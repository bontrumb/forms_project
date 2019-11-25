GCC=/usr/bin/gcc
JAVAC=/usr/bin/javac
JAVAE=/usr/bin/java
DIRS=bin docs lib
BASE_DIR:=$(shell pwd)

T_LIB:=$(BASE_DIR)/lib

SRC = $(BASE_DIR)/src
S_LIB:=$(SRC)/lib
S_GUI:=$(SRC)/gui
S_DOCS:=$(SRC)/docs
S_BIN:=$(SRC)/bin

JCOMP=$(JAVAC) -d $@ -cp $(T_LIB)

# $(call MKDIR, $(d))
define MKDIR

if [ -d $1 ]; then \
	rm $1 -rf; \
	fi 
mkdir $1
endef
all	: classes Program_DIRS
classes	: lib/abstract

lib/abstract : $(S_LIB)/abstract
	$(call MKDIR, $@)
	$(JCOMP) $(wildcard $</*.java)

Program_DIRS	:
	$(foreach d,$(DIRS), $(call MKDIR, $(BASE_DIR)/$(d));)
	@echo $(BASE_DIR);
