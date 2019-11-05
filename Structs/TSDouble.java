abstract class TSDouble extends TStruct
{
	private TSEDouble heap;
	// constructor
	public TSDouble(String Type, String Units) {
		super(Type, Units);
	}
	// validation check
	protected boolean AE(Object o) {
		if (CT(o) && CC(o) && COT(o)) {
			super.AddEntry(this.heap);
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
