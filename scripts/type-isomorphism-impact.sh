#! /bin/bash

seeds=$1

if [ -z "$seeds" ]; then
  echo "Usage: $0 <seeds-dir>" >&2
  exit 1
fi

rm -rf bugs/with-type-isomorphism bugs/without-type-isomorphism

echo "Computing affected locations w/ type isomorphism (bear with us...)"
eris -i 100000000 -t 0 -P -L \
  --generator api-decl \
  --api-doc-path ${HOME}/eris/example-apis/java-stdlib/json-docs/ \
  --seeds "$seeds" \
  --language java \
  --error-enumerator type \
  --dry-run \
  --disable-location-cache \
  --max-depth 1 \
  --name with-type-isomorphism -d > /dev/null

echo "Computing affected locations w/o type isomorphism (bear with us...)"
eris -i 100000000 -t 0 -P -L \
  --generator api-decl \
  --api-doc-path ${HOME}/eris/example-apis/java-stdlib/json-docs/ \
  --seeds "$seeds" \
  --language java \
  --error-enumerator type \
  --dry-run \
  --disable-location-cache \
  --disable-type-isomorphism \
  --max-depth 1 \
  --name without-type-isomorphism -d > /dev/null

python eval-scripts/count-variants.py \
  bugs/with-type-isomorphism/logs/error-enumeration.logs \
  bugs/without-type-isomorphism/logs/error-enumeration.logs

rm -rf bugs/with-type-isomorphism bugs/without-type-isomorphism
