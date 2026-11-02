# mio — Minecraft 1.21.5 → 1.21.11 port

The mod was built for **Minecraft 1.21.5, Yarn mappings, Java 21** (`mio-loader(2).jar`
declares `"minecraft": "~1.21.5"`). This port moves both jars to **1.21.11**
(`net.fabricmc:yarn:1.21.11+build.6`, intermediary namespaces).

| artifact | what it is |
|---|---|
| `mio-1.21.11.jar` | the payload mod (1633 classes) remapped to 1.21.11 |
| `mio-loader-1.21.11.jar` | the turboloader (18 classes) remapped to 1.21.11, incl. `mio.accesswidener` |
| `PORT-WORK.tsv` | the residual breakages, ranked by reference count, with Yarn names |
| `MIXIN-WORK.txt` | per-mixin-class list of annotation targets that no longer resolve |
| `VERIFICATION.txt` | raw verification output |

## What was rewritten

Measured against the inputs (`port/applied_report.py`):

| artifact | identical | modified |
|---|---|---|
| `mio-1.21.11.jar` (1636 entries) | 1 567 | **69** = 67 classes + `fabric.mod.json` + `refmap.json` |
| `mio-loader-1.21.11.jar` (96 entries) | 94 | **2** = `mio.accesswidener` + `fabric.mod.json` |

So the honest headline is that **intermediary mappings did most of the work for
free**: of the 3 404 MC member references in the payload, **0 needed a rename and
0 needed a descriptor change** — they are byte-identical and already valid in
1.21.11. The Yarn join produced 135 member renames and 1 483 descriptor changes
*across all of Minecraft*, but the mod references none of them.

What actually changed:

* **159 mixin annotation values** (`@Inject(method=…)`, `@At(target=…)`,
  `@Shadow`), which this mod stores in **Yarn named** form. They were converted to
  **1.21.11 intermediary**, so `refmap.json` is no longer needed: its `mappings`
  section was emptied while its `data` section is preserved.
* **1 class renamed by Yarn** in class references/descriptors (`class_379`
  `client/font/Glyph` → `class_11759`; Fabric reuses the old number for a different
  class in 1.21.11, so this cannot be skipped), plus 4 rewritten descriptors.
* **`mio.accesswidener`**: 2 lines changed (`class_10726`, `class_379`); the other
  3 434 lines were already valid and are byte-identical.
* **`fabric.mod.json`** in both jars: `depends.minecraft` = `~1.21.11`, plus
  `fabricloader`, `java >=21`, `fabric-api`.

The other 1 566 payload classes and all 18 loader classes are byte-identical, as are
all encrypted strings, the member tables, the `invokedynamic` bootstraps and the
obfuscated names — which is itself part of the verification: the port changed only
what it had to.

Untouched, byte for byte: every Branchlock artifact — the layer-1 encrypted string
literals, the per-class member tables, the `invokedynamic` bootstrap methods, the
obfuscated `m$$…` class and member names, and the 54 hidden loader resources.

## Verification (static — see limitations)

Parsed with an independent class-file reader, then resolved against the **real
1.21.11 client jar** (`port/mc/client.jar`) plus the intermediary mappings, walking
superclasses/interfaces exactly as the JVM does:

| check | result |
|---|---|
| classes re-serialised / parse errors | 1 651 / **0** |
| `mio-1.21.11.jar` structure (`unzip -t`) | OK, 1636 entries |
| MC class references that exist in 1.21.11 | **4 060 / 4 091** |
| MC member references that resolve in 1.21.11 | **3 243 / 3 404** (0 renames needed) |
| mixin annotation values that resolve | **84 / 123** |
| loader jar unresolved MC references | **0** |
| **total MC references resolved** | **7 387 / 7 618 (97.0 %)** |
| referenced MC classes missing | 17 |

The 231 unresolved references reduce to **144 distinct symbols**, all of them
genuine 1.21.6 / 1.21.9 API refactors — the render-pipeline and GUI rewrite:

* `DrawContext.getMatrices()` / `method_51448` (18 refs) and the rest of the old
  `DrawContext` surface (`method_51452`, `method_25290`, `method_25303`, `field_44658`,
  the old constructor) — 1.21.6+ replaced this with the render-state/`DrawContext.draw*`
  API.
* `RenderLayer.method_62277` / `method_51784` / `method_23572` / `method_23580`,
  `RenderPipelines.field_56849`, `UniformType.field_56741/3/5` — `RenderLayer` and
  `RenderPipeline` were reworked.
* `class_4668` (`ClickableWidget`), `class_1921$class_4687/4688/4689`
  (`RenderLayer` subclasses), `class_5294` (+nested), `class_8685$class_7920`
  (`SkinTextures`), `class_4761`, `class_898`, `class_9958` — removed or split.
* `Camera.method_19326`, `OutlineVertexConsumerProvider.method_23286`,
  `MathHelper.method_15374`, `Text.equals`, `Entity.method_19538`,
  `ClientPlayerEntity.field_53038/53039`, `NetworkThreadUtils.forceMainThread`,
  `MinecraftClient.runTasks`, `Screen.init`, …

On top of that, **201 accesswidener entries no longer apply** in 1.21.11
(140 methods, 46 fields, 15 classes — e.g. `Window.setScaleFactor(D)V`, whose
descriptor became `(I)V`). Entries the AW cannot resolve are ignored with a warning
rather than failing the launch, so these are "access is not widened" bugs, not
crashes. A subset (entries written in Yarn *named* form such as
`class_310 execute (Ljava/lang/Runnable;)V`) never applied on 1.21.5 either, and were
left untouched on purpose.

Watch especially for the **mixin annotation targets**: Mixin fails *hard* when an
`@Inject` / `@ModifyArgs` / `@At(target=…)` target does not exist, so each affected
mixin class aborts at load until its target is updated. `MIXIN-WORK.txt` lists
**70 unresolvable target rows across 44 mixin classes** (53 member targets plus 17
class/owner references; 39 of them are the distinct symbols the hierarchy check also
flags on the rewritten jar). This is where the remaining work is concentrated.

## Known limitations

1. **The `invokedynamic` member tables are not remapped.** Branchlock stores every
   member access as a `long` key into a per-class table that its `<clinit>` builds
   from **encrypted** strings; the table is resolved reflectively by *name* at class
   initialisation (`Class.forName`, `getDeclaredMethod`, …). Those names are not
   visible to any offline bytecode tool, so ~30 909 call sites keep referring to
   1.21.5 member names. Entries whose target disappeared (the 144 symbols above) will
   throw at class-init, even though the surrounding bytecode is correct.
   `port/tables.py` is the harness for finishing this: it attempts an offline
   keystream recovery for the table blobs (the `<clinit>` transform is a 6-value XOR
   keystream `P[j] = C[j] ^ K[j % 6]`). In this pass 20 499 blobs were classified, only
   2 086 could be proven out-of-model and none decoded with certainty, so the reliable
   path is still the runtime one: run `DumpTables` with the real **1.21.5** client jar
   on its classpath (download it exactly like `port/mc/client.jar`), remap the dumped
   tables with `port/map/members.tsv`, and re-encrypt with the recovered keystream.
2. **No runtime test.** There is no Minecraft client, GPU or Fabric environment here,
   so nothing was executed: verification is mapping-level and hierarchy-aware, not
   "it launches". Expect to iterate on the 144 symbols above before the client loads.
3. **The mod's own obfuscation is untouched** — class/member names are still
   `m$$…`. That is a separate problem from the version port.
4. Yarn publishes only **`1.21.5+build.1`** today; if the mod was compiled against a
   later 1.21.5 build, a handful of Yarn names may resolve differently.
5. `dist/` from the earlier deobfuscation pass (readable `src/`, `mio-deob.jar`) is
   still 1.21.5-based; only the artifacts in this directory are ported.

## Reproducing

```
cd port
./rebuild.sh            # downloads mappings + the 1.21.11 client jar, then:
                        #   mkmap.py -> remap.py -> verify_hier.py -> missing_report.py
```
Inputs: `../mio(2).jar`, `../mio-loader(2).jar`. Outputs: `port/out/`, then copied here.
