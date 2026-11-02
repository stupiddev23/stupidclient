#!/usr/bin/env python3
"""Port mio (Fabric, Minecraft 1.21.5 + Yarn) to Minecraft 1.21.11.

What is rewritten:
  * intermediary class names in constant pools        -> 1.21.11 intermediary
  * descriptors / signatures containing them          -> 1.21.11
  * MC member references (owner, name, descriptor)    -> 1.21.11
  * Yarn *named* references inside mixin annotation
    values ("Lnet/minecraft/...;name(desc)")          -> 1.21.11 intermediary
  * mio.accesswidener                                 -> 1.21.11
  * fabric.mod.json depends                           -> ~1.21.11
  * refmap.json                                        -> neutralised (the
    annotation values are already intermediary now)

Untouched: encrypted string literals, the Branchlock member tables, the
invokedynamic bootstrap methods, the mod's own obfuscated names.
"""
import collections, io, json, os, re, shutil, struct, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
MAP = os.path.join(HERE, "map")
OUT = os.path.join(HERE, "out")

DESC_RE = re.compile(r"L([A-Za-z0-9_$/.\-]+);")
NAMED_MC_RE = re.compile(r"net/minecraft/(?!class_\d)[A-Za-z0-9_$/]+")
TARGET_RE = re.compile(r"^L([^;]+);([A-Za-z0-9_$<>]+)(\(.*\).*)$")
BARE_RE = re.compile(r"^net/minecraft/class_[0-9]+(?:[$][A-Za-z0-9_]+)*$")
DESCISH_RE = re.compile(r"Lnet/minecraft/class_")


def load_tsv(path, n):
    rows = []
    with open(path, encoding="utf-8") as fh:
        for line in fh:
            p = line.rstrip("\n").split("\t")
            if len(p) >= n:
                rows.append(p)
    return rows


cls_map = dict(load_tsv(os.path.join(MAP, "classes.tsv"), 2))
mem_map = {}
mem_by_name_desc = collections.defaultdict(set)
for kind, owner, old, desc, new, ndesc in load_tsv(os.path.join(MAP, "members.tsv"), 6):
    mem_map[(kind, owner, old, desc)] = (new, ndesc)
    mem_by_name_desc[(kind, old, desc)].add(new)

n2i_cls = dict(load_tsv(os.path.join(MAP, "named-classes.tsv"), 2))
n2i_mem = {}
n2i_mem_by_name_desc = collections.defaultdict(set)
for kind, owner, name, desc, iname, idesc in load_tsv(os.path.join(MAP, "named-members.tsv"), 6):
    n2i_mem[(kind, owner, name, desc)] = (iname, idesc)
    n2i_mem_by_name_desc[(kind, name, desc)].add((iname, idesc))

print("mappings: %d classes, %d members, %d named classes, %d named members"
      % (len(cls_map), len(mem_map), len(n2i_cls), len(n2i_mem)))

stats = collections.Counter()
unresolved = []


def xlate_desc(desc, table=None):
    table = cls_map if table is None else table
    return DESC_RE.sub(lambda m: "L%s;" % table.get(m.group(1), m.group(1)), desc)


def is_mc_inter(n):
    return n.startswith("net/minecraft/class_") or "/class_" in n or "$class_" in n


# ---------------------------------------------------------- constant pools ---
class CP:
    def __init__(self, data):
        r = io.BytesIO(data)
        assert r.read(4) == b"\xca\xfe\xba\xbe"
        self.minor, self.major = struct.unpack(">HH", r.read(4))
        (self.count,) = struct.unpack(">H", r.read(2))
        self.entries = [None] * self.count
        i = 1
        while i < self.count:
            tag = r.read(1)[0]
            if tag == 1:
                (ln,) = struct.unpack(">H", r.read(2))
                raw = r.read(ln)
                self.entries[i] = [1, raw]
            elif tag in (3, 4):
                self.entries[i] = [tag, r.read(4)]
            elif tag in (5, 6):
                self.entries[i] = [tag, r.read(8)]
                i += 1
                self.entries[i] = None          # phantom slot, never serialised
            elif tag in (7, 8, 16, 19, 20):
                self.entries[i] = [tag, r.read(2)]
            elif tag in (9, 10, 11, 12, 17, 18):
                self.entries[i] = [tag, r.read(4)]
            elif tag == 15:
                self.entries[i] = [tag, r.read(3)]
            else:
                raise ValueError("bad cp tag %d at %d" % (tag, i))
            i += 1
        self.rest = r.read()

    def u2(self, payload, off=0):
        return struct.unpack_from(">H", payload, off)[0]

    def text(self, idx):
        e = self.entries[idx]
        return e[1].decode("utf-8", "surrogateescape")

    def set_text(self, idx, s):
        self.entries[idx][1] = s.encode("utf-8", "surrogateescape")

    def class_name(self, idx):
        return self.text(self.u2(self.entries[idx][1]))

    def serialize(self):
        out = bytearray(b"\xca\xfe\xba\xbe" + struct.pack(">HHH", self.minor, self.major, self.count))
        for e in self.entries[1:]:
            if e is None:
                continue
            tag, payload = e
            out.append(tag)
            if tag == 1:
                out += struct.pack(">H", len(payload)) + payload
            else:
                out += payload
        return bytes(out) + self.rest


# ------------------------------------------------------------- named values --
def rewrite_named(text, jar, clsname):
    m = TARGET_RE.match(text)
    if m:
        owner_named, member, desc_named = m.group(1), m.group(2), m.group(3)
        owner_i = n2i_cls.get(owner_named)
        desc_i = xlate_desc(desc_named, n2i_cls)
        if owner_i is None:
            stats["named_owner_unresolved"] += 1
            unresolved.append(("NAMED-OWNER", jar, clsname, text))
            return text
        kind = "METHOD" if desc_named.startswith("(") else "FIELD"
        hit = n2i_mem.get((kind, owner_named, member, desc_named))
        if hit is None:
            cands = n2i_mem_by_name_desc.get((kind, member, desc_named))
            if cands and len(cands) == 1:
                hit = next(iter(cands))
        if hit is None:
            stats["named_member_unresolved"] += 1
            unresolved.append(("NAMED-MEMBER", jar, clsname, text))
            return "L%s;%s%s" % (owner_i, member, desc_i)
        return "L%s;%s%s" % (owner_i, hit[0], hit[1])

    m2 = re.match(r"^([A-Za-z0-9_$<>]+)(\(.*\).*)$", text)
    if m2:
        member, desc_named = m2.group(1), m2.group(2)
        desc_i = xlate_desc(desc_named, n2i_cls)
        cands = n2i_mem_by_name_desc.get(("METHOD", member, desc_named))
        if cands and len(cands) == 1:
            name_i, desc_i2 = next(iter(cands))
            return "%s%s" % (name_i, desc_i2)
        stats["named_method_unresolved"] += 1
        unresolved.append(("NAMED-METHOD", jar, clsname, text))
        return "%s%s" % (member, desc_i)

    if text in n2i_cls:
        return n2i_cls[text]
    stats["named_unclassified"] += 1
    unresolved.append(("NAMED-CLASS", jar, clsname, text))
    return text


# ------------------------------------------------------------------ classes --
def remap_class(data, jar, name):
    cp = CP(data)

    # (1) member references FIRST: the lookup keys are the pre-remap owner /
    #     name / descriptor, so they must be read before anything is rewritten.
    for e in cp.entries:
        if not e or e[0] not in (9, 10, 11):
            continue
        kind = "FIELD" if e[0] == 9 else "METHOD"
        owner = cp.class_name(cp.u2(e[1]))
        if "net/minecraft/" not in owner:
            continue
        nat_i = cp.u2(e[1], 2)
        name_utf = cp.u2(cp.entries[nat_i][1])
        desc_utf = cp.u2(cp.entries[nat_i][1], 2)
        nm, dm = cp.text(name_utf), cp.text(desc_utf)
        if nm in ("<init>", "<clinit>"):
            continue          # yarn tiny omits constructors; identity is correct
        hit = mem_map.get((kind, owner, nm, dm))
        if hit is None and is_mc_inter(owner):
            cands = mem_by_name_desc.get((kind, nm, dm))
            if cands and len(cands) == 1:
                hit = (next(iter(cands)), dm)
        if hit is None:
            if is_mc_inter(owner):
                stats["member_unresolved"] += 1
                unresolved.append((kind, jar, name, "%s.%s%s" % (owner, nm, dm)))
            continue
        newname, newdesc = hit
        if newname != nm:
            stats["member_renamed"] += 1
            cp.set_text(name_utf, newname)
        if newdesc != dm:
            stats["member_desc_rewritten"] += 1
            cp.set_text(desc_utf, newdesc)

    # (2) class names, descriptors and Yarn-named mixin annotation values
    for i, e in enumerate(cp.entries):
        if not e or e[0] == 7 or e[0] == 8:
            continue
        if e[0] == 1:
            t = e[1].decode("utf-8", "surrogateescape")
            if BARE_RE.match(t):
                new = cls_map.get(t)
                if new is None:
                    stats["class_unresolved"] += 1
                    unresolved.append(("CLASS", jar, name, t))
                elif new != t:
                    stats["class_renamed"] += 1
                    cp.set_text(i, new)
            elif DESCISH_RE.search(t):
                new = xlate_desc(t, cls_map)
                if new != t:
                    stats["desc_rewritten"] += 1
                    cp.set_text(i, new)
                    for tok in DESC_RE.findall(t):
                        if "net/minecraft/class_" in tok and tok not in cls_map:
                            stats["desc_class_unresolved"] += 1
            elif "net/minecraft/" in t and NAMED_MC_RE.search(t):
                new = rewrite_named(t, jar, name)
                if new != t:
                    stats["named_rewritten"] += 1
                    cp.set_text(i, new)

    # (3) class entries (e.g. `new X`, class literals, array component types)
    for i, e in enumerate(cp.entries):
        if not e or e[0] != 7:
            continue
        n = cp.class_name(i)
        if "net/minecraft/" not in n or n.startswith("["):
            continue
        new = cls_map.get(n)
        if new is None:
            if is_mc_inter(n):
                stats["class_entry_unresolved"] += 1
                unresolved.append(("CLASS-ENTRY", jar, name, n))
            continue
        if new != n:
            stats["class_entry_renamed"] += 1
            cp.set_text(cp.u2(e[1]), new)

    return cp.serialize()


# --------------------------------------------------------------------- jars --
def remap_jar(src, dst):
    zin = zipfile.ZipFile(src)
    zout = zipfile.ZipFile(dst, "w", zipfile.ZIP_DEFLATED)
    for item in zin.infolist():
        data = zin.read(item.filename)
        if item.filename.endswith(".class"):
            try:
                data = remap_class(data, os.path.basename(src), item.filename)
                stats["classes_remapped"] += 1
            except Exception as ex:
                stats["classes_failed"] += 1
                print("  !! %s: %r" % (item.filename, ex))
        zout.writestr(item, data)
    zout.close()


def remap_accesswidener(text):
    """Rewrite tokens in place, preserving the original whitespace exactly."""
    out, bad = [], 0
    for line in text.splitlines():
        s = line.strip()
        if not s or s.startswith("#"):
            out.append(line)
            continue
        p = s.split()
        if p[0] == "accessWidener" or p[0] not in ("accessible", "extendable", "mutable"):
            out.append(line)
            continue
        if len(p) < 3:
            out.append(line)
            continue
        kind = {"class": "CLASS", "method": "METHOD", "field": "FIELD"}.get(p[1])
        if kind is None:
            out.append(line)
            continue
        if kind == "CLASS":
            new = cls_map.get(p[2]) or n2i_cls.get(p[2])
            if new is None:
                if p[2].startswith("net/minecraft/"):
                    bad += 1
                    unresolved.append(("AW-CLASS", "accesswidener", "", p[2]))
                new = p[2]
            out.append(_respell(line, p, {2: new}))
            continue
        owner, mname = p[2], p[3]
        mdesc = p[4] if len(p) > 4 else ""
        hit = mem_map.get((kind, owner, mname, mdesc))
        if hit is None:
            cands = mem_by_name_desc.get((kind, mname, mdesc))
            hit = (next(iter(cands)), mdesc) if cands and len(cands) == 1 else None
        owner_out = owner
        if hit is None and owner.startswith("net/minecraft/"):
            # entry may be written in Yarn *named* form (loom left it unresolved)
            owner_i = n2i_cls.get(owner)
            if owner_i:
                desc_i = xlate_desc(mdesc, n2i_cls)
                hit = n2i_mem.get((kind, owner, mname, mdesc))
                if hit is None:
                    cands = n2i_mem_by_name_desc.get((kind, mname, mdesc))
                    hit = next(iter(cands)) if cands and len(cands) == 1 else None
                if hit:
                    owner_out = owner_i
        if hit is None and mname in ("<init>", "<clinit>"):
            hit = (mname, xlate_desc(mdesc))
        if hit is None:
            if owner.startswith("net/minecraft/"):
                bad += 1
                unresolved.append(("AW-" + kind, "accesswidener", "", "%s %s %s" % (owner, mname, mdesc)))
            hit = (mname, mdesc)
        changed = {2: owner_out, 3: hit[0], 4: hit[1]}
        out.append(_respell(line, p, changed))
    stats["aw_unresolved"] = bad
    return "\n".join(out) + "\n"


def _respell(line, p, changed):
    """Rebuild a line with specific token indexes replaced, keeping whitespace."""
    if all(p[i] == changed[i] for i in changed):
        return line
    sep = "\t" if "\t" in line else " "
    for i, v in changed.items():
        p[i] = v
    return sep.join(p[:5]) + (line[len(line.rstrip()):] if line != line.rstrip() else "")


def patch_json(data, changes):
    obj = json.loads(data.decode("utf-8"))
    obj.update(changes)
    return json.dumps(obj, indent=2).encode("utf-8")


def postprocess(path, is_loader):
    zin = zipfile.ZipFile(path)
    tmp = path + ".tmp"
    zout = zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED)
    for item in zin.infolist():
        data = zin.read(item.filename)
        if item.filename.endswith(".accesswidener"):
            data = remap_accesswidener(data.decode("utf-8")).encode("utf-8")
        elif item.filename == "fabric.mod.json":
            data = patch_json(data, {"depends": {"minecraft": "~1.21.11",
                                                 "fabricloader": ">=0.16.0",
                                                 "java": ">=21",
                                                 "fabric-api": "*"}})
        elif item.filename == "refmap.json":
            obj = json.loads(data.decode("utf-8"))
            obj["mappings"] = {}
            data = json.dumps(obj, indent=2).encode("utf-8")
        zout.writestr(item, data)
    zout.close()
    shutil.move(tmp, path)


def main():
    os.makedirs(OUT, exist_ok=True)
    payload = os.path.join(OUT, "mio-1.21.11.jar")
    loader = os.path.join(OUT, "mio-loader-1.21.11.jar")
    remap_jar(os.path.join(ROOT, "mio(2).jar"), payload)
    remap_jar(os.path.join(ROOT, "mio-loader(2).jar"), loader)
    postprocess(payload, False)
    postprocess(loader, True)
    with open(os.path.join(OUT, "remap-stats.json"), "w") as fh:
        json.dump(dict(stats), fh, indent=2)
    with open(os.path.join(OUT, "remap-unresolved.tsv"), "w") as fh:
        for row in unresolved:
            fh.write("\t".join(str(x) for x in row) + "\n")
    print(json.dumps(dict(stats), indent=2))
    print("unresolved rows:", len(unresolved))


if __name__ == "__main__":
    main()
