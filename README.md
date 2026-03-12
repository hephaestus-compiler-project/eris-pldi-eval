# Artifact for "Enumerating Ill-Typed Programs for Testing Type Analyzers (PLDI'26)"

This artifact is for the conditionally accepted  PLDI'26 paper titled
"Enumerating Ill-Typed Programs for Testing Type Analyzers".

An archived version of the artifact is also available on Zenodo.
See XXX.

# Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Setup](#setup)
- [Getting Started](#getting-started)
  * [Usage](#usage)
  * [Run Tests](#run-tests)
  * [Example: Testing the Groovy compiler](#example-testing-the-groovy-compiler-using-the-api-of-its-standard-library)
  * [Example: Testing the Java Checker Framework](#example-testing-the-groovy-compiler-using-the-api-of-a-third-party-library)
- [Step by Step Instructions](#step-by-step-instructions)

# Overview

The artifact contains the instructions and scripts to re-run the evaluation
described in our paper. The artifact has the following structure:

* `scripts/`: This directory contains the scripts needed to re-run the
experiments and re-produce the figures and tables presented in our paper.
* `data/`: This is the directory that contains the pre-computed results of our
evaluation.
* `data/apis`: A directory that contains the API specification from popular Java libraries.
* `data/runs`: Computed data from previous evaluation runs of our approach.
* `eris/`: Contains the source code of our tool
(provided as a git submodule) used for evaluating the soundness of
type analyzers. The name of our tool is `eris`.
* `installation_scripts/`: Contains helper scripts used to install all
dependencies (e.g., compiler versions from [SDKMAN](https://sdkman.io/)).
* `figures/`: This directory will be used to save the figures of our paper.
* `Dockerfile`: The Dockerfile used to create a Docker image of our artifact.
  This image contains all data and dependencies.

`eris` is available as open-source software under the
GNU General Public License v3.0, and can also be reached through the following
repository: https://github.com/hephaestus-compiler-project/eris.

Inside the `eris` directory, there are the following directories:

* `src/`: The source code of `eris` written in Python.
* `tests/`: Contains the tests of `eris`.
* `example-apis/`: Example inputs of `eris`. Our tool
takes as input an API specification in JSON.
* `deployment/`: Contains configuration and scripts to install and run
`eris` on a server.

# Requirements

See [REQUIREMENTS.md](./REQUIREMENTS.md)

# Setup

See [INSTALL.md](./INSTALL.md)


# Getting Started

To get started with our `eris` tool,
we use the Docker image (namely `eris-eval`) built by
the instructions from the [Setup](#Setup) guide.
The image contains all the
required environments for running our evaluation
(i.e., it includes installations of the corresponding type analyzers,
as well as any other tool needed for processing the results).

You can enter a new container by using the following command:

```
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

To run `eris` tests, execute the following commands:

```bash
# Enter eris directory
eris@e0456a9b520e:~$ cd eris
# Run tests
eris@e0456a9b520e:~/eris$ python -m pytest
```

The output of the previous command should be similar to the following:

```
tests/test_api_graph.py::test1 PASSED                                                   [  0%]
tests/test_api_graph.py::test2 PASSED                                                   [  0%]
...
tests/test_use_analysis.py::test_program6 PASSED                                        [ 99%]
tests/test_use_analysis.py::test_program7 PASSED                                        [ 99%]
tests/test_use_analysis.py::test_program8 PASSED                                        [100%]

===================================== 266 passed in 2.02s =====================================
```


## Example: Testing the Groovy compiler

**NOTE:** At each run, `eris` generates random programs.
Therefore, you should expect to get different results at each run:
some randomly generated programs might trigger unfixed compiler bugs.

In this example,
we use `eris` to generate 30 ill-typed variants from a set of
well-typed Groovy seed programs.
To do so,
run the following command.

```
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

The expected outcome is something similar to:

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

**Inputs**: The inputs of the aforementioned command instruct `eris` to
generate 30 (`-i 30`) Groovy (`--language programs`) by injecting type
errors (`--error-enumerator type`) into a provided set of well-typed
seed programs (`--seeds /home/erirs/example-seeds/groovy-seeds`).
The option `--keep-all` makes `eris` to store every generated program
into the file system.

**Outputs:** During this run,
`eris` stores every output into a `bugs/groovy-session` directory
(specified by the `--name groovy-session` option).
Among other things,
the `bugs/groovy-session/` directory contains two files:
`stats.json` and `faults.json` (see more details later).

`stats.json` contains the following details about the testing session.

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

###  Logging

The `-L` option allows you to log all the type mismatches
injected by `eris`.
The resulting log file can be found
at `bugs/groovy-session/logs/api-generator`.
In our previous example,
the contents of this file look like:

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

Indeed, if produce the diff between the seed program and the
ill-typed variant produced by `eris`,
we get:

``` diff
eris@d55f523ab2da:~$ diff --color example-seeds/groovy-seeds/iter_14/Main.groovy bugs/groovy-session/generator/iter_1/Main.groovy
27c27
<     Integer[] fracking = new Integer[]{-85, 49, 28};
---
>     Integer[] fracking = new Integer[0][0];
```

And we verify that the generated ill-typed variant is correctly rejected by
the `groovyc` type analyzer.

```
eris@d55f523ab2da:~$ groovyc --compile-static bugs/groovy-session/generator/iter_1/Main.groovy
org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
bugs/groovy-session/generator/iter_1/Main.groovy: 27: [Static type checking] - Cannot assign value of type java.lang.Integer[][] to variable of type java.lang.Integer[]
 @ line 27, column 26.
       Integer[] fracking = new Integer[0][0];
                            ^

1 error
```

By examining the logs,
the second variant generated by `eris` creates another ill-typed variant 
that contains the type mismatch:
expected type: `Integer[]` vs. actual type: `java.security.cert.X509CRL[]`,
which is also successfully rejected by the `groovyc` type checker.

```diff
eris@d55f523ab2da:~$ diff --color example-seeds/groovy-seeds/iter_14/Main.groovy bugs/groovy-session/generator/iter_2/Main.groovy
27c27
<     Integer[] fracking = new Integer[]{-85, 49, 28};
---
>     Integer[] fracking = new java.security.cert.X509CRL[0];
```

Notably,
if any of the variants generated by `eris` is not rejected by the type checker
(let's imagine that variant `2` does that),
`eris` will record it in the `faults.json` file,
which would have a format like that:

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


Congratulations, you have completed the Getting Started guide of our artifact!
You can not proceed with the
[Step by Step Instructions](#step-by-step-instructions) guide.
Notably,
in [Running Eris on More Type Analyzers][#running-eris-on-more-type-analyzers],
you will find more examples on hot to use `eris`.



# Step By Step Instructions

**NOTE**: Remember to run all the subsequent `docker run` commands
from the root directory of the artifact (i.e., `eris-pldi-eval/`).
