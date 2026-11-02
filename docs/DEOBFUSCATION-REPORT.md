# mio — deobfuscation report

Inputs

| file | size | contents |
|---|---|---|
| `mio(2).jar` | 14.3 MB | the Fabric mod: 1633 obfuscated classes (`me/mioclient/**`, `com/jagrosh/discordipc/**`) + `fabric.mod.json`, `mio.mixins.json`, `refmap.json` |
| `mio-loader(2).jar` | 1.6 MB | "turboloader": `nick/Loader`, `nick/MioClassLoader`, `nick/Hash`, `nick/Plugin`, `me/mioclient/loader/Globals` and 57 `mio/*.bin` payloads (3 look-up tables + 54 hidden resources) |

Obfuscator: **Branchlock** (`m$$`-prefixed identifiers, `invokedynamic` string decryption,
constant-hiding helpers, reflective member resolution).

Outputs (in `dist/`)

| artifact | what it is |
|---|---|
| `mio-deob.jar` | `mio(2).jar` with **all 5069 encrypted strings replaced by real string literals** (1633 classes + the three json resources, 14 MB, loadable) |
| `src/` | CFR 0.152 decompilation of `mio-deob.jar` — **1633/1633 classes**, 99 MB of `.java` |
| `loader-resources/` | the 54 resources the loader was hiding inside `mio/*.bin` (PNGs, JSON, shaders, XML) |
| `rebuild.sh` | re-runs the whole pipeline |
| tooling (workspace) | `harness/src/p/BlDeob.java` (layer 1), `BlIndy.java` (layer 2, validated rewriter), `p/DumpTables.java` (table recovery), `work/bl.py` (class-file parser) |

Vineflower was run first but stalls in its preprocessing pass on this input
(it reached 1543/1633 classes and stopped making progress), so the shipped sources
are CFR's. One class, `com/jagrosh/discordipc/entities/Packet$OpCode`, is decompiled
with Vineflower instead because CFR cannot render that enum.

---

## Layer 1 — string encryption (fully removed)

Every string literal is a *constant dynamic* (`LDC` of a `ConstantDynamic`) whose bootstrap
method is a per-class generated method

```
(Lookup, String, Class, int key) -> String
```

Because the static key index is different for every site, Branchlock emits a *fresh*
bootstrap table entry per string (5069 entries for 5069 sites — see the survey output).

The generated body is trivial and was recovered from bytecode, then re-verified by
**executing the real method inside a JVM** (see `harness/src/p/Dump.java`):

```java
public static String decrypt(int key) {                 // m$$9STsz… in every class
    byte[] data = Loader.getString(key);                // mio/strings.bin : int key, int len, byte[len]
    byte[] xor  = { 101,117,105,-123,-106,126,122,-49,-100,55,72,-116,-22,46 }; // per class, 8..21 bytes
    for (int i = 0; i < data.length; i++) data[i] ^= xor[i % xor.length];
    return new String(data, UTF_8);
}
```

* the XOR pad is **per class** (one new random pad per generated class, length 8–21 bytes);
* `mio/strings.bin` in the loader jar holds all 5069 ciphertexts (`int key, int length, bytes`);
* the accessor chain is `m$$c5dTOPIoKY…m$$pTTK…` → `nick.Loader.getString(int)`.

`harness/src/p/BlDeob.java` walks every class with ASM, extracts each class's XOR pad
from its bootstrap method, resolves every `ConstantDynamic` against `strings.bin` and
rewrites the `LDC` into the plain literal. Result: **5069/5069 sites decrypted, 0 failures**
(the survey line `noKey=0 decodeFail=0`).

Note: some decrypted values are *deliberately* binary-looking (control characters,
`U+0080–U+00FF`). Those are **data blobs**, not messages: each class's `<clinit>` splits them
into 8-char chunks and parses them (integer/type tables, see layer 2). They are reproduced
byte-for-byte by the decryption, so they are correct.

## Layer 2 — member-access indirection (`invokedynamic`), documented but not removed

32 279 `invokedynamic` sites: 30 909 use Branchlock's own `(Lookup,String,MethodType)CallSite`
bootstrap, the remainder are ordinary `LambdaMetafactory`, `StringConcatFactory`,
`ObjectMethods` and `SwitchBootstraps`.

The bootstrap (`a(Lookup, MutableCallSite, String name, MethodType mt, long key)`) resolves a
member **by the last call-site argument** and then `dropArguments(mh, mt.parameterCount()-1, long)`:

| `name.charAt(0)` | meaning | emitted as |
|---|---|---|
| `o` (111) | static method | `invokestatic` |
| `$` (36) | virtual method | `invokevirtual` |
| other | super/private method | `invokespecial` |
| `È` (200) | instance field read | `getfield` |
| `O` (79) | instance field write | `putfield` |
| `á` (225) | static field read | `getstatic` |
| `w` (119) | static field write | `putstatic` |

The `long key` encodes the table slot in its top bits — `slot = (int)(key >>> 46)` — and
`slot` indexes a per-class `String[] h` table built in `<clinit>` from the layer-1 data blobs:

```
h[slot] = "<base36 ownerClassKey>" \u0008 "<memberName>" \u0008 "<base36 typeKey>" ...
```

i.e. `h` holds *both* class names (resolved through `b(long) -> Class.forName(h[i])`) and
fully encoded member descriptors. `c(long)`/`d(long)` turn a key into
`java.lang.reflect.Field` / `Method` by splitting that string and looking the member up
reflectively; `a(long) -> int` is `(int)(key >>> 46)`.

**Why it is not rewritten here.** A rewrite needs two things per site: the runtime `long` key
and the class's `h[]` table. Both are only partly recoverable offline:

* `harness/src/p/DumpTables.java` loads each class with stand-in stubs for the ~746 external
  Minecraft/Mojang/Fabric types and reads the tables through `Unsafe`, even when `<clinit>`
  aborts. Yield: **732 of 1174 classes with an `invokedynamic` bootstrap produced a table,
  302 of them containing real member descriptors.** Branchlock's `<clinit>` eagerly resolves
  some members (e.g. `org.slf4j.LoggerFactory.getLogger`) and aborts on a stubbed JVM, so
  most tables stop halfway — `mio/settings.bin`-style data is never reached.
* `harness/src/p/BlIndy.java` implements the rewriter itself. It computes `slot = key >>> 46`,
  decodes `h[slot]` (`ownerKey \u0008 name \u0008 paramKeys… \u0008 returnKey`, base-36 keys
  resolved through the same table, as `b(long)`/`c(long)`/`d(long)` do), and **only rewrites a
  site when the decoded owner/name/descriptor exactly matches the call site**. Measured over
  the whole jar: `sites=30909, constKey=1238, resolved=159, REWRITTEN=0` — 29 671 sites belong
  to classes whose table was lost, and most keys are computed rather than pushed with `ldc2_w`.

To finish the job: put the real Minecraft jar on the classpath of `DumpTables` (the
reflective resolver then succeeds and every `<clinit>` completes), re-dump the tables, and run
`BlIndy write work/mio out harness/tables/all.tsv`. Every rewrite it emits is type-checked, so
unresolved sites stay as `invokedynamic` and nothing is silently corrupted.

## Layer 3 — the loader (`mio-loader(2).jar`)

* `nick.Plugin` is a Fabric `PreLaunchEntrypoint` that swaps the loader's own classloader.
* `nick.MioClassLoader` is a **resource redirection** loader: `getResourceAsStream(name)`
  computes `Hash.hash(name.getBytes(UTF_8))` and, if a `mio/<hash>.bin` exists, returns that
  payload instead of the real resource. The payloads are the resources *as-is* (plaintext),
  only renamed to their 64-bit hash.
* `Hash` is the classic 64-bit multiply-xor hash (`multiplier -4132994306676758123`,
  seed `-512093083`); the `.bin` file names are its results.
* `nick.Loader` reads `mio/strings.bin` and `mio/integers.bin` into `Map`s and exposes
  `getString(int)` / `getInt(long)`; it also drives `Loader.loadModules/loadCommands/…`
  reflection-based module registration, and `sun.misc.Unsafe` writes to static fields
  (delta-time constants etc.).

`dist/loader-resources/` contains all 54 hidden payloads extracted with their natural
extensions. Three of them could be identified by hashing known resource paths:

| hash file | real resource |
|---|---|
| `-1156854636071942612.bin` | `assets/mio/textures/aero.png` |
| `-7090278656847170995.bin` | `assets/mio/textures/effect/empty.png` |
| `1539974198544823836.bin` | `assets/minecraft/shaders/program/blur_mask.fsh` |

The remaining 51 payloads are resources whose path string is not inside either jar (they are
requested by the game at runtime); their contents are recovered, only their names are unknown
(shaders, GUIs, JSON data — an `xml`, several `png`, `json` and `vsh` were detected by magic).

## Behaviour notes

Nothing malicious was found: the loader only swaps resources, hides the mod's asset set and
registers modules/commands reflectively. The network-facing code is the Discord Rich Presence
IPC (`com.jagrosh.discordipc`) plus ordinary Fabric mixins. There is no dropper, no
`Runtime.exec`, no network exfiltration in the deobfuscated strings.
