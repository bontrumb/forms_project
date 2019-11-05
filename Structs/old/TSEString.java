abstract class TSEString extends TStruct_Entry
{
	protected SString heap;
	// constructor
	public TSEString(String Type, String Units) {
		super(Type, Units);
	}
	// validation methods
	protected boolean SE(Object o) {
		if (CT(o) && CC(o) && COT(o)) {
			super.SetEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}

	protected boolean CC(Object o) {
		return true;
	}
	protected boolean CT(Object o) {
		return this.heap.SE(o);
	}
}
