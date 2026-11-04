#!/usr/bin/env python3
"""Neutralise the skin-override code that 1.21.11's SkinTextures rewrite broke.

1.21.5 SkinTextures was a plain record of Identifiers:

    SkinTextures(Identifier texture, String url, Identifier cape,
                 Identifier elytra, PlayerSkinType model, boolean secure)

1.21.11 reworked it around an asset model:

    SkinTextures(AssetInfo.TextureAsset texture, TextureAsset cape,
                 TextureAsset elytra, PlayerSkinType model, boolean secure)

A TextureAsset (intermediary class_12079$class_12081) wraps the Identifier, the
url moved inside it, and PlayerSkinType left the nested class_8685$class_7920
for top-level class_7920.  The url component and the six-argument constructor
are gone.

Porting mio's skin overrides is not a descriptor swap: the handlers store
Identifiers in locals whose stack map frames name class_2960 and
class_8685$class_7920, three values would have to become TextureAssets, and the
url argument has to be dropped -- so frames and the call sequence both change.

Until that port is done, every void method that reaches the removed API is
reduced to a bare return, which leaves vanilla skins in place.  Anything else
that still touches the old API is reported and left alone rather than guessed
at.

    python3 tools/fixskins.py           # patch jars/mio-1.21.11.jar
    python3 tools/fixskins.py --check   # report, change nothing
"""
import os
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC
import classdump as CD
import fixguimatrices as FG

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")
SKIN = "net/minecraft/class_8685"
# Members of the 1.21.5 record that 1.21.11 no longer declares.
GONE = {"comp_1626", "comp_1627", "comp_1628", "comp_1629", "comp_1911",
        "field_41122", "field_41123"}
RETURN = b"\xb1"


def walk(code):
    pc = 0
    while pc < len(code):
        yield pc, code[pc]
        pc += 1 + CD.size(code, pc)


def old_refs(cls, code):
    """-> [names] of instructions in `code` naming a member that is gone."""
    out = []
    for pc, op in walk(code):
        if op not in (0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9, 0xBB):
            continue
        e = cls["cp"].get((code[pc + 1] << 8) | code[pc + 2])
        if not e or e[0] not in (9, 10, 11, 7):
            continue
        owner = MC.class_name(cls, (e[1] << 8) | e[2])
        if owner != SKIN and not (owner or "").startswith(SKIN + "$"):
            continue
        if op == 0xBB:                       # `new` names the type only
            out.append("<new>")
            continue
        nt = cls["cp"].get((e[3] << 8) | e[4])
        if nt and nt[0] == 12:
            name = MC.utf8(cls, (nt[1] << 8) | nt[2])
            desc = MC.utf8(cls, (nt[3] << 8) | nt[4])
            if name in GONE or (name == "<init>" and desc.startswith("(Lnet/minecraft/class_2960;")):
                out.append(name + desc)
    return out


def sites(cls):
    """-> [(method, code, refs)] for methods that reach the removed API."""
    out = []
    for m in cls["methods"]:
        c = MC.code_of(cls, m)
        if not c:
            continue
        r = old_refs(cls, bytes(c["code"]))
        if r:
            out.append((m, c, r))
    return out


def stub_method(cls, m, c):
    c["code"] = bytearray(RETURN)
    c["max_stack"] = 0
    c["handlers"] = b""
    c["attrs"] = []
    MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)


def delegate(cls, m, c, extra):
    """Replace the body with `return super.<same>();`.

    Used for a no-argument override that built a SkinTextures: the vanilla
    superclass implementation still returns a valid skin, which is what the
    callers expect, where returning null would not be.
    """
    idx = FG.add_methodref(cls, extra, MC.class_name(cls, cls["super"]),
                           MC.utf8(cls, m["name"]), MC.utf8(cls, m["desc"]))
    c["code"] = bytearray(b"\x2a\xb7" + MC.u2b(idx) + b"\xb0")
    c["max_stack"] = max(c["max_stack"], 1)
    c["handlers"] = b""
    c["attrs"] = []
    MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)


def patch(path, b, log, skipped):
    cls = MC.parse(b)
    extra, hit = [], 0
    for m, c, refs in sites(cls):
        name = MC.utf8(cls, m["name"])
        desc = MC.utf8(cls, m["desc"])
        if bytes(c["code"]) == RETURN:
            continue
        if desc.endswith(")V") and name != "<init>":
            stub_method(cls, m, c)
            hit += 1
            log.append((path.split("/")[-1][:40], name[:24] + " stub"))
        elif desc.startswith("()") and name != "<init>":
            delegate(cls, m, c, extra)
            hit += 1
            log.append((path.split("/")[-1][:40], name[:24] + " -> super"))
        else:
            skipped.append((path.split("/")[-1][:40], name[:24], desc[:40]))
    return (MC.write(cls, extra) if hit else None), hit


def check(data):
    """-> number of instructions still naming a member that no longer exists.

    A stubbed method drops out of `sites` entirely, so counting stubs here is
    meaningless; what matters is that nothing live still reaches the old API.
    """
    live = 0
    for name, b in data.items():
        if not name.endswith(".class"):
            continue
        cls = MC.parse(b)
        for m, c, refs in sites(cls):
            live += len(refs)
    return live


def read_jar():
    z = zipfile.ZipFile(JAR)
    items = z.infolist()
    data = {it.filename: z.read(it.filename) for it in items}
    z.close()
    return items, data


def main(argv):
    items, data = read_jar()

    if "--check" in argv:
        live = check(data)
        print("live references to the removed API: %d" % live)
        ok = live == 0
        print("RESULT: %s" % ("PASS" if ok else "FAIL"))
        return 0 if ok else 1

    log, skipped, total = [], [], 0
    for name, b in list(data.items()):
        if not name.endswith(".class"):
            continue
        nb, n = patch(name, b, log, skipped)
        if nb is None:
            continue
        data[name] = nb
        total += n

    for cls_name, meth in log:
        print("%-40s %-24s disabled" % (cls_name, meth))
    for cls_name, meth, desc in skipped:
        print("%-40s %-24s SKIPPED (non-void) %s" % (cls_name, meth, desc))
    if skipped:
        print("refusing to patch: %d method(s) need a real port" % len(skipped))
        return 1
    if not total:
        print("nothing to do")
        print("check: live=%d" % check(data))
        return 0

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it.filename, data[it.filename])
    os.replace(tmp, JAR)
    print("methods stubbed: %d" % total)
    print("check: live=%d" % check(read_jar()[1]))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))
