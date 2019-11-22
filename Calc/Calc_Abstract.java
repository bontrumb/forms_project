/**Contains abstract methods to calculate and return
 * calculations.
 * It is a subclass of #Struct.
 */
abstract class Calc_Abstract extends Struct
{
	/**Calls #UserData_Tools to get values
	 * of the #UserData.
	 */
	private UserData_Tools x;
	/**Temporary heap for calculations.
	 */
	protected Object heap;
	/**Initializes #Calc_Abstract with the #UserData.
	 * @param	z	User's data.
	 * @param	Type	The type of the calculation.
	 * @param	Units	The units of the calculation.
	 */
	public Calc_Abstract(UserData z, String Type, String Units) {
		super(Type, Units);
		this.x = new UserData_Tools(z);
		Calc();
	}
	/**Returns the value of the calculation.
	 * @return	#Struct.GetEntry
	 */
	public Object Result() {
		return GetEntry();
	}
	/**Abstract class to force a method for calculation.
	 * Uses the #UserData_Tools for accessing the values
	 * for calculation.
	 * @param	use	Data to use.
	 */
	abstract Object Method(UserData_Tools use);
	/**Runs the methods for calculations.
	 */
	private void Calc() {
		UserData_Tools use = this.x;
		SE(Method(use));
	}
	/**@see #Struct.SE
	 */
	public boolean SE(Object o) {
		if (CT(o) && CC(o) && COT(o)) {
			super.SetEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}
	/**@see #Struct.CC
	 */
	protected boolean CC(Object o) {
		return true;
	}
	/**Checks if the object for input is valid for entry.
	 * @see #Struct.CT
	 */
	protected boolean CT(Object o) {
		try {
			this.heap = o;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
