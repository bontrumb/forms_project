package menu;
import data.UserData;
import file_io.*;
import static menu.Profiler.*;
public class User_Select extends Menu_Abstract
{
	public User_Select() {
		super("User Selection Screen");
		AddMenu_Entry(new Menu_Entry("New User"));
		if (UserList.GetUserList() != null) {
			for (String o : UserList.GetUserList()) {
				Menu_Entry toAdd = new Menu_Entry(o);
				AddMenu_Entry(toAdd);
			}
		}
		ClearScreen();
	}
	public void SelectMenu(int choice, UserData z) {
		Home a = new Home();
		
		switch (choice) {
			case 0: break;
			case 1: Profiler.Profiler(z);
				a.Menu_Main(z);
				break;
			default: String g = UserList.GetUserList().get(
						 choice - 2);
				 if (UserData_File.SetData(g,z)) {
					 a.Menu_Main(z);
				 }
				 break;
		}
	}
		/*
		if (choice == 1) {
			Profiler.Profiler(z);
		} else if (choice == 0) {
			System.exit(0);
		}

		String g = UserList.GetUserList().get(choice - 2);
		UserData_File.SetData(g, z);
		a.Menu_Main(z);
		*/
}

