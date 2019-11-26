import java.util.Scanner;

abstract class SS_Abstract extends Calc_Abstract
{
	protected int RepWeight;
	protected String gender;
	protected int bodyweight_lbs;
	protected UserData_Tools use = super.x;
	// constructor
	public SS_Abstract(UserData z, String Type) {
		super(z, Type, "");
		this.gender = (String) use.Get("Gender");
		this.bodyweight_lbs = (int) ((double) use.Get("Weight"));
	}
	// return value
	public String Result() {
		if (Scan()) {
			Calc();
			return (String) GetEntry();
		} else {
			return "Cannot get data.";
		}
	}
	// scanner
	private boolean Scan() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter your average weight per rep.");
			RepWeight = input.nextInt();
			return true;
		} catch (Exception e) {
			System.out.println("Invalid input.");
			input.next();
			return false;
		}
	}
	// base method
	protected Object Method(UserData_Tools use) {
		Object b = SSMethod(RepWeight, gender, bodyweight_lbs);
		if (b instanceof Integer) {
			return Integer.toString((int) b);
		} else if (b instanceof Double) {
			return Double.toString((double) b);
		} else {
			return (String) b;
		}
	}
	// SS method
	abstract Object SSMethod(int RepWeight, String gender, int weight);
}
