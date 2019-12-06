vpath %.java .
vpath %.class $(LG_DIRS)
.PHONY		: $(TARGET) main
$(TARGET)	: UserList.class UserData_File.class
UserList.class UserData_File.class	: UserData.class UserData_Tools.class
%.class : %.java
	$(JCOMP) $<;
