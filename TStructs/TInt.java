public class TInt extends TStruct
{
	// constructor
	public TInt(String Title, String Type, String Units) {
		super(Title, Type, Units);
	}
	public TInt(TInt ToCopy) {
		super(ToCopy);
	}
	// add entry
	protected boolean AddEntry(Object o) {
		TEInt ToAdd = new TEInt(GetType(), GetUnits());
		if (ToAdd.SetData(o)) {
			GetArray().add(ToAdd);
			return true;
		} else {
			System.out.println("Cannot add entry...");
			return false;
		}
	}
	// set methods
	public int GetData(int choice) {
		Object temp = super.GetData_Entry(choice);
		Number temp1 = (Number) temp;
		return temp1.intValue();
	}
}
