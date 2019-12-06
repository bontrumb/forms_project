vpath %.java
vpath %.class $(LG_DIRS)
.PHONY	: $(TARGET) main
$(TARGET)	: UserData_Tools.class
UserData_Tools.class	: UserDataIndex.class UserData.class
UserData.class	: Activity_Level.class Benches.class BF.class \
	Gender.class Height.class Info.class Lifts.class \
	Resting_BPM.class Squats.class Steps.class Weight.class Deadlifts.class
Squats.class Benches.class Deadlifts.class : Lifts.class
Lifts.class : Weight.class
Activity_Level.class BF.class : SDouble.class
Gender.class Info.class : SString.class
Weight.class Height.class Resting_BPM.class Steps : SInt.class

%.class	: %.java
	$(JCOMP) $<;
