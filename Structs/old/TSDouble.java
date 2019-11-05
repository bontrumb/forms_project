import java.util.ArrayList;
abstract class TSDouble extends TStruct
{
	protected TSEDouble heap;
	// constructor
	public TSDouble(String Type, String Units) {
		super(Type, Units);
	}
	// validation methods
	protected boolean AE(Object o) {
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
