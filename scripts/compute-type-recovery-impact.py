import argparse
import re

parser = argparse.ArgumentParser(
    description=("Compare examined locations between two"
                 "api-generator log files."))
parser.add_argument("baseline",
                    help=("Log file where locations with unknown expected"
                          " type are ignored."))
parser.add_argument("extended",
                    help=("Log file where locations with "
                          "unknown expected type are included."))
args = parser.parse_args()

pattern = re.compile(r"^Metadata for skeleton \d+: locations: (\d+) examined locations: (\d+)")


def parse_log(path):
    skeletons, total_locations, total_examined = 0, 0, 0
    with open(path) as f:
        for line in f:
            m = pattern.match(line)
            if m:
                total_locations += int(m.group(1))
                total_examined += int(m.group(2))
                skeletons += 1
    return skeletons, total_locations, total_examined


skeletons_b, locations_b, examined_b = parse_log(args.baseline)
skeletons_e, locations_e, examined_e = parse_log(args.extended)

assert skeletons_b == skeletons_e, f"Skeleton count mismatch: {skeletons_b} vs {skeletons_e}"
assert locations_b == locations_e, f"Total locations mismatch: {locations_b} vs {locations_e}"

pct_change = (examined_e - examined_b) / examined_b * 100

print(f"Seeds:                                 {skeletons_b}")
print(f"Total locations:                       {locations_b}")
print(f"Examined locations (baseline):         {examined_b}")
print(f"Examined locations (extended):         {examined_e}")
print(f"Change in examined locations:          {pct_change:+.1f}%")
