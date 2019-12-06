package menu;

import data.UserData;
import file_io.UserData_File;
/**The main class that runs the TUI.
 */
public class Main
{
	/**Main object that is run at runtime.
	 * Maybe might take in user data if needed.
	 */
	public static void main(String[] args) {
		UserData z = new UserData();
		User_Select b = new User_Select();
		b.Menu_Main(z);
	}
}
