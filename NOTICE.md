# Third-party notice

## The mod is not ours

`jars/mio-1.21.11.jar` and `jars/mio-loader-1.21.11.jar` are patched builds of the **mio**
Fabric client mod. `source/` is a decompilation of that same mod. All rights in that code,
its class and member names, its assets and its obfuscation scheme belong to the original
authors. **No license is granted over any of it here**, and this project claims none.

The code in `source/` is a derivative work produced by decompiling an obfuscated release,
which can only be lawfully redistributed with the rightsholder's permission. If you do not
have that permission, delete `jars/` and `source/` before publishing this repository and
keep only `tools/` and `docs/` — the tooling is original and MIT licensed.

## What is not included

- No Minecraft code, assets or mappings are redistributed. The tooling downloads Yarn and
  the 1.21.11 client jar from Fabric/Mojang at build time.
- No Minecraft assets from the mod's hidden loader payloads.
- No credentials, tokens or account data.

## Affiliations

Not affiliated with or endorsed by the mio authors, Mojang Studios, Microsoft, or the Fabric
project. "Minecraft" is a trademark of Mojang Synergies AB.

## Safety notes

The deobfuscation pass inspected the loader's behaviour: it swaps resources through a
hash-keyed classloader and registers modules reflectively. No dropper, `Runtime.exec`, or
network exfiltration was found in the decrypted strings; the only network-facing code is
Discord Rich Presence IPC. This is a static observation, not a security audit of a running
client.
