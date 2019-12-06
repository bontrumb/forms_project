vpath %.java driver/ gui/ handlers/
vpath %.class $(LG_DIRS)
.PHONY		: $(TARGET) main
$(TARGET)	: main
main		:$(wildcard driver/*.java) $(wildcard gui/*.java) $(wildcard handlers/*.java)
	$(JCOMP) $^;
