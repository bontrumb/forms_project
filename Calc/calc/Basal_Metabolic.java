package calc;

import data.UserData;
import data.UserDataIndex;
import data.UserData_Tools;

/**Calculates and returns Basal Metabolic values.
 */
public class Basal_Metabolic extends Calc_Abstract
{
	/**Constructor for the class that uses #UserData.
	 * @param	z	User's data.
	 */
	public Basal_Metabolic(UserData z) {
		super(z, "Basal Metabolic", "");
	}
	/**The body of the calculations.
	 * @param	use	Instance of using the user's values
	 * 			to calculate the value of the class.
	 * Women BMR = 655 + (9.6 X weight in kg) + (1.8 x height in cm) – (4.7 x age in yrs)
	 * Men BMR = 66 + (13.7 X weight in kg) + (5 x height in cm) – (6.8 x age in yrs)
	 */
	protected Object Method(UserData_Tools use) {
		//assume everyone has age 20
		if(use.GetDataEntry(UserDataIndex.GENDER).toString().equals("M")){
			return 66 + 13.7*(double)use.GetDataEntry(UserDataIndex.WEIGHT)/2.2 + 5*(double)use.GetDataEntry(UserDataIndex.HEIGHT)*30.48 - 6.8*20;
		}else{
			return 655 + 9.6*(double)use.GetDataEntry(UserDataIndex.WEIGHT)/2.2 + 1.8*(double)use.GetDataEntry(UserDataIndex.HEIGHT)*30.48 - 4.7*20;
		}
	}
}
