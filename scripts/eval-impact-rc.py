import argparse
import json
from collections import defaultdict

from matplotlib import pylab as plt
import pandas as pd
import seaborn as sns


plt.style.use('ggplot')
sns.set(style="whitegrid")
plt.rcParams['font.family'] = 'Ubuntu'
plt.rcParams['font.serif'] = 'Ubuntu'
plt.rcParams['font.size'] = 22
plt.rcParams['font.monospace'] = 'Inconsolata Medium'
plt.rcParams['figure.figsize'] = (7, 5)
plt.rcParams['ytick.labelsize'] = 22
plt.rcParams['xtick.labelsize'] = 22


def get_args():
    parser = argparse.ArgumentParser(
        description='Compute statistics for the bugs.')
    parser.add_argument("input", help="File with bugs.")
    parser.add_argument("--latex", action='store_true',
                        help='Print latex commands')
    return parser.parse_args()


def process(bugs):
    root_causes = defaultdict(lambda: 0)
    impacts = defaultdict(lambda: 0)
    for bug in bugs:
        chars = bug['chars']
        root_cause = chars.get("rootcause")
        if root_cause is not None:
            root_causes[root_cause] += 1
        mutator = bug["mutator"]
        if mutator != "generator":
            impact = chars["impact"]
            impacts[impact] += 1
    return root_causes, impacts


def create_dataframe(data, label):
    keys = []
    values = []
    for key, value in data.items():
        keys.append(key)
        values.append(value)
    return pd.DataFrame({label: keys, "#Bugs": values})


def main():
    args = get_args()
    with open(args.input, 'r') as f:
        data = json.load(f)
    root_causes, impacts = process(data)
    df_rootcauses = create_dataframe(root_causes, "Root cause")
    df_impacts = create_dataframe(impacts, "Impact")
    ax = df_rootcauses.sort_values(by="#Bugs", ascending=True).plot.barh(
        width=0.5, x="Root cause", color="gray", legend=False)
    ax.set_ylabel("")
    values = sorted(list(root_causes.values()))
    count = sum(root_causes.values())
    for i, p in enumerate(ax.patches):
        ax.annotate("{} / {}".format(int(values[i]), count),
                    (p.get_x() + p.get_width(), p.get_y()),
                    xytext=(5, 10), textcoords='offset points')
    plt.savefig("root-causes.pdf", format='pdf', bbox_inches='tight',
                pad_inches=0)

    plt.figure()
    ax = df_impacts.sort_values(by="#Bugs", ascending=True).plot.barh(
        width=0.5, x="Impact", color="gray", legend=False)
    ax.set_ylabel("")
    ax.set_xticks([0, 5, 10, 15, 20])
    values = sorted(list(impacts.values()))
    count = sum(impacts.values())
    for i, p in enumerate(ax.patches):
        print("here")
        ax.annotate("{} / {}".format(int(values[i]), count),
                    (p.get_x() + p.get_width(), p.get_y()),
                    xytext=(5, 10), textcoords='offset points')
    plt.savefig("impact.pdf", format='pdf', bbox_inches='tight',
                pad_inches=0)
    print(root_causes, impacts)


if __name__ == "__main__":
    main()
