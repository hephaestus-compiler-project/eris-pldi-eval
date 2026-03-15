To get the artifact, run:

```
git clone --recursive https://github.com/hephaestus-compiler-project/eris-pldi-eval eris-pldi-eval
```

The easiest way to get `eris` and all dependencies required for evaluating 
the artifact (e.g., scalac, kotlinc, the Java Checker framework) is to download
a pre-built Docker image from DockerHub.
Another option is to build the Docker  image locally.

We provide a `Dockerfile` to build an image that contain:

* An installation of Python (version 3.10.12).
* An installation of [SDKMAN](https://sdkman.io/).
* An installation of `kotlinc` version 2.0.10.
* An installation of `groovyc` version 5.0.4.
* An installation of `scalac` version 3.4.1.
* An installation of `jcf` version 3.42.0.
* An installation of [eris](https://github.com/hephaestus-compiler-project/eris).
* A user named `eris` with sudo privileges.
* Python packages for plotting figures (i.e., `seaborn`, `pandas`, `matplotlib`)

Pull Docker Image from DockerHub
--------------------------------

You can download the Docker image from DockerHub by using the following 
commands:

```
docker pull theosotr/eris-eval
# Rename the image to be consistent with our scripts
docker tag theosotr/eris-eval eris-eval
```

After downloading the Docker image successfully, 
please navigate to the root directory of the artifact:

```
cd eris-pldi-eval
```

Build Docker Image Locally
--------------------------

First enter the `eris-pldi-eval/` directory:

```
cd eris-pldi-eval
```

To build the image (named `eris-eval`), run the following command 
(estimated running time: ~5 minutes, depending on your internet 
connection):

```
docker build -t eris-eval --no-cache .
```

NOTE: The image is built upon `ubuntu:22.04`.
