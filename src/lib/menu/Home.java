package menu;
import file_io.*;
import data.UserData;

/**The Home Menu interface.
 */
public class Home extends Menu_Abstract
{
	/**#Menu_Entry to #Track_Fitness.
	 */
	private Menu_Entry Track_Fitness = new Menu_Entry("Track Fitness");
	/**#Menu_Entry to #View_Insights.
	 */
	private Menu_Entry View_Insights = new Menu_Entry("View Insights");
	/**Constructor that builds the #Home menu interface.
	 */
	public Home() {
		super("Home");
		ClearScreen();
		AddMenu_Entry(Track_Fitness);
		AddMenu_Entry(View_Insights);
	}
	/**Accesses the menu entries
	 * @param	choice	Integer value to access a certain value.
	 * @param	z	#UserData that should be used to be
	 * 			passed through the interface.
	 */
	public void SelectMenu(int choice, UserData z) {
		Fitness b = new Fitness();
		switch (choice) {
			case 1:	System.out.println("To Track Fitness (NOT IMPLEMENTED)");
				break;
			case 2: b.Menu_Main(z);
		}
	}
}
