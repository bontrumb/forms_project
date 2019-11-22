package data;

import structs.SDouble;

/**The class that holds Height data.
 */
public class Height extends SDouble
{
	/**Constructor with a null value.
	 */
	public Height() {
		super("Height", "ft.");
	}
	/**Constructor with a defined value.
	 * @param	o	The value of the class.
	 */
	public Height(double o) {
		super(o, "Height", "ft.");
	}
}
