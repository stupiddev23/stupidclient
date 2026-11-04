#!/usr/bin/env python3
"""Retarget the removed VertexConsumer.vertex(Matrix4f, F, F, F) call at MioGl.

1.21.5:

    VertexConsumer.method_22918(Lorg/joml/Matrix4f;FFF)V

1.21.11 replaced it with an overload taking Matrix4fc that *returns* the
consumer, so the intermediary id changed and the call also has a different
stack effect.  Swapping the descriptor alone would leave a value on a stack
that expects none, which fails verification, so the call goes through
MioGl.vertex, which keeps the old void shape and discards the result.

    invokeinterface class_4588.method_22918(Matrix4f,FFF)V   (5 bytes)
    invokestatic    MioGl.vertex(class_4588,Matrix4f,FFF)V   (3 bytes + 2 nop)

The receiver sits under the arguments, so promoting it to a parameter keeps the
stack shape and the two spare bytes become nop.

    python3 tools/fixvc.py           # patch jars/mio-1.21.11.jar
    python3 tools/fixvc.py --check   # report, change nothing
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
COMPAT_PREFIX = "me/mioclient/compat/"
HELPER = "me/mioclient/compat/MioGl"
INVOKEINTERFACE, INVOKESTATIC, NOP = 0xB9, 0xB8, 0x00

OWNER = "net/minecraft/class_4588"
NAME = "method_22918"
# The old call already returned the consumer (chained builder style); only the
# parameter type and the intermediary id changed.
DESC = "(Lorg/joml/Matrix4f;FFF)L" + OWNER + ";"
NEW_NAME = "vertex"
NEW_DESC = "(L" + OWNER + ";Lorg/joml/Matrix4f;FFF)L" + OWNER + ";"
# (path inside the jar, path under tools/compat/out).  The class_4588 stub is
# only a compile-time stand-in for the real interface and must NOT be shipped:
# a mod jar defining a game class would shadow it.
COMPAT_CLASSES = (
    ("me/mioclient/compat/MioGl.class", "me/mioclient/compat/MioGl.class"),
)


def walk(code):
    pc = 0
    while pc < len(code):
        yield pc, code[pc]
        pc += 1 + CD.size(code, pc)


def target_of(cls, idx):
    e = cls["cp"].get(idx)
    if not e or e[0] not in (10, 11):
        return False
    ci = (e[1] << 8) | e[2]
    nt = cls["cp"].get((e[3] << 8) | e[4])
    if not nt or nt[0] != 12:
        return False
    return (MC.class_name(cls, ci) == OWNER
            and MC.utf8(cls, (nt[1] << 8) | nt[2]) == NAME
            and MC.utf8(cls, (nt[3] << 8) | nt[4]) == DESC)


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
            if not target_of(cls, (code[pc + 1] << 8) | code[pc + 2]):
                continue
            (good if op == INVOKEINTERFACE else bad).append((m, pc))
    return good, bad


def patch(b, owner_name, log):
    if owner_name.startswith(COMPAT_PREFIX):
        return None, 0
    cls = MC.parse(b)
    good, bad = sites(cls)
    if not good:
        return None, 0
    for m, pc in bad:
        log.append((owner_name, "wrong-opcode", NAME))

    extra = []
    helper = FG.add_methodref(cls, extra, HELPER, NEW_NAME, NEW_DESC)
    for m, pc in good:
        c = MC.code_of(cls, m)
        code = c["code"]
        code[pc] = INVOKESTATIC
        code[pc + 1] = helper >> 8
        code[pc + 2] = helper & 0xFF
        code[pc + 3] = NOP
        code[pc + 4] = NOP
        MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)
    log.append((owner_name, NAME, NEW_NAME))
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
                nt = cls["cp"].get((e[3] << 8) | e[4])
                if (nt and nt[0] == 12 and MC.class_name(cls, (e[1] << 8) | e[2]) == HELPER
                        and MC.utf8(cls, (nt[3] << 8) | nt[4]) == NEW_DESC):
                    new += 1
    present = all(dst in data for dst, _ in COMPAT_CLASSES)
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
        print("old VertexConsumer sites: %d" % old)
        print("MioGl.vertex sites:       %d" % new)
        print("compat classes present:   %s" % ("yes" if present else "NO"))
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

    out_root = os.path.join(HERE, "compat", "out")
    added = 0
    for dst, rel in COMPAT_CLASSES:
        src = os.path.join(out_root, rel)
        if not os.path.exists(src):
            print("missing %s -- run tools/build-compat.sh first" % src)
            return 1
        blob = open(src, "rb").read()
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
        dst for dst, _ in COMPAT_CLASSES if dst not in have]
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
