# mio — Minecraft 1.21.11 port

An unofficial, bytecode-level port of the **mio** Fabric client mod from Minecraft **1.21.5**
to Minecraft **1.21.11**, plus the decompiled source and the tooling used to produce it.

> **Status: static verification only.** Nothing here has been run inside a real Minecraft
> client — there is no GPU, Fabric runtime or game jar execution in the environment that
> built this. Parsing, mapping resolution and archive integrity are verified; *launching is
> not*. Expect to fix the items in [Remaining work](#remaining-work) before the client loads.

---

## Downloads

| file | classes | description |
|---|---|---|
| [`jars/mio-1.21.11.jar`](jars/mio-1.21.11.jar) | 1633 | the payload mod, remapped to 1.21.11 intermediary |
| [`jars/mio-loader-1.21.11.jar`](jars/mio-loader-1.21.11.jar) | 18 | the "turboloader" (`PreLaunchEntrypoint`), incl. `mio.accesswidener` |

SHA-256 checksums are in [`jars/SHA256SUMS.txt`](jars/SHA256SUMS.txt).

### Install

1. Install **Fabric Loader** for Minecraft **1.21.11** (Java 21).
2. Install **Fabric API** for 1.21.11.
3. Drop **both** jars into `.minecraft/mods/`. The loader jar is required: it is a
   `PreLaunchEntrypoint` that swaps in a resource-redirecting classloader, and the payload
   mod depends on it.
4. Launch the 1.21.11 profile.

If the game crashes during mixin application, the affected class is listed in
[`docs/MIXIN-WORK.txt`](docs/MIXIN-WORK.txt) — those targets do not exist in 1.21.11 yet.

---

## What the port changed

The mod was built for `minecraft ~1.21.5` with Yarn named mappings. The port rewrites only
what 1.21.11 actually moved; everything else is byte-identical to the input.

| artifact | entries identical | entries rewritten |
|---|---|---|
| `mio-1.21.11.jar` (1636 entries) | 1567 | **69** = 67 classes + `fabric.mod.json` + `refmap.json` |
| `mio-loader-1.21.11.jar` (96 entries) | 94 | **2** = `mio.accesswidener` + `fabric.mod.json` |

Concretely:

- **159 mixin annotation values** (`@Inject(method=…)`, `@At(target=…)`, `@Shadow`) were
  stored in Yarn *named* form and are now 1.21.11 **intermediary**. Because of that,
  `refmap.json` is no longer needed: its `mappings` section is empty, its `data` preserved.
- **One class was renamed by Yarn** and had to be followed through class references and
  descriptors: `class_379` (`client/font/Glyph`) → `class_11759`. Fabric reuses `class_379`
  for a different class in 1.21.11, so this cannot be skipped. 4 descriptors rewritten.
- **`mio.accesswidener`**: 2 of 3436 lines changed (`class_10726`, `class_379`).
- **`fabric.mod.json`** in both jars: `depends.minecraft = ~1.21.11`, plus `fabricloader`,
  `java >=21`, `fabric-api`.

Notably, **0 member renames and 0 descriptor changes were needed** for the mod's 3404
Minecraft member references: intermediary names are stable across these versions, so the
mapping join did the work for free.

Untouched, byte for byte: every Branchlock artifact — the encrypted string literals, the
per-class member tables, the `invokedynamic` bootstraps, the `m$$…` names, and the 54 hidden
loader resources.

---

## Verification

Parsed with an independent class-file reader and resolved against the **real 1.21.11 client
jar**, walking superclasses and interfaces the way the JVM does:

| check | result |
|---|---|
| classes re-serialised / parse errors | 1651 / **0** |
| archive integrity (`unzip -t`) | OK, both jars |
| MC class references present in 1.21.11 | 4060 / 4091 |
| MC member references resolved | 3243 / 3404 (0 renames needed) |
| mixin annotation values resolved | 84 / 123 |
| loader jar unresolved MC references | **0** |
| **total MC references resolved** | **7387 / 7618 (97.0 %)** |

Raw output: [`docs/VERIFICATION.txt`](docs/VERIFICATION.txt).
Full analysis: [`docs/PORT-REPORT.md`](docs/PORT-REPORT.md).

---

## Remaining work

1. **144 distinct missing symbols** (231 references) — all genuine 1.21.6 / 1.21.9 API
   refactors, concentrated in the render-pipeline and GUI rewrite. Ranked list:
   [`docs/PORT-WORK.tsv`](docs/PORT-WORK.tsv). Biggest offenders:
   `DrawContext.getMatrices()` (18 refs) and the old `DrawContext` surface, `RenderLayer`
   / `RenderPipeline` methods, and removed classes such as `class_4668` (`ClickableWidget`).
2. **44 mixin classes with 70 unresolvable targets** — mixin fails *hard* on a missing
   `@Inject` / `@At` target, so each of these aborts at load until updated.
   List: [`docs/MIXIN-WORK.txt`](docs/MIXIN-WORK.txt).
3. **`invokedynamic` member tables are not remapped.** Branchlock resolves members by name
   from encrypted per-class tables at `<clinit>`; ~30 909 call sites still name 1.21.5
   members. Entries whose target disappeared (item 1) will throw at class-init.
   `tools/tables.py` is the harness for finishing this; see `docs/PORT-REPORT.md`.
4. **201 accesswidener entries no longer apply** (140 methods, 46 fields, 15 classes).
   Unresolvable AW entries are ignored with a warning, so these are "access not widened"
   bugs, not crashes.
5. **No runtime test.** Verification is mapping-level and hierarchy-aware. This is the
   honest limitation of the whole repository.

---

## Repository layout

```
.
├── jars/                 ported jars + SHA-256 sums
├── source/
│   ├── payload/          CFR decompilation of the deobfuscated 1.21.5 payload (1633 files)
│   ├── loader/           decompiled turboloader (6 files)
│   └── FILENAMES.tsv     shortened → original path map for the obfuscated class names
├── tools/                the port + deobfuscation toolchain (Python, no JVM needed)
│   ├── bl.py             Branchlock-aware class-file parser
│   ├── mkmap.py          Yarn named <-> intermediary mapping join
│   ├── remap.py          the bytecode remapper
│   ├── verify.py         reference verifier
│   ├── verify_hier.py    hierarchy-aware verifier
│   ├── tables.py         invokedynamic table recovery harness
│   ├── analyze.py, applied_report.py, missing_report.py, mixin_work.py
│   ├── rebuild.sh        end-to-end rebuild
│   └── harness/          Java tooling: BlDeob, BlIndy, DumpTables, Dump
└── docs/                 port report, deobfuscation report, verification, work lists
```

---

## Rebuilding the port

Requirements: Python 3, `curl`, `unzip`. **No JVM is needed** for the port itself.

```bash
git clone <this repo> mio-1.21.11-port
cd mio-1.21.11-port

# the two original 1.21.5 jars, next to tools/
cp /path/to/mio\(2\).jar /path/to/mio-loader\(2\).jar .

cd tools
./rebuild.sh        # downloads Yarn 1.21.5 + 1.21.11 and the 1.21.11 client jar,
                    # then mkmap -> remap -> verify -> reports
```

Outputs land in `tools/out/`. The script is idempotent; downloads are cached in
`tools/mappings/` and `tools/mc/` (both git-ignored).

---

## How the port works

1. **Mapping join** — build `Yarn 1.21.5 named → intermediary` and
   `Yarn 1.21.11 named → intermediary` tables, then intersect them, so a name that exists in
   both versions maps directly to the 1.21.11 intermediary symbol (`mkmap.py`).
2. **Bytecode remap** — `remap.py` rewrites class references, descriptors and mixin
   annotation values in place, without touching the Branchlock structures (`invokedynamic`
   bootstraps, encrypted string constants, member tables). Class files are re-serialised
   with the original constant-pool layout preserved.
3. **Verification** — `verify_hier.py` resolves every Minecraft reference against the real
   1.21.11 client jar with proper `super`/interface walking; `missing_report.py` and
   `mixin_work.py` turn the failures into the work lists in `docs/`.
4. **Packaging** — `fabric.mod.json` dependency ranges updated, `refmap.json` emptied,
   jars repacked.

There is **no separate 1.21.11 Java source tree**: the port is a bytecode transform, so the
compilable source of the 1.21.11 jars is the 1.21.5 decompilation with the same references
rewritten. `source/payload` is that tree before the rewrite.

---

## Decompiled source

`source/payload` is a **CFR 0.152** decompilation of `mio-deob.jar` — the input jar with all
**5069** Branchlock-encrypted strings replaced by their plaintext (recovered by executing the
real bootstrap in a JVM). Branchlock's second layer (member-access `invokedynamic`) is
documented but not removed, so class/member names are still `m$$<random>` and some method
bodies call through synthetic helpers.

`source/loader` is the decompiled turboloader: a resource-redirecting classloader that serves
54 hidden assets keyed by a 64-bit hash, plus reflective module registration.

Branchlock's class names are up to 208 characters long, which makes the raw tree
un-extractable on Windows (260-character `MAX_PATH`). Paths over ~96 characters were renamed
to `cNNNN.java` inside their package directory; contents are untouched and
[`source/FILENAMES.tsv`](source/FILENAMES.tsv) maps each one back to its original name.

Full write-up, including the string-decryption algorithm and the `invokedynamic` bootstrap
format: [`docs/DEOBFUSCATION-REPORT.md`](docs/DEOBFUSCATION-REPORT.md).

---

## Legal

This repository redistributes **third-party code**: the mod in `jars/` and `source/` is the
work of mio's authors, and the source is a decompilation of their obfuscated release.
**No license is granted over that code**, and nothing here is affiliated with or endorsed by
the mio authors, Mojang, Microsoft, or Fabric. See [`NOTICE.md`](NOTICE.md).

The tooling (`tools/`) is MIT licensed — see [`LICENSE`](LICENSE).

If you do not have permission to redistribute the mod, delete `jars/` and `source/` before
publishing and keep only the tooling and reports.
