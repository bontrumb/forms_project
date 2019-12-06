JAVAC = /usr/bin/javac
JAVAE = /usr/bin/java
JAR = /usr/bin/jar
JAR_E = $(JAR) cvf $@
JAR_M = $(JAR) cvfe $@ Main
BIN = $(CUR_DIR)/bin
LIBS = $(CUR_DIR)/libs
SRC = $(CUR_DIR)/src
DIRS = $(BIN) $(LIBS)
S_CLASS = $(BIN)/*.class
CC = /usr/bin/gcc
#C_CLASS = $(shell rm -rf $(LIBS)/*.class)
S_JAVA = $(wildcard $@/*.java)
VERSION = 0.1
CUR_DIR = $(shell pwd)
vpath %.jar $(LLIBS)
vpath %.class $(LBIN)
vpath %.c $(SRC)

define G_JAVA
$(JAVAC) $(S_JAVA) -cp $(LIBS) -d $(LIBS)
endef
.PHONY	: Structs Fitness_App
all	: dir Fitness_App Menu
Fitness_App ;Fitness_App.c
	$(GCC) -o $(BIN)/$@ Fitness

Menu	: Calc
	$(G_JAVA);

Calc	: Data
	$(G_JAVA);

Data	: Structs
	$(G_JAVA);
Structs :
	$(G_JAVA);

dir	: $(DIRS)
$(DIRS) :
	if [ ! -d $@ ]; then \
		mkdir $@; \
	fi
test	: $(LIBS)/Main.class
	if [ -f $< ]; then \
		cd $(BIN); \
		./a.out; \
	fi
## need to make a c program to create an executable...
