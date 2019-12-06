package menu;
import data.UserData;
import data.UserData_Tools;
import static menu.Menu_Abstract.ClearScreen;
public class Profiler
{
	public static void Profiler(UserData NewUser) {
		UserData_Tools use = new UserData_Tools(NewUser);
		use.Set_Interactive("Info");
		use.Set_Interactive("Gender");
		use.Set_Interactive("Weight");
		use.Set_Interactive("Height");
		ClearScreen();
	}
}
