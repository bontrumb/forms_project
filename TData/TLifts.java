abstract class TLifts extends TInt
{
	private Weight weight;
	public TLifts(String Type) {
		super("Lifts over Time",Type, "reps.");
		weight = new Weight();
	}
	// weight methods
	public double GetWeight() {
		return (double) weight.GetEntry();
	}
	public String GetWeightUnits() {
		return weight.GetUnits();
	}
	public void SetWeight(double o) {
		this.weight.SE(o);
	}
}

