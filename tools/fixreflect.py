#!/usr/bin/env python3
"""Retarget intermediary member names that 1.21.11 removed outright.

mio resolves Minecraft members by name at runtime, so the ids it carries are
plain strings inside the class files and the remapper never sees them.  When
1.21.11 kept a member under a new id, tools/fixids.py can translate it through
the Yarn name.  When the member was *deleted*, there is nothing to translate to
and picking a successor is a judgement call, so every entry here is explicit,
with the evidence that justifies it.

    method_19538  Entity.getPos()  ->  method_43390  Entity.getSyncedPos()

1.21.11 has no getPos row for Entity (cgk) at all.  The no-arg Vec3d accessors
that remain are getMovement, getLastRenderPos, getEyePos, getSyncedPos and
getVelocity; getSyncedPos is the position the client uses for rendering, which
is what a HUD position read wants.

    python3 tools/fixreflect.py --check
    python3 tools/fixreflect.py
"""
import os
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")

MANUAL = {
    "method_19538": "method_43390",
}


def main(argv):
    check = "--check" in argv
    src = zipfile.ZipFile(JAR)
    files = {n: src.read(n) for n in src.namelist()}
    src.close()

    out, hits = {}, 0
    for n, data in files.items():
        if not n.endswith(".class"):
            out[n] = data
            continue
        cls = MC.parse(data)
        changed = False
        for i, e in cls["cp"].items():
            if e[0] != 1:
                continue
            s = e[3:].decode("utf-8", "replace")
            new = MANUAL.get(s.strip())
            if new:
                body = new.encode("utf-8")
                cls["cp"][i] = b"\x01" + len(body).to_bytes(2, "big") + body
                changed = True
                hits += 1
                print("  %s: %s -> %s" % (n.split("/")[-1][:24], s, new))
        out[n] = MC.write(cls) if changed else data

    if check:
        print("check: %d site(s)" % hits)
        return 0 if not hits else 1
    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as z:
        for n, data in out.items():
            z.writestr(n, data)
    os.replace(tmp, JAR)
    print("rewrote %d entr(ies)" % hits)
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))
