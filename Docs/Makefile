PDFBIN = pdflatex
all	:	Doxyfile
	doxygen Doxyfile
	cd latex; \
		${PDFBIN} refman.tex; \
		${PDFBIN} refman.tex;
	
