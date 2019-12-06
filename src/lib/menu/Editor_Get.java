package menu;

import data.UserData;

/**Class that provides a User Interface to #Editor_Abstract,
 * specifically to get values.
 */
public class Editor_Get extends Editor_Abstract
{
	/**Constructor that initializes the get menu.
	 * @param	z	The current #UserData values.
	 */
	public Editor_Get(UserData z) {
		super("Get Values", z);
	}
	/**Shows user value when some choice is selected.
	 * @param	choice	Some integer value that corresponds
	 * 			to the array index of what value
	 * 			should be shown.
	 * @param	z	Not used. Inherited from #Menu_Abstract.
	 */
	public void SelectMenu(int choice, UserData z) {
		System.out.println(GetData_String(choice));
	}
	/**Method to display the #UserData's values selected from
	 * the index chosen.
	 * @param	choice	Value to access the #choice index
	 * 			of the #UserData array.
	 */
	private String GetData_String(int choice) {
		String ArrayStringed = "";
		String type = tools.GetType_Interactive(choice);
		String units = tools.GetUnits_Interactive(type);
		Object entry = tools.Get_Interactive(type);
		ArrayStringed = type + "\t" + entry + " " + units;
		return ArrayStringed;
	}
}


