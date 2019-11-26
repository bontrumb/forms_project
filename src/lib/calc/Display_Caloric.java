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
	 */
	protected Object Method(UserData_Tools use) {
		(String) use.Get("Gender");
		(int) use.Get("Weight");
	}
}
