#!/usr/bin/env python3
"""Fix mixin annotations whose target is not a string the audit could rewrite.

Two defects survived tools/mixaudit.py + tools/mixapply.py because neither is
visible as a *string operand*:

  * `@Accessor`/`@Invoker` with no explicit value.  Mixin derives the target
    name from the Java method name (`setDrawables` -> field `drawables`), which
    is a 1.21.5 Yarn name, so it never resolves.  Renaming the method would
    break every call site in the mod, so instead an explicit `value` element is
    added to the annotation.  That means rebuilding the class file: append the
    UTF-8 constants, insert one element_value pair into the annotation, bump
    the pair count and the enclosing attribute length.

  * `@Mixin(targets = "...")` entries that a previous pass rewrote into
    descriptor form (`Lnet/minecraft/class_2841$class_6561;`).  `targets` takes
    class names, not descriptors, so Mixin tries to load a class whose name
    literally starts with `L` and fails with ClassNotFoundException.

Run after tools/mixapply.py; both operate in place on jars/mio-1.21.11.jar.
"""
import collections, json, os, struct, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")

# Reuse the audited mapping/hierarchy tables (1.21.5 named, 1.21.11 client).
_src = open(os.path.join(HERE, "mixaudit.py")).read()
_head = _src.split("# ----------------------------------------------------------------------- main")[0]
T = {"__file__": os.path.abspath(os.path.join(HERE, "mixaudit.py")), "__name__": "mixaudit_tables"}
exec(compile(_head, "mixaudit_tables", "exec"), T)
M5, resolve_member, field_type_of = T["M5"], T["resolve_member"], T["field_type_of"]


def load_cp(b):
    """-> (entries {idx: (tag, payload)}, count, end offset)."""
    o = 10
    count = struct.unpack_from(">H", b, 8)[0]
    entries, i = {}, 1
    while i < count:
        tag = b[o]; o += 1
        if tag == 1:
            l = struct.unpack_from(">H", b, o)[0]
            entries[i] = (1, b[o + 2:o + 2 + l]); o += 2 + l
        elif tag in (3, 4):
            entries[i] = (tag, b[o:o + 4]); o += 4
        elif tag in (5, 6):
            entries[i] = (tag, b[o:o + 8]); o += 8; i += 1
        elif tag in (7, 8, 16, 19, 20):
            entries[i] = (tag, b[o:o + 2]); o += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            entries[i] = (tag, b[o:o + 4]); o += 4
        elif tag == 15:
            entries[i] = (tag, b[o:o + 3]); o += 3
        else:
            raise ValueError("cp tag %d" % tag)
        i += 1
    return entries, count, o


def dump_cp(entries, count, extra):
    out = bytearray()
    for i in range(1, count):
        e = entries.get(i)
        if e is None:
            continue
        tag, payload = e
        out.append(tag)
        if tag == 1:
            out += struct.pack(">H", len(payload)) + payload
        else:
            out += payload
    for text in extra:
        raw = text.encode("utf-8")
        out.append(1)
        out += struct.pack(">H", len(raw)) + raw
    return bytes(out)


def skip_ev(b, p):
    tag = chr(b[p]); p += 1
    if tag in "scBCDFIJSZ":
        return p + 2
    if tag == "e":
        return p + 4
    if tag == "@":
        return skip_ann(b, p)
    if tag == "[":
        n = struct.unpack_from(">H", b, p)[0]; p += 2
        for _ in range(n):
            p = skip_ev(b, p)
        return p
    raise ValueError("element_value tag %r" % tag)


def skip_ann(b, p):
    p += 2
    n = struct.unpack_from(">H", b, p)[0]; p += 2
    for _ in range(n):
        p += 2
        p = skip_ev(b, p)
    return p


def collect_vals(b, p, key, out):
    """Record every string/class operand, recursing into arrays."""
    tag = chr(b[p])
    if tag in ("s", "c"):
        out.append((key, tag, struct.unpack_from(">H", b, p + 1)[0], p + 1))
    elif tag == "[":
        n = struct.unpack_from(">H", b, p + 1)[0]
        q = p + 3
        for _ in range(n):
            q = collect_vals(b, q, key, out)
        return q
    return skip_ev(b, p)


def _attrs(b, o, kind, mname, mdesc, entries, anns):
    """Walk one attribute table, collecting runtime annotations."""
    n = struct.unpack_from(">H", b, o)[0]; o += 2
    for _ in range(n):
        an = struct.unpack_from(">H", b, o)[0]
        alen = struct.unpack_from(">I", b, o + 2)[0]
        alen_off, payload = o + 2, o + 6
        aname = entries[an][1].decode("utf-8", "replace")
        if aname in ("RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"):
            na = struct.unpack_from(">H", b, payload)[0]
            p = payload + 2
            for _ in range(na):
                type_idx = struct.unpack_from(">H", b, p)[0]
                pairs_off = p + 2
                npairs = struct.unpack_from(">H", b, pairs_off)[0]
                vals, q = [], p + 4
                for _ in range(npairs):
                    ni = struct.unpack_from(">H", b, q)[0]; q += 2
                    key = entries[ni][1].decode("utf-8", "replace")
                    q = collect_vals(b, q, key, vals)
                anns.append({"kind": kind, "member": mname, "desc": mdesc,
                             "type": entries[type_idx][1].decode("utf-8", "replace"),
                             "vals": vals, "pairs_off": pairs_off,
                             "end_off": q, "len_off": alen_off})
                p = q
        o = payload + alen
    return o


def scan(b):
    """Collect every runtime annotation, class-level ones included."""
    entries, count, cp_end = load_cp(b)
    utf8 = {}
    for i, (tag, payload) in entries.items():
        if tag == 1:
            utf8.setdefault(payload.decode("utf-8", "replace"), i)
    anns = []
    o = cp_end + 6                       # access_flags, this_class, super_class
    o += 2 + 2 * struct.unpack_from(">H", b, o)[0]
    for kind in ("field", "method"):
        n = struct.unpack_from(">H", b, o)[0]; o += 2
        for _ in range(n):
            o += 2                                        # access
            nm = struct.unpack_from(">H", b, o)[0]; o += 2
            ds = struct.unpack_from(">H", b, o)[0]; o += 2
            mname = entries[nm][1].decode("utf-8", "replace")
            mdesc = entries[ds][1].decode("utf-8", "replace")
            o = _attrs(b, o, kind, mname, mdesc, entries, anns)
    _attrs(b, o, "class", "<class>", "", entries, anns)
    return entries, count, cp_end, utf8, anns


def short(t):
    return (t or "").lstrip("L").rstrip(";").split("/")[-1]


def derive(name):
    for p in ("get", "set", "is"):
        if name.startswith(p) and len(name) > len(p) and name[len(p)].isupper():
            return name[len(p)].lower() + name[len(p) + 1:]
    return name


def patch_class(b, str_edits, inserts):
    """str_edits: [(operand_off, text)]  inserts: [(pairs_off, end_off, len_off, text)]"""
    entries, count, cp_end, utf8, _ = scan(b)
    extra = []

    def add(text):
        if text in utf8:
            return utf8[text]
        extra.append(text)
        return count + len(extra) - 1

    occ = {off: add(text) for off, text in str_edits}
    built = [(pairs, end, ln, add("value"), add(text)) for pairs, end, ln, text in inserts]

    cp = dump_cp(entries, count, extra)
    tail = bytearray(b[cp_end:])
    for off, idx in occ.items():
        struct.pack_into(">H", tail, off - cp_end, idx)
    for pairs, end, ln, nidx, vidx in built:
        cur = struct.unpack_from(">H", tail, pairs - cp_end)[0]
        struct.pack_into(">H", tail, pairs - cp_end, cur + 1)
        cur = struct.unpack_from(">I", tail, ln - cp_end)[0]
        struct.pack_into(">I", tail, ln - cp_end, cur + 5)
    for pairs, end, ln, nidx, vidx in sorted(built, key=lambda t: -t[1]):
        tail[end - cp_end:end - cp_end] = struct.pack(">H", nidx) + b"s" + struct.pack(">H", vidx)
    return b[:8] + struct.pack(">H", count + len(extra)) + cp + bytes(tail)


def main():
    zin = zipfile.ZipFile(JAR)
    items = zin.infolist()
    data = {it.filename: zin.read(it.filename) for it in items}
    zin.close()
    cfg = json.loads(data["mio.mixins.json"])

    stats = collections.Counter()
    report = []
    for mn in cfg["mixins"]:
        name = "me/mioclient/mixin/%s.class" % mn
        if name not in data:
            continue
        b = data[name]
        entries, count, cp_end, utf8, anns = scan(b)

        def txt(i):
            return entries[i][1].decode("utf-8", "replace")

        # @Mixin is a class-level attribute and therefore parsed last, so the
        # target list has to be gathered before the member annotations are used.
        tnames = []
        for a in anns:
            if short(a["type"]) != "Mixin":
                continue
            for key, tag, idx, _operand in a["vals"]:
                if key in ("targets", "value"):
                    tnames.append(txt(idx).strip("L;").replace(".", "/"))

        str_edits, inserts = [], []
        for a in anns:
            t = short(a["type"])
            if t == "Mixin":
                for key, tag, idx, operand in a["vals"]:
                    raw = txt(idx)
                    if (key == "targets" and tag == "s"
                            and raw.startswith("L") and raw.endswith(";")):
                        str_edits.append((operand, raw[1:-1]))
                        stats["targets_unwrapped"] += 1
                continue
            if t not in ("Accessor", "Invoker"):
                continue
            if any(k == "value" for k, _t, _i, _o in a["vals"]):
                stats["accessor_has_value"] += 1
                continue
            if a["kind"] == "class":
                continue
            field = t == "Accessor"
            nm = derive(a["member"]) if field else a["member"]
            if not tnames or nm.startswith("<"):
                stats["accessor_no_target_class"] += 1
                continue
            iowner = next((o for o in tnames if "class_" in o), tnames[0])
            iowner = M5.n2i.get(iowner, iowner)
            res = resolve_member(iowner, "FIELD" if field else "METHOD",
                                 nm, "" if field else a["desc"],
                                 field_type_of(a["desc"]) if field else a["desc"])
            st, iname = res[0], res[1]
            if st in ("FIX", "MOVED") and iname:
                inserts.append((a["pairs_off"], a["end_off"], a["len_off"], iname))
                stats["accessor_value_added"] += 1
                report.append((mn[:16], t, a["member"] + a["desc"], nm, iname))
            elif st == "OK":
                stats["accessor_ok_as_is"] += 1
            else:
                stats["accessor_needs_port"] += 1
                report.append((mn[:16], t, a["member"] + a["desc"], nm, "NEEDS-PORT"))

        if str_edits or inserts:
            data[name] = patch_class(b, str_edits, inserts)
            stats["classes_patched"] += 1

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it, data[it.filename])
    os.replace(tmp, JAR)

    for r in report:
        print("  %-16s %-8s %-46s %-12s -> %s" % r)
    print(json.dumps(dict(stats), indent=2))
    return 1 if stats["accessor_needs_port"] else 0


if __name__ == "__main__":
    sys.exit(main())
