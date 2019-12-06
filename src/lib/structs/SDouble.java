package structs;

/**The class that holds Double-typed data.
 */
public abstract class SDouble extends Struct
{
	/**Temporary storage for containing Double values.
	 */
	protected double heap;
	/**Initializes #SDouble with default value null.
	 * @param	Type	The type of double.
	 * @param	Units	The units of the type.
	 */
	public SDouble(String Type, String Units) {
		super(Type, Units);
	}
	/**Initializes #SDouble with a defined value.
	 * @param	o	The defined value for the class.
	 * @param	Type	The type of double.
	 * @param	Units	The units of the type.
	 */
	public SDouble(double o, String Type, String Units) {
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
	/**Returns whether the object is positive or not.
	 * @see	#Struct.CC
	 */
	public boolean CC(Object o) {
		return (IsPositive(heap));
	}
	/**Returns whether an object is a double or not.
	 * \note
	 * May losslessly take any int values.
	 * @see	#Struct.CT
	 */
	public boolean CT(Object o) {
		try {
			this.heap = Double.parseDouble((String) o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
