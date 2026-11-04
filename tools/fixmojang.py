#!/usr/bin/env python3
"""Neutralise code that calls com.mojang members 1.21.11 no longer has.

net.minecraft is remapped to intermediary, but com.mojang.* is not: those names
are compiled in literally, so a Mojang-side change is a plain NoSuchMethodError
at runtime with no mapping to bridge.  The first one to fire was

    NoSuchMethodError: 'void ...RenderSystem.setShaderColor(float, float, float, float)'

from mio's custom HUD renderer.  1.21.11 replaced that whole layer: colour,
scissor, line width and textures moved onto RenderPass / per-pipeline uniforms,
and RenderPipeline.Builder changed shape.

Stubbing is only safe for void methods with no arguments that must produce a
value, so anything else is reported and left alone.  The tool works from
tools/mc/client.jar, so it stays accurate if that jar is refreshed.

    python3 tools/fixmojang.py           # patch jars/mio-1.21.11.jar
    python3 tools/fixmojang.py --check   # report, change nothing
    python3 tools/fixmojang.py --list    # show what would be stubbed
"""
import os
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC
import classdump as CD

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")
CLIENT = os.path.join(HERE, "mc", "client.jar")
RETURN = b"\xb1"


def walk(code):
    pc = 0
    while pc < len(code):
        yield pc, code[pc]
        pc += 1 + CD.size(code, pc)


class Vanilla:
    """Members of the 1.21.11 client jar, for detecting removed ones."""

    def __init__(self, path):
        self.z = zipfile.ZipFile(path)
        self.names = set(self.z.namelist())
        self.cache = {}

    def members(self, owner):
        if owner in self.cache:
            return self.cache[owner]
        out = set()
        p = owner + ".class"
        if p in self.names:
            c = MC.parse(self.z.read(p))
            for m in c["methods"]:
                out.add((MC.utf8(c, m["name"]), MC.utf8(c, m["desc"])))
            for f in c["fields"]:
                out.add((MC.utf8(c, f["name"]), MC.utf8(c, f["desc"])))
        self.cache[owner] = out
        return out


def refs(cls, code, vanilla):
    """-> [(owner, name, desc)] for com.mojang members this code calls
    that the 1.21.11 client jar no longer declares."""
    out = []
    for pc, op in walk(code):
        if op not in (0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9):
            continue
        e = cls["cp"].get((code[pc + 1] << 8) | code[pc + 2])
        if not e or e[0] not in (9, 10, 11):
            continue
        owner = MC.class_name(cls, (e[1] << 8) | e[2])
        if not owner or not owner.startswith("com/mojang/"):
            continue
        if owner + ".class" not in vanilla.names:
            continue
        nt = cls["cp"].get((e[3] << 8) | e[4])
        if not nt or nt[0] != 12:
            continue
        name = MC.utf8(cls, (nt[1] << 8) | nt[2])
        desc = MC.utf8(cls, (nt[3] << 8) | nt[4])
        if (name, desc) not in vanilla.members(owner):
            out.append((owner, name, desc))
    return out


def sites(cls, vanilla):
    out = []
    for m in cls["methods"]:
        c = MC.code_of(cls, m)
        if not c:
            continue
        r = refs(cls, bytes(c["code"]), vanilla)
        if r:
            out.append((m, c, r))
    return out


def stub(cls, m, c):
    c["code"] = bytearray(RETURN)
    c["max_stack"] = 0
    c["handlers"] = b""
    c["attrs"] = []
    MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)


def scan(data, vanilla):
    """-> (stubbable, blocked) lists of (class, method, desc, refs)."""
    stubbable, blocked = [], []
    for name, b in data.items():
        if not name.endswith(".class"):
            continue
        cls = MC.parse(b)
        for m, c, r in sites(cls, vanilla):
            if bytes(c["code"]) == RETURN:
                continue
            entry = (name, MC.utf8(cls, m["name"]), MC.utf8(cls, m["desc"]), r)
            # <clinit> is not stubbable: zeroing it would leave the class's
            # static fields uninitialised rather than merely unused.
            if (entry[2].endswith(")V")
                    and entry[1] not in ("<init>", "<clinit>")):
                stubbable.append(entry)
            else:
                blocked.append(entry)
    return stubbable, blocked


def read_jar():
    z = zipfile.ZipFile(JAR)
    items = z.infolist()
    data = {it.filename: z.read(it.filename) for it in items}
    z.close()
    return items, data


def main(argv):
    vanilla = Vanilla(CLIENT)
    items, data = read_jar()

    if "--list" in argv or "--check" in argv:
        stubbable, blocked = scan(data, vanilla)
        live = sum(len(e[3]) for e in stubbable)
        print("void methods calling removed members: %d (%d calls)" % (len(stubbable), live))
        for name, meth, desc, r in sorted(stubbable):
            print("  %-44s %-26s %s" % (name.split("/")[-1][:44], meth[:26], r[0][1] + r[0][2][:20]))
        print("other methods calling removed members: %d" % len(blocked))
        for name, meth, desc, r in sorted(blocked):
            print("  %-44s %-26s %s" % (name.split("/")[-1][:44], meth[:26], desc[:34]))
        if "--check" in argv:
            ok = live == 0 and not blocked
            print("RESULT: %s" % ("PASS" if ok else "FAIL"))
            return 0 if ok else 1
        return 0

    stubbable, blocked = scan(data, vanilla)
    for name, meth, desc, r in blocked:
        print("%-40s %-24s NEEDS PORT (%s)" % (name.split("/")[-1][:40], meth[:24], desc[:30]))
    if blocked:
        print("refusing to patch: %d method(s) cannot be stubbed" % len(blocked))
        return 1

    for name, meth, desc, r in stubbable:
        cls = MC.parse(data[name])
        for m in cls["methods"]:
            if MC.utf8(cls, m["name"]) == meth and MC.utf8(cls, m["desc"]) == desc:
                stub(cls, m, MC.code_of(cls, m))
                break
        data[name] = MC.write(cls)
        print("%-40s %-24s disabled (%d call(s))" % (name.split("/")[-1][:40], meth[:24], len(r)))

    if not stubbable:
        print("nothing to do")
        return 0

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it.filename, data[it.filename])
    os.replace(tmp, JAR)
    left, still = scan(read_jar()[1], vanilla)
    print("remaining: %d stubbable, %d blocked" % (len(left), len(still)))
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))
