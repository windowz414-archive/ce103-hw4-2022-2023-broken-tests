SET GRAPHVIZ_DOT="C:\Program Files\Graphviz\bin\dot.exe"
SET DOXYGEN_EXE="C:\Program Files\doxygen\bin\doxygen.exe"
SET SOURCE_DIR=..\ ce103-hw3-2022-2023-ahmet-kaya
SET DOC_IMG_PATH_UML=..\doxygen\Resources
SET DOC_IMG_PATH=../doxygen/Resources
:: SET STRIP_PATH="C:xx"
IF NOT EXIST plantuml.jar ( curl -Lo plantuml.jar "https://github.com/plantuml/plantuml/releases/download/v1.2021.14/plantuml-1.2021.14.jar" )
java -jar "plantuml.jar" -v -o "%DOC_IMG_PATH_UML%" "%SOURCE_DIR%/**.(c|cpp|doc|h|java|puml)"
doxygen Doxyfile
pause
