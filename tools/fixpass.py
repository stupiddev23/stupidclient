#!/usr/bin/env python3
"""Retarget the renderer's removed RenderPass / CommandEncoder calls at MioGl.

The second layer of the same 1.21.11 API rewrite.  Where tools/fixgfx.py handles
the RenderSystem statics (invokestatic, 3 bytes), these are interface calls
(invokeinterface, 5 bytes) that have to become a static helper call:

    invokeinterface RenderPass.setUniform(String, float[])V      (5 bytes)
    invokestatic    MioGl.setUniform(RenderPass, String, float[])V (3 bytes + 2 nop)

The receiver already sits on the stack below the arguments, so promoting it to
an explicit first parameter keeps the stack shape identical and the two spare
bytes become nop.  Nothing moves: no offset, stack map frame or exception range.

    RenderPass.setUniform(String,float[])        -> MioGl.setUniform
    RenderPass.bindSampler(String,GpuTexture)    -> MioGl.bindSampler (dropped, see MioGl)
    RenderPass.setPipeline(RenderPipeline)       -> MioGl.setPipeline (also binds the
                                                    default uniforms 1.21.11 requires)
    CommandEncoder.createRenderPass(GpuTexture,OptionalInt)
                                                 -> MioGl.createPass (view + label)

    python3 tools/fixpass.py           # patch jars/mio-1.21.11.jar
    python3 tools/fixpass.py --check   # report, change nothing
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
COMPAT = os.path.join(HERE, "compat", "out", "me", "mioclient", "compat")
HELPER = "me/mioclient/compat/MioGl"
INVOKEINTERFACE, INVOKESTATIC, NOP = 0xB9, 0xB8, 0x00
COMPAT_CLASSES = ("MioGl.class",)
PASS = "com/mojang/blaze3d/systems/RenderPass"
ENC = "com/mojang/blaze3d/systems/CommandEncoder"

# (owner, name, desc, new name, new desc) -- new desc is the old one with the
# receiver prepended.
RULES = (
    (PASS, "setUniform", "(Ljava/lang/String;[F)V", "setUniform",
     "(L" + PASS + ";Ljava/lang/String;[F)V"),
    (PASS, "bindSampler", "(Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTexture;)V",
     "bindSampler", "(L" + PASS + ";Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTexture;)V"),
    (PASS, "setPipeline", "(Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V", "setPipeline",
     "(L" + PASS + ";Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V"),
    (ENC, "createRenderPass",
     "(Lcom/mojang/blaze3d/textures/GpuTexture;Ljava/util/OptionalInt;)Lcom/mojang/blaze3d/systems/RenderPass;",
     "createPass",
     "(L" + ENC + ";Lcom/mojang/blaze3d/textures/GpuTexture;Ljava/util/OptionalInt;)Lcom/mojang/blaze3d/systems/RenderPass;"),
)
BY_KEY = {(o, n, d): (new, nd) for o, n, d, new, nd in RULES}


def walk(code):
    pc = 0
    while pc < len(code):
        yield pc, code[pc]
        pc += 1 + CD.size(code, pc)


def target_of(cls, idx):
    e = cls["cp"].get(idx)
    if not e or e[0] not in (10, 11):
        return None
    ci = (e[1] << 8) | e[2]
    nt = cls["cp"].get((e[3] << 8) | e[4])
    if not nt or nt[0] != 12:
        return None
    owner = MC.class_name(cls, ci)
    name = MC.utf8(cls, (nt[1] << 8) | nt[2])
    desc = MC.utf8(cls, (nt[3] << 8) | nt[4])
    hit = BY_KEY.get((owner, name, desc))
    return (name, desc, hit[0], hit[1]) if hit else None


def sites(cls):
    good, bad = [], []
    for m in cls["methods"]:
        c = MC.code_of(cls, m)
        if not c:
            continue
        code = bytes(c["code"])
        for pc, op in walk(code):
            if op not in (INVOKEINTERFACE, INVOKESTATIC) or pc + 2 >= len(code):
                continue
            t = target_of(cls, (code[pc + 1] << 8) | code[pc + 2])
            if not t:
                continue
            (good if op == INVOKEINTERFACE else bad).append((m, pc, t))
    return good, bad


COMPAT_PREFIX = "me/mioclient/compat/"


def patch(b, owner_name, log):
    if owner_name.startswith(COMPAT_PREFIX):
        return None, 0
    cls = MC.parse(b)
    good, bad = sites(cls)
    if not good and not bad:
        return None, 0
    for m, pc, t in bad:
        log.append((owner_name, "wrong-opcode", t[0]))
    if not good:
        return None, 0

    extra = []
    refs = {}
    for m, pc, t in good:
        key = (t[2], t[3])
        if key not in refs:
            refs[key] = FG.add_methodref(cls, extra, HELPER, t[2], t[3])
        c = MC.code_of(cls, m)
        code = c["code"]
        code[pc] = INVOKESTATIC
        code[pc + 1] = refs[key] >> 8
        code[pc + 2] = refs[key] & 0xFF
        # invokeinterface's trailing argument count and zero byte become nop,
        # so the following instruction does not move.
        code[pc + 3] = NOP
        code[pc + 4] = NOP
        MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)
        log.append((owner_name, t[0], t[2]))
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
                        and MC.utf8(cls, (nt[3] << 8) | nt[4]) in {r[4] for r in RULES}):
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
        print("removed pass API sites: %d" % old)
        print("MioGl pass call sites:  %d" % new)
        print("compat classes present: %s" % ("yes" if present else "NO"))
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
        print("%-52s %-16s -> %s" % ((r[0].split("/")[-1])[:52], r[1], r[2]))

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
