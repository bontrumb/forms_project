package data;

/**The class that holds Benches data.
 */
public class Benches extends Lifts
{
	/**Constructor with null values both in reps
	 * and weight.
	 */
	public Benches() {
		super("Benches");
	}
	/**Constructor with a defined reps value.
	 * @param	o	The value of the reps.
	 */
	public Benches(int o) {
		super(o, "Benches");
	}
	/**Constructor with a defined reps value,
	 * and a weight value.
	 * @param	o	The value of the reps.
	 * @param	p	The value of the weight.
	 */
	public Benches(int o, double p) {
		super(o, p, "Benches");
	}
}
