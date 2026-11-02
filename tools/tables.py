#!/usr/bin/env python3
"""Recover the Branchlock member-table strings.

Every class stores its member table as `s[i] = "<ciphertext>"` where the
plaintext is produced at <clinit> by XORing the (UTF-16) characters with a
6-value keystream derived from the site key:

    P[j] = C[j] ^ K[j % 6]         (a keystream value of 0 stops the pass)

We know C (the literal is in the constant pool) and we know what P must look
like - either a class name or `<base36 ownerKey>\\x08member\\x08<base36 ...>`.
So we recover K per blob by filtering each residue class with that constraint.
"""
import collections, json, os, re, sys, zipfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, os.path.join(os.path.dirname(HERE), "work"))
ROOT = os.path.dirname(HERE)

ALLOWED = set(range(0x20, 0x7F)) | {8}
CLASS_RE = re.compile(r"^(?:[A-Za-z_$][A-Za-z0-9_$]*\.)*[A-Za-z_$][A-Za-z0-9_$]*$")
CLASS_SLASH_RE = re.compile(r"^(?:[A-Za-z_$][A-Za-z0-9_$]*/)*[A-Za-z_$][A-Za-z0-9_$]*$")
MEMBER_RE = re.compile(r"^[0-9a-z]+\x08[A-Za-z0-9_$<>]+\x08(?:[0-9a-z]+\x08)*[0-9a-z]+$")

stats = collections.Counter()


def blob_like(chars):
    """ciphertext candidates: contain control characters but stay <= 0xFF"""
    if len(chars) < 6 or any(c > 0xFF for c in chars):
        return False
    return any(c < 0x20 and c != 8 for c in chars)


def candidates_for_residue(C, r):
    out = []
    for k in range(128):
        if k == 0:
            ok = all(C[j] in ALLOWED for j in range(r, len(C), 6))
        else:
            ok = all((C[j] ^ k) in ALLOWED for j in range(r, len(C), 6))
        if ok:
            out.append(k)
    return out


def decrypt(C, K):
    chars = []
    for j, ch in enumerate(C):
        k = K[j % 6]
        if k == 0:
            break
        chars.append(chr(ch ^ k))
    chars.extend(chr(x) for x in C[len(chars):])
    return "".join(chars)


def try_decode(C):
    cs = [candidates_for_residue(C, r) for r in range(6)]
    if any(not c for c in cs):
        return None
    n = 1
    for c in cs:
        n *= len(c)
        if n > 20000:
            return None
    good = []
    for k0 in cs[0]:
        for k1 in cs[1]:
            for k2 in cs[2]:
                for k3 in cs[3]:
                    for k4 in cs[4]:
                        for k5 in cs[5]:
                            K = (k0, k1, k2, k3, k4, k5)
                            P = decrypt(C, K)
                            if CLASS_SLASH_RE.match(P) or CLASS_RE.match(P) or MEMBER_RE.match(P):
                                good.append((K, P))
                                if len(good) > 4:
                                    return ("ambiguous", good)
    if len(good) == 1:
        return ("ok", good[0])
    if not good:
        stats["undecodable"] += 1
        return None
    stats["ambiguous"] += 1
    return ("ambiguous", good)


def main():
    from remap import CP
    z = zipfile.ZipFile(os.path.join(HERE, "out", "mio-1.21.11.jar"))
    decoded, undecoded = [], 0
    seen = {}
    for cn in z.namelist():
        if not cn.endswith(".class"):
            continue
        cp = CP(z.read(cn))
        for i, e in enumerate(cp.entries):
            if not e or e[0] != 1:
                continue
            s = e[1].decode("utf-8", "surrogateescape")
            raw = [ord(ch) for ch in s]
            if not blob_like(raw):
                continue
            stats["blobs"] += 1
            r = seen.get(s)
            if r is None:
                r = try_decode(raw)
                seen[s] = r
                if r is None:
                    undecoded += 1
                    continue
            if r[0] == "ok":
                decoded.append((cn, i, r[1][0], r[1][1]))
            else:
                undecoded += 1
    print(json.dumps(dict(stats), indent=2))
    print("decoded blobs:", len(decoded), "unique plaintexts:",
          len({d[3] for d in decoded}))
    cls = [d for d in decoded if "(" not in d[3]]
    mem = [d for d in decoded if "(" in d[3]]
    print("  class-name entries:", len(cls), " member entries:", len(mem))
    for d in cls[:10]:
        print("   ", d[3])
    for d in mem[:5]:
        print("   ", d[3])
    with open(os.path.join(HERE, "out", "table-strings.tsv"), "w") as fh:
        for cn, i, K, P in decoded:
            fh.write("%s\t%d\t%s\t%s\n" % (cn, i, ",".join(map(str, K)), P))


def decoded_cache_get(cache, s):
    return cache.get(s)


if __name__ == "__main__":
    main()
