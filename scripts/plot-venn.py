import json
import sys

import seaborn as sns
from matplotlib import pylab as plt
from matplotlib_venn import venn3

with open(sys.argv[1]) as f:
    bug_set = json.load(f)

bugs = {
    "hephaestus": set(),
    "thalia": set(),
    "eris": set()
}

for bug in bug_set:
    detectable_lst = bug["chars"]["detectable"]
    detectable_lst = ["eris" if x == "error enumeration" else x
                      for x in detectable_lst]
    if bug["mutator"] == "generator":
        continue
    if "hephaestus" in detectable_lst:
        bugs["hephaestus"].add(bug["bugid"])
    if "thalia" in detectable_lst:
        bugs["thalia"].add(bug["bugid"])

    if "eris" in detectable_lst:
        bugs["eris"].add(bug["bugid"])


plt.style.use('ggplot')
sns.set(style="whitegrid")
plt.rcParams['font.family'] = 'Ubuntu'
plt.rcParams['font.serif'] = 'Ubuntu'
plt.rcParams['font.size'] = 22
plt.rcParams['font.monospace'] = 'Inconsolata Medium'
plt.rcParams['figure.figsize'] = (6, 5)
plt.rcParams['axes.labelsize'] = 22

print(bugs)
venn3([
   bugs["hephaestus"],
   bugs["thalia"],
   bugs["eris"]
       ],
      ("Hephaestus", "Thalia",
       "Eris"))
plt.savefig('venn.pdf', format='pdf', bbox_inches='tight',
            pad_inches=0)
