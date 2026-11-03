#!/usr/bin/env python3
"""Repair the client command source construction for 1.21.11.

1.21.11 added a third argument to `ClientCommandSource.<init>`:

    1.21.5   (ClientPlayNetworkHandler, MinecraftClient)
    1.21.11  (ClientPlayNetworkHandler, MinecraftClient, PermissionPredicate)

The mod builds one in a static initializer, so the missing argument threw
NoSuchMethodError out of `<clinit>` and left the client half-initialized.

Passing a `null` predicate would only move the failure to the first command, so
the bridge passes `PermissionPredicate.ALL` (field_63208, `bbn.h`).

The replacement keeps the bytecode length identical: that method already has
branch targets and stack map frames, and re-encoding those is a far bigger change
than this fix needs.  `new X; dup; a; b; invokespecial` (11 bytes) becomes
`a; b; invokestatic bridge; nop * 4` (also 11 bytes), so every existing offset,
frame and exception range stays exactly where it was.
"""
import os
import struct
import sys
import zipfile

import classdump
import mixclass as MC

CLIENT_SOURCE = "net/minecraft/class_637"
NETWORK_HANDLER = "net/minecraft/class_634"
MINECRAFT = "net/minecraft/class_310"
PERMISSION = "net/minecraft/class_12096"
ALL_FIELD = "field_63208"           # PermissionPredicate.ALL
BRIDGE = "m$$ccs"
OLD_DESC = "(L%s;L%s;)V" % (NETWORK_HANDLER, MINECRAFT)
BRIDGE_DESC = "(L%s;L%s;)L%s;" % (NETWORK_HANDLER, MINECRAFT, CLIENT_SOURCE)


class Pool:
    """Append-only view of a class constant pool that can add entries."""

    def __init__(self, cls):
        self.base = cls["cp_count"]
        self.extra = []
        self.index = {e: i for i, e in cls["cp"].items()}

    def _add(self, raw):
        i = self.base + len(self.extra)
        self.extra.append(raw)
        return i

    def _get(self, raw):
        i = self.index.get(raw)
        return i if i is not None else self._add(raw)

    def utf8(self, s):
        b = s.encode()
        return self._get(b"\x01" + struct.pack(">H", len(b)) + b)

    def cls_(self, name):
        return self._get(b"\x07" + struct.pack(">H", self.utf8(name)))

    def nat(self, name, desc):
        return self._get(b"\x0c" + struct.pack(">HH", self.utf8(name), self.utf8(desc)))

    def field(self, owner, name, desc):
        return self._get(b"\x09" + struct.pack(">HH", self.cls_(owner), self.nat(name, desc)))

    def method(self, owner, name, desc):
        return self._get(b"\x0a" + struct.pack(">HH", self.cls_(owner), self.nat(name, desc)))


def ref_target(cls, idx):
    e = cls["cp"].get(idx)
    if not e:
        return None
    if e[0] == 7:
        return MC.class_name(cls, idx), None, None
    if e[0] not in (9, 10, 11):
        return None
    ci, nti = struct.unpack_from(">HH", e, 1)
    nt = cls["cp"].get(nti)
    if not nt or nt[0] != 12:
        return None
    ni, di = struct.unpack_from(">HH", nt, 1)
    return MC.class_name(cls, ci), MC.utf8(cls, ni), MC.utf8(cls, di)


def old_init_index(cls):
    for i in sorted(cls["cp"]):
        e = cls["cp"][i]
        if e[0] != 10:
            continue
        t = ref_target(cls, i)
        if t and t[0] == CLIENT_SOURCE and t[1] == "<init>" and t[2] == OLD_DESC:
            return i
    return None


def starts(code):
    """-> list of instruction start offsets."""
    out, pc = [], 0
    while pc < len(code):
        out.append(pc)
        pc += 1 + classdump.size(code, pc)
    return out


def find_sites(cls, old_index):
    """-> [(method, pc, class_idx, getstatic_idx, invokespecial_pc)]."""
    out = []
    for m in cls["methods"]:
        c = MC.code_of(cls, m)
        if not c:
            continue
        code = c["code"]
        for pc in starts(code):
            if code[pc] != 0xBB or pc + 3 >= len(code) or code[pc + 3] != 0x59:
                continue
            t = ref_target(cls, struct.unpack_from(">H", code, pc + 1)[0])
            if not t or t[0] != CLIENT_SOURCE:
                continue
            a = pc + 4
            if code[a] == 0x01:
                a += 1
            elif code[a] == 0x19:
                a += 2
            elif 0x2A <= code[a] <= 0x2D:
                a += 1
            else:
                continue
            if code[a] != 0xB2:
                continue
            gs = struct.unpack_from(">H", code, a + 1)[0]
            insp = a + 3
            if insp + 3 > len(code) or code[insp] != 0xB7:
                continue
            if struct.unpack_from(">H", code, insp + 1)[0] != old_index:
                continue
            out.append((m, pc, struct.unpack_from(">H", code, pc + 1)[0], gs, insp))
    return out


def has_bridge(cls):
    for m in cls["methods"]:
        if MC.utf8(cls, m["name"]) == BRIDGE:
            return True
    return False


def patch(cls):
    """-> (report, extra_pool_entries) or None when nothing to do."""
    if has_bridge(cls):
        return None
    old = old_init_index(cls)
    if old is None:
        return None
    sites = find_sites(cls, old)
    if not sites:
        return None
    pool = Pool(cls)
    helper = pool.method(MC.class_name(cls, cls["this"]), BRIDGE, BRIDGE_DESC)
    init3 = pool.method(CLIENT_SOURCE, "<init>",
                        "(L%s;L%s;L%s;)V" % (NETWORK_HANDLER, MINECRAFT, PERMISSION))
    perm = pool.field(PERMISSION, ALL_FIELD, "L%s;" % PERMISSION)

    code = bytearray()
    code += b"\xbb" + struct.pack(">H", sites[0][2])   # new ClientCommandSource
    code += b"\x59"                                     # dup
    code += b"\x2a"                                     # aload_0
    code += b"\x2b"                                     # aload_1
    code += b"\xb2" + struct.pack(">H", perm)           # PermissionPredicate.ALL
    code += b"\xb7" + struct.pack(">H", init3)          # invokespecial <init>
    code += b"\xb0"                                     # areturn

    code_name = None
    for m in cls["methods"]:
        for a in m["attrs"]:
            if MC.attr_name(cls, a) == "Code":
                code_name = a["name"]
                break
        if code_name is not None:
            break
    body = MC.build_code({"max_stack": 5, "max_locals": 2, "code": code,
                          "handlers": b"", "attrs": []})
    cls["methods"].append({"acc": 0x9, "name": pool.utf8(BRIDGE),
                           "desc": pool.utf8(BRIDGE_DESC),
                           "attrs": [{"name": code_name, "data": body}]})

    for m, pc, _new, gs, insp in sites:
        c = MC.code_of(cls, m)
        code = c["code"]
        end = insp + 3
        repl = bytearray()
        repl += b"\x01"                                 # aconst_null (handler)
        repl += b"\xb2" + struct.pack(">H", gs)         # getstatic   (client)
        repl += b"\xb8" + struct.pack(">H", helper)     # invokestatic bridge
        repl += b"\x00" * (end - pc - len(repl))        # pad back to same length
        code[pc:end] = repl
        # code_of() decodes a copy; rebuild the attribute so the edit persists
        MC.find_attr(cls, m, "Code")["data"] = MC.build_code(c)
    report = {"status": "patched", "sites": len(sites), "added_cp": len(pool.extra)}
    return report, pool.extra


def main(argv):
    jar, out = argv[1], argv[2]
    src = zipfile.ZipFile(jar)
    changed = 0
    tmp = out + ".tmp"
    with zipfile.ZipFile(tmp, "w", zipfile.ZIP_DEFLATED) as dst:
        for info in src.infolist():
            data = src.read(info.filename)
            if info.filename.endswith(".class"):
                try:
                    cls = MC.parse(data)
                except Exception:
                    cls = None
                if cls is not None:
                    res = patch(cls)
                    if res:
                        report, extra = res
                        data = MC.write(cls, extra)
                        changed += 1
                        print("%-48s %s" % (info.filename.rsplit("/", 1)[-1][:48], report))
            dst.writestr(info, data)
    print("classes patched:", changed)
    os.replace(tmp, out)


if __name__ == "__main__":
    main(sys.argv)
