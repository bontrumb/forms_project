/**The main menu for choosing either to get values
 * or set values in the main program.
 */
public class Editor extends Menu_Abstract
{
	/**#Menu_Entry to access the #Editor_Get class.
	 */
	private Menu_Entry Get_Data = new Menu_Entry("Get Data");
	/**#Menu_Entry to access the #Editor_Set class.
	 */
	private Menu_Entry Set_Data = new Menu_Entry("Set Data");
	/**Constructor that builds the Editor Menu.
	 */
	public Editor(){
		super("Data Editor");
		AddMenu_Entry(Get_Data);
		AddMenu_Entry(Set_Data);
	}
	/**Access either the #Editor_Get or #Editor_Set classes.
	 * @param	choice	Chooses either Get or Set classes.
	 * @param	z	#UserData that should be edited with.
	 */
	public void SelectMenu(int choice, UserData z) {
		Editor_Get a = new Editor_Get(z);
		Editor_Set b = new Editor_Set(z);
		switch (choice) {
			case 1:	a.Menu_Main(z);
				break;
			case 2:	b.Menu_Main(z);
				break;
		}
	}
}
