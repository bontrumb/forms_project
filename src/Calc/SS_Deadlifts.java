public class SS_Deadlifts extends SS_Abstract
{
	// constructor
	public SS_Deadlifts(UserData z) {
		super(z, "Deadlifts"); 
	}
	// main SS method
	protected Object SSMethod(int RepWeight, String gender, int bodyweight_lbs) {
		System.out.println(RepWeight + " " + gender + " " + bodyweight_lbs);
		return 1 + 1;
	}

}
