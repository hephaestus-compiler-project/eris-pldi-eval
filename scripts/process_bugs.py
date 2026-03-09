import argparse
import json
from collections import defaultdict


lang_lookup = {
    'groovyc': 'groovyc',
    'JCF': 'JCF',
    'kotlinc': 'kotlinc',
    'dotty': 'dotty',
    'total': 'Total'
}

rows_lookup = {
    'Unexpected Runtime Behavior': 'Soundness',
    'crash': 'Crash',
    'Unexpected Compile-Time Error': 'Completeness',
    'generator': 'No error',
    'type': 'Type error',
    'nullability': 'Null pointer dereference',
    'accessibility': 'Access violation',
    'immutability': 'Reassignment of var',
}


def get_args():
    parser = argparse.ArgumentParser(
        description='Process unsound-bugs.json to answer RQs')
    parser.add_argument("input", help="JSON File with bugs.")
    return parser.parse_args()


def process(bug, res):
    status_map = {
        'Kotlin': {
            'Submitted': 'Confirmed',
            'Open': 'Confirmed',
            'Closed': None
        },
        'Groovy': {
            'Open': 'Confirmed',
            'Closed': None
        },
        'Scala': {
            'Open': 'Confirmed',
            'Closed': None
        },
        'Java': {
            'Open': 'Confirmed',
            'Closed': None
        }
    }
    resolution_map = {
        'Kotlin': {
            'Fixed': 'Fixed',
            'As Designed': 'Wont fix',
            'Duplicate': 'Duplicate'
        },
        'Groovy': {
            'Fixed': 'Fixed',
            'Duplicate': 'Duplicate',
            'Information Provided': 'Wont fix',
        },
        'Scala': {
            'Fixed': 'Fixed',
            'Not an Issue': 'Wont fix',
            'Duplicate': 'Duplicate',
        },
        'Java': {
            'Fixed': 'Fixed',
            'Duplicate': 'Duplicate',
        }
    }
    lang = bug['language']
    compiler = 'JCF' if bug['compiler'].lower() == 'jcf' else bug['compiler']
    bstatus = bug['status']
    bresolution = bug['resolution']
    bsymptom = bug['symptom']
    bmutator = bug['mutator']
    status = status_map[lang].get(bstatus, None)
    if status is None:
        status = resolution_map[lang].get(bresolution, None)
    res[compiler]['status'][status] += 1
    res[compiler]['symptom'][bsymptom] += 1
    res[compiler]['mutator'][bmutator] += 1
    res['total']['status'][status] += 1
    res['total']['symptom'][bsymptom] += 1
    res['total']['mutator'][bmutator] += 1


def print_table(title, column_name, res, extra_line=True, first_col=26):
    # res should be a dict of dict in the following format:
    # {"row name": {"column name": value, ...}, ...}
    def print_line(title, columns, values):
        row_format = f"{{:<{first_col}}}" + "{:<10}" * len(columns)
        print(row_format.format(
            title,
            *(values[column] for column in columns)
        ))
    if len(res.values()) == 0:
        return
    header = [column_name] + list(list(res.values())[0].keys())
    row_format = f"{{:<{first_col}}}" + "{:<10}" * (len(header) - 1)
    length = first_col + 10 * (len(header) - 1)
    print(title.center(length))
    print(length * "=")
    pretty_header = [lang_lookup.get(h, h) for h in header]
    print(row_format.format(*pretty_header))
    print(length * "-")
    for counter, item in enumerate(res.items()):
        row_name, values = item
        if extra_line and counter == len(res)-1:
            print(length * "-")
        print_line(rows_lookup.get(row_name, row_name), header[1:], values)
    print()


def main():
    args = get_args()
    with open(args.input, 'r') as f:
        data = json.load(f)
    compilers = ['groovyc', 'JCF', 'kotlinc', 'dotty']
    res = defaultdict(lambda: {
        'status': {
            'Confirmed': 0,
            'Fixed': 0,
            'Wont fix': 0,
            'Duplicate': 0
        },
        'symptom': {
            'Unexpected Runtime Behavior': 0,
            'crash': 0,
            'Unexpected Compile-Time Error': 0,
        },
        'mutator': {
            'generator': 0,
            'type': 0,
            'nullability': 0,
            'accessibility': 0,
            'immutability': 0,
        }
    })
    for bug in data:
        process(bug, res)

    def per_attribute(attrs, attr, total=True):
        r = {
            s: {compiler: res[compiler][attr][s]
                for compiler in compilers + ['total']}
            for s in attrs
        }
        if total:
            r['Total'] = {compiler: sum(res[compiler][attr][s] for s in attrs)
                          for compiler in compilers + ['total']}
        return r

    status_cat = res['total']['status'].keys()
    status = per_attribute(status_cat, 'status', total=True)
    print_table('Table 2a', 'Status', status)

    symptoms_cat = res['total']['symptom'].keys()
    symptoms = per_attribute(symptoms_cat, 'symptom', total=False)
    print_table('Table 2b', 'Symptoms', symptoms, extra_line=False)

    mutator_cat = res['total']['mutator'].keys()
    mutators = per_attribute(mutator_cat, 'mutator', total=False)
    print_table('Table 2c', 'Error type', mutators, extra_line=False)


if __name__ == "__main__":
    main()
