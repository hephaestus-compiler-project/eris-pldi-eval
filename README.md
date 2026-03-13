# Artifact for "Enumerating Ill-Typed Programs for Testing Type Analyzers (PLDI'26)"

This artifact accompanies the PLDI'26 paper
"Enumerating Ill-Typed Programs for Testing Type Analyzers".

An archived version of the artifact is also available on Zenodo (see XXX).

# Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Setup](#setup)
- [Getting Started](#getting-started)
  * [Usage](#usage)
  * [Run Tests](#run-tests)
  * [Example: Testing the Groovy Compiler](#example-testing-the-groovy-compiler)
  * [Example: Testing the Java Checker Framework](#example-testing-the-java-checker-framework)
- [Step by Step Instructions](#step-by-step-instructions)
  * [Reproducing the Figures](#reproducing-the-figures)
  * [Reproducing the Statistics](#reproducing-the-statistics)

# Overview

The artifact contains the instructions and scripts to re-run the evaluation
described in our paper. It has the following structure:

* `scripts/`: Scripts for re-running experiments and reproducing the figures
  and tables presented in our paper.
* `data/`: Pre-computed results of our evaluation.
  * `data/apis/`: API specifications from popular Java libraries.
  * `data/bugs.json`: The bugs found by `eris` during our evaluation.
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
               [--error-enumerator {type,flow-type}]
               [--max-cfg-nodes MAX_CFG_NODES] [--use-nullable-types]
               [--extra-compiler-option flag value] [--seeds SEEDS]
               [--ignore-locations-with-unknown-target-type]
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
                        /home/eris/bugs)
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
                        Set log file (default: /home/eris/logs)
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
                        option is used to avoid re-occurrence of a specific
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
  --error-enumerator {type,flow-type}
                        Select a strategy for enumerating errors in a given
                        program
  --max-cfg-nodes MAX_CFG_NODES
                        Maximum nodes in CFG graph (only applicable when
                        --generator cfg)
  --use-nullable-types  Use nullable types in the generated programs and
                        enumerators
  --extra-compiler-option flag value
                        Extra compiler options for invoking the compiler
  --seeds SEEDS         Directory of seeds
  --ignore-locations-with-unknown-target-type
                        Disregard locations whose expected type is unknown
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

===================================== 266 passed in 2.02s =====================================
```


## Example: Testing the Groovy Compiler

**NOTE:** At each run, `eris` generates random programs.
Therefore, you should expect different results at each run:
some randomly generated programs might trigger unfixed bugs
in type analyzers.

In this example, we use `eris` to generate 30 ill-typed variants from a set
of well-typed Groovy seed programs. Run the following command:

```bash
eris@e0456a9b520e:~/eris$ eris --language groovy \
  --transformations 0  \
  --batch 1 -i 30 -P \
  --max-depth 2 \
  --generator api-decl \
  --seeds /home/eris/example-seeds/groovy-seeds \
  --api-doc-path /home/eris/eris/example-apis/java-stdlib/json-docs \
  --keep-all \
  --name groovy-session \
  --error-enumerator type
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
The resulting log is saved at `bugs/groovy-session/logs/api-generator`.
Its contents look like:

```
Built API with the following statistics:
        Number of nodes:13181
        Number of edges:19722
        Number of methods:9664
        Number of polymorphic methods:425
        Number of fields:1068
        Number of constructors:1144
        Number of types:1115
        Reduced size of type pool:146
        Number of type constructors:146
        Avg inheritance chain size:4.18
        Avg API signature size:2.43

Metadata for skeleton 1: locations: 2 examined locations: 2
No error added to skeleton 1
Metadata for skeleton 2: locations: 0 examined locations: 0
No error added to skeleton 2
Enumerating error program 1 for skeleton 3

API namespace: iter_14
Added type error using TypeErrorEnumerator:
 - Expected type: Integer[]
 - Actual type: Integer[][]
 - Previous expression new Integer[]{-85, 49, 28}
 - New expression new Integer[0][0]
 - Receiver location: False

Enumerating error program 2 for skeleton 3

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

For example,
by examining the above log file, we observe that `eris` generated
two variants by injecting two type errors into the well-typed
seed program located at `example-seeds/groovy-seeds/iter_14`.

Taking the diff between the seed program and the first ill-typed variant:

```diff
eris@d55f523ab2da:~$ diff --color example-seeds/groovy-seeds/iter_14/Main.groovy bugs/groovy-session/generator/iter_1/Main.groovy
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
eris@d55f523ab2da:~$ diff --color example-seeds/groovy-seeds/iter_14/Main.groovy bugs/groovy-session/generator/iter_2/Main.groovy
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


See [Testing Other Type Analyzers with Eris](#testing-other-type-analyzers-with-eris)
for examples of running `eris` on the Java Checker Framework (JCF)
and other type analyzers.


## Discovered bugs

We provide a JSON file (`data/bugs.json` in the root directory of the artifact)
that contains detailed information about
the bugs identified by `eris` during our testing efforts.
Each entry in the file corresponds to a distinct bug
and includes the following fields:

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

# Step by Step Instructions

**NOTE**: Run all `docker run` commands
from the root directory of the
artifact (i.e., `eris-pldi-eval/`).

To validate the main results presented in the paper,
first create a new Docker
container by running:

```
docker run -ti --rm \
  -v $(pwd)/data:/home/eris/data \
  -v $(pwd)/scripts:/home/eris/eval-scripts \
  -v $(pwd)/figures:/home/eris/eval-figures \
  -v $(pwd)/new-results:/home/eris/new-results \
  eris-eval
```

Note that we mount four _local volumes_ inside the newly created container.
The first volume (`data/`) contains the data collected during our evaluation,
including the bugs discovered by `eris`.
The second volume (`eval-scripts/`) includes
all necessary scripts to reproduce
and validate the results of the paper.
The third volume (`eval-figures/`) is used to save the figures of our paper.
Finally,
the last volume (`new-results/`) mounts an empty directory where
you can store the results if you decide to re-run our experiments.

## RQ1: Bug-Finding Capability (Section 5.2)

For the first research question,
we examine the `database/bugs.json` file
to reproduce the entire Table 2.

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

For the second research question,
we examine `data/bugs.json` to compute the distribution of
bugs' root causes and impact by reproducing Figures 10 and 11.
To reproduce Figure 10,
run:

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

The generated figure is available at `figures/impact.pdf` in your host machine.

Now,
to reproduce Figure 11,
run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-category-distribution.py --input data/bugs.json --output eval-figures/rootcauses.pdf --category rootcause
Root cause distribution (total: 46):
  Type checking of AST nodes: 13
  Type inference/Type comparison: 12
  Control-flow analysis: 9
  SAM resolution/inference: 7
  Method resolution: 4
  Other: 1
```

The above command reproduces Figure 11,
which can be found at `data/rootcauses.pdf` in your host machine.

## RQ3: Importance of Type Recovery and Isomorphic Type Shapes (Section 5.4)

### Bug-Triggering Variants

To reproduce Figures 13a and 13b that capture
the bug-triggering variants per seed,
run the following two commands.

Command 1 (Figure 13a):

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

Command 2 (Figure 13b): 

```
eris@afa4de3612b7:~$ python eval-scripts/plot-bug-triggering-variants.py \
  data/runs/bug-triggering-variants/jcf/logs \
  data/runs/bug-triggering-variants/jcf/faults.json  \
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

In your host machine,
the generated figures can be found at:
 * `figures/groovy-variants.pdf` (Figure 13a)
 * `figures/jcf-variants.pdf` (Figure 13b)

To reproduce Figure 13c,
run:

```
eris@afa4de3612b7:~$ python eval-scripts/plot-bug-evolution.py \
  data/runs/bug-triggering-variants/ eval-figures/evolution.pdf
```

The generated figure can be found at `figures/evolution.pdf`.

### Importance of Type Recovery

To estimate the importance of type recovery
(Section 5.4, paragraph: "Importance of type recovery"),
we use 1,098 Java seed programs found
at `/home/eris/java-seeds/` inside the artifact,
and then use `eris` to enumerate the locations
where faults can be safely injected.
To do so,
our experiment uses two modes:
one with type recovery enabled,
and one with type recovery disabled.
To run the experiment
and compute the impact of type recovery,
run the following command
(estimated running time: 10--15 minutes).

```
eris@afa4de3612b7:~$ ./eval-scripts/type-recovery-impact.sh \
  /home/eris/java-seeds
Computing affected locations w/ type recovery (bear with us...)
Computing affected locations w/o type recovery (bear with us...)
Seeds:                                      1098
Total locations:                            158557
Examined locations (w/o type recovery):     119829
Examined locations (w/ type recovery):      86316
Change in examined locations:               -28.0%
```

### Importance of Type Shape Isomorphism

To estimate the impact of type shape isomorphism,
we perform two experiments.

**Experiment 1 (Type pool reduction rate):**
In the first experiment,
we estimate the reduction rate in the type pool size
performed by type shape isomorphism in the types of various
APIs from popular Java libraries.
Run (estimated running time: 5 minutes):

```
eris@afa4de3612b7:~$ ./eval-scripts/type-pool-reduction.sh data/apis/
Type pool reduction rate (mean):   84.4140
Type pool reduction rate (median): 84.0000
```


**Experiment 2 (Variant reduction rate):**
In the second experiment,
we use 85 well-typed seed programs
(note: the paper mentions 100 seed programs,
but it is actually 85)
and enumerate their ill-typed variants
with and without type shape isomorphism.
You can reproduce the results mentioned in the paper
(Section 5.4, paragraph: "Effectiveness of isomorphic type shapes")
using the pre-computed data found
at `data/runs/type-isomorphism`.

```
eris@afa4de3612b7:~$ python eval-scripts/count-variants.py data/runs/type-isomorphism/reduced.logs data/runs/type-isomorphism/full.logs        
Seeds:                                       85

Total variants (w/ type isomorphism):        714989
Total variants (w/o type isomorphism):       10263193

Median variants/seed (w/ type isomorphism):  5016.0
Median variants/seed (w/o type isomorphism): 65285.0

Variant ratio (full/type isomorphism):
  Mean:                          13.02x
  Median:                        12.63x
```

**(OPTIONAL) Re-computing experiment 2 (Variant reduction rate):***
To fully re-compute the data from experiment 2 can take 2--3 days.
Therefore,
you may re-compute the data for a smaller dataset.
To do so,
use 5 seed programs located at `data/smaller-seeds`
and re-compute the experiment as follows.

```eris@afa4de3612b7:~$ ./eval-scripts/type-isomorphism-impact.sh data/new-seeds/generator/
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

Figure 14 shows the overlap of bugs detected by `eris`
and other existing tools.
To reproduce it,
run:

```bash
eris@afa4de3612b7:~$ python eval-scripts/plot-venn.py \
  data/bugs.json --output eval-figures/venn.pdf
```

The figure can be found at `figures/venn.pdf` in your host machine.
Note that the figure is slightly different from the one in the paper
and we will update it in the revised paper.

Congratulations on completing the instructions of our artifact! :-)
