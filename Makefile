JAVAC = /usr/bin/javac
JAVAE = /usr/bin/java
<<<<<<< HEAD
BIN = bin
all	:
	if [ ! -d ${BIN} ]; then \
		mkdir ${BIN}; \
		fi
	cd Structs; \
		make; \
		cd .. ;
	##
	cd TStructs; \
		make; \
		cd .. ;
	cd Data; \
		make ; \
		cd .. ;
	##
	cd Calc; \
		make ; \
		cd ..;
	##
	cd Menu; \
		make ; \
		cd .. ;
	##
	cd Docs; \
		make ; \
		cd ..;
test	:
	cd ${BIN}; \
		${JAVAE} Main;
=======
JAR = /usr/bin/jar
JAR_E = $(JAR) cvf $@
JAR_M = $(JAR) cvfe $@ Main
BIN = $(CUR_DIR)/bin
LIBS = $(CUR_DIR)/libs
DIRS = $(BIN) $(LIBS)
S_CLASS = $(BIN)/*.class
#C_CLASS = $(shell rm -rf $(LIBS)/*.class)
S_JAVA = $(wildcard $@/*.java)
VERSION = 0.1
CUR_DIR = $(shell pwd)
vpath %.jar $(LLIBS)
vpath %.class $(LBIN)

#define G_JAR
#cd libs; \
#	$(JAR_E) *.class
#$(C_CLASS)
#endef

#define GM_JAR
#cd libs; \
#	$(JAR_M) *.class
#$(C_CLASS)
#endef

#define C_CLASS
#rm -rf $(S_CLASS)
#endef

define G_JAVA
$(JAVAC) $(S_JAVA) -cp $(LIBS) -d $(LIBS)
endef
.PHONY	: Structs Menu
all	: dir classes exec
classes	: Menu
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
>>>>>>> master
