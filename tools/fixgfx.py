#!/usr/bin/env python3
"""Point the renderer's removed RenderSystem calls at MioGl instead.

com.mojang.* is not remapped to intermediary, so when 1.21.11 dropped these
members the calls became plain NoSuchMethodError at runtime with no mapping to
bridge them.  Auditing the whole jar against client.jar (see tools/fixmojang.py)
leaves exactly eight, all in mio's custom HUD renderer:

    RenderSystem.setShaderColor(FFFF)V                    -> MioGl.color(FFFF)V
    RenderSystem.getShaderColor()[F                       -> MioGl.color()[F
    RenderSystem.enableScissor(IIII)V                     -> MioGl.scissor(IIII)V
    RenderSystem.disableScissor()V                        -> MioGl.noScissor()V
    RenderSystem.lineWidth(F)V                            -> MioGl.lineWidth(F)V
    RenderSystem.setShaderTexture(int,GpuTexture)V        -> MioGl.texture(int,GpuTexture)V
    RenderSystem.getProjectionMatrix()Lorg/joml/Matrix4f; -> MioGl.projection()...
    RenderSystem.shaderLightDirections [Lorg/joml/Vector3f; -> MioGl.lights()...

Every replacement takes and returns exactly what the original did, so each site
is a three-byte instruction for a three-byte instruction:

    invokestatic RenderSystem.foo(...)      (3 bytes)
    invokestatic MioGl.foo(...)             (3 bytes, same stack effect)

The shaderLightDirections field read becomes an invokestatic call: getstatic
pushes one reference and so does invokestatic, so both are 3 bytes and the
stack depth is unchanged.  No offset, stack map frame or exception range moves.

    python3 tools/fixgfx.py           # patch jars/mio-1.21.11.jar
    python3 tools/fixgfx.py --check   # report, change nothing
"""
import os
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC
import classdump as CD
import fixvoidcalls as FV
import fixguimatrices as FG

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")
COMPAT = os.path.join(HERE, "compat", "out", "me", "mioclient", "compat")
OWNER = "com/mojang/blaze3d/systems/RenderSystem"
HELPER = "me/mioclient/compat/MioGl"
INVOKESTATIC, GETSTATIC = 0xB8, 0xB2
COMPAT_CLASSES = ("MioGl.class",)

# (old name, old desc, new name) -- the new descriptor always matches the old.
SWAPS = (
    ("setShaderColor", "(FFFF)V", "color"),
    ("getShaderColor", "()[F", "color"),
    ("enableScissor", "(IIII)V", "scissor"),
    ("disableScissor", "()V", "noScissor"),
    ("lineWidth", "(F)V", "lineWidth"),
    ("setShaderTexture", "(ILcom/mojang/blaze3d/textures/GpuTexture;)V", "texture"),
    ("getProjectionMatrix", "()Lorg/joml/Matrix4f;", "projection"),
    ("shaderLightDirections", "[Lorg/joml/Vector3f;", "lights"),
)
BY_MEMBER = {(n, d): new for n, d, new in SWAPS}


def walk(code):
    pc = 0
    while pc < len(code):
        yield pc, code[pc]
        pc += 1 + CD.size(code, pc)


def target_of(cls, idx):
    """-> (old name, old desc, new name) when idx is a removed RenderSystem
    member, else None."""
    e = cls["cp"].get(idx)
    if not e or e[0] not in (9, 10):
        return None
    ci = (e[1] << 8) | e[2]
    nt = cls["cp"].get((e[3] << 8) | e[4])
    if not nt or nt[0] != 12:
        return None
    if MC.class_name(cls, ci) != OWNER:
        return None
    name = MC.utf8(cls, (nt[1] << 8) | nt[2])
    desc = MC.utf8(cls, (nt[3] << 8) | nt[4])
    new = BY_MEMBER.get((name, desc))
    return (name, desc, new) if new else None


def sites(cls):
    """-> ([(method, pc, old name, desc, new name)], [(method, pc, ...) wrong opcode])"""
    good, bad = [], []
    for m in cls["methods"]:
        c = MC.code_of(cls, m)
        if not c:
            continue
        code = bytes(c["code"])
        for pc, op in walk(code):
            if op not in (INVOKESTATIC, GETSTATIC):
                continue
            if pc + 2 >= len(code):
                continue
            t = target_of(cls, (code[pc + 1] << 8) | code[pc + 2])
            if not t:
                continue
            entry = (m, pc, t[0], t[1], t[2])
            if (op == GETSTATIC) == (t[2] == "lights"):
                good.append(entry)
            else:
                bad.append(entry)
    return good, bad


COMPAT_PREFIX = "me/mioclient/compat/"


def patch(b, owner_name, log):
    if owner_name.startswith(COMPAT_PREFIX):
        return None, 0
    cls = MC.parse(b)
    good, bad = sites(cls)
    if not good and not bad:
        return None, 0
    for m, pc, name, desc, new in bad:
        log.append((owner_name, "wrong-opcode", name))
    if not good:
        return None, 0

    extra = []
    refs = {}
    for m, pc, name, desc, new in good:
        if new not in refs:
            refs[new] = FG.add_methodref(cls, extra, HELPER, new, desc)
        c = MC.code_of(cls, m)
        c["code"][pc] = INVOKESTATIC
        c["code"][pc + 1] = refs[new] >> 8
        c["code"][pc + 2] = refs[new] & 0xFF
        MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)
        log.append((owner_name, name, new))
    return MC.write(cls, extra), len(good)


def check(data):
    old = new = 0
    for name, b in data.items():
        if not name.endswith(".class") or name.startswith(COMPAT_PREFIX):
            continue
        cls = MC.parse(b)
        good, bad = sites(cls)
        old += len(good) + len(bad)
        for m in cls["methods"]:
            c = MC.code_of(cls, m)
            if not c:
                continue
            code = bytes(c["code"])
            for pc, op in walk(code):
                if op != INVOKESTATIC or pc + 2 >= len(code):
                    continue
                e = cls["cp"].get((code[pc + 1] << 8) | code[pc + 2])
                if not e or e[0] != 10:
                    continue
                ci = (e[1] << 8) | e[2]
                nt = cls["cp"].get((e[3] << 8) | e[4])
                if not nt or nt[0] != 12:
                    continue
                if (MC.class_name(cls, ci) == HELPER
                        and MC.utf8(cls, (nt[3] << 8) | nt[4]) in
                        {d for _, d, _ in SWAPS}):
                    new += 1
    present = all(("me/mioclient/compat/" + c) in data for c in COMPAT_CLASSES)
    return old, new, present


def read_jar():
    z = zipfile.ZipFile(JAR)
    items = z.infolist()
    data = {it.filename: z.read(it.filename) for it in items}
    z.close()
    return items, data


def main(argv):
    items, data = read_jar()

    if "--check" in argv:
        old, new, present = check(data)
        print("removed RenderSystem sites: %d" % old)
        print("MioGl call sites:           %d" % new)
        print("compat classes present:     %s" % ("yes" if present else "NO"))
        ok = old == 0 and new > 0 and present
        print("RESULT: %s" % ("PASS" if ok else "FAIL"))
        return 0 if ok else 1

    log = []
    total = 0
    for name, b in list(data.items()):
        if not name.endswith(".class"):
            continue
        new_b, n = patch(b, name, log)
        if new_b is None:
            continue
        data[name] = new_b
        total += n

    added = 0
    for c in COMPAT_CLASSES:
        src = os.path.join(COMPAT, c)
        if not os.path.exists(src):
            print("missing %s -- run tools/build-compat.sh first" % src)
            return 1
        blob = open(src, "rb").read()
        dst = "me/mioclient/compat/" + c
        if data.get(dst) != blob:
            data[dst] = blob
            added += 1

    for r in log:
        print("%-52s %-20s -> %s" % ((r[0].split("/")[-1])[:52], r[1], r[2]))

    if not total and not added:
        print("nothing to do")
        print("check: old=%d helper=%d compat=%s" % check(data))
        return 0

    have = {it.filename for it in items}
    names = [it.filename for it in items] + [
        "me/mioclient/compat/" + c for c in COMPAT_CLASSES
        if "me/mioclient/compat/" + c not in have]
    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for n in names:
            zout.writestr(n, data[n])
    os.replace(tmp, JAR)
    print("patched %d site(s); compat classes written: %d" % (total, added))
    old, new, present = check(read_jar()[1])
    print("check: old=%d helper=%d compat=%s" % (old, new, present))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))
