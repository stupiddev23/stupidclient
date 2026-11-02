#!/usr/bin/env python3
"""Report what the port actually changed (not what the mapping contains)."""
import os, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
sys.path.insert(0, os.path.join(ROOT, "work"))
import bl

pairs = [("mio(2).jar", "out/mio-1.21.11.jar"),
         ("mio-loader(2).jar", "out/mio-loader-1.21.11.jar")]

for src, dst in pairs:
    za = zipfile.ZipFile(os.path.join(ROOT, src))
    zb = zipfile.ZipFile(os.path.join(HERE, dst))
    same = modified = added = 0
    for n in za.namelist():
        a = za.read(n)
        b = zb.read(n) if n in zb.namelist() else None
        if b is None:
            added += 1
        elif a == b:
            same += 1
        else:
            modified += 1
    print("%s -> %s" % (src, dst))
    print("   entries identical=%d modified=%d missing=%d" % (same, modified, added))
    if src.endswith("loader(2).jar"):
        a = za.read("mio.accesswidener").decode().splitlines()
        b = zb.read("mio.accesswidener").decode().splitlines()
        print("   accesswidener lines=%d changed=%d" % (len(a), sum(1 for x, y in zip(a, b) if x != y)))
    # how many of this jar's MC member refs needed a *rename* (vs. left alone)?
    ren = desc = ident = 0
    for n in za.namelist():
        if not n.endswith(".class"):
            continue
        ca, cb = bl.Cls(za.read(n)), bl.Cls(zb.read(n))
        for ea, eb in zip(ca.cp, cb.cp):
            if not ea or ea[0] not in ("Fieldref", "Methodref", "InterfaceMethodref"):
                continue
            if not ca.clsname(ea[1]).startswith("net/minecraft/"):
                continue
            na, nb = ca.cp[ea[2]], cb.cp[eb[2]]
            if ca.utf(na[1]) != cb.utf(nb[1]):
                ren += 1
            elif ca.utf(na[2]) != cb.utf(nb[2]):
                desc += 1
            else:
                ident += 1
    print("   MC member refs: renamed=%d descriptor-changed=%d untouched=%d" % (ren, desc, ident))
