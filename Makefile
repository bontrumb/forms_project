GCC=/usr/bin/gcc
JAVAC=/usr/bin/javac
JAVAE=/usr/bin/java
CFLAGS=-Wall -Werror
JFLAGS=-verbose -Werror
DIRS=bin docs lib
BASE_DIR:=$(shell pwd)

LIB_DIR=abstract structs data calc menu gui user

T_LIB:=$(BASE_DIR)/lib
T_LIBS=$(foreach d, $(LIB_DIR),$(T_LIB)/$(d))
T_BIN:=$(BASE_DIR)/bin
TCP_LIBS=$(subst Z,,$(subst Z :,:, .$(strip $(foreach d,$(T_LIBS),:$(d)Z))))
SRC = $(BASE_DIR)/src
S_LIB:=$(SRC)/lib
S_GUI:=$(SRC)/gui
S_DOCS:=$(SRC)/docs
S_BIN:=$(SRC)/bin

JCOMP=$(JAVAC) $(JFLAGS) -d $@ -cp $(TCP_LIBS) $(wildcard $</*.java)

vpath %.c $(S_BIN)
# $(call EXISTDIR, $(d))
define EXISTDIR
@if [ ! -d $1 ]; then \
	mkdir -v $1; \
fi
endef

# $(call JCOMPILE)
define JCOMPILE
$(call EXISTDIR, $@)
$(JCOMP)
endef

.PHONY 	: main
main	: GEN_DIR classes $(T_BIN)/Fitness_App
classes	: $(T_LIB)/menu

docs	: src/docs docs/html docs/latex
	cp -rv $</important $@
	cd $@/latex; \
		pdflatex refman.tex; \
		pdflatex refman.tex;\
		mv -v refman.pdf ../important \

docs/html docs/latex : src/docs
	doxygen $</Doxyfile

$(T_BIN)/Fitness_App : $(S_BIN)/Fitness_App.c $(T_BIN)/Main.class
	@sed -e "s/ZZ/$(subst /,\/,$(TCP_LIBS))/g" $< > $@.c
	$(GCC) $(CFLAGS) -o $@ $@.c
	@rm -v $@.c

$(T_BIN)/Main.class : $(S_BIN)/Main.java
	$(JCOMP) -d bin -cp $(TCP_LIBS) $<

$(T_LIB)/menu		: $(S_LIB)/menu		$(T_LIB)/calc
$(T_LIB)/calc		: $(S_LIB)/calc		$(T_LIB)/user
$(T_LIB)/user		: $(S_LIB)/user 	$(T_LIB)/data
$(T_LIB)/data		: $(S_LIB)/data 	$(T_LIB)/structs
$(T_LIB)/structs	: $(S_LIB)/structs 	$(T_LIB)/abstract
$(T_LIB)/abstract	: $(S_LIB)/abstract 

$(T_LIB)/%	: $(S_LIB)/%
	$(call JCOMPILE)

#lib/menu : $(S_LIB)/menu lib/calc
#	$(call JCOMPILE)
#
#lib/calc : $(S_LIB)/calc lib/user
#	$(call JCOMPILE)
#
#lib/user : $(S_LIB)/user lib/data
#	$(call JCOMPILE)
#
#lib/data : $(S_LIB)/data lib/structs
#	$(call JCOMPILE)
#
#lib/structs : $(S_LIB)/structs lib/abstract
#	$(call JCOMPILE)
#
#lib/abstract : $(S_LIB)/abstract
#	$(call JCOMPILE)

GEN_DIR :
	@if [ ! -d bin ]; then \
		mkdir -v bin; \
	fi
	@if [ ! -d lib ]; then \
		mkdir -v lib; \
	fi

test	: main
	./bin/Fitness_App

clean	:
	@if [ -d bin ]; then \
		rm -rvf bin; \
	fi
	@if [ -d lib ]; then \
		rm -rvf lib; \
	fi
	@if [ -d docs ]; then \
		rm -rvf docs; \
	fi
.PHONY	: clean all
all	: main docs
