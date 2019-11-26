public class SS_Barbell_Curls extends SS_Abstract
{
	// constructor
	public SS_Barbell_Curls(UserData z) {
		super(z, "Barbell_Curls"); 
	}
	// main SS method
	protected Object SSMethod(int RepWeight, String gender, int bodyweight_lbs) {
		System.out.println(RepWeight + " " + gender + " " + bodyweight_lbs);
		return 1 + 1;
	}

}
