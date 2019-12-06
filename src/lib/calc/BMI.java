package calc;

import data.UserData;
import data.UserDataIndex;
import data.UserData_Tools;

/**Calculates and returns BMI values.
 */
public class BMI extends Calc_Abstract
{
	/**Constructor for the class that uses #UserData.
	 * @param	z	User's data.
	 */
	public BMI(UserData z) {
		super(z, "BMI", "");
	}
	/**The body of the calculations.
	 * @param	use	Instance of using the user's values
	 * 			to calculate the value of the class.
	 *
	 *  BMI = body weight in kg/ height in m squared
	 */
	protected Object Method(UserData_Tools use) {

		return ((double)use.GetDataEntry(UserDataIndex.WEIGHT)/2.2)/Math.pow((double)use.GetDataEntry(UserDataIndex.HEIGHT)*0.3048,2);
	}
}
