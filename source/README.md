# Decompiled source

| directory | contents |
|---|---|
| `payload/` | CFR 0.152 decompilation of `mio-deob.jar` — the 1.21.5 payload mod with all 5069 Branchlock-encrypted strings replaced by plaintext. **1633 `.java` files.** |
| `loader/` | decompiled turboloader — `nick.Loader`, `nick.MioClassLoader`, `nick.Hash`, `nick.Plugin`, `me.mioclient.loader.Globals`. **6 `.java` files.** |

## Provenance

1. `mio(2).jar` is obfuscated with **Branchlock**: every string literal is a
   `ConstantDynamic` decrypted by a per-class XOR pad, and member access goes through a
   custom `invokedynamic` bootstrap backed by encrypted per-class tables.
2. `tools/harness/BlDeob.java` runs each class's real bootstrap in a JVM, recovers the XOR
   pad, and rewrites every `LDC` into a plain string literal — **5069/5069 sites, 0 failures**.
   The result is `mio-deob.jar` (not committed; rebuildable).
3. CFR decompiles that jar. One enum (`com/jagrosh/discordipc/entities/Packet$OpCode`) is
   rendered by Vineflower instead, because CFR cannot produce it.

## What is still obfuscated

- Class and member names are `m$$<random>` — Branchlock's second layer (member-access
  `invokedynamic` + per-class name tables) was documented and a validated rewriter exists
  (`tools/harness/BlIndy.java`), but it could not complete offline:
  `sites=30909, constKey=1238, resolved=159, REWRITTEN=0`.
- Method bodies still call synthetic helpers that unpack integer/type tables in `<clinit>`.
  Some string literals look like binary garbage — those are data blobs, not text.

## These sources are 1.21.5, not 1.21.11

The port is a **bytecode transform**, so there is no hand-written 1.21.11 source tree. The
1.21.11 jar is this class tree with its Minecraft references remapped. To read the ported
classes specifically, decompile `jars/mio-1.21.11.jar` locally with Vineflower or CFR:

```bash
java -jar vineflower.jar -dgs=1 jars/mio-1.21.11.jar out-src
```

Expect the decompiler to need a large heap (`-Xmx2g`) and several minutes.

## Filenames are shortened

Branchlock's class names are long random strings — up to 208 characters for a single file
name, and 236 characters counting `source/payload/me/mioclient/`. That breaks extraction on
Windows, whose default `MAX_PATH` is 260 characters including your download folder.

Every source path longer than ~96 characters was therefore renamed to `cNNNN.java` in its
original package directory. File **contents are unchanged**, including the `public class
m$$…` declaration, so the real class name is still visible inside each file.

[`FILENAMES.tsv`](FILENAMES.tsv) maps every new path back to the original one:

```
source/payload/me/mioclient/c0001.java<TAB>source/payload/me/mioclient/m$$q5dcpEBC…$1.java
```

With this layout the longest path in the repository is ~120 characters, so it extracts and
clones on Windows without enabling long-path support.

## Caveats

- These files are not a buildable Gradle project: there is no `build.gradle`, no mappings
  declaration, and the `m$$` names must not be renamed. Treat them as reading material.
- `com/jagrosh/discordipc/**` is a vendored third-party library (Discord IPC), unrelated to
  Minecraft.
