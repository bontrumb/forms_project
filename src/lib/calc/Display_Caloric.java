package calc;

import data.UserData;
import data.UserDataIndex;
import data.UserData_Tools;
import java.lang.NullPointerException;

/**Calculates and returns Display Caloric values.
 */
public class Display_Caloric extends Calc_Abstract
{
	/**Constructor for the class that uses #UserData.
	 * @param	z	User's data.
	 */
	public Display_Caloric(UserData z) {
		super(z, "Display Caloric", "");
	}
	/**The body of the calculations.
	 * @param	use	Instance of using the user's values
	 * 			to calculate the value of the class.
	 *
	 * Daily Calorie Requirement = BMR * Activity Factor
	 * Sedentary (little to no exercise + work a desk job) = 1.2
	 * Lightly Active (light exercise 1-3 days / week) = 1.375
	 * Moderately Active (moderate exercise 3-5 days / week) = 1.55
	 * Very Active (heavy exercise 6-7 days / week) = 1.725
	 * Extremely Active (very heavy exercise, hard labor job, training 2x / day) = 1.9
	 */
	protected Object Method(UserData_Tools use) {
		double BMR;
		//assume everyone has age 20
		try {
			if (use.GetDataEntry(UserDataIndex.GENDER).toString().equals("M")) {
				BMR = 66 + 13.7*(double)use.GetDataEntry(UserDataIndex.WEIGHT)/2.2 + 5*(double)use.GetDataEntry(UserDataIndex.HEIGHT)*30.48 - 6.8*20;
			} else {
				BMR = 655 + 9.6*(double)use.GetDataEntry(UserDataIndex.WEIGHT)/2.2 + 1.8*(double)use.GetDataEntry(UserDataIndex.HEIGHT)*30.48 - 4.7*20;
			}
			return BMR * (double)use.GetDataEntry(UserDataIndex.ACTIVITY_LEVEL);
		} catch (NullPointerException e) {
			return "Did you forget to set your Activity Level?";
		}
	}
}
