#!/usr/bin/env bash
# Install a JDK into the user's home directory.
#
# sudo and apt-get are not available in this sandbox (uid has no privileges),
# so a distribution package cannot be installed; a Temurin tarball can.  It goes
# outside the repository so the JDK's ~300 MB never ends up in a checkpoint or a
# commit, and this script is the way to recreate it after a VM restore.
#
#   ./tools/setup-jdk.sh            install into ~/.jdk21
#   JDK_DIR=/opt/jdk ./tools/setup-jdk.sh
#   ./tools/setup-jdk.sh --check    report what is installed, install nothing
set -euo pipefail

DEST="${JDK_DIR:-$HOME/.jdk21}"

case "$(uname -m)" in
  x86_64|amd64) ARCH=x64 ;;
  aarch64|arm64) ARCH=aarch64 ;;
  *) echo "unsupported machine: $(uname -m)" >&2; exit 1 ;;
esac

if [ "${1:-}" = "--check" ]; then
  if [ -x "$DEST/bin/java" ]; then
    "$DEST/bin/java" -version 2>&1 | head -1
    echo "JAVA_HOME=$DEST"
  else
    echo "no JDK at $DEST"
    exit 1
  fi
  exit 0
fi

if [ -x "$DEST/bin/java" ]; then
  echo "already installed: $("$DEST/bin/java" -version 2>&1 | head -1)"
else
  url="https://api.adoptium.net/v3/binary/latest/21/ga/linux/$ARCH/jdk/hotspot/normal/eclipse"
  echo "== downloading Temurin 21 ($ARCH)"
  mkdir -p "$DEST"
  tmp="$(mktemp -d)"
  curl -fL --retry 2 --max-time 240 -o "$tmp/jdk.tar.gz" "$url"
  tar -xzf "$tmp/jdk.tar.gz" -C "$DEST" --strip-components=1
  rm -rf "$tmp"
  echo "== installed $("$DEST/bin/java" -version 2>&1 | head -1)"
fi

cat <<EOF

Activate it in this shell:

    export JAVA_HOME="$DEST"
    export PATH="\$JAVA_HOME/bin:\$PATH"

Neither this JDK nor any other process survives a workspace archive; rerun
this script after a restore.
EOF
