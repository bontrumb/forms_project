public class TEString extends TStruct_Entry
{
	private String heap;
	public TEString(String Type, String Units) {
		super(Type, Units);
	}
	// check methods
	protected boolean ValidCondition(Object o) {
		return true;
	}
	protected boolean ValidType(Object o) {
		try {
			String temp = "" + o;
			this.heap = temp;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
