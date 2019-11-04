import java.util.ArrayList;
abstract class TSString extends TStruct
{
	protected SString heap;
	// constructor
	public TSString(String Type, String Units) {
		super(Type, Units);
	}
	public TSString(SString o, String Type, String Units) {
		super(o, Type, Units);
	}
	public TSString(ArrayList<TStruct_Entry> a, String Type,
			String Units) {
		super(a, Type, Units);
	}
	// validation methods
	protected boolean SE(Object o) {
		if (CT(o) && CC(o) && COT(o)) {
			super.AddEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}
	protected boolean CC(Object o) {
		return false;
	}
	protected boolean CT(Object o) {
		return this.heap.SE(o);
	}
}

