#!/usr/bin/env bash
# Compile the 1.21.11 GUI compat layer.
#
# net.minecraft.* is named in intermediary, which the obfuscated client jar does
# not expose, so those come from the hand-written stubs in tools/compat/stubs.
# org.joml is NOT stubbed: JOML keeps Matrix4f's components package-private and
# only exposes m00()..m33(), and a stub that got that wrong compiled happily and
# then threw IllegalAccessError in game.  The real 1.10.8 jar the launcher puts
# on the classpath is used instead, pinned by checksum.
set -euo pipefail

cd "$(dirname "$0")/.."
JAVAC="${JAVAC:-$HOME/.jdk21/bin/javac}"
if [ ! -x "$JAVAC" ]; then
    echo "javac not found at $JAVAC (run tools/setup-jdk.sh)" >&2
    exit 1
fi

JOML=tools/compat/libs/joml-1.10.8.jar
JOML_SHA=bf19510145178df82cd3bd37edd514c13f411531ec5545299fd3abcbc98fe7c2
mkdir -p "$(dirname "$JOML")"
if [ ! -f "$JOML" ]; then
    echo "fetching joml 1.10.8" >&2
    curl -sfL -o "$JOML.tmp" \
        https://repo1.maven.org/maven2/org/joml/joml/1.10.8/joml-1.10.8.jar
    mv "$JOML.tmp" "$JOML"
fi
echo "$JOML_SHA  $JOML" | sha256sum -c --status - || {
    echo "joml checksum mismatch -- delete $JOML and retry" >&2
    exit 1
}

OUT=tools/compat/out
rm -rf "$OUT"
mkdir -p "$OUT"
"$JAVAC" -nowarn --release 21 -cp "$JOML" -d "$OUT" \
    $(find tools/compat/stubs -name '*.java') \
    $(find tools/compat/src -name '*.java')
find "$OUT/me" -name '*.class' | sort
