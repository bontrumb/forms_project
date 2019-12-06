package menu;
import calc.*;
import data.UserData;

public class Lifting_Stats extends Menu_Abstract
{
	private Menu_Entry BarbellCurl = new Menu_Entry("Barbell Curl");
	private Menu_Entry BenchPress = new Menu_Entry("Bench Press");
	private Menu_Entry Deadlift = new Menu_Entry("Deadlift");
	private Menu_Entry ShoulderPress = new Menu_Entry("Shoulder Press");
	private Menu_Entry Squat = new Menu_Entry("Squat");
	public Lifting_Stats() {
		super("Lifting Stats");
		AddMenu_Entry(BarbellCurl);
		AddMenu_Entry(BenchPress);
		AddMenu_Entry(Deadlift);
		AddMenu_Entry(ShoulderPress);
		AddMenu_Entry(Squat);
	}
	public void SelectMenu(int choice, UserData z) {
		UserData_Calc b = new UserData_Calc(z);
		switch (choice) {
			case 1:	System.out.println(b.GetBC());
				break;
			case 2:	System.out.println(b.GetBP());
				break;
			case 3: System.out.println(b.GetDL());
				break;
			case 4: System.out.println(b.GetSP());
				break;
			case 5: System.out.println(b.GetSQ());
				break;
		}
	}
}
