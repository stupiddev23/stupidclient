#!/usr/bin/env python3
"""Hierarchy-aware verification of the ported jars.

Uses the real 1.21.11 client jar + intermediary mappings to resolve member
references the way the JVM would (walking superclasses and interfaces), so
members that merely moved up the hierarchy are not reported as breakage.
"""
import collections, io, json, os, pickle, re, struct, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
sys.path.insert(0, os.path.join(ROOT, "work"))
import bl

MC = os.path.join(HERE, "mc")
CACHE = os.path.join(HERE, "out", "hierarchy-%s.pkl")
DESC_RE = re.compile(r"L([^;]+);")
NAME_RE = re.compile(r"^L([^;]+);([A-Za-z0-9_$<>]+)(\([^)]*\)(?:\[?[VZBCSIJFD]|\[?L[^;]+;)*)$")


def load_intermediary():
    """tiny v2: official -> intermediary (classes and members)."""
    off2inter, members = {}, {}
    owner = None
    with open(os.path.join(MC, "inter", "mappings", "mappings.tiny"), encoding="utf-8") as fh:
        head = fh.readline().split("\t")
        assert head[0] == "tiny" and head[3] == "official" and head[4].strip() == "intermediary", head
        for line in fh:
            line = line.rstrip("\n")
            if line.startswith("c\t"):
                p = line.split("\t")
                off2inter[p[1]] = p[2]
                owner = p[1]
            elif line.startswith("\tm\t") or line.startswith("\tf\t"):
                p = line.split("\t")
                kind = "METHOD" if p[1] == "m" else "FIELD"
                members[(owner, kind, p[3], p[2])] = p[4]
    return off2inter, members


def build_cache(version="1.21.11"):
    off2inter, membermap = load_intermediary()
    z = zipfile.ZipFile(os.path.join(MC, "client.jar"))

    def tr(n):
        return off2inter.get(n, n)

    def tr_desc(d):
        return DESC_RE.sub(lambda m: "L%s;" % tr(m.group(1)), d)

    def tr_member(owner, kind, name, desc):
        return membermap.get((owner, kind, name, desc), name)

    declared = collections.defaultdict(set)
    parents = {}
    names = set()
    for n in z.namelist():
        if not n.endswith(".class") or ("$" in n and False):
            continue
        try:
            c = bl.Cls(z.read(n))
        except Exception:
            continue
        cls = c.clsname(c.this)
        icls = tr(cls)
        if not icls.startswith(("net/minecraft/", "com/mojang/")):
            continue
        names.add(icls)
        sup = c.clsname(c.super) if c.super else None
        ps = [tr(sup)] if sup else []
        ps += [tr(c.clsname(i)) for i in c.ifaces]
        parents[icls] = ps
        for m in c.fields:
            declared[icls].add(("FIELD", tr_member(cls, "FIELD", m["name"], m["desc"]),
                                tr_desc(m["desc"])))
        for m in c.methods:
            declared[icls].add(("METHOD", tr_member(cls, "METHOD", m["name"], m["desc"]),
                                tr_desc(m["desc"])))
    data = {"declared": dict(declared), "parents": parents, "names": names}
    with open(CACHE % version, "wb") as fh:
        pickle.dump(data, fh)
    print("cached: %d classes, %d with members" % (len(names), len(declared)))
    return data


def load(version="1.21.11"):
    if os.path.exists(CACHE % version):
        data = pickle.load(open(CACHE % version, "rb"))
        print("hierarchy: %d classes (cached)" % len(data["names"]))
        return data
    return build_cache(version)


def resolvable(declared, parents, owner, kind, name, desc):
    """JVM-style lookup: fields walk supers then interfaces, methods too."""
    seen, stack = set(), [owner]
    while stack:
        c = stack.pop()
        if c in seen:
            continue
        seen.add(c)
        if (kind, name, desc) in declared.get(c, ()):
            return c
        stack.extend(parents.get(c, ()))
    return None


def main():
    data = load()
    declared, parents, names = data["declared"], data["parents"], data["names"]

    out = {}
    for jar, label in (("out/mio-1.21.11.jar", "payload"), ("out/mio-loader-1.21.11.jar", "loader")):
        z = zipfile.ZipFile(os.path.join(HERE, jar))
        stat = collections.Counter()
        missing = collections.Counter()
        for cn in z.namelist():
            if not cn.endswith(".class"):
                continue
            try:
                c = bl.Cls(z.read(cn))
            except Exception:
                stat["parse_error"] += 1
                continue
            cp = c.cp
            for e in cp:
                if not e:
                    continue
                if e[0] == "Class":
                    n = c.utf(e[1])
                    if n.startswith("net/minecraft/"):
                        if n in names:
                            stat["class_ok"] += 1
                        else:
                            stat["class_missing"] += 1
                            missing["CLASS " + n] += 1
                elif e[0] == "Utf8":
                    # mixin annotation values are intermediary descriptors now
                    m = NAME_RE.match(e[1])
                    if m and m.group(1).startswith("net/minecraft/"):
                        owner, nm, dm = m.group(1), m.group(2), m.group(3)
                        kind = "METHOD" if dm.startswith("(") else "FIELD"
                        if resolvable(declared, parents, owner, kind, nm, dm):
                            stat["annot_ok"] += 1
                        else:
                            stat["annot_missing"] += 1
                            missing["%s %s.%s%s" % (kind.replace("METHOD", "ANNOT-METHOD"),
                                                     owner, nm, dm)] += 1
                elif e[0] in ("Fieldref", "Methodref", "InterfaceMethodref"):
                    owner = c.clsname(e[1])
                    if not owner.startswith("net/minecraft/"):
                        continue
                    kind = "FIELD" if e[0] == "Fieldref" else "METHOD"
                    nat = cp[e[2]]
                    nm, dm = c.utf(nat[1]), c.utf(nat[2])
                    if nm in ("<init>", "<clinit>"):
                        nm, kind = "<init>", "METHOD"
                    if resolvable(declared, parents, owner, kind, nm, dm):
                        stat["member_ok"] += 1
                    else:
                        stat["member_missing"] += 1
                        missing["%s %s.%s%s" % (kind, owner, nm, dm)] += 1
        out[label] = dict(stat)
        with open(os.path.join(HERE, "out", "missing-%s.tsv" % label), "w") as fh:
            for k, v in missing.most_common():
                fh.write("%d\t%s\n" % (v, k))
        print("\n[%s] %s" % (label, json.dumps(dict(stat))))
        print("   distinct missing: %d" % len(missing))
        for k, v in missing.most_common(25):
            print("   %4d  %s" % (v, k))

    json.dump(out, open(os.path.join(HERE, "out", "verify-hier.json"), "w"), indent=2)


if __name__ == "__main__":
    main()
