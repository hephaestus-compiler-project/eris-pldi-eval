import argparse
import pickle
import os

import numpy as np


def analyze_log(file):
    data = {}
    if os.path.isfile(file + ".bin"):
        with open(file + ".bin", "rb") as f:
            return pickle.load(f)

    with open(file, 'r') as f:
        last_value = None
        for line in f:
            segs = line.split("Enumerating error program ")
            if len(segs) == 2:
                rest = segs[1]
                last_value = int(rest.split(" ", 1)[0])
                continue

            segs = line.split("API namespace: iter_")
            if len(segs) == 2:
                program = segs[1]
                assert last_value is not None
                data[program] = last_value
                last_value = None
    with open(file + ".bin", "wb") as f:
        pickle.dump(data, f)

    return data


def process_data(reduced_data, naive_data):
    common_keys = {k for k in naive_data if k in reduced_data}

    reduced = {k: reduced_data[k] for k in common_keys}
    naive = {k: naive_data[k] for k in common_keys}
    ratios = [naive[k] / reduced[k] for k in common_keys]

    print(f"Seeds:                                       {len(common_keys)}")
    print()
    print(f"Total variants (w/ type isomorphism):        {sum(reduced.values())}")
    print(f"Total variants (w/o type isomorphism):       {sum(naive.values())}")
    print()
    print(f"Median variants/seed (w/ type isomorphism):  {np.median(list(reduced.values())):.1f}")
    print(f"Median variants/seed (w/o type isomorphism): {np.median(list(naive.values())):.1f}")
    print()
    print(f"Variant ratio (full/type isomorphism):")
    print(f"  Mean:                          {np.mean(ratios):.2f}x")
    print(f"  Median:                        {np.median(ratios):.2f}x")
    print(f"  Min:                           {np.min(ratios):.2f}x")
    print(f"  Max:                           {np.max(ratios):.2f}x")


parser = argparse.ArgumentParser()
parser.add_argument("reduced", help="Log file with type pool reduction (e.g. eris-ee.logs).")
parser.add_argument("naive", help="Log file without type pool reduction (e.g. eris-full.logs).")
args = parser.parse_args()

reduced_data = analyze_log(args.reduced)
naive_data = analyze_log(args.naive)
process_data(reduced_data, naive_data)
