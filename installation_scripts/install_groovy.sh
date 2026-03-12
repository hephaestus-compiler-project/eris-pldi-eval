#!/usr/bin/env bash
#
# Install the Groovy compiler

export SDKMAN_DIR="$HOME/.sdkman"
[[ -s "$HOME/.sdkman/bin/sdkman-init.sh" ]] && source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install groovy 5.0.4 < /dev/null
