package structs;

/**The class that holds String-typed data.
 */
public abstract class SString extends Struct
{
	/**Temporary storage for containing String values.
	 * Assumes that anything that is a subclass of String
	 * can be casted here.
	 */
	protected String heap;
	/**Initializes #SString with default value null.
	 * @param	Type	The type of String.
	 * @param	Units	Not typically used for the class.
	 */
	public SString(String Type, String Units) {
		super(Type, Units);
	}
	/**Initializes #SString with a defined value.
	 * @param	o	The defined value for the class.
	 * @param	Type	The type of String.
	 * @param	Units	Not typically used for the class.
	 */
	public SString(String o, String Type, String Units) {
		super(o, Type, Units);
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
	public boolean CC(Object o) {
		return true;
	}
	/**Returns whether an object is a String or not.
	 * @param    o    The object to be tested if
	 * 			it is a String.
	 * @see	#Struct.CT
	 */
	public boolean CT(Object o) {
		try {
			this.heap = (String) o;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
