/**The class that holds Deadlifts data.
 */
public class Deadlifts extends Lifts
{
	/**Constructor with null values in both reps
	 * and weight.
	 */
	public Deadlifts() {
		super("Deadlifts");
	}
	/**Constructor with a defined reps value.
	 * @param	o	The value of the reps.
	 */
	public Deadlifts(int o) {
		super(o, "Deadlifts");
	}
	/**Constructor with a defined reps value,
	 * and a weight value.
	 * @param	o	The value of the reps.
	 * @param	p	The value of the weight.
	 */
	public Deadlifts(int o, double p) {
		super(o, p, "Deadlifts");
	}
}
