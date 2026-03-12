FROM ubuntu:22.04

ENV TZ=Europe/Zurich
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN apt update -yq && apt upgrade -yq
RUN apt install -y vim software-properties-common git curl unzip zip sudo \
    sqlite3 wget unzip locales
RUN sudo locale-gen "en_US.UTF-8"
RUN update-locale LC_ALL="en_US.UTF-8"
RUN update-alternatives --install /usr/bin/python python /usr/bin/python3 1
RUN apt install -yq python3-distutils python3-pip


# Create the eris user.
RUN useradd -ms /bin/bash eris && \
    echo eris:eris | chpasswd && \
    cp /etc/sudoers /etc/sudoers.bak && \
    echo 'eris ALL=(ALL:ALL) NOPASSWD:ALL' >> /etc/sudoers
USER eris
ENV HOME=/home/eris
WORKDIR ${HOME}

# Install missing python packages
RUN pip3 install --upgrade setuptools
RUN pip3 install --upgrade distlib
RUN pip3 install --upgrade pip
RUN pip3 install seaborn pandas matplotlib pytest matplotlib_venn

USER eris

RUN touch ${HOME}/.bash_profile
RUN echo "source ${HOME}/.bash_profile" >> ${HOME}/.bashrc
RUN echo 'export LANG="en_US.UTF-8"' >> ${HOME}/.bashrc

# Create directory for helper installation scripts
RUN mkdir ${HOME}/installation_scripts
 
# Install sdkman
ADD ./installation_scripts/install_sdkman.sh ${HOME}/installation_scripts/install_sdkman.sh
RUN ${HOME}/installation_scripts/install_sdkman.sh
ENV SDKMAN_DIR="${HOME}/.sdkman"
 
# Install Java
ADD ./installation_scripts/install_java.sh ${HOME}/installation_scripts/install_java.sh
SHELL ["/bin/bash", "-c"]
RUN source .sdkman/bin/sdkman-init.sh && sdk update
RUN ${HOME}/installation_scripts/install_java.sh
 
# Install Kotlin
ADD ./installation_scripts/install_kotlin.sh ${HOME}/installation_scripts/install_kotlin.sh
RUN ${HOME}/installation_scripts/install_kotlin.sh

# Install Groovy
ADD ./installation_scripts/install_groovy.sh ${HOME}/installation_scripts/install_groovy.sh
RUN ${HOME}/installation_scripts/install_groovy.sh

# Install Scala
ADD ./installation_scripts/install_scala.sh ${HOME}/installation_scripts/install_scala.sh
RUN ${HOME}/installation_scripts/install_scala.sh

# Install JCF
ADD ./installation_scripts/install_jcf.sh ${HOME}/installation_scripts/install_jcf.sh
RUN ${HOME}/installation_scripts/install_jcf.sh

# Now cleanup helper scripts
RUN sudo rm -rf ${HOME}/installation_scripts

# Install python deps
RUN pip install networkx

# Add source code of eris
ADD ./eris ${HOME}/eris
RUN sudo chown -R eris:eris ${HOME}/eris

# Install and run eris
RUN cd ${HOME}/eris/ && python -m pytest && pip install . && echo "export PATH=\"$PATH:/home/eris/.local/bin\"" >> ${HOME}/.bashrc

ADD ./data/seeds/ /home/eris/example-seeds
RUN echo "source .sdkman/bin/sdkman-init.sh" >> ${HOME}/.bashrc
