#!/usr/bin/env python3
"""Repair @Inject handlers whose target signature changed in 1.21.11.

Mixin requires a handler's descriptor to be the target method's descriptor with a
CallbackInfo appended, and validates it at apply time: a mismatch aborts the
whole mixin.  When 1.21.11 added a parameter to a method (DeathScreen's
constructor gained a PlayerEntity, for example), every handler compiled against
1.21.5 stopped matching.

Re-assembling the obfuscated handler in place would mean moving the CallbackInfo
to another local slot and repairing each stack-map frame that names it, with no
JVM here to check the verifier's opinion.  Instead this adds a small bridge
method that carries the @Inject annotation, declares the descriptor Mixin now
expects, and forwards to the untouched original handler.  The original method
keeps its code and frames byte for byte; the only edit to it is losing the
annotation.

Handled shapes:
    append   the target grew parameters at the end (the common case)
    generic  the target returns a value, so the handler needs
             CallbackInfoReturnable<T> instead of a raw CallbackInfoReturnable

Anything else (a parameter whose type changed, parameters reordered) cannot be
forwarded and is reported for a per-mixin port.
"""
import collections, json, os, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")

_src = open(os.path.join(HERE, "mixaudit.py")).read()
_g = {"__file__": os.path.join(HERE, "mixaudit.py"), "__name__": "mixaudit_head"}
exec(compile(_src.split("# ----------------------------------------------------------------------- main")[0],
             "mixaudit-head", "exec"), _g)
CF = _g["CF"]
short = _g["short"]
strings_in = _g["strings_in"]
anns_in = _g["anns_in"]
classify = _g["classify"]
by_name = _g["by_name"]
off_of = _g["off_of"]
M5 = _g["M5"]
M11 = _g["M11"]
MEMNAME = _g["MEMNAME"]
xlate_desc = _g["xlate_desc"]
CFS_BY_OFF = {c.name: c for c in _g["CFS"]}
_STATIC = {}


def target_static(owner_inter, name, desc):
    """1.21.11 staticness of one intermediary method, or None if it can't be read.

    Mixin rejects a handler whose staticness differs from the target's, so a
    bridge has to copy the target's rather than assume an instance method.
    """
    off = M11.i2off.get(owner_inter, owner_inter)
    table = _STATIC.get(off)
    if table is None:
        table = {}
        cf = CFS_BY_OFF.get(off)
        if cf is not None:
            try:
                mc = MC.parse(cf.b)
                for m in mc["methods"]:
                    d = xlate_desc(MC.utf8(mc, m["desc"]), M11.off2i)
                    n = MC.utf8(mc, m["name"])
                    table[(MEMNAME.get(("METHOD", owner_inter, n, d), n), d)] = \
                        bool(m["acc"] & 0x0008)
            except Exception:
                table = {}
        _STATIC[off] = table
    return table.get((name, desc))

CI = "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;"
CIR_RAW = "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;"
# Descriptors are erased: the type argument belongs in a Signature attribute, and
# ASM rejects a '<' inside a descriptor outright.
CIR = CIR_RAW
CIR_OPEN = "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<"
INJECT = "Lorg/spongepowered/asm/mixin/injection/Inject;"
CIR_OWNER = "org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable"

LOAD = {"I": 0x15, "Z": 0x15, "B": 0x15, "C": 0x15, "S": 0x15,
        "J": 0x16, "F": 0x17, "D": 0x18}
LOAD_N = {"I": 0x1A, "Z": 0x1A, "B": 0x1A, "C": 0x1A, "S": 0x1A,
          "J": 0x1E, "F": 0x22, "D": 0x26}
ALOAD, ALOAD_N = 0x19, 0x2A
RET = {"V": 0xB1, "Z": 0xAC, "B": 0xAC, "C": 0xAC, "S": 0xAC, "I": 0xAC,
       "J": 0xAD, "F": 0xAE, "D": 0xAF}
WRAP = {"Z": ("java/lang/Boolean", "booleanValue", "()Z", 0xAC),
        "B": ("java/lang/Byte", "byteValue", "()B", 0xAC),
        "C": ("java/lang/Character", "charValue", "()C", 0xAC),
        "S": ("java/lang/Short", "shortValue", "()S", 0xAC),
        "I": ("java/lang/Integer", "intValue", "()I", 0xAC),
        "J": ("java/lang/Long", "longValue", "()J", 0xAD),
        "F": ("java/lang/Float", "floatValue", "()F", 0xAE),
        "D": ("java/lang/Double", "doubleValue", "()D", 0xAF)}


class Pool:
    """Constant pool with appended entries, deduplicated by their raw bytes."""

    def __init__(s, cls):
        s.cls = cls
        s.extra = []
        s.base = cls["cp_count"]

    def _find(s, raw):
        for i, e in s.cls["cp"].items():
            if e == raw:
                return i
        for k, e in enumerate(s.extra):
            if e == raw:
                return s.base + k
        return None

    def add(s, raw):
        i = s._find(raw)
        if i is not None:
            return i
        s.extra.append(raw)
        return s.base + len(s.extra) - 1

    def utf8(s, text):
        b = text.encode("utf-8")
        return s.add(b"\x01" + MC.u2b(len(b)) + b)

    def klass(s, internal):
        return s.add(b"\x07" + MC.u2b(s.utf8(internal)))

    def klass_type(s, t):
        if t.startswith("["):
            return s.add(b"\x07" + MC.u2b(s.utf8(t)))
        return s.klass(t[1:-1] if t.startswith("L") else t)

    def nat(s, name, desc):
        return s.add(b"\x0c" + MC.u2b(s.utf8(name)) + MC.u2b(s.utf8(desc)))

    def method(s, owner, name, desc):
        return s.add(b"\x0a" + MC.u2b(s.klass(owner)) + MC.u2b(s.nat(name, desc)))


def norm(t):
    """A raw CallbackInfoReturnable and CallbackInfoReturnable<T> are one shape."""
    if t == CIR_RAW or t.startswith(CIR_OPEN):
        return "@CIR"
    return t


def emit_load(code, t, slot):
    if t in LOAD:
        code.extend([LOAD_N[t] + slot] if slot <= 3 else [LOAD[t], slot])
    else:
        code.extend([ALOAD_N + slot] if slot <= 3 else [ALOAD, slot])


def emit_return_value(pool, code, ret, ci_slot):
    emit_load(code, CIR_RAW, ci_slot)
    code.append(0xB6)
    code += MC.u2b(pool.method(CIR_OWNER, "getReturnValue", "()Ljava/lang/Object;"))
    if ret in WRAP:
        wrapper, name, desc, op = WRAP[ret]
        code.append(0xC0)
        code += MC.u2b(pool.klass(wrapper))
        code.append(0xB6)
        code += MC.u2b(pool.method(wrapper, name, desc))
        code.append(op)
    else:
        code.append(0xC0)
        code += MC.u2b(pool.klass_type(ret))
        code.append(0xB0)


def target_descs(cfm, targets):
    """Every descriptor the annotation could be pointing at."""
    out = []
    for a in cfm["ann"]:
        if short(a["type"]) != "Inject":
            continue
        for key in ("at", "target"):
            for nested in anns_in(a["v"].get(key)):
                for s in strings_in(nested["v"].get("target")):
                    _o, _n, d, _h = classify(s["val"])
                    if d.startswith("("):
                        out.append((d, None))
        for s in strings_in(a["v"].get("method")):
            _o, name, d, _h = classify(s["val"])
            for t in targets:
                ti = t.strip("L;")
                if ti.startswith("net/minecraft/") and "class_" not in ti:
                    ti = M5.n2i.get(ti, ti)
                off = off_of(ti)
                if off is None:
                    continue
                for cc, dd in by_name(off, "METHOD", name):
                    out.append((dd, target_static(cc, name, dd)))
    seen, uniq = set(), []
    for d, st in out:
        if "<" in d:
            continue
        if d not in seen:
            seen.add(d)
            uniq.append((d, st))
    return uniq


def decide(cfm_desc, cands):
    """-> (kind, target_desc, new_handler_desc, target_is_static)"""
    old_params = MC.desc_types(cfm_desc)
    old_ret = MC.desc_ret(cfm_desc)
    old_args = [norm(x) for x in old_params[:-1]]
    for dd, st in cands:
        tp = MC.desc_types(dd)
        if [norm(x) for x in tp] == old_args and MC.desc_ret(dd) == old_ret:
            return ("ok", dd, None, st)
    for dd, st in cands:
        tp = MC.desc_types(dd)
        tr = MC.desc_ret(dd)
        if len(tp) > len(old_args) and [norm(x) for x in tp[:len(old_args)]] == old_args:
            return ("append", dd, MC.desc_of(tp + [CI if tr == "V" else CIR], tr), st)
    for dd, st in cands:
        tp = MC.desc_types(dd)
        tr = MC.desc_ret(dd)
        if [norm(x) for x in tp] == old_args and tr != old_ret and tr != "V":
            return ("generic", dd, MC.desc_of(tp + [CIR], tr), st)
    return ("port", cands[0][0] if cands else None, None, None)


def spanned_anns(mc, m):
    for name in ("RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"):
        a = MC.find_attr(mc, m, name)
        if a:
            for span in MC.anns_with_spans(a["data"]):
                yield a, span


def patch(mn, b, log):
    mc = MC.parse(b)
    cf = CF(b)
    this = MC.class_name(mc, mc["this"])
    targets = []
    for a in cf.ann:
        if short(a["type"]) == "Mixin":
            for s in strings_in(a["v"].get("value")) + strings_in(a["v"].get("targets")):
                targets.append(s["val"])
    if not targets:
        return None

    pool = Pool(mc)
    used = {MC.utf8(mc, m["name"]) for m in mc["methods"]}
    bridged = 0
    for idx, cfm in enumerate(cf.methods):
        if not any(short(a["type"]) == "Inject" for a in cfm["ann"]):
            continue
        m = mc["methods"][idx]
        kind, tdesc, new_desc, tstatic = decide(MC.utf8(mc, m["desc"]),
                                                target_descs(cfm, targets))
        if kind in ("ok", "port"):
            log.append((mn, cfm["name"], kind, tdesc, None))
            continue
        # Mixin rejects a handler whose staticness differs from the target's.  The
        # 1.21.5 target's staticness is what the handler was written against, so the
        # bridge copies it rather than assuming an instance method.
        static = bool(m["acc"] & 0x0008)
        if tstatic is not None and tstatic != static:
            log.append((mn, cfm["name"], "static", tdesc, None))
            continue

        all_anns = list(spanned_anns(mc, m))
        labels = [x for x in all_anns if MC.utf8(mc, x[1][2]) == INJECT]
        if not labels:
            log.append((mn, cfm["name"], "no-bytes", tdesc, None))
            continue
        attr, span = labels[0]
        ann_bytes = attr["data"][span[0]:span[1]]

        old_desc = MC.utf8(mc, m["desc"])
        old_params = MC.desc_types(old_desc)
        old_ret = MC.desc_ret(old_desc)
        new_params = MC.desc_types(new_desc)
        new_ret = MC.desc_ret(new_desc)

        first = 0 if static else 1
        old_slots, _ = slots_of(old_params, first)
        new_slots, total = slots_of(new_params, first)
        ci_slot = new_slots[-1]

        code = bytearray() if static else bytearray([ALOAD_N])
        for t, sl in zip(old_params, old_slots):
            emit_load(code, t, sl)
        emit_load(code, new_params[-1], ci_slot)
        code.append(0xB8 if static else 0xB7)
        code += MC.u2b(pool.method(this, MC.utf8(mc, m["name"]), old_desc))
        if new_ret == "V":
            code.append(0xB1)
        elif old_ret != "V":
            code.append(RET.get(new_ret, 0xB0))
        else:
            emit_return_value(pool, code, new_ret, ci_slot)

        name = "m$$b%d" % bridged
        while name in used:
            name += "x"
        used.add(name)

        mc["methods"].append({
            "acc": 0x000A if static else 0x0002,
            "name": pool.utf8(name),
            "desc": pool.utf8(new_desc),
            "attrs": [
                {"name": pool.utf8("RuntimeVisibleAnnotations"),
                 "data": MC.u2b(1) + ann_bytes},
                {"name": pool.utf8("Code"),
                 "data": MC.build_code({"max_stack": len(old_params) + 4,
                                        "max_locals": total,
                                        "code": code,
                                        "handlers": b"",
                                        "attrs": []})},
            ],
        })

        keep = {(s, e) for (s, e, _t) in [x[1] for x in all_anns if x[0] is attr]
                if (s, e) != (span[0], span[1])}
        if keep:
            attr["data"] = MC.anns_keep(attr["data"], keep)
        else:
            m["attrs"].remove(attr)

        bridged += 1
        log.append((mn, cfm["name"], kind, tdesc, new_desc))

    if not bridged:
        return None
    return MC.write(mc, pool.extra)


def slots_of(types, first=1):
    out, s = [], first
    for t in types:
        out.append(s)
        s += MC.width(t)
    return out, s


def verify(mn, b, new_b):
    """The bridge must exist, the handler must be clean, everything else intact."""
    old, new = MC.parse(b), MC.parse(new_b)
    problems = []
    if len(new["methods"]) <= len(old["methods"]):
        problems.append("no method added")
    if [m["acc"] for m in new["methods"][:len(old["methods"])]] != [m["acc"] for m in old["methods"]]:
        problems.append("method order changed")
    for i, m in enumerate(old["methods"]):
        n = new["methods"][i]
        for key in ("name", "desc"):
            if m[key] != n[key]:
                problems.append("method %d %s changed" % (i, key))
        oc = MC.find_attr(old, m, "Code")
        nc = MC.find_attr(new, n, "Code")
        if (oc["data"] if oc else None) != (nc["data"] if nc else None):
            problems.append("code of %s changed" % MC.utf8(old, m["name"])[:12])
    for m in new["methods"][len(old["methods"]):]:
        if not MC.code_of(new, m):
            problems.append("bridge without code")
        if not any(MC.utf8(new, x[1][2]) == INJECT for x in spanned_anns(new, m)):
            problems.append("bridge without @Inject")
        if "<" in MC.utf8(new, m["desc"]):
            problems.append("bridge descriptor carries a type argument")
        if not (m["acc"] & 0x0002):
            problems.append("bridge is not private")
    if [MC.utf8(old, a["name"]) for a in old["fields"]] != [MC.utf8(new, a["name"]) for a in new["fields"]]:
        problems.append("fields changed")
    return problems


def main():
    z = zipfile.ZipFile(JAR)
    cfg = json.loads(z.read("mio.mixins.json"))
    items = z.infolist()
    data = {it.filename: z.read(it.filename) for it in items}
    z.close()

    stats = collections.Counter()
    log, problems = [], []
    for mn in cfg["mixins"]:
        path = "me/mioclient/mixin/%s.class" % mn
        b = data[path]
        new_b = patch(mn, b, log)
        if new_b is None:
            stats["unchanged"] += 1
            continue
        bad = verify(mn, b, new_b)
        if bad:
            problems.append((mn, bad))
            stats["rejected"] += 1
            continue
        data[path] = new_b
        stats["classes_patched"] += 1
        stats["bridges"] += len(MC.parse(new_b)["methods"]) - len(MC.parse(b)["methods"])

    if problems:
        print("REJECTED, jar not written:")
        for mn, bad in problems[:5]:
            print("  ", mn[:16], bad)
        return 1

    for r in log:
        if r[2] not in ("ok",):
            print("%-9s %-14s %-34s -> %s" % (r[2], r[0][:14], (r[3] or "")[:34], r[4] or ""))

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it, data[it.filename])
    os.replace(tmp, JAR)
    print(json.dumps(dict(stats), indent=2))
    return 0


if __name__ == "__main__":
    sys.exit(main())
