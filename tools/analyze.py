#!/usr/bin/env python3
"""Measure how much of the mod's 1.21.5 surface survives in 1.21.11.

Classification of each referenced MC member:
  mapped      - yarn-named bridge found a 1.21.11 counterpart (maybe renamed)
  desc-changed- same name exists, descriptor differs
  identity    - no named counterpart but the intermediary name still exists verbatim
  GONE        - intermediary name no longer present in 1.21.11
"""
import collections, gzip, json, os, re, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
sys.path.insert(0, os.path.join(ROOT, "work"))
import bl

MAP = os.path.join(HERE, "map")
MDIR = os.path.join(HERE, "mappings")
DESC_RE = re.compile(r"L([^;]+);")


def parse_tiny_plain(path):
    cls = []
    mem = []
    op = gzip.open if path.endswith(".gz") else open
    with op(path, "rt", encoding="utf-8") as fh:
        fh.readline()
        for line in fh:
            p = line.rstrip("\n").split("\t")
            if p[0] == "CLASS":
                cls.append((p[1], p[2], p[3]))
            elif p[0] in ("FIELD", "METHOD"):
                mem.append((p[0], p[1], p[2], p[3], p[4], p[5]))
    return cls, mem


def xlate(desc, table):
    return DESC_RE.sub(lambda m: "L%s;" % table.get(m.group(1), m.group(1)), desc)


# ------------------------------------------------- 1.21.11 intermediary sets -
c11, m11 = parse_tiny_plain(os.path.join(MDIR, "yarn-1.21.11.tiny.gz"))
o2i11 = {off: inter for off, inter, named in c11}
inter_classes_11 = set(o2i11.values()) | {i for _, i, _ in c11}
inter_members_11 = set()
inter_members_11_by_owner_name = collections.defaultdict(set)
for kind, owner_off, desc_off, noff, ninter, nnamed in m11:
    owner = o2i11.get(owner_off, owner_off)
    t = (kind, owner, ninter, xlate(desc_off, o2i11))
    inter_members_11.add(t)
    inter_members_11_by_owner_name[(kind, owner, ninter)].add(t[3])

# ------------------------------------------------------ yarn-named bridge map -
bridge_cls, bridge_mem = {}, {}
with open(os.path.join(MAP, "inter2inter.tiny"), encoding="utf-8") as fh:
    fh.readline()
    for line in fh:
        p = line.rstrip("\n").split("\t")
        if p[0] == "CLASS":
            bridge_cls[p[1]] = p[2]
        elif p[0] in ("FIELD", "METHOD"):
            bridge_mem[(p[0], p[1], p[3], p[2])] = (p[4], p[5] if len(p) > 5 else p[4])

print("bridge: %d classes, %d members | 1.21.11 intermediary: %d classes, %d members"
      % (len(bridge_cls), len(bridge_mem), len(inter_classes_11), len(inter_members_11)))


# ------------------------------------------------------------- jar scanning --
def scan_class(data):
    c = bl.Cls(data)
    cp = c.cp
    for e in cp:
        if not e:
            continue
        if e[0] == "Class":
            yield ("C", c.utf(e[1]))
        elif e[0] in ("Fieldref", "Methodref", "InterfaceMethodref"):
            owner = c.clsname(e[1])
            nat = cp[e[2]]
            yield ("FIELD" if e[0] == "Fieldref" else "METHOD",
                   owner, c.utf(nat[1]), c.utf(nat[2]))


refs = collections.Counter()
classes = collections.defaultdict(set)     # jar -> classes
members = collections.defaultdict(set)     # jar -> members
for jarname in ("mio(2).jar", "mio-loader(2).jar"):
    z = zipfile.ZipFile(os.path.join(ROOT, jarname))
    for n in z.namelist():
        if not n.endswith(".class"):
            continue
        for r in scan_class(z.read(n)):
            if r[0] == "C":
                if r[1].startswith("net/minecraft/"):
                    refs[r] += 1
                    classes[jarname].add(r[1])
            else:
                # only MC-owned members need version mapping; but a mod-owned
                # member may still have an MC type in its descriptor
                if r[1].startswith("net/minecraft/"):
                    refs[r] += 1
                    members[jarname].add(r)

all_classes = set().union(*classes.values())
all_members = set().union(*members.values())
print("distinct MC classes referenced:", len(all_classes))
print("distinct MC members referenced:", len(all_members))
print("class-ref instances:", sum(v for r, v in refs.items() if r[0] == "C"))
print("member-ref instances:", sum(v for r, v in refs.items() if r[0] != "C"))

# ------------------------------------------------------------- resolution ----
stat = collections.Counter()
gone_classes, gone_members, desc_changed, unmapped_by_bridge = [], [], [], []

for c in sorted(all_classes):
    if c in bridge_cls:
        stat["class_mapped"] += 1
        if bridge_cls[c] != c:
            stat["class_renamed"] += 1
    elif c in inter_classes_11:
        stat["class_identity"] += 1
    else:
        stat["class_GONE"] += 1
        gone_classes.append((c, refs[("C", c)]))

for (kind, owner, name, desc) in sorted(all_members):
    key = (kind, owner, name, desc)
    if key in bridge_mem:
        nname, ndesc = bridge_mem[key]
        if ndesc != desc:
            stat["member_desc_changed"] += 1
            desc_changed.append((kind, owner, name, desc, nname, ndesc, refs[key]))
        else:
            stat["member_mapped"] += 1
            if nname != name:
                stat["member_renamed"] += 1
    elif key in inter_members_11:
        stat["member_identity"] += 1
    else:
        unmapped_by_bridge.append(key)
        if (kind, owner, name) in inter_members_11_by_owner_name:
            stat["member_desc_changed"] += 1
            desc_changed.append((kind, owner, name, desc, name, None, refs[key]))
        else:
            stat["member_GONE"] += 1
            gone_members.append((kind, owner, name, desc, refs[key]))

# the runtime-visible cost: instances affected
inst_gone = sum(v for r, v in refs.items() if r[0] == "C" and r[1] not in bridge_cls
                and r[1] not in inter_classes_11) + \
            sum(v for r, v in refs.items() if r[0] != "C" and
                (r[0], r[1], r[2], r[3]) not in bridge_mem and
                r not in inter_members_11 and
                (r[0], r[1], r[2]) not in inter_members_11_by_owner_name)

summary = {
    "classes_referenced": len(all_classes),
    "class_ref_instances": sum(v for r, v in refs.items() if r[0] == "C"),
    "classes_mapped_by_name": stat["class_mapped"] - stat["class_renamed"],
    "classes_renamed": stat["class_renamed"],
    "classes_intermediary_stable": stat["class_identity"],
    "classes_GONE": stat["class_GONE"],
    "members_referenced": len(all_members),
    "members_mapped_by_name": stat["member_mapped"] - stat["member_renamed"],
    "members_renamed": stat["member_renamed"],
    "members_intermediary_stable": stat["member_identity"],
    "members_descriptor_changed": stat["member_desc_changed"],
    "members_GONE": stat["member_GONE"],
    "unresolved_ref_instances": inst_gone,
}
print(json.dumps(summary, indent=2))
json.dump(summary, open(os.path.join(HERE, "analysis.json"), "w"), indent=2)

with open(os.path.join(HERE, "unresolved-refs.tsv"), "w") as fh:
    fh.write("# kind\towner\tname\tdesc\tinstances\n")
    for c, n in sorted(gone_classes, key=lambda x: -x[1]):
        fh.write("C\t%s\t\t\t%d\n" % (c, n))
    for k, o, n, d, cnt in sorted(gone_members, key=lambda x: -x[4]):
        fh.write("%s\t%s\t%s\t%s\t%d\n" % (k, o, n, d, cnt))
    for k, o, n, d, nn, nd, cnt in sorted(desc_changed, key=lambda x: -x[6]):
        fh.write("%s\t%s\t%s\t%s\t%d\tDESC-CHANGED-> %s%s\n" % (k, o, n, d, cnt, nn, nd))

print("\n=== classes gone (%d)" % len(gone_classes))
for c, n in sorted(gone_classes, key=lambda x: -x[1])[:30]:
    print("   %5d  %s" % (n, c))
print("\n=== members gone (%d), top by usage" % len(gone_members))
for k, o, n, d, cnt in sorted(gone_members, key=lambda x: -x[4])[:40]:
    print("   %5d  %s %s.%s%s" % (cnt, k, o, n, d[:70]))
print("\n=== descriptor changed (%d), top by usage" % len(desc_changed))
for row in sorted(desc_changed, key=lambda x: -x[6])[:25]:
    k, o, n, d, nn, nd, cnt = row
    print("   %5d  %s %s.%s%s  ->  %s%s" % (cnt, k, o, n, d[:60], nn, (nd or "")[:60]))
