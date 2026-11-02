# Reports

| file | what it covers |
|---|---|
| [`PORT-REPORT.md`](PORT-REPORT.md) | the 1.21.5 → 1.21.11 port: what changed, what broke, verification, limitations |
| [`DEOBFUSCATION-REPORT.md`](DEOBFUSCATION-REPORT.md) | Branchlock analysis: string encryption, `invokedynamic` indirection, the loader's hidden resources |
| [`VERIFICATION.txt`](VERIFICATION.txt) | raw verifier output (counters, resolution table, parse errors) |
| [`PORT-WORK.tsv`](PORT-WORK.tsv) | every unresolved Minecraft reference, ranked by usage count, with Yarn and intermediary names |
| [`MIXIN-WORK.txt`](MIXIN-WORK.txt) | per-mixin-class list of `@Inject` / `@At` / `@Shadow` targets missing in 1.21.11 |
| [`unresolved-refs.tsv`](unresolved-refs.tsv) | flat dump of all references the mapper could not resolve |

## Path notes

The reports were written in the original working tree and refer to paths that this
repository has reorganised:

| path in the reports | path here |
|---|---|
| `dist-1.21.11/mio-1.21.11.jar` | `jars/mio-1.21.11.jar` |
| `dist-1.21.11/mio-loader-1.21.11.jar` | `jars/mio-loader-1.21.11.jar` |
| `dist/src` | `source/payload` |
| `dist/DEOBFUSCATION-REPORT.md` | `docs/DEOBFUSCATION-REPORT.md` |
| `port/*.py`, `port/rebuild.sh` | `tools/` |
| `harness/src/p/*.java` | `tools/harness/` |
| `port/mc/client.jar`, `port/mappings/` | downloaded by `tools/rebuild.sh` into `tools/mc/` and `tools/mappings/` |

Numbers in the reports are from the run that produced these jars; they are not re-measured
on every commit.
