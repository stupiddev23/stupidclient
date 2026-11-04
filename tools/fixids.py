#!/usr/bin/env python3
"""Retarget hardcoded 1.21.5 intermediary member ids that 1.21.11 no longer has.

mio resolves a lot of Minecraft members by name at runtime (reflection on the
intermediary-named game), so the ids it carries are plain strings in the class
files rather than constant-pool references -- the remapper cannot touch them.
When 1.21.11 renamed a member, the lookup throws NoSuchMethodException at the
first frame that needs it.

Both Yarn mappings are on disk, and their METHOD/FIELD rows carry the owner's
official class name, so an old id can be translated through the Yarn name:

    (owner intermediary, yarn name) -> id   for 1.21.5 and 1.21.11

Intermediary class ids are stable across versions, which is what makes the
owner survive the trip.  Only unambiguous single-candidate translations are
applied; everything else is reported and left alone.

    python3 tools/fixids.py --check   # report, change nothing
    python3 tools/fixids.py           # rewrite the jar
"""
import gzip
import os
import re
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")
OLD = os.path.join(HERE, "mappings", "yarn-1.21.5.tiny.gz")
NEW = os.path.join(HERE, "mappings", "yarn-1.21.11.tiny.gz")

MEMBER = re.compile(r"^(method|field)_\d+$")
IDENT = re.compile(r"^[A-Za-z_$][A-Za-z0-9_$]*$")
TOKEN = re.compile(r"\b(method_\d+|field_\d+)\b")


def load(path):
    """-> ({(owner intermediary, yarn name): id}, set of live ids)"""
    off2inter = {}
    rows = []
    for line in gzip.open(path, "rt", encoding="utf-8"):
        f = line.rstrip("\n").split("\t")
        if f[0] == "CLASS":
            off2inter[f[1]] = f[2]
        elif f[0] in ("METHOD", "FIELD") and len(f) >= 4:
            owner = off2inter.get(f[1])
            inter = next((t for t in f[1:] if MEMBER.match(t)), None)
            tail = [t for t in f[1:] if IDENT.match(t)
                    and t != inter and t != f[1]]
            named = tail[-1] if tail else None
            rows.append((owner, named, inter))
    return {(o, n): i for (o, n, i) in rows if o and n}, {i for (_o, _n, i) in rows}


def rewrite(entry, s):
    """Rebuild a CONSTANT_Utf8 pool entry with a different string."""
    body = s.encode("utf-8")
    return b"\x01" + len(body).to_bytes(2, "big") + body


def main(argv):
    # Report-only unless asked: a translation is a rename, and most of the
    # stale names in this jar are removals with no counterpart, which this
    # tool must not paper over.
    check = "--apply" not in argv
    old, live = load(OLD)
    new, live_new = load(NEW)

    src = zipfile.ZipFile(JAR)
    files = {n: src.read(n) for n in src.namelist()}
    src.close()

    used = {}
    for n, data in files.items():
        if not n.endswith(".class"):
            continue
        cls = MC.parse(data)
        for i, e in cls["cp"].items():
            if e[0] != 1:
                continue
            for tok in TOKEN.findall(e[3:].decode("utf-8", "replace")):
                if tok not in live_new:
                    used.setdefault(tok, set()).add(n)

    plan, skipped = {}, []
    for tok, where in sorted(used.items()):
        keys = [k for k, v in old.items() if v == tok]
        # A field must stay a field: without this the tool happily rewrote
        # field_56741 to a method id, which would only move the failure.
        kind = tok.split("_")[0]
        cands = {new[k] for k in keys
                 if k in new and new[k].split("_")[0] == kind}
        if len(cands) == 1:
            plan[tok] = cands.pop()
        else:
            skipped.append((tok, len(cands), sorted(where)[:2]))

    print("stale member ids in the jar: %d" % len(used))
    print("translated: %d   unresolved: %d" % (len(plan), len(skipped)))
    for a, b in sorted(plan.items())[:26]:
        print("  %-14s -> %-14s" % (a, b))
    if len(plan) > 26:
        print("  ... %d more" % (len(plan) - 26))
    for tok, k, where in skipped[:12]:
        print("  UNRESOLVED %-14s candidates=%d %s" % (tok, k, where))
    if check:
        return 0

    out = {}
    hits = 0
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
            t = s.strip()
            if t in plan:
                cls["cp"][i] = rewrite(e, plan[t])
                changed = True
                hits += 1
        out[n] = MC.write(cls) if changed else data

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as z:
        for n, data in out.items():
            z.writestr(n, data)
    os.replace(tmp, JAR)
    print("rewrote %d entries" % hits)
    return 0


if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))
