#!/usr/bin/env python3
"""Group the unresolvable mixin annotation targets per mixin class."""
import collections, os, re

HERE = os.path.dirname(os.path.abspath(__file__))
i2n = {}
with open(os.path.join(HERE, "map", "inter2named.tsv"), encoding="utf-8") as fh:
    for line in fh:
        a, b = line.rstrip("\n").split("\t")
        i2n[a] = b


def nl(t):
    m = re.match(r"^L([^;]+);(.+)$", t)
    return "%s.%s" % (i2n.get(m.group(1), m.group(1)), m.group(2)) if m else t


groups = collections.defaultdict(list)
with open(os.path.join(HERE, "out", "remap-unresolved.tsv"), encoding="utf-8") as fh:
    for line in fh:
        p = line.rstrip("\n").split("\t")
        if len(p) == 4 and p[0].startswith("NAMED"):
            groups[p[2]].append((p[0].replace("NAMED-", ""), p[3]))

lines = ["# mixin targets with no 1.21.11 counterpart (%d mixin classes, %d targets)"
         % (len(groups), sum(len(v) for v in groups.values())), ""]
for cls in sorted(groups):
    lines.append(cls)
    for kind, raw in groups[cls]:
        lines.append("    %-12s %s" % (kind, nl(raw)))
    lines.append("")
with open(os.path.join(HERE, "out", "MIXIN-WORK.txt"), "w", encoding="utf-8") as fh:
    fh.write("\n".join(lines))
print("mixin classes affected:", len(groups),
      "| targets:", sum(len(v) for v in groups.values()))
