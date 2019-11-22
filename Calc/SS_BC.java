public class SS_BC extends SS_Abstract
{
	// constructor
	public SS_BC(UserData z) {
		super(z, "BC"); 
	}
	// main SS method
	protected Object SSMethod(int RepWeight, String gender, int bodyweight_lbs) {
		System.out.println(RepWeight + " " + gender + " " + bodyweight_lbs);
		return 1 + 1;
	}

}
