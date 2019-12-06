vpath %.java .
vpath %.class $(LG_DIRS)
.PHONY		: $(TARGET) main
$(TARGET)	:

%.class : %.java
	$(JCOMP) $<;
