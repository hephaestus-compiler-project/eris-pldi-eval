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
plt.rcParams['pdf.fonttype'] = 42
plt.rcParams['ps.fonttype'] = 42

CATEGORY_CONFIG = {
    'impact': {
        'field': 'impact',
        'label': 'Impact',
        'filter': lambda bug: bug.get('mutator') != 'generator',
    },
    'rootcause': {
        'field': 'rootcause',
        'label': 'Root cause',
        'filter': lambda bug: True,
    },
}


def get_args():
    parser = argparse.ArgumentParser(
        description='Plot the distribution of a bug category.')
    parser.add_argument('--input', required=True, help='JSON file with bugs.')
    parser.add_argument('--output', required=True, help='Output PDF file.')
    parser.add_argument('--category', required=True,
                        choices=list(CATEGORY_CONFIG.keys()),
                        help='Category to plot.')
    return parser.parse_args()


def process(bugs, field, bug_filter):
    counts = defaultdict(lambda: 0)
    for bug in bugs:
        if not bug_filter(bug):
            continue
        chars = bug.get('chars', {})
        value = chars.get(field)
        if value is not None and value != '':
            counts[value] += 1
    return counts


def main():
    args = get_args()
    config = CATEGORY_CONFIG[args.category]

    with open(args.input, 'r') as f:
        data = json.load(f)

    counts = process(data, config['field'], config['filter'])
    label = config['label']

    total = sum(counts.values())
    print(f"{label} distribution (total: {total}):")
    for key, value in sorted(counts.items(), key=lambda x: -x[1]):
        print(f"  {key}: {value}")

    df = pd.DataFrame({label: list(counts.keys()), '#Bugs': list(counts.values())})
    ax = df.sort_values(by='#Bugs', ascending=True).plot.barh(
        width=0.5, x=label, color='gray', legend=False)
    ax.set_ylabel('')
    sorted_values = sorted(counts.values())
    for i, p in enumerate(ax.patches):
        ax.annotate('{} / {}'.format(int(sorted_values[i]), total),
                    (p.get_x() + p.get_width(), p.get_y()),
                    xytext=(5, 10), textcoords='offset points')

    plt.savefig(args.output, format='pdf', bbox_inches='tight', pad_inches=0)


if __name__ == '__main__':
    main()
