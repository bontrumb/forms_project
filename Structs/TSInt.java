import java.util.ArrayList;
abstract class TSInt extends TStruct
{
	protected SInt heap;
	// constructor
	public TSInt(String Type, String Units) {
		super(Type, Units);
	}
	public TSInt(SInt o, String Type, String Units) {
		super(o, Type, Units);
	}
	public TSInt(ArrayList<TStruct_Entry> a, String Type
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
	protected CT(Object o) {
		return this.heap.SE(o);
	}
}

