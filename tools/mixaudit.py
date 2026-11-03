#!/usr/bin/env python3
"""Audit mixin annotation targets in jars/mio-1.21.11.jar against MC 1.21.11.

Targets the port could not resolve are still in 1.21.5 Yarn form: bare member
names (`alpha`), `Lowner;name(desc)`, or dotted class paths
(`net.minecraft.x.Y`).  Each is bridged through its 1.21.5 intermediary id,
because intermediary ids are stable across versions: if the id still exists in
1.21.11 the target survives (possibly with a new descriptor); if not, the symbol
was really removed and the mixin needs porting, not renaming.

Statuses
    OK           resolves as-is
    FIX          resolvable; `repl` is the 1.21.11 intermediary replacement
    MOVED        unique 1.21.11 member with the same Yarn name, other owner
    NEEDS-PORT   no mapping-level counterpart
    CLASS-GONE   the @Mixin target class itself no longer exists

Every row keeps the absolute offset of the operand that holds the string, so the
patch pass can repoint just that occurrence.
"""
import collections, gzip, json, os, re, struct, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")
MC = os.path.join(HERE, "mc", "client.jar")
Y5 = os.path.join(HERE, "mappings", "yarn-1.21.5.tiny.gz")
Y11 = os.path.join(HERE, "mappings", "yarn-1.21.11.tiny.gz")
OUT = os.environ.get("MIXAUDIT_OUT", "/tmp/mixaudit.json")

# --------------------------------------------------------------- class files
class R:
    __slots__ = ("b", "o")
    def __init__(s, b): s.b = b; s.o = 0
    def u1(s): v = s.b[s.o]; s.o += 1; return v
    def u2(s): v = struct.unpack_from(">H", s.b, s.o)[0]; s.o += 2; return v
    def u4(s): v = struct.unpack_from(">I", s.b, s.o)[0]; s.o += 4; return v
    def take(s, n): v = s.b[s.o:s.o + n]; s.o += n; return v


def parse_cp(r):
    n = r.u2(); cp = {}; i = 1
    while i < n:
        t = r.u1()
        if t == 1:
            l = r.u2(); cp[i] = ["utf8", r.take(l).decode("utf-8", "replace")]
        elif t in (3, 4): cp[i] = ["n", r.take(4)]
        elif t in (5, 6): cp[i] = ["n", r.take(8)]; i += 1
        elif t == 7: cp[i] = ["class", r.u2()]
        elif t == 8: cp[i] = ["string", r.u2()]
        elif t in (16, 19, 20): cp[i] = ["ref", r.u2()]
        elif t in (9, 10, 11, 12, 17, 18): cp[i] = ["pair", r.u2(), r.u2()]
        elif t == 15: cp[i] = ["mh", r.u1(), r.u2()]
        else: raise ValueError("cp tag %d" % t)
        i += 1
    return cp


class CF:
    """Class file with runtime annotations and the offsets of their operands."""

    def __init__(self, b):
        self.b = b
        self.r = R(b)
        self.r.u4(); self.r.u2(); self.r.u2()
        self.cp = parse_cp(self.r)
        self.acc = self.r.u2()
        self.name = self.cls(self.r.u2())
        sup = self.r.u2()
        self.super = self.cls(sup) if sup else None
        self.ifaces = [self.cls(self.r.u2()) for _ in range(self.r.u2())]
        self.fields = self.members("field")
        self.methods = self.members("method")
        self.ann = self.attrs()

    def u(s, i):
        e = s.cp.get(i)
        return e[1] if e and e[0] == "utf8" else None

    def cls(s, i):
        e = s.cp.get(i)
        if not e: return None
        if e[0] == "class": return s.u(e[1])
        if e[0] == "utf8": return e[1]
        return None

    def ev(s):
        pos = s.r.o
        tag = chr(s.r.u1())
        if tag == "s": return {"tag": "s", "off": s.r.o, "val": s.u(s.r.u2())}
        if tag == "c": return {"tag": "c", "off": s.r.o, "val": s.u(s.r.u2())}
        if tag in "BCDFIJSZ": s.r.u2(); return {"tag": tag}
        if tag == "e": return {"tag": "e", "val": (s.u(s.r.u2()), s.u(s.r.u2()))}
        if tag == "@": return {"tag": "@", "val": s.ann1()}
        if tag == "[":
            return {"tag": "[", "val": [s.ev() for _ in range(s.r.u2())]}
        raise ValueError("ev tag %r at %d" % (tag, pos))

    def ann1(s):
        t = s.u(s.r.u2()); pairs = []
        for _ in range(s.r.u2()):
            k = s.u(s.r.u2()); pairs.append((k, s.ev()))
        return {"type": t, "v": dict(pairs)}

    def attrs(s):
        out = []
        for _ in range(s.r.u2()):
            nm = s.u(s.r.u2()); l = s.r.u4(); start = s.r.o
            if nm in ("RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"):
                out += [s.ann1() for _ in range(s.r.u2())]
            s.r.o = start + l
        return out

    def members(s, kind):
        out = []
        for _ in range(s.r.u2()):
            s.r.u2()
            noff = s.r.o; nm = s.u(s.r.u2()); desc = s.u(s.r.u2())
            out.append({"kind": kind, "name": nm, "desc": desc, "name_off": noff,
                        "ann": s.attrs()})
        return out


def short(t):
    return (t or "").lstrip("L").rstrip(";").split("/")[-1]


def strings_in(ev):
    """Flatten an element value into its string operands."""
    if not ev: return []
    if ev["tag"] in ("s", "c"): return [ev]
    if ev["tag"] == "[": return [x for it in ev["val"] for x in strings_in(it)]
    return []


def anns_in(ev):
    """Nested annotations (e.g. @At inside @Inject)."""
    if not ev: return []
    if ev["tag"] == "@": return [ev["val"]]
    if ev["tag"] == "[": return [x for it in ev["val"] for x in anns_in(it)]
    return []


# ------------------------------------------------------------------ mappings
DESC_RE = re.compile(r"L([^;]+);")


def xlate_desc(d, table):
    return DESC_RE.sub(lambda m: "L%s;" % table.get(m.group(1), m.group(1)), d)


class Mapping:
    def __init__(self, path):
        self.off2i, self.i2n, self.n2i, self.off2n = {}, {}, {}, {}
        mem = []
        with gzip.open(path, "rt") as fh:
            fh.readline()
            for line in fh:
                p = line.rstrip("\n").split("\t")
                if p[0] == "CLASS":
                    self.off2i[p[1]] = p[2]; self.i2n[p[2]] = p[3]
                    self.n2i[p[3]] = p[2]; self.off2n[p[1]] = p[3]
                elif p[0] in ("FIELD", "METHOD"):
                    mem.append((p[0], p[1], p[2], p[3], p[4], p[5]))
        self.i2off = {v: k for k, v in self.off2i.items()}
        self.mem = mem
        self.exist = set()
        self.named = {}
        self.named_inter = {}
        self.by_owner_name = collections.defaultdict(set)
        self.named_by_name = collections.defaultdict(set)
        self.named_by_owner_name = collections.defaultdict(list)
        for kind, ow, dc, off, inter, named in mem:
            iowner = self.off2i.get(ow, ow)
            idesc = xlate_desc(dc, self.off2i)
            nowner = self.off2n.get(ow, ow)
            ndesc = xlate_desc(dc, self.off2n)
            self.exist.add((kind, iowner, inter, idesc))
            self.named[(kind, nowner, named, ndesc)] = (inter, idesc)
            self.named_inter[(kind, nowner, named, idesc)] = (inter, idesc)
            self.by_owner_name[(kind, iowner, inter)].add(idesc)
            self.named_by_name[(kind, named)].add((iowner, inter, idesc))
            self.named_by_owner_name[(kind, nowner, named)].append((inter, idesc))


M5, M11 = Mapping(Y5), Mapping(Y11)

# --------------------------------------------- 1.21.5 hierarchy (named space)
# Name-only targets (e.g. @Inject(method="tick")) have to be looked up the way
# Mixin does it: through the target's whole supertype chain, not just the class
# that declares the member.  The 1.21.5 jar is the authority for that.
MC5 = os.path.join(HERE, "mc", "client-1.21.5.jar")
HIER5N = {}
MEM5N = collections.defaultdict(lambda: (set(), set()))
if os.path.exists(MC5):
    _MEM5NAME = {}
    for kind, ow, dc, off, inter, named in M5.mem:
        _MEM5NAME[(kind, M5.off2i.get(ow, ow), off, xlate_desc(dc, M5.off2i))] = named
    _z5 = zipfile.ZipFile(MC5)
    for _n in _z5.namelist():
        if not _n.endswith(".class"): continue
        try:
            _c = CF(_z5.read(_n))
        except Exception:
            continue
        _iowner = M5.off2i.get(_c.name, _c.name)
        _nowner = M5.off2n.get(_c.name, _c.name)
        HIER5N[_nowner] = [M5.off2n.get(x, x) for x in ([_c.super] + _c.ifaces) if x]
        _ms, _fs = MEM5N[_nowner]
        for _m in _c.methods:
            _id = xlate_desc(_m["desc"], M5.off2i)
            _ms.add((_MEM5NAME.get(("METHOD", _iowner, _m["name"], _id), _m["name"]),
                     xlate_desc(_m["desc"], M5.off2n)))
        for _f in _c.fields:
            _id = xlate_desc(_f["desc"], M5.off2i)
            _fs.add((_MEM5NAME.get(("FIELD", _iowner, _f["name"], _id), _f["name"]),
                     xlate_desc(_f["desc"], M5.off2n)))


def bridge5(nowner, kind, name, ndesc):
    """1.21.5 named member -> 1.21.11 (inter name, inter desc), via hierarchy."""
    if not HIER5N: return None
    idx = 0 if kind == "METHOD" else 1
    seen, todo, hits = [], [nowner], []
    while todo:
        c = todo.pop()
        if c in seen: continue
        seen.append(c); todo += HIER5N.get(c, [])
    for c in seen:
        for (n, d) in MEM5N.get(c, (set(), set()))[idx]:
            if n == name and (not ndesc or d == ndesc):
                hits.append((c, n, d))
    if len(hits) != 1: return None
    c, n, d = hits[0]
    return M5.named.get((kind, c, n, d))

# ------------------------------------------------------------- 1.21.11 client
ZK = zipfile.ZipFile(MC)
FAIL = []
CFS = []
for n in ZK.namelist():
    if not n.endswith(".class"): continue
    try:
        CFS.append(CF(ZK.read(n)))
    except Exception as ex:
        FAIL.append((n, repr(ex)))

# the game jar is in official names; build the hierarchy and member tables in
# intermediary space so annotation targets can be compared directly.
MEMNAME = {}
for kind, ow, dc, off, inter, named in M11.mem:
    MEMNAME[(kind, M11.off2i.get(ow, ow), off, xlate_desc(dc, M11.off2i))] = inter

SUP, MEM, OFFICIAL = {}, collections.defaultdict(lambda: (set(), set())), set()
for c in CFS:
    OFFICIAL.add(c.name)
    ci = M11.off2i.get(c.name, c.name)
    SUP[ci] = [M11.off2i.get(x, x) for x in ([c.super] + c.ifaces) if x]
    ms, fs = MEM[ci]
    for m in c.methods:
        d = xlate_desc(m["desc"], M11.off2i)
        ms.add((MEMNAME.get(("METHOD", ci, m["name"], d), m["name"]), d))
    for f in c.fields:
        d = xlate_desc(f["desc"], M11.off2i)
        fs.add((MEMNAME.get(("FIELD", ci, f["name"], d), f["name"]), d))

def alive(inter): return inter in SUP
def off_of(inter): return inter if inter in SUP else None
def in_player(official): return official in OFFICIAL


HIER = {}
def hier(off):
    if off in HIER: return HIER[off]
    seen, todo = [], [off]
    while todo:
        n = todo.pop()
        if n is None or n in seen: continue
        seen.append(n); todo += SUP.get(n, [])
    HIER[off] = seen
    return seen


def has_member(off, kind, name, desc):
    if off is None: return False
    idx = 0 if kind == "METHOD" else 1
    return any((name, desc) in MEM.get(c, (set(), set()))[idx] for c in hier(off))


def by_name(off, kind, name):
    if off is None: return []
    idx = 0 if kind == "METHOD" else 1
    return [(c, d) for c in hier(off)
            for (n, d) in MEM.get(c, (set(), set()))[idx] if n == name]


INTER = re.compile(r"(^|/)class_\d+")
def is_inter(p): return bool(INTER.search(p or ""))
def is_mc(p): return (p or "").startswith("net/minecraft/")


def norm_class(t):
    t = (t or "").strip()
    if t.startswith("L") and t.endswith(";"): t = t[1:-1]
    if t.startswith("net.minecraft."): t = t.replace(".", "/")
    return t


def resolve_class(raw):
    t = norm_class(raw)
    if is_inter(t):
        return ("OK", None, "") if alive(t) else ("CLASS-GONE", None, "class removed")
    if in_player(t): return ("OK", None, "")
    if is_mc(t):
        for tab in (M5.n2i, M11.n2i):
            i = tab.get(t)
            if i and alive(i): return ("FIX", "L%s;" % i, "class renamed")
        return ("CLASS-GONE", None, "no 1.21.11 class")
    for tab in (M5.n2i, M11.n2i):
        i = tab.get(t)
        if i and alive(i): return ("FIX", "L%s;" % i, "class renamed")
    return ("CLASS-GONE", None, "absent from the game jar")


TARGET_RE = re.compile(r"^L([^;]+);([A-Za-z0-9_$<>]+)(\(.*\)\S*)?$")
FIELD_TARGET_RE = re.compile(r"^L([^;]+);([A-Za-z0-9_$<>]+):(\[*[A-Za-z0-9_$/;]+)$")
BARE_RE = re.compile(r"^([A-Za-z0-9_$<>]+)(\(.*\)\S*)?$")


def classify(v):
    v = (v or "").strip()
    m = TARGET_RE.match(v)
    if m: return m.group(1), m.group(2), m.group(3) or "", True
    # @At field targets are `Lowner;field:Type;`
    m = FIELD_TARGET_RE.match(v)
    if m: return m.group(1), m.group(2), m.group(3), True
    m = BARE_RE.match(v)
    if m: return None, m.group(1), m.group(2) or "", False
    return v, None, "", False


def resolve_member(iowner, kind, name, desc, declared_desc):
    """-> (status, member_name, member_desc, owner_inter, why)"""
    if not iowner or not alive(iowner):
        return ("CLASS-GONE", None, None, None, "owner class gone")
    off = off_of(iowner)
    raw = desc or declared_desc or ""
    idesc = xlate_desc(raw, M5.n2i) if raw else ""
    if idesc and has_member(off, kind, name, idesc):
        return ("OK", name, idesc, iowner, "")
    if not idesc and by_name(off, kind, name):
        return ("OK", name, "", iowner, "")
    nowner = M5.i2n.get(iowner, iowner)
    ndesc = xlate_desc(idesc, M5.i2n) if idesc else ""
    hit = bridge5(nowner, kind, name, ndesc)
    if hit is None:
        if idesc:
            hit = M5.named_inter.get((kind, nowner, name, idesc))
            if hit is None:
                hit = M5.named.get((kind, nowner, name, ndesc))
        else:
            cands = M5.named_by_owner_name.get((kind, nowner, name))
            if cands and len(cands) == 1: hit = cands[0]
    if hit:
        iname, tdesc = hit
        if has_member(off, kind, iname, tdesc):
            return ("FIX", iname, tdesc, iowner, "id survives")
        cands = M11.by_owner_name.get((kind, iowner, iname))
        if cands:
            near = [d for d in cands if d == tdesc] or sorted(cands)
            if len(near) == 1 and has_member(off, kind, iname, near[0]):
                return ("FIX", iname, near[0], iowner, "descriptor updated")
    cands = M11.named_by_name.get((kind, name))
    if cands and len(cands) == 1:
        o, iname, d = next(iter(cands))
        return ("MOVED", iname, d, o, "unique by Yarn name")
    return ("NEEDS-PORT", None, None, None, "no counterpart")


def field_type_of(d):
    """Field type an @Accessor maps to: the return type, or the setter's param."""
    i = d.index(")")
    ret = d[i + 1:]
    if ret and ret != "V":
        return ret
    inner = d[1:i]
    return inner.split(")")[0] if inner else ret


def derive_accessor_name(name):
    """Mixin derives a missing @Accessor value from the accessor method name."""
    for p in ("get", "set", "is"):
        if name.startswith(p) and len(name) > len(p) and name[len(p)].isupper():
            return name[len(p)].lower() + name[len(p) + 1:]
    return name


def fmt(style, res, had_owner, had_desc, orig_owner):
    st, name, desc, owner, why = res
    if st not in ("FIX", "MOVED"): return None
    if style == "name":
        if had_owner and owner != orig_owner:
            return "L%s;%s" % (owner, name)
        return name
    if style == "shadow":
        return name
    s = name + (desc if had_desc else "")
    if had_owner:
        return "L%s;%s" % (owner or orig_owner, s)
    return s


# ----------------------------------------------------------------------- main
z = zipfile.ZipFile(JAR)
cfg = json.loads(z.read("mio.mixins.json"))
mixins = cfg["mixins"]
rows = []

for mn in mixins:
    entry = "me/mioclient/mixin/%s.class" % mn
    try:
        c = CF(z.read(entry))
    except KeyError:
        rows.append({"mixin": mn, "status": "MISSING-FILE", "what": "class", "value": entry})
        continue

    targets, target_rows = [], []
    for a in c.ann:
        if short(a["type"]) != "Mixin": continue
        ev = a["v"].get("value") or a["v"].get("targets")
        for s in strings_in(ev):
            t = norm_class(s["val"])
            targets.append(t)
            st, repl, why = resolve_class(s["val"])
            if st != "OK":
                target_rows.append({"status": st, "what": "Mixin.target", "value": s["val"],
                                    "repl": repl, "why": why, "off": s["off"]})
            elif repl:
                target_rows.append({"status": st, "what": "Mixin.target", "value": s["val"],
                                    "repl": repl, "why": why, "off": s["off"]})
    rows += [dict(r, mixin=mn, targets=targets) for r in target_rows]

    def handle(ann_type, elems, mbr):
        decl = mbr["name"] + mbr["desc"]
        kind_hint = "METHOD" if mbr["kind"] == "method" else "FIELD"
        # what descriptor the target should have: injection targets carry their
        # own descriptor, accessors the field type, shadows the member's
        dd = mbr["desc"]
        if ann_type == "Accessor":
            dd = field_type_of(mbr["desc"])
        elif ann_type in ("Inject", "Redirect", "ModifyArg", "ModifyArgs",
                          "ModifyVariable", "ModifyConstant", "ModifyExpressionValue",
                          "WrapOperation", "WrapWithCondition", "At"):
            dd = None
        if ann_type in ("Accessor", "Invoker"):
            kind = "METHOD" if ann_type == "Invoker" else "FIELD"
            if elems.get("value") is None:
                # No value: Mixin derives the member name from the declaration,
                # so the Yarn name never appears as a string to patch.  Report
                # it when the derived name does not already resolve.
                nm = mbr["name"] if ann_type == "Invoker" else derive_accessor_name(mbr["name"])
                d = "" if kind == "FIELD" else mbr["desc"]
                dd2 = field_type_of(mbr["desc"]) if kind == "FIELD" else mbr["desc"]
                ok = False
                for o in targets:
                    iowner = o if is_inter(o) else M5.n2i.get(o, o)
                    if not iowner or not alive(iowner):
                        continue
                    if resolve_member(iowner, kind, nm, d, dd2)[0] == "OK":
                        ok = True
                        break
                if not ok:
                    rows.append({"mixin": mn, "status": "NEEDS-PORT",
                                 "what": ann_type + ".derived",
                                 "value": mbr["name"] + mbr["desc"],
                                 "repl": None, "why": "name-derived target " + nm,
                                 "off": None, "targets": targets})
                return
            elems = {"value": elems.get("value")}
            style = "name"
        elif ann_type in ("Shadow", "Overwrite"):
            kind = kind_hint
            style = "shadow" if ann_type == "Shadow" else "member"
            if "value" not in elems:
                # the member's own name is the target: renaming the declaration
                for tg in targets:
                    res = resolve_member(tg if is_inter(tg) else M5.n2i.get(tg),
                                         kind, mbr["name"], mbr["desc"], mbr["desc"])
                    if res[0] not in ("OK", "CLASS-GONE"):
                        rows.append({"mixin": mn, "status": res[0], "what": ann_type + ".decl",
                                     "value": mbr["name"] + mbr["desc"],
                                     "repl": res[1] + (res[2] or "") if res[1] else None,
                                     "why": res[4], "off": mbr["name_off"],
                                     "decl_style": "member", "targets": targets})
                        break
                return
        elif ann_type == "At":
            kind = "METHOD" if True else kind_hint
            elems = {"target": elems.get("target")}
            style = "inject"
        else:
            kind = "METHOD"
            elems = {"method": elems.get("method")}
            style = "inject"

        for key, ev in elems.items():
            if ev is None: continue
            for s in strings_in(ev):
                owner, name, desc, had_owner = classify(s["val"])
                if not name:
                    st, repl, why = resolve_class(s["val"])
                    if st != "OK":
                        rows.append({"mixin": mn, "status": st, "what": ann_type + "." + key,
                                     "value": s["val"], "repl": repl, "why": why,
                                     "off": s["off"], "targets": targets})
                    continue
                if name.startswith("<"):
                    continue
                onorm = norm_class(owner) if owner else None
                if onorm and not is_mc(onorm) and not in_player(onorm):
                    continue          # JDK / library target, not ours to remap
                k = "METHOD" if desc.startswith("(") else ("FIELD" if desc else kind)
                cand_owners = [owner] if owner else targets
                chosen = None
                for o in cand_owners:
                    iowner = o if is_inter(o) else M5.n2i.get(o, o)
                    if not alive(iowner):
                        continue
                    res = resolve_member(iowner, k, name, desc, dd)
                    if res[0] == "OK":
                        chosen = None
                        break
                    if res[0] in ("FIX", "MOVED"):
                        chosen = (res, had_owner, bool(desc), o)
                        break
                    chosen = (res, had_owner, bool(desc), o)
                else:
                    chosen = (("NEEDS-PORT", None, None, None, "unresolved"), had_owner, bool(desc), None)
                if chosen is None:
                    continue
                res, ho, hd, oo = chosen
                if res[0] == "OK":
                    continue
                rows.append({"mixin": mn, "status": res[0], "what": ann_type + "." + key,
                             "value": s["val"], "repl": fmt(style, res, ho, hd, oo),
                             "why": res[4], "off": s["off"], "targets": targets})

    for mbr in c.fields + c.methods:
        for a in mbr["ann"]:
            handle(short(a["type"]), a["v"], mbr)
            for nested in anns_in(a["v"].get("at")) + anns_in(a["v"].get("target")):
                handle(short(nested["type"]), nested["v"], mbr)

summary = collections.Counter()
for r in rows: summary[r["status"]] += 1
bad = sorted({r["mixin"] for r in rows if r["status"] != "OK"})

print("mixins in config:", len(mixins))
print("client jar classes:", len(SUP), "parse failures:", len(FAIL))
print("statuses:", json.dumps(dict(summary)))
print("mixin classes affected:", len(bad))
json.dump(rows, open(OUT, "w"), indent=1)
for r in rows:
    print("%-11s %-16s %-44s %-22s %s" % (r["status"], r["what"], str(r["value"])[:44],
          r["mixin"][:22], (r.get("repl") or r.get("why") or "")[:56]))
