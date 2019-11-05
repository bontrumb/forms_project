import java.util.ArrayList;
abstract class TSInt extends TStruct
{
	protected TSEInt heap;
	// constructor
	public TSInt(String Type, String Units) {
		super(Type, Units);
	}
	// validation methods
	protected boolean SE(Object o) {
		if (CT(o) && CC(o) && COT(o)) {
			super.AddEntry(heap);
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
	// init methods
	
}
