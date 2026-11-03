#!/usr/bin/env python3
"""Make the existing @Inject bridges return void.

mixbridge used to declare a bridge with the *target's* return type and end it
with CallbackInfoReturnable.getReturnValue() -> unbox -> return.  At
@At("HEAD") the callback holds nothing yet, so that unbox dies with an NPE the
first time the target runs -- TextColor.getRgb on the title screen.

Mixin throws away whatever a handler returns (the value the target uses only
travels through the callback), so the tail is dead weight.  This cuts the code
after the forwarding call, discards a forwarded result if there is one, and
returns void -- the descriptor Mixin actually expects.

Annotations are deliberately not touched.  An earlier version also rewrote the
`cancellable` element in place and mis-landed by one byte, producing 17
annotation attributes that ASM rejected at mixin prepare time.  Anything that
changes an annotation has to rebuild it, not poke a byte in the middle.
"""
import collections
import json
import os
import re
import sys
import zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mixclass as MC

ROOT = os.path.dirname(HERE)
JAR = os.path.join(ROOT, "jars", "mio-1.21.11.jar")

BRIDGE = re.compile(r"m\$\$b\d+x?$")
CALLS = (0xB7, 0xB8)              # invokespecial, invokestatic
RETURN, POP, POP2 = 0xB1, 0x57, 0x58

_LEN = {op: 1 for op in range(0x100)}
for _op in (0x10, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x36, 0x37, 0x38,
            0x39, 0x3A, 0xA9, 0xBC):
    _LEN[_op] = 2
for _op in (0x11, 0x13, 0x14, 0x84, 0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8,
            0xBB, 0xBD, 0xC0, 0xC1, 0xC6, 0xC7):
    _LEN[_op] = 3
_LEN[0xC5] = 4
for _op in (0xB9, 0xBA, 0xC8, 0xC9):
    _LEN[_op] = 5
for _op in range(0x99, 0xA9):
    _LEN[_op] = 3
BRANCH = set(range(0x99, 0xA9)) | {0xC6, 0xC7, 0xC8, 0xC9, 0xAA, 0xAB}


def instructions(code):
    pc, n = 0, len(code)
    while pc < n:
        op = code[pc]
        if op in (0xAA, 0xAB):
            raise ValueError("switch in a bridge body")
        if op == 0xC4:
            ln = 6 if code[pc + 1] == 0x84 else 4
        else:
            ln = _LEN.get(op, 1)
        yield pc, op, ln
        pc += ln


def method_ref(cls, i):
    e = cls["cp"].get(i)
    if not e or e[0] != 10:
        return None
    ci, nti = (e[1] << 8) | e[2], (e[3] << 8) | e[4]
    nt = cls["cp"].get(nti)
    if not nt or nt[0] != 12:
        return None
    return (MC.class_name(cls, ci),
            MC.utf8(cls, (nt[1] << 8) | nt[2]),
            MC.utf8(cls, (nt[3] << 8) | nt[4]))


def add_utf8(cls, extra, text):
    raw = b"\x01" + MC.u2b(len(text.encode("utf-8"))) + text.encode("utf-8")
    for i, e in cls["cp"].items():
        if e == raw:
            return i
    for k, e in enumerate(extra):
        if e == raw:
            return cls["cp_count"] + k
    extra.append(raw)
    return cls["cp_count"] + len(extra) - 1


def patch(mn, b, log):
    cls = MC.parse(b)
    extra = []
    this = MC.class_name(cls, cls["this"])
    changed = 0
    for m in cls["methods"]:
        name = MC.utf8(cls, m["name"])
        if not BRIDGE.match(name):
            continue
        desc = MC.utf8(cls, m["desc"])
        if MC.desc_ret(desc) == "V":
            continue
        c = MC.code_of(cls, m)
        if c is None or c["handlers"]:
            log.append((mn, name, "no-code"))
            continue
        code = bytes(c["code"])
        end = fwd = None
        try:
            for pc, op, _ln in instructions(code):
                if op in BRANCH:
                    end = None
                    break
                if op in CALLS:
                    ref = method_ref(cls, (code[pc + 1] << 8) | code[pc + 2])
                    if ref and ref[0] == this:
                        end, fwd = pc + 3, ref
                        break
        except ValueError as exc:
            log.append((mn, name, str(exc)))
            continue
        if end is None or end >= len(code):
            log.append((mn, name, "no-forward"))
            continue
        tail = bytearray(code[:end])
        fret = MC.desc_ret(fwd[2])
        if fret != "V":
            tail.append(POP2 if fret in "JD" else POP)
        tail.append(RETURN)
        c["code"] = tail
        c["handlers"] = b""
        MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)
        m["desc"] = add_utf8(cls, extra, desc[:desc.rindex(")") + 1] + "V")
        changed += 1
        log.append((mn, name, desc))
    return MC.write(cls, extra) if changed else None


def main():
    z = zipfile.ZipFile(JAR)
    cfg = json.loads(z.read("mio.mixins.json"))
    items = z.infolist()
    data = {it.filename: z.read(it.filename) for it in items}
    z.close()

    stats = collections.Counter()
    log = []
    for mn in cfg["mixins"]:
        path = "me/mioclient/mixin/%s.class" % mn
        new_b = patch(mn, data[path], log)
        if new_b is None:
            stats["unchanged"] += 1
            continue
        data[path] = new_b
        stats["classes_patched"] += 1

    for mn, name, desc in log:
        print("%-12s %-8s %s" % (mn[:12], name, desc))
    stats["bridges_rewritten"] = len(log)

    tmp = JAR + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as zout:
        for it in items:
            zout.writestr(it, data[it.filename])
    os.replace(tmp, JAR)
    print(json.dumps(dict(stats), indent=2))
    return 0


if __name__ == "__main__":
    sys.exit(main())
