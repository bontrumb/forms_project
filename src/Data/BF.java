/**The class that holds BF data.
 */
public class BF extends SDouble
{
	/**Constructor with a null value.
	 */
	public BF() {
		super("Body Fat", "%");
	}
	/**Constructor with a defined value.
	 * @param	o	The value of the class.
	 */
	public BF(double o) {
		super(o, "Body Fat", "%");
	}
}
