package data;

import structs.SInt;

/**The abstract class that defines the lifts,
 * using also the Weight class as an object.
 */
abstract class Lifts extends SInt
{
	/**Define the weight of the reps taken.
	 */
	Weight weight;
	/**Constructor to define the type of exercise.
	 * @param	Type	The type of lifting exercise.
	 */
	public Lifts(String Type) {
		super(Type, "reps.");
		weight = new Weight();
	}
	/**Constructor to define the amount of reps for
	 * the exercise.
	 * @param	o	The amount of reps for the exercise.
	 * @param	Type	The type of lifting exercise.
	 */
	public Lifts(int o, String Type) {
		super(o, Type, "reps.");
		weight = new Weight();
	}
	/**Constructor to define the amount of reps on
	 * a certain weight per exercise.
	 * @param	o	The amount of reps for the exercise.
	 * @param	p	The weight used for the exercise.
	 * @param	Type	The type of lifting exercise.
	 */
	public Lifts(int o, double p, String Type) {
		super(o, Type, "reps.");
		weight = new Weight(p);
	}
	// get weight
	/**Gets the double value of the weight used for the 
	 * exercise.
	 * @return	#weight.GetEntry()
	 */
	public double GetWeight() {
		return (double) weight.GetEntry();
	}
	/**Gets the weight units for the exercise.
	 * @return	#weight.GetUnits()
	 */
	public String GetWeightUnits() {
		return (String) weight.GetUnits();
	}
	// set weight
	/**Sets the weight for the exercise.
	 * @param	o	The weight of the exercise.
	 */
	protected void SetWeight(double o) {
		weight.SetEntry(o);
	}
}
