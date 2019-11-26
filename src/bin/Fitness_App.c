#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv) {
	static char *com = "java -cp ZZ:bin Main";
	system(com);
}
