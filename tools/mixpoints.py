#!/usr/bin/env python3
"""Drop injections whose @At target no longer occurs in the 1.21.11 method.

Mixin and MixinExtras both `require` an injector to match at least one injection
point, so a method that stopped making a call aborts the whole mixin rather than
silently skipping:

    Callback method ... failed injection check, (0/1) succeeded. Scanned 0 target(s)

That is not a descriptor problem and no rename can fix it: the bytecode simply no
longer contains the instruction the annotation points at (InGameHud stopped
calling SimpleOption.getValue, and the method it does call now returns a concrete
type instead of Object).  The honest repair is to take that one injector out and
leave the rest of the mixin applying, the same policy tools/mixbridge.py uses for
handlers it cannot forward.

Only concrete `@At(value="INVOKE"|"FIELD", target="Lowner;name(desc)")` targets
are judged; anything else (CONSTANT, ordinal-only, unresolved names) is left
alone because absence cannot be proven here.
"""
import collections, json, os, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC
import mixbridge as MB

JAR = MB.JAR
CF = MB.CF
short = MB.short
strings_in = MB.strings_in
anns_in = MB.anns_in
classify = MB.classify
by_name = MB.by_name
off_of = MB.off_of
M5, M11 = MB.M5, MB.M11
MEMNAME = MB.MEMNAME
xlate_desc = MB.xlate_desc
CFS_BY_OFF = MB.CFS_BY_OFF
INJECT = MB.INJECT

_REF_CACHE = {}


def decode(code):
    """-> (opcode, pc, length) for every instruction; lengths must be exact."""
    pc = 0
    while pc < len(code):
        op = code[pc]
        if op == 0xAA:                              # tableswitch
            p = pc + 1
            p += (4 - (p % 4)) % 4
            lo = int.from_bytes(code[p + 4:p + 8], "big", signed=True)
            hi = int.from_bytes(code[p + 8:p + 12], "big", signed=True)
            ln = (p - pc) + 12 + 4 * (hi - lo + 1)
        elif op == 0xAB:                            # lookupswitch
            p = pc + 1
            p += (4 - (p % 4)) % 4
            pairs = int.from_bytes(code[p + 4:p + 8], "big", signed=True)
            ln = (p - pc) + 8 + 8 * pairs
        elif op == 0xC4:                            # wide
            ln = 6 if code[pc + 1] == 0x84 else 4
        else:
            ln = MB._LEN.get(op, 1)
        yield op, pc, ln
        pc += ln


def refs_of(inter, name, desc):
    """Member accesses inside one 1.21.11 method, in intermediary space."""
    key = (inter, name, desc)
    if key in _REF_CACHE:
        return _REF_CACHE[key]
    out = set()
    off = M11.i2off.get(inter)
    cf = CFS_BY_OFF.get(off) if off else None
    if cf is not None:
        c = MC.parse(cf.b)
        for m in c["methods"]:
            md = xlate_desc(MC.utf8(c, m["desc"]), M11.off2i)
            mn = MEMNAME.get(("METHOD", inter, MC.utf8(c, m["name"]), md),
                             MC.utf8(c, m["name"]))
            if mn != name or md != desc:
                continue
            code = MC.code_of(c, m)
            if not code:
                continue
            raw = bytes(code["code"])
            for op, pc, _ln in decode(raw):
                if op not in (0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9):
                    continue
                e = c["cp"].get(int.from_bytes(raw[pc + 1:pc + 3], "big"))
                if not e or e[0] not in (10, 11):
                    continue
                owner = M11.off2i.get(MC.class_name(c, int.from_bytes(e[1:3], "big")))
                nat = c["cp"][int.from_bytes(e[3:5], "big")]
                out.add((op in (0xB2, 0xB3, 0xB4, 0xB5),
                         owner,
                         MC.utf8(c, int.from_bytes(nat[1:3], "big")),
                         xlate_desc(MC.utf8(c, int.from_bytes(nat[3:5], "big")), M11.off2i)))
    _REF_CACHE[key] = out
    return out


def at_targets(a):
    """-> [(kind, target)] for the @At annotations nested in one injector."""
    out = []
    for nested in anns_in(a["v"].get("at")) + anns_in(a["v"].get("target")):
        kind = next((s["val"] for s in strings_in(nested["v"].get("value"))), None)
        for s in strings_in(nested["v"].get("target")):
            out.append((kind, s["val"]))
    return out


def method_targets(cfm, targets):
    """Every (declaring class, name, descriptor) the injector's method= names."""
    out, seen = [], set()
    for a in cfm["ann"]:
        for s in strings_in(a["v"].get("method")):
            owner, name, desc = classify(s["val"])[:3]
            if not name or name.startswith("<"):
                continue
            for t in ([owner] if owner else targets):
                # @Mixin values keep their L...; wrapper.
                t = (t or "").strip("L;")
                ti = t if t.startswith("net/minecraft/") else M5.n2i.get(t, t)
                off = off_of(ti)
                if off is None:
                    continue
                want = xlate_desc(desc, M5.n2i) if desc else ""
                for c, d in by_name(off, "METHOD", name):
                    if want and d != want:
                        continue
                    if (c, name, d) not in seen:
                        seen.add((c, name, d))
                        out.append((c, name, d))
    return out


def occurs(kind, target, refs):
    owner, name, desc = classify(target)[:3]
    if not owner or not name:
        return True                    # cannot judge; keep the injection
    o = owner if owner.startswith("net/minecraft/") else M5.n2i.get(owner, owner)
    d = desc
    if d.startswith("("):
        d = xlate_desc(d, M5.n2i)
    is_field = kind == "FIELD"
    for ref in refs:
        if ref[0] != is_field or ref[1] != o or ref[2] != name:
            continue
        if not d or ref[3] == d:
            return True
    return False


def spans_by_type(mc, m):
    a = MC.find_attr(mc, m, "RuntimeVisibleAnnotations")
    if not a:
        return None, []
    return a, [(s, e, short(MC.utf8(mc, t))) for (s, e, t) in MC.anns_with_spans(a["data"])]


def main():
    z = zipfile.ZipFile(JAR)
    cfg = json.loads(z.read("mio.mixins.json"))
    items = z.infolist()
    data = {it.filename: z.read(it.filename) for it in items}
    z.close()

    log, stats = [], collections.Counter()
    for mn in cfg["mixins"]:
        path = "me/mioclient/mixin/%s.class" % mn
        b = data[path]
        mc = MC.parse(b)
        cf = CF(b)
        targets = []
        for a in cf.ann:
            if short(a["type"]) == "Mixin":
                for s in (strings_in(a["v"].get("value"))
                          + strings_in(a["v"].get("targets"))):
                    targets.append(s["val"])

        changed = False
        for idx, cfm in enumerate(cf.methods):
            if not cfm["ann"]:
                continue
            m = mc["methods"][idx]
            methods = method_targets(cfm, targets)
            if not methods:
                continue
            drop = []
            for a in cfm["ann"]:
                ats = at_targets(a)
                judged = [(k, t) for (k, t) in ats if k in ("INVOKE", "FIELD")]
                if not judged or len(judged) != len(ats):
                    continue           # nothing concrete to disprove
                if any(occurs(k, t, refs_of(*meth)) for (k, t) in judged
                       for meth in methods):
                    continue
                drop.append(a)
            if not drop:
                continue
            attr, spans = spans_by_type(mc, m)
            if attr is None:
                stats["no_visible_attr"] += 1
                continue
            used = set()
            for a in drop:
                want = short(a["type"])
                hit = next((s for s in spans if s[2] == want and s[0] not in used), None)
                if hit is None:
                    stats["span_not_found"] += 1
                    continue
                used.add(hit[0])
                keep = {(s, e) for (s, e, _t) in spans if (s, e) != (hit[0], hit[1])}
                if keep:
                    attr["data"] = MC.anns_keep(attr["data"], keep)
                else:
                    m["attrs"].remove(attr)
                spans = [(s, e, t) for (s, e, t) in spans if (s, e) != (hit[0], hit[1])]
                changed = True
                stats["dropped"] += 1
                log.append((mn, cfm["name"], want))

        if changed:
            data[path] = MC.write(mc)
            stats["classes_patched"] += 1

    for mn, hn, ann in log:
        print("drop %-11s %-14s %s" % (ann, mn[:14], hn[:34]))
    print(json.dumps(dict(stats), indent=2))

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it, data[it.filename])
    os.replace(tmp, JAR)
    return 0


if __name__ == "__main__":
    sys.exit(main())
