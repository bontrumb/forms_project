vpath %.java .
vpath %.class $(LG_DIRS)
.PHONY		: $(TARGET) main
$(TARGET)	: SDouble.class SInt.class SString.class
SDouble.class SInt.class SString.class : Struct.class

%.class	: %.java
	$(JCOMP) $<;
