package data;

import structs.SString;

/**The class that holds the user's Gender.
 */
public class Gender extends SString
{
	/**Constructor with a null value.
	 */
	public Gender() {
		super("Gender", "M/F");
	}
	/**Constructor with a defined value.
	 */
	public Gender(String o) {
		super(o, "Gender", "M/F");
	}
	// main body check
	/**Checks whether the Gender entry is valid.
	 * @param	o	The string containing the gender.
	 */
	protected boolean COT(Object o) {
		return G1(o);
	}
	/**Checks whether the Gender is male or female,
	 * or returns false if invalid.
	 * @param	o	The string containing the gender.
	 */
	// additional body check
	private boolean G1(Object o) {
		if (heap.equals("M") ||
				heap.equals("F") ||
				heap.equals("m") ||
				heap.equals("f") 
		   ) {
			return true;
		   } else {
			   return false;
		   }
	}

}
