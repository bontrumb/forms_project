public class TDouble extends TStruct
{
	// constructor
	public TDouble(String Title, String Type, String Units) {
		super(Title, Type, Units);
	}
	public TDouble(TDouble ToCopy) {
		super(ToCopy);
	}
	// add entry
	protected boolean AddEntry(Object o) {
		TEDouble ToAdd = new TEDouble(GetType(), GetUnits());
		if (ToAdd.SetData(o)) {
			GetArray().add(ToAdd);
			return true;
		} else {
			System.out.println("Cannot add entry...");
			return false;
		}
	}
	// set methods
	public double GetData(int choice) {
		Object temp = super.GetData_Entry(choice);
		Number temp1 = (Number) temp;
		return temp1.doubleValue();
	}
}
