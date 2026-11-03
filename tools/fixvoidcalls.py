#!/usr/bin/env python3
"""Call a method whose return type was dropped in 1.21.11, without moving code.

Some 1.21.11 methods kept their identity but lost their result:
DrawContext.drawTextWithShadow(TextRenderer, String, int, int, int) returns
void now, while 1.21.5 returned the width it drew.  A mod compiled against the
old signature throws NoSuchMethodError the first time the call runs.

When the caller throws the value away anyway -- `invokevirtual ... ; pop` --
the repair is exact and length-preserving: point the constant pool entry at the
void descriptor and turn that `pop` into a `nop`.  Nothing moves, so no branch
offset, stack map frame or exception range needs fixing up.

A call site that *uses* the value is reported and left alone: inventing a
replacement result would change behaviour, not just compile.
"""
import collections
import os
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC
import fixbridges as FB

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")

# (owner, name, descriptor in 1.21.5, descriptor in 1.21.11)
VOIDING = [
    ("net/minecraft/class_332", "method_25303",
     "(Lnet/minecraft/class_327;Ljava/lang/String;III)I",
     "(Lnet/minecraft/class_327;Ljava/lang/String;III)V"),
]
NOP, POP = 0x00, 0x57
INVOKEVIRTUAL = 0xB6


def add_utf8(cls, extra, text):
    raw = b"\x01" + MC.u2b(len(text.encode("utf-8"))) + text.encode("utf-8")
    for i, e in cls["cp"].items():
        if e == raw:
            return i
    for k, e in enumerate(extra):
        if e == raw:
            return cls["cp_count"] + k
    extra.append(raw)
    return cls["cp_count"] + len(extra) - 1


def name_and_type(cls, extra, name, desc):
    for i, e in cls["cp"].items():
        if not e or e[0] != 12:
            continue
        ni, di = (e[1] << 8) | e[2], (e[3] << 8) | e[4]
        if MC.utf8(cls, ni) == name and MC.utf8(cls, di) == desc:
            return i
    ni = add_utf8(cls, extra, name)
    di = add_utf8(cls, extra, desc)
    raw = b"\x0c" + MC.u2b(ni) + MC.u2b(di)
    for k, e in enumerate(extra):
        if e == raw:
            return cls["cp_count"] + k
    extra.append(raw)
    return cls["cp_count"] + len(extra) - 1


def sites(cls, m, refs):
    """-> [(pc, index)] for every invokevirtual that names one of `refs`."""
    c = MC.code_of(cls, m)
    if not c:
        return []
    code = bytes(c["code"])
    out = []
    for pc, op, _ln in FB.instructions(code):
        if op != INVOKEVIRTUAL:
            continue
        idx = (code[pc + 1] << 8) | code[pc + 2]
        if idx in refs:
            out.append((pc, idx))
    return out


def patch(path, b, log):
    cls = MC.parse(b)
    extra = []
    changed = 0
    for owner, name, old_desc, new_desc in VOIDING:
        refs = {}
        for i, e in cls["cp"].items():
            if not e or e[0] != 10:
                continue
            ci = (e[1] << 8) | e[2]
            nt = cls["cp"].get((e[3] << 8) | e[4])
            if not nt or nt[0] != 12:
                continue
            if (MC.class_name(cls, ci) == owner
                    and MC.utf8(cls, (nt[1] << 8) | nt[2]) == name
                    and MC.utf8(cls, (nt[3] << 8) | nt[4]) == old_desc):
                refs[i] = e
        if not refs:
            continue

        found = []
        for m in cls["methods"]:
            for pc, idx in sites(cls, m, refs):
                found.append((m, pc, idx))
        if not found:
            continue

        bad = []
        for m, pc, idx in found:
            code = bytes(MC.code_of(cls, m)["code"])
            nxt = next((p for p, _o, _l in FB.instructions(code) if p > pc), None)
            if nxt != pc + 3 or code[nxt] != POP:
                bad.append((MC.utf8(cls, m["name"]), pc))
        if bad:
            log.append((path, name, "result-used", bad[:3]))
            continue

        nat = name_and_type(cls, extra, name, new_desc)
        for idx, e in refs.items():
            ci = (e[1] << 8) | e[2]
            cls["cp"][idx] = b"\x0a" + MC.u2b(ci) + MC.u2b(nat)
        for m, pc, _idx in found:
            c = MC.code_of(cls, m)
            c["code"][pc + 3] = NOP
            MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)
            changed += 1
        log.append((path, name, "%d site(s)" % len(found), new_desc))
    return MC.write(cls, extra) if changed else None


def main():
    z = zipfile.ZipFile(JAR)
    items = z.infolist()
    data = {it.filename: z.read(it.filename) for it in items}
    z.close()

    stats = collections.Counter()
    log = []
    for it in items:
        if not it.filename.endswith(".class"):
            continue
        new_b = patch(it.filename, data[it.filename], log)
        if new_b is None:
            continue
        data[it.filename] = new_b
        stats["classes_patched"] += 1
    stats["sites"] = sum(int(r[2].split()[0]) for r in log if r[2].endswith("site(s)"))

    for r in log:
        print("%-46s %-14s %-9s %s" % ((r[0].split("/")[-1])[:46], r[1], r[2],
                                       r[3] if len(r) > 3 else ""))

    if not (stats["classes_patched"]):
        print("nothing to do")
        return 0
    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it, data[it.filename])
    os.replace(tmp, JAR)
    print(dict(stats))
    return 0


if __name__ == "__main__":
    sys.exit(main())
