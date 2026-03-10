import argparse
import pickle
import os

import matplotlib.pyplot as plt

import numpy as np

import seaborn as sns

plt.style.use('default')
sns.set(style="whitegrid")
plt.rcParams['font.monospace'] = 'Inconsolata Medium'
plt.rcParams['font.size'] = 19
plt.rcParams['axes.labelsize'] = 26
plt.rcParams['axes.titlesize'] = 14
plt.rcParams['xtick.labelsize'] = 24
plt.rcParams['ytick.labelsize'] = 24
plt.rcParams['legend.fontsize'] = 24
plt.rcParams['figure.titlesize'] = 24
plt.rcParams['figure.figsize'] = (9, 5)
plt.rcParams['pdf.fonttype'] = 42


def get_args():
    parser = argparse.ArgumentParser(
        description='Study the evolution of bug detection')
    parser.add_argument("data", help="Directory with pickled data.")
    parser.add_argument("output", help="Path of the output figure.")
    parser.add_argument("--avoid-log-scale",
                        default=False,
                        action="store_true",
                        help="Avoid using log scale in the y axis.")
    return parser.parse_args()


def load_data(data_dir):
    compilers = ["groovy", "jcf"]
    data = {}
    for compiler in compilers:
        file_path = os.path.join(data_dir, f"{compiler}", f"{compiler}.pkl")
        if not os.path.exists(file_path):
            continue
        with open(file_path, "rb") as f:
            data[compiler] = sorted(pickle.load(f).values())
    return data


def plot_evolution_diagram(data, output_dir, log_scale):
    plot_data = {}
    map_compilers = {
        "groovy": "groovyc",
        "jcf": "JCF",
    }
    for compiler, times in data.items():
        compiler = map_compilers.get(compiler)

        if compiler not in plot_data:

            plot_data[compiler] = []
        plot_data[compiler].extend(times)

    all_times = []
    for times in plot_data.values():
        all_times.extend(times)

    all_times = sorted(all_times)

    standardized_data = {}

    for key, times in plot_data.items():
        times = np.array(times)  # Convert to numpy array for easy processing
        times.sort()
        cumulative_counts = np.arange(1, len(times) + 1)

        interpolated_counts = []
        current_count = 0
        index = 0

        for t in all_times:
            if index < len(times) and times[index] == t:
                current_count = cumulative_counts[index]
                index += 1
            interpolated_counts.append(current_count)

        standardized_data[key] = (all_times, interpolated_counts)

    fig, ax = plt.subplots(figsize=(10, 6))

    color_palette = sns.color_palette("colorblind")

    for i, (key, (times, counts)) in enumerate(standardized_data.items()):
        times = np.array(times) / 3600
        color = color_palette[i % len(color_palette)]
        ax.plot(times, counts, label=key, linestyle='-', linewidth=3,
                color=color)

    if log_scale:
        ax.set_yscale("log")

    ax.set_xlabel("Time (hours)")
    ax.set_ylabel("Cumulative bug count")
    ax.legend()

    plt.tight_layout()
    plt.savefig(output_dir, bbox_inches='tight', pad_inches=0)


def main():
    args = get_args()
    data = load_data(args.data)
    plot_evolution_diagram(data, args.output,
                           log_scale=not args.avoid_log_scale)


if __name__ == "__main__":
    main()
