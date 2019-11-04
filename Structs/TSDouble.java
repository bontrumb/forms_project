import java.util.ArrayList;
abstract class TSDouble extends TStruct
{
	protected SDouble heap;
	// constructor
	public TSDouble(String Type, String Units) {
		super(Type, Units);
	}
	public TSDouble(SDouble o, String Type, String Units) {
		super(o, Type, Units);
	}
	public TSDouble(ArrayList<TStruct_Entry> a, String Type
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
	protected boolean CC(Object) {
		return false;
	}
	protected boolean CT(Object o) {
		return this.heap.SE(o);
	}
}

