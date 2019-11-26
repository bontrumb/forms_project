public class SS_Bench_Presses extends SS_Abstract
{
	// constructor
	public SS_Bench_Presses(UserData z) {
		super(z, "Bench_Presses"); 
	}
	// main SS method
	protected Object SSMethod(int RepWeight, String gender, int bodyweight_lbs) {
		System.out.println(RepWeight + " " + gender + " " + bodyweight_lbs);
		return 1 + 1;
	}

}
