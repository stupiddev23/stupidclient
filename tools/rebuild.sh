#!/usr/bin/env bash
# Rebuild the Minecraft 1.21.11 port of mio from the two 1.21.5 jars.
# Requires: python3, curl, unzip.  No JVM needed.
set -euo pipefail
cd "$(dirname "$0")"

YARN5="1.21.5+build.1"
YARN11="1.21.11+build.6"
VM="https://launchermeta.mojang.com/mc/game/version_manifest_v2.json"

mkdir -p mappings mc/inter

fetch_yarn() {                     # $1 = version spec, $2 = output name
  [ -s "mappings/$2" ] && return 0
  echo "== downloading yarn $1"
  curl -fsSL -o "mappings/$2" \
    "https://maven.fabricmc.net/net/fabricmc/yarn/$1/yarn-$1-tiny.gz"
}
fetch_yarn "$YARN5"  yarn-1.21.5.tiny.gz
fetch_yarn "$YARN11" yarn-1.21.11.tiny.gz

if [ ! -s mc/client.jar ]; then
  echo "== downloading the 1.21.11 client jar"
  url=$(curl -fsSL "$VM" \
        | python3 -c 'import json,sys;d=json.load(sys.stdin);print([v["url"] for v in d["versions"] if v["id"]=="1.21.11"][0])')
  curl -fsSL "$url" | python3 -c 'import json,sys;print(json.load(sys.stdin)["downloads"]["client"]["url"])' > mc/clienturl.txt
  curl -fsSL -o mc/client.jar "$(cat mc/clienturl.txt)"
fi
if [ ! -s mc/inter/mappings/mappings.tiny ]; then
  echo "== downloading intermediary 1.21.11"
  curl -fsSL -o mc/intermediary-v2.jar \
    "https://maven.fabricmc.net/net/fabricmc/intermediary/1.21.11/intermediary-1.21.11-v2.jar"
  (cd mc/inter && unzip -oq ../intermediary-v2.jar)
fi

echo "== 1/4 mapping join";   python3 mkmap.py       | tail -4
echo "== 2/4 remap jars";     python3 remap.py       | tail -18
echo "== 3/4 verify";         python3 verify_hier.py | sed -n '1,6p'
echo "== 4/4 work list";      python3 missing_report.py | head -8; python3 mixin_work.py

echo
echo "outputs in port/out/:"
ls -la out/*.jar
