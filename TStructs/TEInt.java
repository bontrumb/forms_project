public class TEInt extends TStruct_Entry
{
	private int heap;
	public TEInt(String Type, String Units) {
		super(Type, Units);
	}
	// check methods
	protected boolean ValidCondition(Object o) {
		return true;
	}
	protected boolean ValidType(Object o) {
		try {
			String temp = "" + o;
			this.heap = Integer.parseInt(temp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
