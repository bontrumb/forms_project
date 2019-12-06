GCC=/user/bin/gcc
JAVAC=/usr/lib/jvm/java-1.8.0-openjdk-amd64/bin/javac
JAVAE=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/bin/java
CFLAGS=-Wall -Werror
JCFLAGS=-Werror -g
DIRS=bin docs lib
BASE_DIR:=$(shell pwd)
L_DIRS:= structs menu data calc gui user driver handlers
T_DIRS:=bin docs lib
SRC:=$(BASE_DIR)/src
T_LIB:=$(BASE_DIR)/lib
T_BIN:=$(BASE_DIR)/bin
LG_DIRS:=$(foreach d,$(L_DIRS),$(T_LIB)/$(d))
T_DOCS:=$(BASE_DIR)/docs
S_LIB:=$(SRC)/lib
S_JUNIT:=$(SRC)/junit/junit-4.13-rc-1.jar
S_HAM:=$(SRC)/junit/hamcrest-core-1.3.jar
S_CP:=-cp $(S_JUNIT):$(S_HAM):$(T_LIB)
S_TARGET=$(S_LIB)/$@
S_TESTS=$(S_LIB)/tests
JCOMP=$(JAVAC) $(JFLAGS) $(S_CP) -d $(T_LIB)
JRUN=$(JAVAE) $(S_CP)
JTEST=$(JAVAE) $(S_CP) org.junit.runner.JUnitCore
define EXISTDIR
@if [ ! -d $1 ]; then \
        mkdir -v $1; \
        else \
        echo "$1 exists.";\
fi
endef
#$(call RMDIR, target)
define RMDIR
@if [ -d $1 ]; then \
        rm -rvf $1; \
        else \
        echo "$1 does not exist.";\
fi
endef

export JCOMP JTEST T_LIB S_TESTS S_LIB LG_DIRS

.PHONY  : all clean test GEN_DIR $(L_DIRS)

all     : GEN_DIR menu

GEN_DIR :
	$(call EXISTDIR,bin);
	$(call EXISTDIR,docs);
	$(call EXISTDIR,lib);
gui	: menu
menu	: calc
calc	: data
data	: structs
$(L_DIRS)	:
	@$(MAKE) -C $(S_TARGET) TARGET=$@
clean	:
	$(call RMDIR,bin);
	$(call RMDIR,docs);
	$(call RMDIR,lib);
run_gui	:
	$(JAVAE) $(S_CP) driver.FormProjectDriver
run	:
	$(JAVAE) $(S_CP) menu.Main
