#!/usr/bin/env python3
"""Type-check the bridge bodies Mixin will merge.

Descriptors alone cannot prove a bridge is valid: the 1.21.11 build shipped one
that pushed the callback twice and the JVM rejected it at class init with

    Type 'CallbackInfoReturnable' (stack[1]) is not assignable to 'net/minecraft/class_2248'

Each bridge is straight-line code -- loads, one call to the untouched handler, a
getReturnValue/unbox, a return -- so an operand stack simulator is enough to
catch that, plus a CallbackInfoReturnable handed to a CallbackInfo slot, a return
opcode that disagrees with the declared type, and an under-sized max_stack or
max_locals.  There is no JVM here; this is the check that stands in for one.
"""
import os, re, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")

CI = "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;"
CIR = "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;"
OBJ = "Ljava/lang/Object;"
INJECT = "Lorg/spongepowered/asm/mixin/injection/Inject;"
BRIDGE = re.compile(r"m\$\$b\d+x?$")

INT = {"Z", "B", "C", "S", "I"}
RET_OP = {"V": 0xB1, "Z": 0xAC, "B": 0xAC, "C": 0xAC, "S": 0xAC,
          "I": 0xAC, "J": 0xAD, "F": 0xAE, "D": 0xAF}


def parse_type(d, i):
    c = d[i]
    if c == "[":
        t, j = parse_type(d, i + 1)
        return "[" + t, j
    if c == "L":
        # CallbackInfoReturnable<T> appears in the handlers this tool did not
        # write, so the type argument has to be stepped over, not stopped at.
        depth = 0
        j = i
        while True:
            ch = d[j]
            if ch == "<":
                depth += 1
            elif ch == ">":
                depth -= 1
            elif ch == ";" and depth == 0:
                return d[i:j + 1], j + 1
            j += 1
    return c, i + 1


def erase(t):
    """CallbackInfoReturnable<T> and the erased form are the same class."""
    if "<" not in t:
        return t
    i, depth, j = t.index("<"), 0, t.index("<")
    while True:
        if t[j] == "<":
            depth += 1
        elif t[j] == ">":
            depth -= 1
            if depth == 0:
                break
        j += 1
    return t[:i] + t[j + 1:]


def parse_desc(d):
    i, params = 1, []
    while d[i] != ")":
        t, i = parse_type(d, i)
        params.append(t)
    return params, d[i + 1:]


def width(t):
    return 2 if t in ("J", "D") else 1


def is_ref(t):
    return t.startswith("L") or t.startswith("[")


def assignable(actual, formal):
    actual, formal = erase(actual), erase(formal)
    if actual == formal:
        return True
    # The null type is assignable to every reference type; a bridge supplies one
    # for a parameter the target no longer passes.
    if actual == "N":
        return is_ref(formal)
    if formal == OBJ and is_ref(actual):
        return True
    # The only hierarchy a bridge relies on: a returnable callback is a callback.
    if actual == CIR and formal == CI:
        return True
    return False


def deref(mc, idx):
    ref = mc["cp"][idx]
    if ref[0] not in (10, 11):
        raise ValueError("constant %d is not a method ref (tag %d)" % (idx, ref[0]))
    owner = MC.class_name(mc, int.from_bytes(ref[1:3], "big"))
    nat = mc["cp"][int.from_bytes(ref[3:5], "big")]
    return ("L" + owner + ";",
            MC.utf8(mc, int.from_bytes(nat[1:3], "big")),
            MC.utf8(mc, int.from_bytes(nat[3:5], "big")))


LOAD_OP = {0x15: "I", 0x16: "J", 0x17: "F", 0x18: "D", 0x19: "L"}
FAST = {0x1A: ("I", 0), 0x1B: ("I", 1), 0x1C: ("I", 2), 0x1D: ("I", 3),
        0x1E: ("J", 0), 0x1F: ("J", 1), 0x20: ("J", 2), 0x21: ("J", 3),
        0x22: ("F", 0), 0x23: ("F", 1), 0x24: ("F", 2), 0x25: ("F", 3),
        0x26: ("D", 0), 0x27: ("D", 1), 0x28: ("D", 2), 0x29: ("D", 3),
        0x2A: ("L", 0), 0x2B: ("L", 1), 0x2C: ("L", 2), 0x2D: ("L", 3)}


def check(mc, m):
    this = "L" + MC.class_name(mc, mc["this"]) + ";"
    desc = MC.utf8(mc, m["desc"])
    params, ret = parse_desc(desc)
    static = bool(m["acc"] & 0x0008)
    co = MC.code_of(mc, m)
    if not co:
        return ["no Code attribute"]
    code = co["code"]
    max_stack = co.get("max_stack")
    max_locals = co.get("max_locals")
    problems = []

    locals_, stack = {}, []
    slot = 0
    if not static:
        locals_[0] = this
        slot = 1
    for t in params:
        locals_[slot] = t
        slot += width(t)
    used_locals = slot
    peak = 0

    def push(t):
        stack.append(t)

    def pop(n):
        if n == 0:  # stack[-0:] is the whole stack, not an empty slice
            return []
        if len(stack) < n:
            problems.append("stack underflow (need %d, have %d)" % (n, len(stack)))
            return None
        got = stack[-n:]
        del stack[-n:]
        return got

    i = 0
    while i < len(code):
        op = code[i]
        if op in LOAD_OP:
            sl = code[i + 1]
            kind = LOAD_OP[op]
            want = locals_.get(sl)
            if want is None:
                problems.append("load from unset local %d" % sl)
            elif kind == "L" and not is_ref(want):
                problems.append("aload of non-reference local %d (%s)" % (sl, want))
            elif kind != "L" and (is_ref(want) or want not in INT | {"J", "F", "D"}):
                problems.append("primitive load of local %d (%s)" % (sl, want))
            push(want if want else OBJ)
            used_locals = max(used_locals, sl + width(want or "I"))
            i += 2
        elif op in FAST:
            kind, sl = FAST[op]
            want = locals_.get(sl)
            if want is None:
                problems.append("load from unset local %d" % sl)
            elif kind == "L" and not is_ref(want):
                problems.append("aload of non-reference local %d (%s)" % (sl, want))
            elif kind != "L" and is_ref(want):
                problems.append("primitive load of reference local %d" % sl)
            push(want if want else OBJ)
            used_locals = max(used_locals, sl + width(want or "I"))
            i += 1
        elif op == 0x01:
            push("N")
            i += 1
        elif 0x03 <= op <= 0x08:
            push("I")
            i += 1
        elif op in (0x09, 0x0A):
            push("J")
            i += 1
        elif op in (0x0B, 0x0C, 0x0D):
            push("F")
            i += 1
        elif op in (0x0E, 0x0F):
            push("D")
            i += 1
        elif op in (0xB6, 0xB7, 0xB8):
            idx = int.from_bytes(code[i + 1:i + 3], "big")
            try:
                owner, name, mdesc = deref(mc, idx)
            except Exception as e:
                problems.append("bad method ref: %s" % e)
                break
            fparams, fret = parse_desc(mdesc)
            n = len(fparams)
            got = pop(n)
            if got is not None:
                for k, (a, f) in enumerate(zip(got, fparams)):
                    if not assignable(a, f):
                        problems.append(
                            "arg %d of %s%s is %s, needs %s" % (k, name, mdesc, a, f))
            if op != 0xB8:
                recv = pop(1)
                if recv and not assignable(recv[0], owner):
                    problems.append("receiver %s is not a %s" % (recv[0], owner))
            if fret != "V":
                push(fret)
            i += 3
        elif op == 0xC0:
            t = MC.class_name(mc, int.from_bytes(code[i + 1:i + 3], "big"))
            if not pop(1):
                break
            push("L" + t + ";")
            i += 3
        elif op in (0xAC, 0xAD, 0xAE, 0xAF, 0xB0, 0xB1):
            want = RET_OP.get(ret, 0xB0)
            if want != op:
                problems.append("return opcode %#x for declared %s" % (op, ret))
            if ret == "V":
                if stack:
                    problems.append("%d values left before return" % len(stack))
            else:
                got = pop(1)
                if got and not assignable(got[0], ret):
                    problems.append("returned %s where %s declared" % (got[0], ret))
                if stack:
                    problems.append("%d values left at return" % len(stack))
            i += 1
        else:
            problems.append("unexpected opcode %#04x at %d" % (op, i))
            break
        peak = max(peak, len(stack))

    if max_stack is not None and peak > max_stack:
        problems.append("needs %d stack slots, max_stack is %d" % (peak, max_stack))
    if max_locals is not None and used_locals > max_locals:
        problems.append("needs %d locals, max_locals is %d" % (used_locals, max_locals))
    return problems


def anns(mc, m):
    out = []
    for name in ("RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"):
        a = MC.find_attr(mc, m, name)
        if a:
            out += [MC.utf8(mc, t) for (_s, _e, t) in MC.anns_with_spans(a["data"])]
    return out


def main():
    z = zipfile.ZipFile(JAR)
    checked = 0
    problems = []
    for name in z.namelist():
        if not name.endswith(".class"):
            continue
        try:
            mc = MC.parse(z.read(name))
        except Exception as e:
            problems.append((name, ["parse: %s" % e]))
            continue
        for m in mc["methods"]:
            if INJECT not in anns(mc, m):
                continue
            # Only the bridges this tool generates are straight-line; the
            # original obfuscated handlers have branches, field access and
            # constants that are out of scope here.
            if not BRIDGE.match(MC.utf8(mc, m["name"])):
                continue
            checked += 1
            bad = check(mc, m)
            if bad:
                problems.append((name, MC.utf8(mc, m["name"]), bad))
    z.close()
    print("inject handlers %d, problems %d" % (checked, len(problems)))
    for p in problems[:12]:
        print("  ", p)
    print("VERDICT:", "PASS" if not problems else "FAIL")
    return 0 if not problems else 1


if __name__ == "__main__":
    sys.exit(main())
