#!/usr/bin/env python3
"""Class-file reader/writer used to repair mixin handlers.

The patchers next to this file only needed to move constants around, so they
worked on raw byte offsets.  Fixing a mixin whose target signature changed needs
more than that: a handler has to be added to the class, and sometimes an
annotation has to be taken off another one.  That means rebuilding the file
section by section, which is what this module does.

`parse` keeps every constant-pool entry and attribute as raw bytes, so writing
back an untouched class reproduces the input byte for byte; `tools/mixbridge.py`
relies on that invariant to know an edited class differs only where intended.
"""
import struct


class R:
    __slots__ = ("b", "o")

    def __init__(s, b):
        s.b = b
        s.o = 0

    def u1(s):
        v = s.b[s.o]
        s.o += 1
        return v

    def u2(s):
        v = struct.unpack_from(">H", s.b, s.o)[0]
        s.o += 2
        return v

    def u4(s):
        v = struct.unpack_from(">I", s.b, s.o)[0]
        s.o += 4
        return v

    def take(s, n):
        v = s.b[s.o:s.o + n]
        s.o += n
        return v


def u2b(v):
    return struct.pack(">H", v)


def u4b(v):
    return struct.pack(">I", v)


def parse(b):
    r = R(b)
    magic, minor, major = r.u4(), r.u2(), r.u2()
    n = r.u2()
    cp, i = {}, 1
    while i < n:
        start = r.o
        tag = r.u1()
        if tag == 1:
            r.take(r.u2())
        elif tag in (3, 4):
            r.take(4)
        elif tag in (5, 6):
            r.take(8)
        elif tag in (7, 8, 16, 19, 20):
            r.take(2)
        elif tag in (9, 10, 11, 12, 17, 18):
            r.take(4)
        elif tag == 15:
            r.take(3)
        else:
            raise ValueError("cp tag %d at %d" % (tag, start))
        cp[i] = b[start:r.o]
        i += 2 if tag in (5, 6) else 1
    if i != n:
        raise ValueError("constant pool count mismatch")
    cls = {
        "magic": magic, "minor": minor, "major": major,
        "cp": cp, "cp_count": n,
        "access": r.u2(), "this": r.u2(), "super": r.u2(),
        "ifaces": [r.u2() for _ in range(r.u2())],
        "fields": [member(r) for _ in range(r.u2())],
        "methods": [member(r) for _ in range(r.u2())],
        "attrs": [attr(r) for _ in range(r.u2())],
    }
    if r.o != len(b):
        raise ValueError("trailing bytes")
    return cls


def member(r):
    acc, name, desc = r.u2(), r.u2(), r.u2()
    return {"acc": acc, "name": name, "desc": desc,
            "attrs": [attr(r) for _ in range(r.u2())]}


def attr(r):
    name = r.u2()
    return {"name": name, "data": r.take(r.u4())}


def utf8(cls, i):
    e = cls["cp"].get(i)
    if not e or e[0] != 1:
        return None
    return e[3:].decode("utf-8", "replace")


def class_name(cls, i):
    e = cls["cp"].get(i)
    if not e or e[0] != 7:
        return None
    return utf8(cls, struct.unpack_from(">H", e, 1)[0])


def attr_name(cls, a):
    return utf8(cls, a["name"])


def find_attr(cls, owner, name):
    for a in owner["attrs"]:
        if attr_name(cls, a) == name:
            return a
    return None


def code_of(cls, m):
    a = find_attr(cls, m, "Code")
    return parse_code(a["data"]) if a else None


def parse_code(data):
    r = R(data)
    out = {"max_stack": r.u2(), "max_locals": r.u2()}
    out["code"] = bytearray(r.take(r.u4()))
    nh = r.u2()
    out["handlers"] = r.take(8 * nh)
    out["attrs"] = [attr(r) for _ in range(r.u2())]
    return out


def build_code(c):
    return (u2b(c["max_stack"]) + u2b(c["max_locals"]) + u4b(len(c["code"]))
            + bytes(c["code"]) + u2b(len(c["handlers"]) // 8) + c["handlers"]
            + u2b(len(c["attrs"]))
            + b"".join(u2b(a["name"]) + u4b(len(a["data"])) + a["data"] for a in c["attrs"]))


def write(cls, extra=()):
    """Serialise cls.  `extra` are raw pool entries, appended at the end."""
    cp = cls["cp"]
    order = sorted(cp)
    body = b"".join(cp[i] for i in order)
    count = cls["cp_count"] + len(extra)
    out = bytearray()
    out += struct.pack(">IHHH", cls["magic"], cls["minor"], cls["major"], count)
    out += body + b"".join(extra)
    out += u2b(cls["access"]) + u2b(cls["this"]) + u2b(cls["super"])
    out += u2b(len(cls["ifaces"])) + b"".join(u2b(x) for x in cls["ifaces"])
    for key in ("fields", "methods"):
        out += u2b(len(cls[key]))
        for m in cls[key]:
            out += u2b(m["acc"]) + u2b(m["name"]) + u2b(m["desc"])
            out += u2b(len(m["attrs"]))
            for a in m["attrs"]:
                out += u2b(a["name"]) + u4b(len(a["data"])) + a["data"]
    out += u2b(len(cls["attrs"]))
    for a in cls["attrs"]:
        out += u2b(a["name"]) + u4b(len(a["data"])) + a["data"]
    return bytes(out)


# ------------------------------------------------------------------ annotations
def skip_ev(r):
    tag = chr(r.u1())
    if tag in "BCDFIJSZs":
        r.u2()
    elif tag == "e":
        r.u2(); r.u2()
    elif tag == "c":
        r.u2()
    elif tag == "@":
        skip_ann(r)
    elif tag == "[":
        for _ in range(r.u2()):
            skip_ev(r)
    else:
        raise ValueError("element tag %r" % tag)


def skip_ann(r):
    r.u2()
    for _ in range(r.u2()):
        r.u2()
        skip_ev(r)


def anns_with_spans(data):
    """-> [(start, end, type_index)] for each annotation in the attribute."""
    r = R(data)
    out = []
    for _ in range(r.u2()):
        start = r.o
        r.u2()
        type_idx = struct.unpack_from(">H", data, start)[0]
        r.o = start
        skip_ann(r)
        out.append((start, r.o, type_idx))
    return out


def anns_keep(data, keep):
    """Rebuild the attribute keeping only annotations whose (start,end) is kept."""
    spans = anns_with_spans(data)
    head = data[:2]
    out = b"".join(data[s:e] for (s, e, _t) in spans if (s, e) in keep)
    return struct.pack(">H", sum(1 for (s, e, _t) in spans if (s, e) in keep)) + out


# -------------------------------------------------------------------- descriptors
def desc_types(d):
    """Parameter types.  CallbackInfoReturnable<T> carries a type argument, so a
    ';' inside <> must not be taken for the end of the type."""
    inner = d[1:d.index(")")]
    out, i = [], 0
    while i < len(inner):
        j = i
        while inner[i] == "[":
            i += 1
        if inner[i] == "L":
            depth = 0
            while True:
                c = inner[i]
                if c == "<":
                    depth += 1
                elif c == ">":
                    depth -= 1
                elif c == ";" and depth == 0:
                    i += 1
                    break
                i += 1
        else:
            i += 1
        out.append(inner[j:i])
    return out


def desc_ret(d):
    return d[d.index(")") + 1:]


def desc_of(params, ret):
    return "(" + "".join(params) + ")" + ret


def width(t):
    if t in ("J", "D"):
        return 2
    return 0 if t == "V" else 1
