abstract class TLifts extends TInt
{
/*
<<<<<<< HEAD
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

=======
*/
	private TWeight Weight_List;
	private double Weight_Default = 100;
	// constructor
	public TLifts(String LiftType) {
		super("Lifts: " + LiftType, LiftType, "reps.");
		Weight_List = new TWeight();
	}
	public TLifts(TLifts ToCopy, double o) {
		this(ToCopy);
		SetWeight_Default(o);
	}
	public TLifts(TLifts ToCopy) {
		super(ToCopy);
		Weight_List = new TWeight(ToCopy.GetWeight_List());
	}
	// get methods
	public TWeight GetWeight_List() {
		return this.Weight_List;
	}
	public String GetAll() {
		String StringedArray = "";
		int i;
		StringedArray += GetTitle() + "\n";
		for (i = 0; i < GetArray().size(); i++) {
			String s1 = super.GetEntry_One(i);
			String s2 = Weight_List.GetEntry_One(i);
			StringedArray += s2 + "\t" + s1 + "\t" + GetDate(i) + "\n";
		}
		return StringedArray;
	}
	public double GetWeight_Default() {
		return this.Weight_Default;
	}
	// add methods
	public boolean AddEntry(Object o, Object p) {
		if (super.AddEntry(o) && Weight_List.AddEntry(p)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean AddEntry(Object o) {
		return this.AddEntry(o, 100);
	}
	// set methods
	public void SetWeight_Default(double o) {
		this.Weight_Default = o;
	}
}
//>>>>>>> 6f3aed03f34689542c969fed8910d104b4c2fbc8
