package menu;

import data.UserData;
import data.UserData_Tools;
import structs.Struct;

/**This class extends the abstract class #Menu_Abstract, which provides
 * the structure for editing and viewing the #UserData.
 */
abstract class Editor_Abstract extends Menu_Abstract
{
	/**Initializes the #UserData_Tools as an object to retrieve 
	 * information.
	 */
	protected UserData_Tools tools;
	/**Constructor that creates the menu title, and takes the
	 * current #UserData.
	 * @param	Menu_Title	The title of the editor 
	 * 				interface.
	 * @param	z		The #UserData to be edited
	 * 				or viewed.
	 */
	public Editor_Abstract(String Menu_Title, UserData z) {
		super(Menu_Title);
		for (Struct o : z.GetData()) {
			Menu_Entry temp = new Menu_Entry(o.GetType());
			AddMenu_Entry(temp);
		}
		tools = new UserData_Tools(z);
	}
	/**Main Menu loop to access other objects.
	 * Modified from the previous instance of 
	 * #Menu_Abstract.Menu_Main to accomodate the smaller 
	 * array size of #UserData when choosing 
	 * which value to check.
	 * @param	z	Takes some #UserData to be passed
	 * 			through the program.
	 */
	public void Menu_Main(UserData z) {
		int choice = -1;
		while (choice != 0) {
			choice = SelectMenu_Scanner();
			if (choice != 0) {
				SelectMenu(choice - 1, z);
			}
		}
	}
}	
