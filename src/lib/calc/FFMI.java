package calc;

import data.UserData;
import data.UserDataIndex;
import data.UserData_Tools;
import java.lang.NullPointerException;
/**Calculates and returns FFMI values.
 */
public class FFMI extends Calc_Abstract
{
	/**Constructor for the class that uses #UserData.
	 * @param	z	User's data.
	 */
	public FFMI(UserData z) {
		super(z, "FFMI", "");
	}
	/**The body of the calculations.
	 * @param	use	Instance of using the user's values
	 * 			to calculate the value of the class.
	 *
	 *  fat free mass = weight [kg] * (1 - (body fat [%]/ 100))
	 *  FFMI = fat free mass [kg]/ (height [m])²
	 *  normalized FFMI = FFMI [kg/m²] + 6.1 * (1.8 - height [m])
	 */
	protected Object Method(UserData_Tools use) {
		try {
			double fatFreeMass = (double)use.GetDataEntry(UserDataIndex.WEIGHT)/2.2 * (1 - (double)use.GetDataEntry(UserDataIndex.BODY_FAT)/100);
			double FFMI = fatFreeMass/Math.pow((double)use.GetDataEntry(UserDataIndex.HEIGHT)*0.3048,2);
			return FFMI + 6.1 * (1.8 - (double)use.GetDataEntry(UserDataIndex.HEIGHT)*0.3048);
		} catch (NullPointerException e) {
			return "Did you forget to set your body fat?";
		}
	}
}
