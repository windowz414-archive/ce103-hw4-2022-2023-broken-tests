#!/bin/bash
for i in dot java doxygen; do
    if [ -z "$(which $i)" ]; then
        echo "$i doesn't exist. Install it on your distro/session and run this script again."
        exit 1
    fi
done

export GRAPHVIZ_DOT="$(which dot)"
export SOURCE_DIR="../src"
export DOC_IMG_PATH_UML="./Resources"
export DOC_IMG_PATH="./Resources"

if [ ! -f plantuml.jar ]; then
    curl -Lo plantuml.jar "https://github.com/plantuml/plantuml/releases/download/v1.2021.14/plantuml-1.2021.14.jar"
fi

java -jar "plantuml.jar" -v -o "$DOC_IMG_PATH_UML" "$SOURCE_DIR/**.(c|cpp|doc|h|java|puml)"
doxygen Doxyfile

echo "Press RETURN to exit."
read
