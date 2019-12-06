package data;

import structs.SDouble;

/**The class that holds Activity_Level data.
 */
public class Activity_Level extends SDouble
{
	/**Constructor with a null value.
	 */
	public Activity_Level() {
		super("Activity Level", "");
	}
	/**Constructor with a defined value.
	 * @param	o	The value of the class.
	 */
	public Activity_Level(double o) {
		super(o, "Activity Level", "");
	}
}
