public class TSEInt extends TStruct_Entry 
{
	private SInt heap;
	// constructor
	public TSEInt(String Type, String Units) {
		super(Type, Units);
		heap = new SInt(GetType(), GetUnits());
	}
	// validation check
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
