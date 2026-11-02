#!/usr/bin/env python3
"""Rank the residual breakages and translate them to Yarn names."""
import collections, os, re

HERE = os.path.dirname(os.path.abspath(__file__))
MAP = os.path.join(HERE, "map")
DESC_RE = re.compile(r"L([^;]+);")

i2n = {}
with open(os.path.join(MAP, "inter2named.tsv"), encoding="utf-8") as fh:
    for line in fh:
        a, b = line.rstrip("\n").split("\t")
        i2n[a] = b


def nl(name):
    return i2n.get(name, name)


def nl_desc(d):
    return DESC_RE.sub(lambda m: "L%s;" % nl(m.group(1)), d)


rows = []
with open(os.path.join(HERE, "out", "missing-payload.tsv"), encoding="utf-8") as fh:
    for line in fh:
        cnt, sym = line.rstrip("\n").split("\t", 1)
        rows.append((int(cnt), sym))

out = []
for cnt, sym in rows:
    m = re.match(r"^([A-Z-]+) ([^.]*)\.([^()]*)(.*)$", sym)
    if m:
        kind, owner, name, desc = m.groups()
        out.append((cnt, "%s %s.%s%s" % (kind, nl(owner), name, nl_desc(desc)), sym))
    else:
        out.append((cnt, "CLASS %s" % nl(sym.split(" ", 1)[-1]), sym))

out.sort(key=lambda x: -x[0])
with open(os.path.join(HERE, "out", "PORT-WORK.tsv"), "w", encoding="utf-8") as fh:
    fh.write("# refs\tYarn name (1.21.5 -> missing in 1.21.11)\tintermediary symbol\n")
    for cnt, nice, raw in out:
        fh.write("%d\t%s\t%s\n" % (cnt, nice, raw))

print("total distinct missing symbols:", len(out))
print("total reference instances       :", sum(c for c, _, _ in out))
print("by kind:")
kc = collections.Counter(n.split(" ", 1)[0] for _, n, _ in out)
ki = collections.Counter(n.split(" ", 1)[0] for _, n, _ in out)
for k, v in kc.most_common():
    print("   %-7s %3d distinct  %4d instances" % (k, v, sum(c for c, n, _ in out if n.startswith(k))))
print()
for cnt, nice, raw in out[:45]:
    print("  %4d  %s" % (cnt, nice))
