#!/usr/bin/env python3
"""Give DrawContext.getMatrices() back the MatrixStack it used to return.

1.21.5 handed the GUI a MatrixStack:

    class_332.method_51448()Lnet/minecraft/class_4587;

1.21.11 hands out the 2D stack it actually draws through instead:

    class_332.method_51448()Lorg/joml/Matrix3x2fStack;

Every call site compiled against the old descriptor throws NoSuchMethodError
the first time it runs.  Rewriting them to the new type would mean changing
every helper that takes a MatrixStack, so instead each accessor call is
retargeted at MioMatrices.get(class_332), which returns a MatrixStack whose
push/pop/translate/scale also apply to the 2D stack (see MioMatrixStack).
Callers keep their MatrixStack-typed locals and arguments unchanged.

The swap is one instruction for one instruction:

    invokevirtual class_332.method_51448()Lclass_4587;   (3 bytes)
    invokestatic  MioMatrices.get(Lclass_332;)Lclass_4587;  (3 bytes)

both popping the context and pushing one reference, so no offset, stack map
frame or exception range moves.  The two compat classes are compiled from
tools/compat/src against stubs in tools/compat/stubs and copied in.

    python3 tools/fixguimatrices.py           # patch jars/mio-1.21.11.jar
    python3 tools/fixguimatrices.py --check   # report, change nothing
"""
import collections
import os
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC
import classdump as CD
import fixvoidcalls as FV

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")
COMPAT = os.path.join(HERE, "compat", "out", "me", "mioclient", "compat")

OWNER = "net/minecraft/class_332"
NAME = "method_51448"
OLD_DESC = "()Lnet/minecraft/class_4587;"
HELPER = "me/mioclient/compat/MioMatrices"
HELPER_DESC = "(Lnet/minecraft/class_332;)Lnet/minecraft/class_4587;"
INVOKEVIRTUAL, INVOKESTATIC = 0xB6, 0xB8
COMPAT_CLASSES = ("MioMatrices.class", "MioMatrixStack.class")


def add_class(cls, extra, name):
    u = FV.add_utf8(cls, extra, name)
    raw = b"\x07" + MC.u2b(u)
    for i, e in cls["cp"].items():
        if e == raw:
            return i
    for k, e in enumerate(extra):
        if e == raw:
            return cls["cp_count"] + k
    extra.append(raw)
    return cls["cp_count"] + len(extra) - 1


def add_methodref(cls, extra, owner, name, desc):
    c = add_class(cls, extra, owner)
    nt = FV.name_and_type(cls, extra, name, desc)
    raw = b"\x0a" + MC.u2b(c) + MC.u2b(nt)
    for i, e in cls["cp"].items():
        if e == raw:
            return i
    for k, e in enumerate(extra):
        if e == raw:
            return cls["cp_count"] + k
    extra.append(raw)
    return cls["cp_count"] + len(extra) - 1


def walk(code):
    """-> [(pc, opcode)]; switches included, unlike fixbridges.instructions."""
    pc = 0
    while pc < len(code):
        yield pc, code[pc]
        pc += 1 + CD.size(code, pc)


def old_refs(cls):
    out = {}
    for i, e in cls["cp"].items():
        if not e or e[0] != 10:
            continue
        ci = (e[1] << 8) | e[2]
        nt = cls["cp"].get((e[3] << 8) | e[4])
        if not nt or nt[0] != 12:
            continue
        if (MC.class_name(cls, ci) == OWNER
                and MC.utf8(cls, (nt[1] << 8) | nt[2]) == NAME
                and MC.utf8(cls, (nt[3] << 8) | nt[4]) == OLD_DESC):
            out[i] = e
    return out


def patch(path, b, log):
    cls = MC.parse(b)
    refs = old_refs(cls)
    if not refs:
        return None, 0

    found, other = [], []
    for m in cls["methods"]:
        c = MC.code_of(cls, m)
        if not c:
            continue
        code = bytes(c["code"])
        for pc, op in walk(code):
            if op not in (INVOKEVIRTUAL, INVOKESTATIC, 0xB7, 0xB9):
                continue
            idx = (code[pc + 1] << 8) | code[pc + 2]
            if idx not in refs:
                continue
            (found if op == INVOKEVIRTUAL else other).append((m, pc))
    if other:
        log.append((path, "other-invoke", "%d site(s)" % len(other)))
    if not found:
        return None, 0

    extra = []
    helper = add_methodref(cls, extra, HELPER, "get", HELPER_DESC)
    for m, pc in found:
        c = MC.code_of(cls, m)
        c["code"][pc] = INVOKESTATIC
        c["code"][pc + 1] = helper >> 8
        c["code"][pc + 2] = helper & 0xFF
        MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)
    log.append((path, "getMatrices", "%d site(s)" % len(found)))
    return MC.write(cls, extra), len(found)


def check(data):
    """-> (sites left on the old descriptor, accessor calls, compat classes present)"""
    old = new = 0
    seen = set()
    for name, b in data.items():
        if not name.endswith(".class"):
            continue
        cls = MC.parse(b)
        for i in old_refs(cls):
            seen.add((name, i))
        for m in cls["methods"]:
            c = MC.code_of(cls, m)
            if not c:
                continue
            code = bytes(c["code"])
            for pc, op in walk(code):
                if op not in (INVOKEVIRTUAL, INVOKESTATIC, 0xB7, 0xB9):
                    continue
                idx = (code[pc + 1] << 8) | code[pc + 2]
                e = cls["cp"].get(idx)
                if not e or e[0] not in (10, 11):
                    continue
                ci = (e[1] << 8) | e[2]
                nt = cls["cp"].get((e[3] << 8) | e[4])
                if not nt or nt[0] != 12:
                    continue
                owner = MC.class_name(cls, ci)
                nm = MC.utf8(cls, (nt[1] << 8) | nt[2])
                ds = MC.utf8(cls, (nt[3] << 8) | nt[4])
                if owner == OWNER and nm == NAME and ds == OLD_DESC:
                    old += 1
                elif owner == HELPER and nm == "get" and ds == HELPER_DESC:
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
        print("old descriptor call sites: %d" % old)
        print("MioMatrices.get call sites: %d" % new)
        print("compat classes present:     %s" % ("yes" if present else "NO"))
        ok = old == 0 and new > 0 and present
        print("RESULT: %s" % ("PASS" if ok else "FAIL"))
        return 0 if ok else 1

    log = []
    total = 0
    for name, b in list(data.items()):
        if not name.endswith(".class"):
            continue
        new_b, n = patch(name, b, log)
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
        print("%-52s %-14s %s" % ((r[0].split("/")[-1])[:52], r[1], r[2]))

    if not total and not added:
        print("nothing to do")
        old, new, present = check(data)
        print("check: old=%d helper=%d compat=%s" % (old, new, present))
        return 0

    names = [it.filename for it in items] + [
        "me/mioclient/compat/" + c for c in COMPAT_CLASSES
        if "me/mioclient/compat/" + c not in {it.filename for it in items}]
    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for n in names:
            zout.writestr(n, data[n])
    os.replace(tmp, JAR)
    old, new, present = check(read_jar()[1])
    print("patched %d site(s); compat classes written: %d" % (total, added))
    print("check: old=%d helper=%d compat=%s" % (old, new, present))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))
