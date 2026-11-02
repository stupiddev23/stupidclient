#!/usr/bin/env python3
"""Join Yarn 1.21.5 and Yarn 1.21.11 tiny mappings through the `named` namespace.

Produces (in port/map/):
  inter2inter.tiny   tiny-v1: intermediary(1.21.5) -> intermediary(1.21.11)
  named2named.tiny   tiny-v1: named(1.21.5)         -> named(1.21.11)
  inter2named.tsv    intermediary(1.21.5) -> named(1.21.11)   (for reporting)
  unresolved.tsv     things with no counterpart in 1.21.11
  stats.json
"""
import gzip, json, os, re, sys

HERE = os.path.dirname(os.path.abspath(__file__))
MDIR = os.path.join(HERE, "mappings")
OUT = os.path.join(HERE, "map")
os.makedirs(OUT, exist_ok=True)

DESC_RE = re.compile(r"L([^;]+);")


def parse_tiny(path):
    """Parse yarn tiny v1 -> (classes, members).  ns = (official, intermediary, named)."""
    cls = []          # (off, inter, named)
    mem = []          # (kind, owner_off, desc_off, name_off, name_inter, name_named)
    op = gzip.open if path.endswith(".gz") else open
    with op(path, "rt", encoding="utf-8") as fh:
        head = fh.readline().rstrip("\n").split("\t")
        assert head[0] == "v1", head
        namespaces = head[1:]
        assert namespaces[:3] == ["official", "intermediary", "named"], namespaces
        for line in fh:
            line = line.rstrip("\n")
            if not line:
                continue
            p = line.split("\t")
            if p[0] == "CLASS":
                cls.append((p[1], p[2], p[3]))
            elif p[0] in ("FIELD", "METHOD"):
                mem.append((p[0], p[1], p[2], p[3], p[4], p[5]))
    return cls, mem


def build(path):
    cls, mem = parse_tiny(path)
    off2inter, off2named = {}, {}
    inter2named, named2inter = {}, {}
    for off, inter, named in cls:
        off2inter[off] = inter
        off2named[off] = named
        if inter.startswith("net/minecraft/") or named.startswith("net/minecraft/"):
            inter2named[inter] = named
            named2inter[named] = inter
    return cls, mem, off2inter, off2named, inter2named, named2inter


def xlate_desc(desc, table):
    """Rewrite L<class>; in a descriptor using table (old class name -> new)."""
    return DESC_RE.sub(lambda m: "L%s;" % table.get(m.group(1), m.group(1)), desc)


print("parsing yarn 1.21.5 ...")
c5, m5, o2i5, o2n5, i2n5, n2i5 = build(os.path.join(MDIR, "yarn-1.21.5.tiny.gz"))
print("  classes=%d members=%d" % (len(c5), len(m5)))
print("parsing yarn 1.21.11 ...")
c11, m11, o2i11, o2n11, i2n11, n2i11 = build(os.path.join(MDIR, "yarn-1.21.11.tiny.gz"))
print("  classes=%d members=%d" % (len(c11), len(m11)))

# --- class level: named is the bridge ---------------------------------------
named_cls_set11 = set(n2i11)
named_cls_set5 = set(n2i5)

# 1.21.11 member index keyed by the *named* view of 1.21.11
mem11_by_key = {}
mem11_by_owner_name = {}
for kind, owner_off, desc_off, noff, ninter, nnamed in m11:
    owner_named = o2n11.get(owner_off, owner_off)
    desc_named = xlate_desc(desc_off, o2n11)
    key = (owner_named, nnamed, desc_named)
    mem11_by_key[key] = (kind, owner_named, ninter, xlate_desc(desc_off, o2i11))
    mem11_by_owner_name.setdefault((owner_named, nnamed), []).append(
        (kind, ninter, xlate_desc(desc_off, o2i11)))

# --- produce the joins ------------------------------------------------------
inter2inter_cls = []     # (old inter, new inter)
inter2named_cls = []     # (old inter, new named)
unresolved_cls = []
for off, inter, named in c5:
    if not (inter.startswith("net/minecraft/") or named.startswith("net/minecraft/")):
        continue
    if named in named_cls_set11:
        inter2inter_cls.append((inter, n2i11[named]))
        inter2named_cls.append((inter, named))
    else:
        unresolved_cls.append((inter, named))

inter2inter_mem = []     # (kind, owner_old_inter, old_name, old_desc_inter, new_name, new_desc_inter)
renamed_mem = []
desc_changed_mem = []
unresolved_mem = []
for kind, owner_off, desc_off, noff, ninter, nnamed in m5:
    owner_named = o2n5.get(owner_off, owner_off)
    if not owner_named.startswith("net/minecraft/"):
        continue
    owner_inter = o2i5.get(owner_off, owner_off)
    desc_inter = xlate_desc(desc_off, o2i5)
    desc_named = xlate_desc(desc_off, o2n5)
    hit = mem11_by_key.get((owner_named, nnamed, desc_named))
    if hit is not None:
        hk, howner, hname, hdesc = hit
        inter2inter_mem.append((kind, owner_inter, ninter, desc_inter, hname, hdesc))
        if hname != ninter:
            renamed_mem.append((kind, owner_named, ninter, hname, desc_named))
    else:
        alt = mem11_by_owner_name.get((owner_named, nnamed))
        if alt:
            desc_changed_mem.append((kind, owner_named, ninter, desc_named,
                                     [a[2] for a in alt][:3]))
        else:
            unresolved_mem.append((kind, owner_named, ninter, desc_named))

# Intermediary names are stable across versions: everything the bridge did not
# map but that still exists verbatim in 1.21.11 maps to itself.
seen = {old for old, _ in inter2inter_cls}
cls11_inter = set(n2i11.values())
id_cls = []
for off, inter, named in c5:
    if inter in cls11_inter and inter not in seen:
        id_cls.append((inter, inter))
inter2inter_cls += id_cls
print("class: mapped=%d identity=%d unresolved=%d"
      % (len(inter2inter_cls) - len(id_cls), len(id_cls), len(unresolved_cls)))
# identity rows for members whose intermediary name survived verbatim
mem5 = set()
for kind, owner_off, desc_off, noff, ninter, nnamed in m5:
    mem5.add((kind, o2i5.get(owner_off, owner_off), ninter, xlate_desc(desc_off, o2i5)))
mem11 = set()
for kind, owner_off, desc_off, noff, ninter, nnamed in m11:
    mem11.add((kind, o2i11.get(owner_off, owner_off), ninter, xlate_desc(desc_off, o2i11)))
mem_seen = {(kind, owner, old, desc) for kind, owner, old, desc, _, _ in inter2inter_mem}
id_mem = []
for kind, owner, name, desc in sorted(mem5 & mem11):
    if (kind, owner, name, desc) not in mem_seen:
        id_mem.append((kind, owner, name, desc, name, desc))
inter2inter_mem += id_mem
print("member: mapped=%d identity=%d renamed=%d desc-changed=%d removed=%d"
      % (len(inter2inter_mem) - len(id_mem), len(id_mem), len(renamed_mem),
         len(desc_changed_mem), len(unresolved_mem)))


def write_tiny(path, kind_of, rows, ns0, ns1):
    with open(path, "w", encoding="utf-8") as fh:
        fh.write("v1\t%s\t%s\n" % (ns0, ns1))
        for r in rows:
            fh.write("\t".join(r) + "\n")


# tiny file only needs classes + members, owners/descs in *source* namespace
with open(os.path.join(OUT, "inter2inter.tiny"), "w", encoding="utf-8") as fh:
    fh.write("v1\tintermediary-1.21.5\tintermediary-1.21.11\n")
    for old, new in inter2inter_cls:
        fh.write("CLASS\t%s\t%s\n" % (old, new))
    for kind, owner, old, desc, new, ndesc in inter2inter_mem:
        fh.write("%s\t%s\t%s\t%s\t%s\n" % (kind, owner, desc, old, new))

with open(os.path.join(OUT, "named2named.tiny"), "w", encoding="utf-8") as fh:
    fh.write("v1\tnamed-1.21.5\tnamed-1.21.11\n")
    for off, inter, named in c5:
        if named in named_cls_set11:
            fh.write("CLASS\t%s\t%s\n" % (named, named))
    for kind, owner_off, desc_off, noff, ninter, nnamed in m5:
        owner_named = o2n5.get(owner_off, owner_off)
        if not owner_named.startswith("net/minecraft/"):
            continue
        if mem11_by_key.get((owner_named, nnamed, xlate_desc(desc_off, o2n5))):
            # named names are stable; desc may still change -> emit with new desc
            hit = mem11_by_key[(owner_named, nnamed, xlate_desc(desc_off, o2n5))]
            fh.write("%s\t%s\t%s\t%s\t%s\n" % (kind, owner_named, xlate_desc(desc_off, o2n5),
                                               nnamed, nnamed))

with open(os.path.join(OUT, "inter2named.tsv"), "w", encoding="utf-8") as fh:
    for old, named in inter2named_cls:
        fh.write("%s\t%s\n" % (old, named))

with open(os.path.join(OUT, "unresolved.tsv"), "w", encoding="utf-8") as fh:
    fh.write("# classes with no 1.21.11 counterpart\n")
    for old, named in unresolved_cls:
        fh.write("CLASS\t%s\t%s\n" % (old, named))
    fh.write("# members whose name vanished in 1.21.11\n")
    for kind, owner, name, desc in unresolved_mem:
        fh.write("%s\t%s\t%s\t%s\n" % (kind, owner, name, desc))

with open(os.path.join(OUT, "desc-changed.tsv"), "w", encoding="utf-8") as fh:
    for kind, owner, name, desc, cands in desc_changed_mem:
        fh.write("%s\t%s\t%s\t%s\t%s\n" % (kind, owner, name, desc, "|".join(cands)))

# --- machine readable tables used by port/remap.py -------------------------
with open(os.path.join(OUT, "classes.tsv"), "w", encoding="utf-8") as fh:
    for old, new in inter2inter_cls:
        fh.write("%s\t%s\n" % (old, new))

with open(os.path.join(OUT, "members.tsv"), "w", encoding="utf-8") as fh:
    for kind, owner, old, desc, new, ndesc in inter2inter_mem:
        fh.write("%s\t%s\t%s\t%s\t%s\t%s\n" % (kind, owner, old, desc, new, ndesc))

# named -> intermediary for 1.21.11 (used to rewrite mixin annotation values)
with open(os.path.join(OUT, "named-classes.tsv"), "w", encoding="utf-8") as fh:
    for off, inter, named in c11:
        if named.startswith("net/minecraft/"):
            fh.write("%s\t%s\n" % (named, inter))

with open(os.path.join(OUT, "named-members.tsv"), "w", encoding="utf-8") as fh:
    for kind, owner_off, desc_off, noff, ninter, nnamed in m11:
        owner_named = o2n11.get(owner_off, owner_off)
        if not owner_named.startswith("net/minecraft/"):
            continue
        fh.write("%s\t%s\t%s\t%s\t%s\t%s\n" % (
            kind, owner_named, nnamed, xlate_desc(desc_off, o2n11),
            ninter, xlate_desc(desc_off, o2i11)))

with open(os.path.join(OUT, "stats.json"), "w", encoding="utf-8") as fh:
    json.dump({
        "classes_5": len(c5), "members_5": len(m5),
        "classes_11": len(c11), "members_11": len(m11),
        "classes_mapped": len(inter2inter_cls),
        "classes_unresolved": len(unresolved_cls),
        "members_mapped": len(inter2inter_mem),
        "members_renamed": len(renamed_mem),
        "members_desc_changed": len(desc_changed_mem),
        "members_removed": len(unresolved_mem),
    }, fh, indent=2)

print("wrote", OUT)
