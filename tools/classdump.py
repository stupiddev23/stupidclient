#!/usr/bin/env python3
"""Disassemble a class file with constant-pool references resolved.

The 1.21.11 client jar has no sources, so any runtime failure in the mod's own
code has to be read off the bytecode.  javap is not available in the build
environment; this walks the same structures `mixclass.parse` already decodes and
prints one line per instruction with field/method/class operands spelled out.
"""
import struct
import sys

import mixclass as MC

N = (
    "nop aconst_null iconst_m1 iconst_0 iconst_1 iconst_2 iconst_3 iconst_4 "
    "iconst_5 lconst_0 lconst_1 fconst_0 fconst_1 fconst_2 dconst_0 dconst_1 "
    "bipush sipush ldc ldc_w ldc2_w iload lload fload dload aload "
    "iload_0 iload_1 iload_2 iload_3 lload_0 lload_1 lload_2 lload_3 "
    "fload_0 fload_1 fload_2 fload_3 dload_0 dload_1 dload_2 dload_3 "
    "aload_0 aload_1 aload_2 aload_3 "
    "iaload laload faload daload aaload baload caload saload "
    "istore lstore fstore dstore astore "
    "istore_0 istore_1 istore_2 istore_3 lstore_0 lstore_1 lstore_2 lstore_3 "
    "fstore_0 fstore_1 fstore_2 fstore_3 dstore_0 dstore_1 dstore_2 dstore_3 "
    "astore_0 astore_1 astore_2 astore_3 "
    "iastore lastore fastore dastore aastore bastore castore sastore "
    "pop pop2 dup dup_x1 dup_x2 dup2 dup2_x1 dup2_x2 swap "
    "iadd ladd fadd dadd isub lsub fsub dsub imul lmul fmul dmul "
    "idiv ldiv fdiv ddiv irem lrem frem drem ineg lneg fneg dneg "
    "ishl lshl ishr lshr iushr lushr iand land ior lor ixor lxor iinc "
    "i2l i2f i2d l2i l2f l2d f2i f2l f2d d2i d2l d2f i2b i2c i2s "
    "lcmp fcmpl fcmpg dcmpl dcmpg "
    "ifeq ifne iflt ifge ifgt ifle if_icmpeq if_icmpne if_icmplt if_icmpge "
    "if_icmpgt if_icmple if_acmpeq if_acmpne goto jsr ret tableswitch "
    "lookupswitch ireturn lreturn freturn dreturn areturn return "
    "getstatic putstatic getfield putfield invokevirtual invokespecial "
    "invokestatic invokeinterface invokedynamic new newarray anewarray "
    "arraylength athrow checkcast instanceof monitorenter monitorexit wide "
    "multianewarray ifnull ifnonnull goto_w jsr_w"
).split()
NAME = {i: n for i, n in enumerate(N)}


def nat(cls, i):
    ni, di = struct.unpack_from(">HH", cls["cp"][i], 1)
    return "%s%s" % (MC.utf8(cls, ni), MC.utf8(cls, di))


def ref(cls, i):
    e = cls["cp"].get(i)
    if e is None:
        return "#%d?" % i
    tag = e[0]
    if tag in (9, 10, 11):
        ci, nti = struct.unpack_from(">HH", e, 1)
        return "%s.%s" % (MC.class_name(cls, ci), nat(cls, nti))
    if tag == 7:
        return MC.class_name(cls, i)
    if tag == 8:
        return repr(MC.utf8(cls, i))
    if tag == 3:
        return str(struct.unpack_from(">i", e, 1)[0])
    if tag == 4:
        return "%ff" % struct.unpack_from(">f", e, 1)[0]
    if tag == 5:
        return "%dL" % struct.unpack_from(">q", e, 1)[0]
    if tag == 6:
        return "%fd" % struct.unpack_from(">d", e, 1)[0]
    if tag == 12:
        return nat(cls, i)
    if tag == 16:
        return MC.utf8(cls, struct.unpack_from(">H", e, 1)[0])
    if tag in (17, 18):
        bsm, nti = struct.unpack_from(">HH", e, 1)
        return "bootstrap#%d:%s" % (bsm, nat(cls, nti) if nti else "")
    if tag == 15:
        return "mh#%d" % i
    return "#%d" % i


def size(code, pc):
    op = code[pc]
    if op in (0x10, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19,
              0x36, 0x37, 0x38, 0x39, 0x3A, 0xA9, 0xBC):
        return 1
    if op in (0x11, 0x13, 0x14, 0x84, 0xC6, 0xC7, 0xBB, 0xBD, 0xC0, 0xC1,
              0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8):
        return 2
    if op in (0xC5,):
        return 3
    if op in (0xB9, 0xBA, 0xC8, 0xC9):
        return 4
    if 0x99 <= op <= 0xA8:
        return 2
    if op == 0xAA:
        pad = (4 - (pc + 1) % 4) % 4
        base = pc + 1 + pad
        lo = struct.unpack_from(">i", code, base + 4)[0]
        hi = struct.unpack_from(">i", code, base + 8)[0]
        return pad + 12 + 4 * (hi - lo + 1)
    if op == 0xAB:
        pad = (4 - (pc + 1) % 4) % 4
        base = pc + 1 + pad
        n = struct.unpack_from(">i", code, base + 4)[0]
        return pad + 8 + 8 * n
    if op == 0xC4:
        return 5 if code[pc + 1] == 0x84 else 3
    return 0


def show(cls, code, pc):
    op = code[pc]
    n = size(code, pc)
    raw = code[pc + 1:pc + 1 + n]
    name = NAME.get(op, "op%02x" % op)
    extra = ""
    if op in (0x12, 0x13, 0x14, 0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8,
              0xB9, 0xBA, 0xBB, 0xBD, 0xC0, 0xC1, 0xC5):
        i = (raw[0] if n == 1 else struct.unpack_from(">H", raw, 0)[0])
        if op == 0xB9:
            i = struct.unpack_from(">H", raw, 0)[0]
        extra = ref(cls, i)
    elif op == 0x10:
        extra = str(struct.unpack_from(">b", raw, 0)[0])
    elif op in (0x11,):
        extra = str(struct.unpack_from(">h", raw, 0)[0])
    elif op in (0x84,):
        extra = "local%d +%d" % (raw[0], struct.unpack_from(">b", raw, 1)[0])
    elif 0x99 <= op <= 0xA8 or op in (0xC6, 0xC7):
        extra = "%+d -> %d" % (struct.unpack_from(">h", raw, 0)[0], pc + struct.unpack_from(">h", raw, 0)[0])
    elif op in (0xC8, 0xC9):
        extra = "%+d" % struct.unpack_from(">i", raw, 0)[0]
    elif op in (0x15, 0x16, 0x17, 0x18, 0x19, 0x36, 0x37, 0x38, 0x39, 0x3A, 0xA9, 0xBC):
        extra = str(raw[0])
    return "%5d: %-18s %s" % (pc, name, extra)


def dump(cls, path):
    print("== %s" % path)
    print("   extends %s" % MC.class_name(cls, cls["super"]))
    for f in cls["fields"]:
        print("   field %s:%s acc=0x%x" % (MC.utf8(cls, f["name"]), MC.utf8(cls, f["desc"]), f["acc"]))
    for m in cls["methods"]:
        name, desc = MC.utf8(cls, m["name"]), MC.utf8(cls, m["desc"])
        print("\n  %s%s acc=0x%x" % (name, desc, m["acc"]))
        c = MC.code_of(cls, m)
        if not c:
            continue
        print("    max_stack=%d max_locals=%d len=%d" % (c["max_stack"], c["max_locals"], len(c["code"])))
        code = c["code"]
        pc = 0
        while pc < len(code):
            print("  " + show(cls, code, pc))
            pc += 1 + size(code, pc)


def main(argv):
    only = None
    args = list(argv[1:])
    if "--method" in args:
        i = args.index("--method")
        only = args[i + 1]
        del args[i:i + 2]
    for path in args:
        cls = MC.parse(open(path, "rb").read())
        if only:
            cls = dict(cls)
            cls["methods"] = [m for m in cls["methods"]
                              if MC.utf8(cls, m["name"]).startswith(only)]
        dump(cls, path)


if __name__ == "__main__":
    main(sys.argv)
