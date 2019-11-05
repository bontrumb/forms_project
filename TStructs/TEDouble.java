public class TEDouble extends TStruct_Entry
{
	private double heap;
	public TEDouble(String Type, String Units) {
		super(Type, Units);
	}
	// check methods
	protected boolean ValidCondition(Object o) {
		return true;
	}
	protected boolean ValidType(Object o) {
		try {
			String temp = "" + o;
			this.heap = Double.parseDouble(temp);
			return true;
		} catch (Exception e) {
			return true;
		}
	}
}
