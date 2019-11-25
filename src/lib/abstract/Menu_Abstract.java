import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**The template class that provides the skeleton menu interface.
 */
abstract class Menu_Abstract {
	/**The title of the current menu.
	 */
	private String Menu_Title;
	/**ArrayList of #Menu_Entry to be displayed on the interface.
	 */
	private ArrayList<Menu_Entry> Menu_List = new ArrayList<Menu_Entry>();
	/**#Menu_Entry to display an exit option.
	 */
	private Menu_Entry Menu_Exit = new Menu_Entry("Exit");
	/**Constructor that builds the menu itself.
	 * @param	Menu_Title	Name of the Menu.
	 */
	public Menu_Abstract(String Menu_Title) {
		SetMenu_Title(Menu_Title);
		AddMenu_Entry(Menu_Exit);
	}
	// get methods
	/**Returns the Menu's title.
	 * @return	#Menu_Title.
	 */
	public String GetMenu_Title() {
		return this.Menu_Title;
	}
	/**Method to retrieve the current menu's #Menu_Entry to
	 * be displayed.
	 * @return	#Menu_Entry.GetMenu_Entry() for the user.
	 */
	public String GetMenu_Entry(Menu_Entry Entry) {
		return Entry.GetMenu_Entry();
	}
	/**Retrieves a list of entries of #Menu_Entry for the 
	 * current menu, and returns it to the user.
	 * @return	#ArrayStringed, or the current menu
	 * 		in String form.
	 */
	public String GetMenu_List() {
		String ArrayStringed = "";
		int i;
		ArrayStringed += GetMenu_Title() + "\n";
		for (i = 0; i < Menu_List.size(); i++) {
			ArrayStringed += "(" + i + ")\t" + 
				GetMenu_Entry(Menu_List.get(i)) + "\n";
		}
		return ArrayStringed;
	}
	// set methods
	/**Sets the current Menu's title.
	 * @param	Menu_Title	Sets the current menu's title.
	 */
	public void SetMenu_Title(String Menu_Title) {
		this.Menu_Title = Menu_Title;
	}
	// add methods
	/**Adds #Menu_Entry to the #Menu_List array.
	 * @param	NewEntry	New menu entry to add to the
	 * 				current menu.
	 */
	public void AddMenu_Entry(Menu_Entry NewEntry) {
		Menu_List.add(NewEntry);
	}
	// select methods
	/**Checks if the selected menu entry is considered valid.
	 * @param	choice		Choice chosen from the
	 * 				user input to check
	 * 				if the value is within 
	 * 				the menu's size.
	 * @return	True if choice is valid. False if otherwise.
	 */
	public boolean SelectMenu_Bool(int choice) {
		ClearScreen();
		if (choice >= 0 && choice < Menu_List.size()) {
			return true;
		} else {
			System.out.println("Invalid choice");
			return false;
		}
	}
	/**Main method that takes the user input from the TUI.
	 * May become obsolete if GUI is chosen.
	 * @return	Integer that accesses the other objects
	 * 		on the menu.
	 */
	public int SelectMenu_Scanner() {
		Scanner input = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println(GetMenu_List());
			try {
				choice = input.nextInt();
				if (SelectMenu_Bool(choice)) {
					return choice;
				}
			} catch (InputMismatchException e) {
				ClearScreen();
				System.out.println("Invalid input");
				input.nextLine();
			}
		}
	}
	/**Abstract class that forces the coder to generate the 
	 * current menu entries manually.
	 * May be obseleted for the GUI due to #SelectMenu_Scanner
	 * being bypassed.
	 * @param	choice		Choice that will be sent to
	 * 				the #SelectMenu method.
	 * @param	z		#UserData that should be
	 * 				passed to other classes.
	 */
	abstract public void SelectMenu(int choice, UserData z);
	// menu main loop
	/**The main loop that bring the TUI interface for the 
	 * user
	 * @param	z		The #UserData that should be
	 * 				passed on to other methods.
	 */
	public void Menu_Main(UserData z) {
	       int choice = -1;
	       while (choice != 0) {
		       choice = SelectMenu_Scanner();
		       SelectMenu(choice, z);
	       }
	}
	// misc methods
	/**Clears the current screen, refresh in a sense,
	 * without building too much buffer on the screen.
	 */
	protected static void ClearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();  
	}
}
