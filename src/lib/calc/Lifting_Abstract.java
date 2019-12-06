package calc;

import data.UserData;
import data.Weight;
import data.UserData_Tools;
import data.UserDataIndex;
import java.util.Scanner;

/**Calculates and returns Lifting Stats values.
 */
public abstract class Lifting_Abstract extends Calc_Abstract
{
	private String gender;
	private double weight;
	private Weight rep_weight;
	/**Constructor for the class that uses #UserData.
	 * @param	z	User's data.
	 */
	public Lifting_Abstract(UserData z, String newType) {
		super(z, "Lifting Stats" + newType, "");
	}
	/**The body of the calculations.
	 * @param	use	Instance of using the user's values
	 *			to calculate the value of the class.
	 */
	protected Object Method(UserData_Tools use) {
		this.gender = (String) use.GetDataEntry(UserDataIndex.GENDER);
		this.weight = (double) use.GetDataEntry(UserDataIndex.WEIGHT);
		Scanner GetRepWeight = new Scanner(System.in);
		rep_weight = new Weight();
		double j;
		while (true) {
			try {
				System.out.println("Enter your one-rep max lift"
						+ "(" + rep_weight.GetUnits() +
						")");
				j = GetRepWeight.nextDouble();
				if (rep_weight.SE(j)) {
					break;
				} else {
					System.out.println("Invalid entry");
				}
			} catch (Exception e) {
				System.out.println("Invalid input");
			}
		}
		return WeightMessage(this.gender, this.weight, 
				(double) this.rep_weight.GetEntry());
	}
	private String WeightMessage(String gender, double pweight,
			double prep_weight) {
		int uweight = ((((int) pweight) + 5) / 10) * 10;
		int urep_weight = (int) prep_weight;
		String ngender = gender.toUpperCase();
		String result;
		if (ngender.equals("M")) {
			result = MaleStandard(uweight, urep_weight);
		} else if (ngender.equals("F")) {
			result = FemaleStandard(uweight, urep_weight);
		} else {
			result = "No valid info";
		}
		return result;
	}
	protected abstract String MaleStandard(int weight, int rweight);
	protected abstract String FemaleStandard(int weight, int rweight);
}
