vpath %.java .
vpath %.class $(LG_DIRS)
.PHONY		: $(TARGET) main
$(TARGET)	: Main.class
Main.class	: Home.class
Home.class	: Fitness.class Menu_Abstract.class
Fitness.class	: UserData.class UserData_Calc.class Menu_Abstract.class Editor.class Lifting_Stats.class
Editor.class : Editor_Set.class Editor_Get.class
Editor_Set.class Editor_Get.class	: Editor_Abstract.class
Editor_Abstract.class	: Menu_Abstract.class
Menu_Abstract.class	: Menu_Entry.class
%.class	: %.java
	$(JCOMP) $<;
