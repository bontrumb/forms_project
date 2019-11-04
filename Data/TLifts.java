public class TLifts extends TSInt
{
	Weight weight;
	public TLifts(String Type) {
		super(Type, "reps.");
	}
	public TLifts(int o, String Type) {
		super(o, Type, "reps.");
		weight = new Weight();
	}
	public TLifts(int o, double p, String Type) {
		super(o, Type, "reps.");
		weight = new Weight(p);
	}
	// get weight
	public dobule GetWeight() {
		return (double) weight.GetEntry();
	}
	public String GetWeightUnits() {
		return (String) weight.GetUnits();
	}
	// set weight
	protected void SetWeight(Object o) {
		weight.SetEntry(o);
	}
}
