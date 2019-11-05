/** Provides the foundational DataType and primitive methods for all various inputs.
 * Includes get, set, and check methods for its objects.
 */
abstract class Struct
{
	/**Stores various forms of data.
	 */
	private Object Struct_Entry = null;
	/**Stores the type of data of #Struct_Entry.
	 * E.g. Weight, Height, etc.
	 */
	private String Struct_Type = "";
	/**Stores the units of the data of #Struct_Entry.
	 * E.g. If #Struct_Type is Weight, then 
	 * #Struct_Units is lbs.
	 */
	private String Struct_Units = "";
	/**Locks #Struct_Type and #Struct_Units from 
	 * modification after initialization of #Struct.
	 */
	private boolean Struct_Lock = false;
	// constructor
	/**Constructor that provides only a null Object.
	 * @param	Type	The type of object.
	 * @param	Value	How the object is measured.
	 */
	public Struct(String Type, String Units) {
		SetType(Type);
		SetUnits(Units);
		SetLock();
	}
	/**Constructor that intializes #Struct with a value.
	 * @param	Value	The value of the object.
	 * @param	Type	The type of object.
	 * @param	Units	How the object is measured.
	 */
	public Struct(Object Value, String Type, String Units) {
		SetEntry(Value);
		SetType(Type);
		SetUnits(Units);
	}
	// get methods
	/**Gets the value of #Struct_Entry.
	 * @return	#Struct_Entry
	 */
	public Object GetEntry() {
		return this.Struct_Entry;
	}
	/**Gets the value of #Struct_Type.
	 * @return	#Struct_Type
	 */
	public String GetType() {
		return this.Struct_Type;
	}
	/**Gets the value of #Struct_Units.
	 * @return	#Struct_Units
	 */
	public String GetUnits() {
		return this.Struct_Units;
	}
	/**Gets the value of #Struct_Lock.
	 * Used for confirming that there is no modification
	 * to the #Struct_Type and #Struct_Units once #Struct 
	 * has been initialized.
	 * @return	#Struct_Lock
	 */
	protected boolean GetLock() {
		return this.Struct_Lock;
	}
	// set methods
	/**Abstract Method to check whether a value to be
	 * entered is valid.
	 * Calls #CC, #COT, and #CT methods to check if the
	 * object is valid for entry.
	 * @param	o	Object to be inputted.
	 * @see		#CC, #COT, #CT
	 */
	abstract boolean SE(Object o);
	/**Sets the value of #Struct_Entry.
	 * @param	o	Object to be inputted.
	 */
	protected void SetEntry(Object o) {
		this.Struct_Entry = o;
	}
	/**Sets the type of #Struct_Type.
	 * Function does not change #Struct_Type after
	 * #Struct has been initialized.
	 * This is made possible by calling #GetLock.
	 * @param	Type	The value of #Struct_Type.
	 */
	private void SetType(String Type) {
		if (!(GetLock())) {
			this.Struct_Type = Type;
		}
	}
	/**Sets the units of #Struct_Units.
	 * Function does not change #Struct_Type after
	 * #Struct has been initialized.
	 * This is made possible by calling #GetLock.
	 * @param	Units	The value of #Struct_Units
	 */
	private void SetUnits(String Units) {
		if (!(GetLock())) {
			this.Struct_Units = Units;
		}
	}
	/**Sets #Struct_Lock to true upon the constructor's 
	 * initialization.
	 */
	private void SetLock() {
		this.Struct_Lock = true;
	}
	// other
	/**Provides a method to return a boolean whether 
	 * an object can be set via #SetEntry under various
	 * conditions.
	 * @see	#CC
	 * @see	#CT
	 * @see	#COT	
	 */
	abstract boolean CC(Object o);
	/**Provides a method to return a boolean whether
	 * the object passes the basic type test.
	 * @param	o	Object to be inspected on.
	 */
	abstract boolean CT(Object o);
	/**Provides a method to return whether the object's
	 * type is valid to be inputted into.
	 * E.g. String cannot go into Double, and vice versa,
	 * so it returns false.
	 *
	 * \note
	 * Lossy type casting may be encountered from Double
	 * to Integer.
	 * \note
	 * Lossless type casting may be encountered from 
	 * Integer to Double.
	 * @param	o	Object to be inspected on other
	 * 			conditions.
	 */
	protected boolean COT(Object o) {
		return true;
	}

	// large class condition types
	/**Checks if object is Positive or is 0.
	 * This assumes that the object is a double.
	 * @param	o	Object to check.
	 */
	protected boolean IsPositive(double o) {
		if (o >= 0) {
			return true;
		} else {
			System.out.println("Value must be 0 or higher...");
			return false;
		}
	}
	/**Checks if object is between 0 and 1 inclusive.
	 * This assumes that the object is a double.
	 * @param	o	Object to check.
	 */
	protected boolean Is0_1(double o) {
		if (o >= 0 && o <= 1) {
			return true;
		} else {
			System.out.println("Value must be between 0 and 1...");
			return false;
		}
	}
	/**Checks if object is not 0. 
	 * Typically used in conjunction with #IsPositive and/or #Is0_1.
	 * @param	o	Object to check.
	 */
	protected boolean IsNot0 (double o) {
		if (o != 0) {
			return true;
		} else {
			System.out.println("Value must not be 0...");
			return false;
		}
	}
}
