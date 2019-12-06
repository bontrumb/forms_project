vpath %.java .
vpath %.class $(LG_DIRS)
.PHONY		: $(TARGET) main tests
tests	: $(subst Test.java,Test.class,$(wildcard *Test.java))
	$(JTEST) $(foreach f,$^,tests.$(subst .class,,$(f)))

%Test.class : %Test.java
	$(JCOMP) $<;
