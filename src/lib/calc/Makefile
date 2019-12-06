vpath %.java .
vpath %.class $(LG_DIRS)
.PHONY		: $(TARGET) main
$(TARGET)	: UserData_Calc.class
UserData_Calc.class : Basal_Metabolic.class BMI.class Display_Caloric.class \
	FFMI.class VO2_Max.class Barbell_Curl.class Bench_Press.class \
	Deadlift.class Shoulder_Press.class Squat.class
Barbell_Curl.class Bench_Press.class Deadlift.class Shoulder_Press.class Squat.class : Lifting_Abstract.class
Basal_Metabolic.class BMI.class Display_Caloric.class FFMI.class Lifting_Stats.class VO2_Max.class : Calc_Abstract.class
Calc_Abstract.class	: UserData.class UserData_Tools.class Struct.class
%.class	: %.java
	$(JCOMP) $<;
