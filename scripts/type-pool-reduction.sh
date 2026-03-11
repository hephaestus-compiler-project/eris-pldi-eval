basedir=$(dirname "$0")
libpath=$1

run()
{
  local libpath=$1
  local libname=$(basename $libpath)

  if [[ ! -d "$libpath/json-docs" || -z $(find "$libpath/json-docs" -mindepth 1 -print -quit) ]]; then
    return 1
  fi

  rm -rf bugs/test-reduction
  base_args="--iterations 1 --batch 1 -P -L --transformations 0 \
    --max-depth 2 --generator api  --dry-run --name test-reduction \
    --api-doc-path $libpath/json-docs \
    --max-conditional-depth 2 --language java"
  echo "$base_args" | xargs ./thalia.py > /dev/null
  logfile=bugs/test-reduction/logs/api-generator

  types=$(grep "Number of types:" "$logfile" | head -1 | cut -d: -f2)
  reduced=$(grep "Reduced size of type pool:" "$logfile" | head -1 | cut -d: -f2)
  reduction=$(awk "BEGIN { printf \"%.1f\", (1 - $reduced / $types) * 100 }")
  echo "$reduction"

  rm -rf bugs/test-reduction
}

if [ -z $libpath ]; then
  echo "You need to specify the library path"
  exit 1
fi

for lib in $libpath/*; do
  run "$lib"
done | python -c "
import sys, statistics
data = [float(x) for x in sys.stdin]
print(f'Mean:   {statistics.mean(data):.4f}')
print(f'Median: {statistics.median(data):.4f}')
"
