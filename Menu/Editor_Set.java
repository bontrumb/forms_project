/**Class that creates a Menu user interface to edit any #UserData
 * values.
 */
public class Editor_Set extends Editor_Abstract 
{
	/**Constructor that creates the #Editor_Set menu.
	 * @param	z	Takes some #UserData to be edited with.
	 */
	public Editor_Set(UserData z) {
		super("Set Values", z);
	}
	/**Takes some value that corresponds to the array index of
	 * the #UserData that should be edited.
	 * @param	choice	Chooses the array index that should
	 * 			be edited in #UserData.
	 * @param	z	#UserData that should be edited.
	 */
	public void SelectMenu(int choice, UserData z) {
		String target = tools.GetType_Interactive(choice);
		tools.Set_Interactive(target);
	}
}
