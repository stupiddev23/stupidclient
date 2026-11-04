#!/usr/bin/env bash
# Compile the 1.21.11 GUI compat layer against the stubs in tools/compat/stubs.
#
# The classes have to name intermediary members (class_332.method_51448), which
# do not exist in the obfuscated client jar, so javac is pointed at hand-written
# stubs that declare exactly the members the compat layer uses.  Only the
# me/mioclient/compat classes are kept; the stubs are compile-time only.
set -euo pipefail

cd "$(dirname "$0")/.."
JAVAC="${JAVAC:-$HOME/.jdk21/bin/javac}"
if [ ! -x "$JAVAC" ]; then
    echo "javac not found at $JAVAC (run tools/setup-jdk.sh)" >&2
    exit 1
fi

OUT=tools/compat/out
rm -rf "$OUT"
mkdir -p "$OUT"
"$JAVAC" -nowarn --release 21 -d "$OUT" \
    $(find tools/compat/stubs -name '*.java') \
    $(find tools/compat/src -name '*.java')
find "$OUT/me" -name '*.class' | sort
