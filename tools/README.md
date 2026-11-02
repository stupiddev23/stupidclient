# Port toolchain

Everything here is original code, MIT licensed. The port itself needs only **Python 3,
`curl` and `unzip`** — no JVM, no Gradle, no remapping library.

## Scripts

| file | role |
|---|---|
| `rebuild.sh` | end-to-end driver: downloads mappings + client jar, runs steps 1–4 |
| `bl.py` | class-file parser/writer that understands Branchlock `invokedynamic` bootstraps and constant-dynamic strings |
| `mkmap.py` | joins `Yarn 1.21.5 named → intermediary` with `Yarn 1.21.11 named → intermediary` into a single rename table |
| `remap.py` | the remapper: class refs, descriptors, mixin annotation values, accesswidener, `fabric.mod.json`, `refmap.json` |
| `verify.py` | flat reference checker against the 1.21.11 client jar |
| `verify_hier.py` | hierarchy-aware checker — walks `super`/interfaces like the JVM `NoSuchMethodError` resolution |
| `tables.py` | Branchlock `invokedynamic` member-table recovery harness |
| `analyze.py` | input survey: class/entry/reference counts per jar |
| `applied_report.py` | diffs input vs output jars: identical / modified / missing entries and reference deltas |
| `missing_report.py` | ranks unresolved Minecraft references by usage count |
| `mixin_work.py` | lists unresolvable mixin annotation targets per mixin class |
| `harness/*.java` | Java-only tooling: `BlDeob` (string decryption), `BlIndy` (validated indy rewriter), `DumpTables` (table dump via `Unsafe`), `Dump` (bootstrap execution). Needs ASM + JDK 21. |

## Usage

```bash
# original jars go one level up: ../mio(2).jar and ../mio-loader(2).jar
./rebuild.sh
```

The script is idempotent and caches downloads in `mappings/` and `mc/`. Outputs:

```
out/mio-1.21.11.jar
out/mio-loader-1.21.11.jar
```

`harness/*.java` is provided for reference and for finishing the `invokedynamic` work. It
expects the original workspace layout (ASM jars in `tools/`, extracted jars in `work/`), so
it is not wired into `rebuild.sh`; see `docs/DEOBFUSCATION-REPORT.md` for its invocation.

## What the remapper refuses to do

- It never renames members unless both mapping sets agree, so a name that 1.21.11 moved is
  left alone and reported instead of silently corrupted.
- It never rewrites a class reference it cannot resolve; unresolved names go to
  `docs/unresolved-refs.tsv` and `docs/PORT-WORK.tsv`.
- It does not touch Branchlock structures: `invokedynamic` call sites, constant-dynamic
  string bootstraps, member tables and encrypted blobs are copied byte for byte.
