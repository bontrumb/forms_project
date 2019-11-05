abstract class TLifts extends TSInt
{
	Weight weight;
	public TLifts(String Type) {
		super(Type, "reps.");
		weight = new Weight();
	}
	public TLifts(double p, String Type) {
		super(Type, "reps.");
		weight = new Weight(p);
	}
	// get weight
	public double GetWeight() {
		return (double) weight.GetEntry();
	}
	public String GetWeightUnits() {
		return (String) weight.GetUnits();
	}
	// set weight
	protected void SetWeight(Object o) {
		weight.SetEntry(o);
	}
	// set entries for lifts
	public boolean AddEntry(Object o) {
		return super.AE(o);
	}
}
