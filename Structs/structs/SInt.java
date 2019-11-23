package structs;

/**The class that holds Integer-typed data.
 */
public abstract class SInt extends Struct
{
	/**Temporary storage for containing Integer values.
	 * Assumes that anything that is a subclass of the 
	 * numbers can be casted here.
	 */
	protected int heap;
	/**Initializes #SInt with default value null.
	 * @param	Type	The type of int.
	 * @param	Units	The units of the type.
	 */
	public SInt(String Type, String Units) {
		super(Type, Units);
	}
	/**Initializes #SInt with a defined value.
	 * @param	o	The defined value for the class.
	 * @param	Type	The type of int.
	 * @param	Units	The units of the type.
	 */
	public SInt(int o, String Type, String Units) {
		super(o, Type, Units);
	}
	/**@see #Struct.SE
	 */
	public boolean SE(Object o) { // class check
		if (CT(o) && CC(o) && COT(o)) {
			super.SetEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}
	/**Returns whether the object is positive or not.
	 * @see #Struct.CC
	 */
	public boolean CC(Object o) { // condition check
		return (IsPositive(heap));
	}
	/**Returns whether an object is an integer or not.
	 * @param    o    The object to be tested if
	 * 			it is an int.
	 * @see	#Struct.CT
	 */
	public boolean CT(Object o) { // type check
		try {
			this.heap = Integer.parseInt((String) o);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
