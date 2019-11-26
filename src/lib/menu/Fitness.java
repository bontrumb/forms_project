/**The Menu Interface for the Fitness class.
 * Runs calculations on the fly as needed.
 */
public class Fitness extends Menu_Abstract
{
	/**#Menu_Entry to access the #Editor class.
	 */
	private Menu_Entry Editor = new Menu_Entry("View/Edit User Data");
	/**#Menu_Entry to access the #Display_Caloric class.
	 */
	private Menu_Entry Display_Caloric = new Menu_Entry("Daily Caloric Requirements");
	/**#Menu_Entry to access the #Basal_Metabolic class.
	 */
	private Menu_Entry Basal_Metabolic = new Menu_Entry("Basal Metabolic Rate");
	/**#Menu_Entry to access the #FFMI class.
	 */
	private Menu_Entry FFMI = new Menu_Entry("Fat Free Mass Index & Ranges");
	/**#Menu_Entry to access the #VO2_Max class.
	 */
	private Menu_Entry VO2_Max = new Menu_Entry("VO2 Max");
	/**#Menu_Entry to access the #BMI class.
	 */
	private Menu_Entry BMI = new Menu_Entry("BMI & Range");
	/**#Menu_Entry to access the #Lifting_Stats class.
	 */
	private Menu_Entry Lifting_Stats = new Menu_Entry("Lifting Stats");

	/**Constructor that builds the Menu interface for #Fitness.
	 */
	public Fitness() {
		super("Fitness Dashboard");
		AddMenu_Entry(Editor);
		AddMenu_Entry(Display_Caloric);
		AddMenu_Entry(Basal_Metabolic);
	       	AddMenu_Entry(FFMI);
		AddMenu_Entry(VO2_Max);
		AddMenu_Entry(BMI);
		AddMenu_Entry(Lifting_Stats);
	}
	/**Accesses the objects of #Fitness, and does
	 * calculations on the fly.
	 * @param	choice	Selects which object to access
	 * 			or return a value to the user.
	 * @param	z	#UserData that should be used 
	 * 			for calculations.
	 */
	public void SelectMenu(int choice, UserData z) {
		Editor a = new Editor();
		UserData_Calc b = new UserData_Calc(z);
		Lifting_Standards c = new Lifting_Standards();
		switch (choice) {
			case 1:	a.Menu_Main(z);
				break;
			case 2:	System.out.println(b.GetDC());
				break;
			case 3:	System.out.println(b.GetBM());
				break;
			case 4:	System.out.println(b.GetFFMI());
				break;
			case 5: System.out.println(b.GetVO2_Max());
				break;
			case 6: System.out.println(b.GetBMI());
				break;
<<<<<<< HEAD:src/Menu/Fitness.java
			case 7:	c.Menu_Main(z);
=======
			case 7:	System.out.println();
>>>>>>> master:src/lib/menu/Fitness.java
				break;
		}
	}
}
