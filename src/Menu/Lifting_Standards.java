public class Lifting_Standards extends Menu_Abstract
{
	private Menu_Entry BarbellCurl = new Menu_Entry("Barbell Curl");
	private Menu_Entry BenchPress = new Menu_Entry("Bench Press");
	private Menu_Entry Deadlift = new Menu_Entry("Deadlift");
	private Menu_Entry ShoulderPress = new Menu_Entry("Shoulder Press");
	private Menu_Entry Squats = new Menu_Entry("Squats");
	// constructor
	public Lifting_Standards() {
		super("Lifting Standards Menu");
		AddMenu_Entry(BarbellCurl);
		AddMenu_Entry(BenchPress);
		AddMenu_Entry(Deadlift);
		AddMenu_Entry(ShoulderPress);
		AddMenu_Entry(Squats);
	}
	public void SelectMenu(int choice, UserData z) {
		UserData_Calc a = new UserData_Calc(z);
		System.out.println(a.GetLS(choice));
	}
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
