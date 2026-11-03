#!/usr/bin/env bash
# Check a copy of the mod jar the way Mixin reads it, and against the recorded hash.
#
#   ./tools/verify-jar.sh ~/.local/share/PrismLauncher/instances/<inst>/mods/mio-1.21.11.jar
#
# A jar whose annotations ASM cannot read aborts the launch during mixin prepare,
# long before any of the mod's code runs, so checking the file in the mods folder
# answers "am I running the build I think I am?".
set -euo pipefail

JAR="${1:?usage: verify-jar.sh <jar>}"
[ -f "$JAR" ] || { echo "no such file: $JAR" >&2; exit 2; }

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
JAVA="${JAVA_HOME:-$HOME/.jdk21}/bin/java"
JAVAC="${JAVA_HOME:-$HOME/.jdk21}/bin/javac"
if [ ! -x "$JAVA" ]; then
  echo "no JDK at $JAVA -- run ./tools/setup-jdk.sh" >&2
  exit 2
fi

CACHE="${XDG_CACHE_HOME:-$HOME/.cache}/mio-verify"
mkdir -p "$CACHE/out"
for art in asm asm-tree; do
  if [ ! -s "$CACHE/$art.jar" ]; then
    curl -fsSL -o "$CACHE/$art.jar" \
      "https://repo1.maven.org/maven2/org/ow2/asm/$art/9.7.1/$art-9.7.1.jar"
  fi
done
"$JAVAC" -cp "$CACHE/asm.jar:$CACHE/asm-tree.jar" -d "$CACHE/out" \
  "$ROOT/tools/harness/AnnCheck.java"

SHA="$(sha256sum "$JAR" | cut -d' ' -f1)"
echo "file    $JAR"
echo "sha256  $SHA"
if [ -f "$ROOT/jars/SHA256SUMS.txt" ]; then
  EXPECTED="$(awk '/  mio-1\.21\.11\.jar$/{print $1}' "$ROOT/jars/SHA256SUMS.txt")"
  if [ "$SHA" = "$EXPECTED" ]; then
    echo "match   jars/SHA256SUMS.txt"
  else
    echo "STALE   expected $EXPECTED -- this is not the current build"
  fi
fi
"$JAVA" -cp "$CACHE/asm.jar:$CACHE/asm-tree.jar:$CACHE/out" AnnCheck "$JAR"
