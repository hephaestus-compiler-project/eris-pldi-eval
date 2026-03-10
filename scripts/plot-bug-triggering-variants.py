from collections import OrderedDict, defaultdict
import argparse
import json

import pandas as pd
import seaborn as sns
import matplotlib.pylab as plt

parser = argparse.ArgumentParser()
parser.add_argument("filename")
parser.add_argument("fault_file")
parser.add_argument("--groovy", action="store_true")
args = parser.parse_args()

plt.style.use('default')
sns.set(style="whitegrid")
plt.rcParams['font.family'] = 'Ubuntu'
plt.rcParams['font.serif'] = 'Ubuntu'
plt.rcParams['font.monospace'] = 'Inconsolata Medium'
plt.rcParams['font.size'] = 19
plt.rcParams['axes.labelsize'] = 26
plt.rcParams['axes.titlesize'] = 14
plt.rcParams['xtick.labelsize'] = 24 if args.groovy else 22
plt.rcParams['ytick.labelsize'] = 24 if args.groovy else 22
plt.rcParams['legend.fontsize'] = 20
plt.rcParams['figure.titlesize'] = 24
plt.rcParams['figure.figsize'] = (9, 5)
plt.rcParams['pdf.fonttype'] = 42

injections = OrderedDict()
with open(args.filename) as f:
    count = None
    for line in f:
        segs = line.split("Enumerating error program ", 1)
        if len(segs) == 2:
            count = int(segs[1].split(" ", 1)[0])
            continue

        segs = line.split("API namespace: ", 1)
        if len(segs) == 2:
            seed = segs[1]
            assert count is not None
            injections[seed.replace("\n", "")] = count
            count = None

ranges = {}
start = 0
for seed, info in injections.items():
    ranges[seed] = (start + 1, start + info)
    start = start + info

with open(args.fault_file) as f:
    faults = json.load(f)

errors = defaultdict(lambda: (0, 0))

for faultid, info in faults.items():
    bug_seed = None
    for seed, seed_range in ranges.items():
        if int(faultid) >= seed_range[0] and int(faultid) <= seed_range[1]:
            bug_seed = seed
    assert bug_seed is not None
    errors[bug_seed] = (errors[bug_seed][0] + 1, injections[bug_seed])

not_errors = [seed for seed, values in ranges.items() if seed not in errors]
for seed in not_errors:
    count = ranges[seed][1] - ranges[seed][0]
    errors[seed] = (0, count)

programs = sum([x[1] for x in errors.values()])
print(programs)
print("Seeds", len(errors))
print("Alerts", sum(x[0] for x in errors.values()))
print("Non seeds", sum(1 for v in errors.values() if not v[0]))

framedata = []
rate = []
for seed, values in errors.items():
    if values[0]:
        framedata.append({
            "Seed": seed,
            "Bug-triggering variants": values[0],
            "Non-bug-triggering variants": values[1] - values[0]
        })
        rate.append((values[0] / values[1]) * 100)
    else:
        rate.append(0)

print(sorted(rate))
import numpy as np
print(np.median(rate))

framedata = sorted(framedata, key=lambda x: x["Non-bug-triggering variants"])

df = pd.DataFrame(framedata)

fig, ax = plt.subplots(figsize=(9, 5))

df.plot.bar(ax=ax, width=0.8, stacked=True, color=["coral", "dimgray"])

if args.groovy:
    ax.set_yscale('symlog', linthresh=100)
    linear_ticks = range(0, 101, 20)
    log_ticks = [200, 500, 1000, 5000, 15000]
else:
    ax.set_yscale('symlog', linthresh=10)
    linear_ticks = range(0, 11, 2)
    log_ticks = [100, 200, 500, 1000, 2000]

all_ticks = list(linear_ticks) + log_ticks
ax.set_yticks(all_ticks)
ax.set_yticklabels([str(tick) for tick in linear_ticks] + [f"{tick}" for tick in log_ticks])

ax.set_xticks([])
plt.xlabel("Seeds")
plt.ylabel("Number of variants")
plt.tight_layout()
plt.savefig('bug-rate.pdf', bbox_inches='tight', pad_inches=0)
