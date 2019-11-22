public class SS_Squats extends SS_Abstract
{
	// constructor
	public SS_Squats(UserData z) {
		super(z, "Squats"); 
	}
	// main SS method
	protected Object SSMethod(int RepWeight, String gender, int bodyweight_lbs) {
		System.out.println(RepWeight + " " + gender + " " + bodyweight_lbs);
		return 1 + 1;
	}

}
