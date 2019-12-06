package data;

import structs.SString;

/**The class that holds the user's Info.
 */
public class Info extends SString
{
	/**Constructor with a null value.
	 */
	public Info() {
		super("Info", "");
	}
	/**Constructor with a defined value.
	 * @param	o	The value of the class.
	 */
	public Info(String o) {
		super(o, "Info", "");
	}
}
