#!/usr/bin/env python3
"""Apply the replacements found by tools/mixaudit.py to jars/mio-1.21.11.jar.

Two kinds of edit, both chosen so nothing else in the class can be corrupted:

  * annotation strings  -- a new UTF-8 constant is appended to the pool and only
    that annotation operand is repointed, so a constant shared by two different
    targets keeps working for both;
  * shadow declarations -- the member's own name constant is rewritten in place,
    because the class's own references to that shadow point at the same constant.

All constant-pool changes happen inside the pool, so every byte after it shifts
by one delta and the operands are moved by exactly that amount.
"""
import collections, json, os, struct, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")
AUDIT = os.environ.get("MIXAUDIT_OUT", "/tmp/mixaudit.json")


def load_cp(b):
    """-> (entries {idx: (tag, payload)}, count, end offset) with payload sans tag."""
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


def patch_class(b, edits):
    """edits: [(operand_offset, new_text, is_declaration)]"""
    entries, count, cp_end = load_cp(b)
    inline, appended, occ = {}, [], {}
    for off, new, is_decl in edits:
        idx = struct.unpack_from(">H", b, off)[0]
        if is_decl:
            inline[idx] = new
        else:
            appended.append(new)
            occ[off] = count + len(appended) - 1
    for idx, text in inline.items():
        if idx in entries and entries[idx][0] == 1:
            entries[idx] = (1, text.encode("utf-8"))
    cp = dump_cp(entries, count, appended)
    new_count = count + len(appended)
    delta = len(cp) - (cp_end - 10)
    tail = bytearray(b[cp_end:])
    for off, new_idx in occ.items():
        struct.pack_into(">H", tail, off - cp_end, new_idx)
    return b[:8] + struct.pack(">H", new_count) + cp + bytes(tail), delta


def main():
    rows = json.load(open(AUDIT))
    per_class = collections.defaultdict(list)
    for r in rows:
        if not r.get("repl") or r.get("off") is None:
            continue
        if r["repl"] == r.get("value"):
            continue
        per_class["me/mioclient/mixin/%s.class" % r["mixin"]].append(
            (r["off"], r["repl"], r.get("decl_style") == "member"))

    zin = zipfile.ZipFile(JAR)
    items = zin.infolist()
    data = {it.filename: zin.read(it.filename) for it in items}
    zin.close()

    stats = collections.Counter()
    for name, edits in per_class.items():
        if name not in data:
            stats["missing_class"] += 1
            continue
        new, delta = patch_class(data[name], edits)
        data[name] = new
        stats["classes_patched"] += 1
        stats["edits"] += len(edits)
        stats["delta_total"] += delta

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it, data[it.filename])
    os.replace(tmp, JAR)
    print(json.dumps(dict(stats), indent=2))


if __name__ == "__main__":
    main()
