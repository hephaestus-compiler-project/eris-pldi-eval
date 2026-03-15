#! /bin/bash

seeds=$1

if [ -z "$seeds" ]; then
  echo "Usage: $0 <seeds-dir>" >&2
  exit 1
fi

rm -rf bugs/with-type-recovery bugs/without-type-recovery

echo "Computing affected locations w/ type recovery (bear with us...)"
eris -i 10000 -t 0 -P -L \
  --generator api-decl \
  --api-doc-path ${HOME}/eris/example-apis/java-stdlib/json-docs/ \
  --seeds "$seeds" \
  --language java \
  --error-enumerator type \
  --disable-enumeration \
  --dry-run \
  --disable-location-cache \
  --name with-type-recovery -d > /dev/null

echo "Computing affected locations w/o type recovery (bear with us...)"
eris -i 10000 -t 0 -P -L \
  --generator api-decl \
  --api-doc-path ${HOME}/eris/example-apis/java-stdlib/json-docs/ \
  --seeds "$seeds" \
  --language java \
  --error-enumerator type \
  --disable-enumeration \
  --dry-run \
  --disable-location-cache \
  --ignore-locations-with-unknown-target-type \
  --name without-type-recovery -d > /dev/null

python eval-scripts/compute-type-recovery-impact.py \
  bugs/with-type-recovery/logs/error-enumeration.logs \
  bugs/without-type-recovery/logs/error-enumeration.logs

#rm -rf bugs/with-type-recovery bugs/without-type-recovery
