# Artifact for "Enumerating Ill-Typed Programs for Testing Type Analyzers (PLDI'26)"

This artifact accompanies the PLDI'26 paper
"Enumerating Ill-Typed Programs for Testing Type Analyzers".

An archived version of the artifact is also available on Zenodo.

# Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Setup](#setup)
- [Getting Started](#getting-started)
  * [Usage](#usage)
  * [Run Tests](#run-tests)
  * [Example: Testing the Groovy Compiler](#example-testing-the-groovy-compiler)
  * [Discovered Bugs](#discovered-bugs)
- [Step by Step Instructions](#step-by-step-instructions)
  * [RQ1: Bug-Finding Capability (Section 5.2)](#rq1-bug-finding-capability-section-52)
  * [RQ2: Bug Characteristics (Section 5.3)](#rq2-bug-characteristics-section-53)
  * [RQ3: Importance of Type Recovery and Isomorphic Type Shapes (Section 5.4)](#rq3-importance-of-type-recovery-and-isomorphic-type-shapes-section-54)
  * [RQ4: Comparison with the State of the Art (Section 5.5)](#rq4-comparison-with-the-state-of-the-art-section-55)
- [Running Eris](#running-eris)

# Overview

The artifact contains the instructions and scripts to re-run the evaluation
described in our paper. It has the following structure:

* `scripts/`: Scripts for re-running experiments and reproducing the figures
  and tables presented in our paper.
* `data/`: Pre-computed results of our evaluation.
  * `data/apis/`: API specifications from popular Java libraries.
  * `data/bugs.json`: The bugs found by `eris` during our evaluation.
  * `data/example-seeds/`: Example seed programs used by `eris`.
  * `data/runs/`: Output data from the evaluation runs.
    * `data/runs/bug-triggering-variants/`: Fuzzing data for the
      bug-triggering variants experiment (JCF and Groovy).
    * `data/runs/type-isomorphism/`: Fuzzing logs for the type isomorphism
      experiment.
* `eris/`: Source code of our tool (provided as a git submodule).
  The tool is named `eris`.
* `installation_scripts/`: Helper scripts for installing dependencies
  (e.g., compiler versions via [SDKMAN](https://sdkman.io/)).
* `figures/`: Output directory where reproduced figures are saved.
* `Dockerfile`: Used to build the Docker image of the artifact.
  The image bundles all data and dependencies.

`eris` is available as open-source software under the
GNU General Public License v3.0 at:
https://github.com/hephaestus-compiler-project/eris.

The `eris/` directory contains:

* `src/`: The source code of `eris`, written in Python.
* `tests/`: The test suite of `eris`.
* `example-apis/`: Example API specifications in JSON format (the input
  format of `eris`).
* `deployment/`: Configuration and scripts for running `eris` on a server.

# Requirements

See [REQUIREMENTS.md](./REQUIREMENTS.md).

# Setup

See [INSTALL.md](./INSTALL.md).


# Getting Started

To get started, we use the Docker image (`eris-eval`) built by following the
[Setup](#setup) guide. The image contains all required environments for
running the evaluation (i.e., installations of the relevant type analyzers
and all tools needed for processing results).

Start a new container with:

```bash
docker run -ti --rm eris-eval
```

## Usage

```
eris@e0456a9b520e:~$ eris --help
usage: eris.py [-h] [-g {base,api,api-decl,cfg}] [--api-doc-path API_DOC_PATH]
               [-s SECONDS] [-i ITERATIONS] [--api-rules API_RULES]
               [--max-conditional-depth MAX_CONDITIONAL_DEPTH] [--erase-types]
               [--inject-type-error] [--enable-expression-cache]
               [--path-search-strategy {shortest,ksimple}]
               [-t TRANSFORMATIONS] [--batch BATCH] [-b BUGS] [-n NAME]
               [-T [{TypeErasure} ...]]
               [--transformation-schedule TRANSFORMATION_SCHEDULE] [-R REPLAY]
               [-e] [-k] [-S] [-w WORKERS] [-d] [-r] [-F LOG_FILE] [-L] [-N]
               [--language {kotlin,groovy,java,scala}]
               [--max-type-params MAX_TYPE_PARAMS] [--max-depth MAX_DEPTH]
               [-P] [--timeout TIMEOUT] [--cast-numbers]
               [--disable-function-references] [--disable-use-site-variance]
               [--disable-contravariance-use-site]
               [--disable-bounded-type-parameters]
               [--disable-parameterized-functions] [--disable-sam]
               [--local-variable-prob LOCAL_VARIABLE_PROB]
               [--error-filter-patterns ERROR_FILTER_PATTERNS]
               [--error-enumerator {accessibility,type,flow-type,final-var}]
               [--max-cfg-nodes MAX_CFG_NODES]
               [--max-cfg-local-vars MAX_CFG_LOCAL_VARS]
               [--use-nullable-types] [--extra-compiler-option flag value]
               [--seeds SEEDS] [--ignore-locations-with-unknown-target-type]
               [--disable-location-cache] [--disable-enumeration]
               [--disable-type-isomorphism]

options:
  -h, --help            show this help message and exit
  -g {base,api,api-decl,cfg}, --generator {base,api,api-decl,cfg}
                        Type of generator
  --api-doc-path API_DOC_PATH
                        Path to API docs
  -s SECONDS, --seconds SECONDS
                        Timeout in seconds
  -i ITERATIONS, --iterations ITERATIONS
                        Iterations to run (default: 3)
  --api-rules API_RULES
                        File that contains the rules specifying the APIs used
                        for program enumeration (used only with API-based
                        program generation)
  --max-conditional-depth MAX_CONDITIONAL_DEPTH
                        Maximum depth of conditionals
  --erase-types         Erases types from the program while preserving its
                        semantics
  --inject-type-error   Injects a type error in the generated program
  --enable-expression-cache
                        Re-use expressions that yield certain types
  --path-search-strategy {shortest,ksimple}
                        Stategy for enumerating paths between two nodes
  -t TRANSFORMATIONS, --transformations TRANSFORMATIONS
                        Number of transformations in each round
  --batch BATCH         Number of programs to generate before invoking the
                        compiler
  -b BUGS, --bugs BUGS  Set bug directory (default:
                        /home/thodoris/postdoc/projects/eris-pldi-
                        eval/eris/bugs)
  -n NAME, --name NAME  Set name of this testing instance (default: random
                        string)
  -T [{TypeErasure} ...], --transformation-types [{TypeErasure} ...]
                        Select specific transformations to perform
  --transformation-schedule TRANSFORMATION_SCHEDULE
                        A file containing the schedule of transformations
  -R REPLAY, --replay REPLAY
                        Give a program to use instead of a randomly generated
                        (pickled)
  -e, --examine         Open ipdb for a program (can be used only with
                        --replay option)
  -k, --keep-all        Save all programs
  -S, --print-stacktrace
                        When an error occurs print stack trace
  -w WORKERS, --workers WORKERS
                        Number of workers for processing test programs
  -d, --debug
  -r, --rerun           Run only the last transformation. If failed, start
                        from the last and go back until the transformation
                        introduces the error
  -F LOG_FILE, --log-file LOG_FILE
                        Set log file (default:
                        /home/thodoris/postdoc/projects/eris-pldi-
                        eval/eris/logs)
  -L, --log             Keep logs for each transformation (bugs/session/logs)
  -N, --dry-run         Do not compile the programs
  --language {kotlin,groovy,java,scala}
                        Select specific language
  --max-type-params MAX_TYPE_PARAMS
                        Maximum number of type parameters to generate
  --max-depth MAX_DEPTH
                        Generate programs up to the given depth
  -P, --only-correctness-preserving-transformations
                        Use only correctness-preserving transformations
  --timeout TIMEOUT     Timeout for transformations (in seconds)
  --cast-numbers        Cast numeric constants to their actual type (this
                        option is used to avoid re-occrrence of a specific
                        Groovy bug)
  --disable-function-references
                        Disable function references
  --disable-use-site-variance
                        Disable use-site variance
  --disable-contravariance-use-site
                        Disable contravariance in use-site variance
  --disable-bounded-type-parameters
                        Disable bounded type parameters
  --disable-parameterized-functions
                        Disable parameterized functions
  --disable-sam         Disable SAM coercions
  --local-variable-prob LOCAL_VARIABLE_PROB
                        Probability of assigning an expression to a local
                        variable
  --error-filter-patterns ERROR_FILTER_PATTERNS
                        A file containing regular expressions for filtering
                        compiler error messages
  --error-enumerator {accessibility,type,flow-type,final-var}
                        Select a strategy for enumerating errors in a given
                        program
  --max-cfg-nodes MAX_CFG_NODES
                        Maximum nodes in CFG graph (only applicable when
                        --generator cfg)
  --max-cfg-local-vars MAX_CFG_LOCAL_VARS
                        Maximum local variables per CFG block (only applicable
                        when --generator cfg)
  --use-nullable-types  Use nullable types in the generated programs and
                        enumerators
  --extra-compiler-option flag value
                        Extra compiler options for invoking the compiler
  --seeds SEEDS         Directory of seeds
  --ignore-locations-with-unknown-target-type
                        Disegard locations whose expected type is uknown
                        (omitted)
  --disable-location-cache
                        Disable cache for locations. Every location is now
                        considered distinct.
  --disable-enumeration
                        It disables enumeration and outputs only statistics
  --disable-type-isomorphism
                        It disables type isomorphism and performs full error
                        enumeration
```

## Run Tests

To run the `eris` test suite:

```bash
# Enter the eris directory
eris@e0456a9b520e:~$ cd eris
# Run tests
eris@e0456a9b520e:~/eris$ python -m pytest
```

The output should look similar to:

```
tests/test_api_graph.py::test1 PASSED                                                   [  0%]
tests/test_api_graph.py::test2 PASSED                                                   [  0%]
...
tests/test_use_analysis.py::test_program6 PASSED                                        [ 99%]
tests/test_use_analysis.py::test_program7 PASSED                                        [ 99%]
tests/test_use_analysis.py::test_program8 PASSED                                        [100%]

===================================== 343 passed in 2.02s =====================================
```


## Example: Testing the Groovy Compiler

**NOTE:** At each run, `eris` generates random programs.
Therefore, you should expect different results at each run:
some randomly generated programs might trigger unfixed bugs
in type analyzers.

In this example, we use `eris` to generate 30 ill-typed variants from a set
of well-typed Groovy seed programs. Run the following command:

```bash
eris@e0456a9b520e:~$ eris --language groovy \
  --transformations 0  \
  --batch 1 -i 30 -P \
  --max-depth 2 \
  --generator api-decl \
  --seeds /home/eris/example-seeds/groovy-seeds \
  --api-doc-path /home/eris/eris/example-apis/java-stdlib/json-docs \
  --keep-all \
  --name groovy-session \
  --error-enumerator type -L
```

The expected output is similar to:

```
stop_cond             iterations (30)
transformations       0
transformation_types  TypeErasure
bugs                  /home/eris/bugs
name                  groovy-session
language              groovy
compiler              Groovy compiler version 5.0.4
Copyright 2003-2025 The Apache Software Foundation. https://groovy-lang.org/
==============================================================================================================================================================================
Test Programs Passed 30 / 30 ✔          Test Programs Failed 0 / 30 ✘
Total faults: 0
```

**Inputs**: The command instructs `eris` to generate 30 (`-i 30`) Groovy
programs (`--language groovy`) by injecting type errors
(`--error-enumerator type`) into a provided set of well-typed seed programs
(`--seeds /home/eris/example-seeds/groovy-seeds`).
The `--keep-all` flag makes `eris` store every generated program on disk.

**Outputs:** `eris` stores all output in `bugs/groovy-session/`
(specified by the `--name groovy-session` option).
This directory contains, among other things, two files:
`stats.json` and `faults.json`.

`stats.json` contains statistics about the testing session:

```json
{
  "Info": {
    "stop_cond": "iterations",
    "stop_cond_value": 30,
    "transformations": 0,
    "transformation_types": "TypeErasure",
    "bugs": "/home/eris/bugs",
    "name": "groovy-session",
    "language": "groovy",
    "generator": "api-decl",
    "extra_options": null,
    "erase_types": false,
    "inject_type_error": false,
    "compiler": "Groovy compiler version 5.0.4\nCopyright 2003-2025 The Apache Software Foundation. https://groovy-lang.org/"
  },
  "totals": {
    "passed": 30,
    "failed": 0
  },
  "synthesis_time": 4.444755919999998,
  "compilation_time": 50.841057538986206
}
```

### Logging

The `-L` flag enables logging of all type mismatches injected by `eris`.
The resulting log is saved at `bugs/groovy-session/logs/error-enumeration.logs`.
Its contents look like:

```
Enumerating error program 1 for skeleton 1

API namespace: iter_14
Added type error using TypeErrorEnumerator:
 - Expected type: Integer[]
 - Actual type: Integer[][]
 - Previous expression new Integer[]{-85, 49, 28}
 - New expression new Integer[0][0]
 - Receiver location: False

Enumerating error program 1 for skeleton 1

API namespace: iter_14
Added type error using TypeErrorEnumerator:
 - Expected type: Integer[]
 - Actual type: java.security.cert.X509CRL[]
 - Previous expression new Integer[]{-85, 49, 28}
 - New expression new java.security.cert.X509CRL[0]
 - Receiver location: False

Enumerating error program 3 for skeleton 3
...
```

By examining the log, we observe that `eris` generated two variants by
injecting two type errors into the well-typed seed program located at
`example-seeds/groovy-seeds/iter_1`.

Taking the diff between the seed program and the first ill-typed variant
and notice the corresponding line:

```diff
eris@d55f523ab2da:~$ diff --color \
  /home/eris/example-seeds/groovy-seeds/iter_1/Main.groovy \
  bugs/groovy-session/generator/iter_1/Main.groovy
27c27
<     Integer[] fracking = new Integer[]{-85, 49, 28};
---
>     Integer[] fracking = new Integer[0][0];
```

We can verify that the generated ill-typed variant is correctly rejected
by the `groovyc` type analyzer:

```
eris@d55f523ab2da:~$ groovyc --compile-static bugs/groovy-session/generator/iter_1/Main.groovy
org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
bugs/groovy-session/generator/iter_1/Main.groovy: 27: [Static type checking] - Cannot assign value of type java.lang.Integer[][] to variable of type java.lang.Integer[]
 @ line 27, column 26.
       Integer[] fracking = new Integer[0][0];
                            ^

1 error
```

The second variant contains the type mismatch
`Integer[]` vs. `java.security.cert.X509CRL[]`, which is also correctly
rejected by `groovyc`:

```diff
eris@d55f523ab2da:~$ diff --color \
  /home/eris/example-seeds/groovy-seeds/iter_1/Main.groovy \
  bugs/groovy-session/generator/iter_2/Main.groovy
27c27
<     Integer[] fracking = new Integer[]{-85, 49, 28};
---
>     Integer[] fracking = new java.security.cert.X509CRL[0];
```

If any variant is not rejected by the type checker, `eris` records it in
`faults.json`, with a format like:

```json
{
   "2": {
     "transformations": [],
     "error": "SHOULD NOT BE COMPILED: Added type error using TypeErrorEnumerator:\n - Expected type: Integer[]\n -   Actual type: java.security.cert.X509CRL[0]\n - Previous expression: new Integer[]{-85, 49, 28}\n - New expression   new java.security.cert.X509CRL[0];\n - Receiver location: True\n",
     "programs": {
       "/tmp/tmpqfzn6sc8/src/dunedin/Main.groovy": false
     },
     "time": 0.44059573399999996
   },
  ...
}
```



## Discovered Bugs

We provide a JSON file (`data/bugs.json` in the root directory of the artifact)
that contains detailed information
about the bugs identified by `eris` during our testing efforts.
Each entry corresponds to a distinct bug and includes the following fields:

```json
{
  "date": "2025-10-27 13:54:53+00:00",
  "language": "Java",
  "compiler": "jcf",
  "version": "",
  "bugid": "7341",
  "title": "false negative when indexing an array that is followed by instanceof ",
  "links": {
    "issuetracker": "https://github.com/typetools/checker-framework/issues/7341",
    "fix": ""
  },
  "oracle": "",
  "mutator": "nullability",
  "severity": "",
  "reporter": "theosotr",
  "status": "Closed",
  "resolution": "Fixed",
  "resolutiondate": "None",
  "symptom": "Unexpected Runtime Behavior",
  "bugtype": "",
  "resolvedin": "None",
  "test": [
    "import java.util.*;",
    "import org.checkerframework.checker.nullness.qual.*;",
    "public class Test {",
    "  static public void main(String[] args) {",
    "      List<List<? extends Number>> lists = new ArrayList<>();",
    "      List<? super List<? extends Number>> y = lists;",
    "      // This assignment is not null-safe",
    "      List<? super @Nullable List<? extends Number>> x = y;",
    "      x.add(null);",
    "      lists.get(0).toString();",
    "  }",
    "}"
  ],
  "chars": {
    "characteristics": [
      "Array",
      "Boxing/Unboxing"
    ],
    "impact": "Null pointer dereference",
    "rootcause": "Type checking of AST nodes",
    "fix": "check omission",
    "detectable": [
      "eris",
      "hephaestus"
    ]
  },
  "errormsg": [
    "Exception in thread \"main\" java.lang.NullPointerException: Cannot invoke \"Object.toString()\" because the return value of \"java.util.List.get(int)\" is null",
    "        at Test.main(Test.java:12)"
  ],
  "comment": ""
}
```

Congratulations, you have completed the Getting Started guide!
You can now proceed to the
[Step by Step Instructions](#step-by-step-instructions).

Exit the container by running:

```
eris@46e496bd70e7:~$ exit
```

# Step by Step Instructions

Before proceeding with the instructions of the artifact,
download the following data from Zenodo,
which contain 1098 Java seed programs used for
reproducing the results of the paper.

**Note***:
If you have fetched the artifact from Zenodo rather than GitHub,
this data is already in your system.
Therefore, you don't have to run the following commands.

```bash
wget -O "java-seeds.zip" ""
unzip java-seeds.zip -d data
```


Then start a new Docker container with the following volumes mounted
(run the command from the root directory of the artifact):

```bash
docker run -ti --rm \
  -v $(pwd)/data:/home/eris/data \
  -v $(pwd)/scripts:/home/eris/eval-scripts \
  -v $(pwd)/figures:/home/eris/eval-figures \
  eris-eval
```

This mounts four local directories inside the container:

| Host path      | Container path              | Purpose                                      |
|----------------|-----------------------------|----------------------------------------------|
| `data/`        | `/home/eris/data`           | Pre-computed evaluation data and bug database |
| `scripts/`     | `/home/eris/eval-scripts`   | Scripts to reproduce results                 |
| `figures/`     | `/home/eris/eval-figures`   | Output directory for reproduced figures      |

All commands in the sections below are run **inside** this container.

## RQ1: Bug-Finding Capability (Section 5.2)

To reproduce Table 2, run:

```
eris@afa4de3612b7:~$ python eval-scripts/process_bugs.py data/bugs.json
                                  Table 2a
============================================================================
Status                    groovyc   JCF       kotlinc   dotty     Total
----------------------------------------------------------------------------
Confirmed                 17        10        3         0         30
Fixed                     21        9         10        6         46
Wont fix                  1         0         2         1         4
Duplicate                 1         1         0         0         2
----------------------------------------------------------------------------
Total                     40        20        15        7         82

                                  Table 2b
============================================================================
Symptoms                  groovyc   JCF       kotlinc   dotty     Total
----------------------------------------------------------------------------
Soundness                 32        12        3         4         51
Crash                     6         8         12        3         29
Completeness              2         0         0         0         2

                                  Table 2c
============================================================================
Error type                groovyc   JCF       kotlinc   dotty     Total
----------------------------------------------------------------------------
No error                  6         7         4         1         18
Type error                24        1         10        2         37
Null pointer dereference  0         12        0         4         16
Access violation          9         0         0         0         9
Reassignment of var       1         0         1         0         2
```


## RQ2: Bug Characteristics (Section 5.3)

To reproduce Figure 10 (bug impact distribution), run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-category-distribution.py \
  --input data/bugs.json \
  --output eval-figures/impact.pdf \
  --category impact
Impact distribution (total: 64):
  Runtime type error: 20
  Null pointer dereference: 15
  Compiler crash (e.g., backend): 13
  Use of missing/illegal member: 9
  Other: 5
  Illegal bytecode: 2
```

The generated figure is saved at `figures/impact.pdf` on your host machine.

To reproduce Figure 11 (bug root cause distribution), run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-category-distribution.py \
  --input data/bugs.json \
  --output eval-figures/rootcauses.pdf \
  --category rootcause
Root cause distribution (total: 46):
  Type checking of AST nodes: 13
  Type inference/Type comparison: 12
  Control-flow analysis: 9
  SAM resolution/inference: 7
  Method resolution: 4
  Other: 1
```

The generated figure is saved at `figures/rootcauses.pdf` on your host machine.

## RQ3: Importance of Type Recovery and Isomorphic Type Shapes (Section 5.4)

### Bug-Triggering Variants

To reproduce Figure 13a (Groovy bug-triggering variants per seed), run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-bug-triggering-variants.py \
  data/runs/bug-triggering-variants/groovy/logs \
  data/runs/bug-triggering-variants/groovy/faults.json \
  --groovy \
  --output eval-figures/groovy-variants.pdf
Seeds: 16
Number of variants: 48836
Alerts: 242
Non bug-triggering seeds: 7
Bug-triggering rate (mean): 0.8025031880806186
Bug-triggering rate (median): 0.04634445490348649
Bug-triggering rate (min): 0.0
Bug-triggering rate (max): 8.727895037079293
```

To reproduce Figure 13b (JCF bug-triggering variants per seed), run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-bug-triggering-variants.py \
  data/runs/bug-triggering-variants/jcf/logs \
  data/runs/bug-triggering-variants/jcf/faults.json \
  --output eval-figures/jcf-variants.pdf
Seeds: 135
Number of variants: 19547
Alerts: 30
Non bug-triggering seeds: 119
Bug-triggering rate (mean): 0.1618056840068163
Bug-triggering rate (median): 0.0
Bug-triggering rate (min): 0.0
Bug-triggering rate (max): 3.0303030303030303
```

The generated figures are saved on your host machine at:
* `figures/groovy-variants.pdf` (Figure 13a)
* `figures/jcf-variants.pdf` (Figure 13b)

To reproduce Figure 13c (bug detection over time), run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-bug-evolution.py \
  data/runs/bug-triggering-variants/ eval-figures/evolution.pdf
```

The generated figure is saved at `figures/evolution.pdf` on your host machine.

### Importance of Type Recovery

To estimate the importance of type recovery
(Section 5.4, paragraph: "Importance of type recovery"),
we use 1,098 Java seed programs found at `/home/eris/data/java-seeds/` inside the
container (this is the data that you downloaded at the beginning of
the [Step by Step Instructions](#step-by-step-instructions) guide),
and run `eris` to count the locations where faults can be
safely injected (without enumerating the corresponding variants).
Counting these locations is done via two modes:
one with type recovery enabled, and one with it disabled (baseline).

Run the following command (estimated running time: 15--20 minutes):

```
eris@afa4de3612b7:~$ ./eval-scripts/type-recovery-impact.sh \
  /home/eris/data/java-seeds
Computing affected locations w/ type recovery (bear with us...)
Computing affected locations w/o type recovery (bear with us...)
Seeds:                                      1098
Total locations:                            158557
Examined locations (w/o type recovery):     119829
Examined locations (w/ type recovery):      86334
Change in examined locations:               -28.0%
```

### Importance of Type Shape Isomorphism

To estimate the impact of type shape isomorphism, we perform two experiments
(Section 5.4, paragraph: "Effectiveness of isomorphic type shapes").

**Experiment 1 (Type pool reduction rate):**
We estimate the reduction in type pool size achieved by type shape isomorphism
across the APIs of popular Java libraries.
Run (estimated running time: 5 minutes):

```
eris@afa4de3612b7:~$ ./eval-scripts/type-pool-reduction.sh /home/eris/data/apis/
Type pool reduction rate (mean):   84.4140
Type pool reduction rate (median): 84.0000
```

**Experiment 2 (Variant reduction rate):**
We enumerate ill-typed variants for 85 well-typed seed programs with and
without type shape isomorphism.
The pre-computed data for this experiment is available at
`data/runs/type-isomorphism/`.

```
eris@afa4de3612b7:~$ python eval-scripts/count-variants.py \
  /home/eris/data/runs/type-isomorphism/reduced.logs \
  /home/eris/data/runs/type-isomorphism/full.logs
Seeds:                                       85

Total variants (w/ type isomorphism):        714989
Total variants (w/o type isomorphism):       10263193

Median variants/seed (w/ type isomorphism):  5016.0
Median variants/seed (w/o type isomorphism): 65285.0

Variant ratio (full/type isomorphism):
  Mean:                          13.02x
  Median:                        12.63x
```

**(OPTIONAL) Re-running Experiment 2:**
Fully re-running this experiment takes 2--3 days.
To verify the setup with a smaller dataset, use the 5 seed programs located at
`data/example-seeds/java-seeds`:

```
eris@afa4de3612b7:~$ ./eval-scripts/type-isomorphism-impact.sh \
  /home/eris/data/example-seeds/java-seeds/
Computing affected locations w/ type isomorphism (bear with us...)
Computing affected locations w/o type isomorphism (bear with us...)
Seeds:                                       5

Total variants (w/ type isomorphism):        20413
Total variants (w/o type isomorphism):       154265

Median variants/seed (w/ type isomorphism):  2196.0
Median variants/seed (w/o type isomorphism): 16568.0

Variant ratio (full/type isomorphism):
  Mean:                          7.58x
  Median:                        7.54x
  Min:                           7.48x
  Max:                           7.81x
```

## RQ4: Comparison with the State of the Art (Section 5.5)

Figure 14 shows the overlap of bugs detected by `eris` and other existing
tools. To reproduce it, run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-venn.py \
  data/bugs.json --output eval-figures/venn.pdf
```

The generated figure is saved at `figures/venn.pdf` on your host machine.
Note that this figure is different from the one in the paper.
We will fix this issue in the revised paper.

Congratulations on completing the artifact evaluation! :-)

## Running Eris

This section describes how to run `eris` on scenarios beyond those covered
by the evaluation above.

### Generating Seed Programs

`eris` includes several generators for producing well-typed seed programs.
The following command uses the `api-decl` generator to synthesize 30 Groovy
programs that implement randomly selected Java standard library APIs:

```bash
eris@307c327ef73e:~$ eris --language groovy \
  --transformations 0 \
  --batch 1 -i 30 -P \
  --max-depth 2 \
  --generator api-decl \
  --api-doc-path /home/eris/eris/example-apis/java-stdlib/json-docs \
  --keep-all \
  --name groovy-seeds \
  --dry-run
```

The `--dry-run` flag skips compilation, so only the program files are written.
The generated programs are saved in `bugs/groovy-seeds/generator/`.

Alternatively, the `base` generator synthesizes programs entirely from
scratch without relying on any API:

```bash
eris@307c327ef73e:~$ eris --language groovy \
  --transformations 0 \
  --batch 1 -i 30 -P \
  --max-depth 6 \
  --generator base \
  --keep-all \
  --name groovy-seeds \
  --dry-run
```

### Injecting Different Types of Errors

`eris` supports four error injection strategies, selectable via
`--error-enumerator`:

| Strategy | Description |
|----------|-------------|
| `type` | Replaces an expression with one of an incompatible type |
| `accessibility` | Makes a method `private` or `protected` and calls it from outside its class |
| `flow-type` | Injects flow-sensitive type errors |
| `final-var` | Attempts to reassign an immutable variable |

The following command injects method accessibility errors into the seeds
generated above:

```bash
eris@307c327ef73e:~$ eris --language groovy \
  --transformations 0 \
  --batch 1 -i 30 -P \
  --max-depth 6 \
  --generator base \
  --seeds bugs/groovy-seeds/generator \
  --error-enumerator accessibility \
  --keep-all \
  --name groovy-variants -L
```

Each of the 30 generated variants makes a method `private` and then calls
it from outside its class; `groovyc` should reject all of them.

### Testing Type Analyzers with Eris

`eris` can test the soundness of four type analyzers:
`groovyc`, JCF (the Java Checker Framework), `kotlinc`, and `scalac`.

The example below tests JCF using the seed programs in
`data/example-seeds/jcf-seeds`.
The `--use-nullable-types` flag enables nullable type annotations and
automatically adds the required JCF import to each generated program.
The `--extra-compiler-option` flags pass JCF's annotation processor to
`javac` to invoke JCF on the generated variant.

```bash
eris@307c327ef73e:~$ eris --language java \
  -t 0 -i 30 -P --batch 1 \
  --generator api-decl \
  --api-doc-path /home/eris/eris/example-apis/java-stdlib/json-docs \
  --max-depth 2 \
  --name jcf-variants \
  --keep-all \
  --seeds data/example-seeds/jcf-seeds \
  --error-enumerator type -L \
  --use-nullable-types \
  --extra-compiler-option "\-processor" "org.checkerframework.checker.nullness.NullnessChecker" \
  --extra-compiler-option "\-cp" "/home/eris/checker-framework-3.42.0/checker/dist/checker.jar" \
  --extra-compiler-option "\-Aignorejdkastub" ""
```

The injected errors are logged at `bugs/jcf-variants/logs/error-enumeration.logs`:

```
Enumerating error program 1 for skeleton 1

API namespace: iter_1
Added type error using TypeErrorEnumerator:
 - Expected type: java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>
 - Actual type: java.util.concurrent.@Nullable Callable<java.time.temporal.TemporalAccessor>
 - Previous expression Main.<java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>>bottom()
 - New expression (java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>) null
 - Receiver location: True

Enumerating error program 2 for skeleton 1

API namespace: iter_1
Added type error using TypeErrorEnumerator:
 - Expected type: java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>
 - Actual type: java.util.concurrent.Callable<java.time.temporal.@Nullable TemporalAccessor>
 - Previous expression Main.<java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>>bottom()
 - New expression (Main.<java.util.function.DoubleFunction<java.util.concurrent.Callable<java.time.temporal.@Nullable TemporalAccessor>>>bottom()).apply((Main.<java.util.concurrent.Callable<Double>>bottom()).call())
 - Receiver location: True
...
```

The generated variants are saved at `bugs/jcf-variants/generator/`.
