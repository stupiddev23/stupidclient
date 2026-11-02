#!/usr/bin/env python3
"""Verify the ported jars against the 1.21.11 mappings.

Every net/minecraft reference left in the output jars must exist in 1.21.11:
classes (intermediary), members (intermediary name + descriptor), and the
mixin annotation values (which are now intermediary too).
"""
import collections, gzip, json, os, re, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
sys.path.insert(0, os.path.join(ROOT, "work"))
import bl

MDIR = os.path.join(HERE, "mappings")
DESC_RE = re.compile(r"L([^;]+);")
NAME_RE = re.compile(r"^L([^;]+);([A-Za-z0-9_$<>]+)(\(.*\).*)$")
BARE_RE = re.compile(r"^net/minecraft/class_[0-9]+(?:[$][A-Za-z0-9_]+)*$")


def parse_tiny(path):
    cls, mem = [], []
    with gzip.open(path, "rt", encoding="utf-8") as fh:
        fh.readline()
        for line in fh:
            p = line.rstrip("\n").split("\t")
            if p[0] == "CLASS":
                cls.append((p[1], p[2]))
            elif p[0] in ("FIELD", "METHOD"):
                mem.append((p[0], p[1], p[2], p[4]))
    return cls, mem


c11, m11 = parse_tiny(os.path.join(MDIR, "yarn-1.21.11.tiny.gz"))
o2i = {off: inter for off, inter in c11}
classes11 = set(o2i.values())
members11 = set()
mem_by_owner_name = collections.defaultdict(set)
for kind, owner_off, desc_off, ninter in m11:
    owner = o2i.get(owner_off, owner_off)
    desc = DESC_RE.sub(lambda m: "L%s;" % o2i.get(m.group(1), m.group(1)), desc_off)
    members11.add((kind, owner, ninter, desc))
    mem_by_owner_name[(kind, owner, ninter)].add(desc)

print("1.21.11: %d classes, %d members" % (len(classes11), len(members11)))

results = {}
for jar, label in (("out/mio-1.21.11.jar", "payload"), ("out/mio-loader-1.21.11.jar", "loader")):
    z = zipfile.ZipFile(os.path.join(HERE, jar))
    stat = collections.Counter()
    dangling = []
    for cn in z.namelist():
        if not cn.endswith(".class"):
            continue
        data = z.read(cn)
        try:
            c = bl.Cls(data)
        except Exception as ex:
            stat["parse_error"] += 1
            continue
        stat["classes"] += 1
        cp = c.cp
        # class names, where they are plain Utf8 constants
        for i, e in enumerate(cp):
            if not e:
                continue
            if e[0] == "Class":
                n = c.utf(e[1])
                if n.startswith("net/minecraft/") and n not in classes11:
                    stat["class_missing"] += 1
                    dangling.append(("CLASS", cn, n))
            elif e[0] in ("Fieldref", "Methodref", "InterfaceMethodref"):
                owner = c.clsname(e[1])
                if not owner.startswith("net/minecraft/"):
                    continue
                kind = "FIELD" if e[0] == "Fieldref" else "METHOD"
                nat = cp[e[2]]
                nm, dm = c.utf(nat[1]), c.utf(nat[2])
                if nm in ("<init>", "<clinit>"):
                    continue
                if (kind, owner, nm, dm) in members11:
                    stat["member_ok"] += 1
                else:
                    stat["member_missing"] += 1
                    dangling.append((kind, cn, "%s.%s%s" % (owner, nm, dm)))
        # leftover Yarn *named* references (mixin annotation values)
        for e in cp:
            if e and e[0] == "Utf8" and "net/minecraft/" in e[1] and "class_" not in e[1]:
                stat["named_leftover"] += 1
                dangling.append(("NAMED", cn, e[1][:100]))
    results[label] = dict(stat)
    with open(os.path.join(HERE, "out", "verify-%s.tsv" % label), "w") as fh:
        for row in dangling:
            fh.write("\t".join(row) + "\n")
    print("\n[%s] %s" % (label, jar))
    print("   " + json.dumps(dict(stat)))

json.dump(results, open(os.path.join(HERE, "out", "verify.json"), "w"), indent=2)
