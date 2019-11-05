public class TString extends TStruct
{
	// constructor
	public TString(String Title, String Type, String Units) {
		super(Title, Type, Units);
	}
	// add entry
	protected boolean AddEntry(Object o) {
		TEString ToAdd = new TEString(GetType(), GetTitle());
		if (ToAdd.SetData(o)) {
			GetArray().add(ToAdd);
			return true;
		} else {
			System.out.println("Cannot add entry...");
			return false;
		}
	}
	// set methods
	public String GetData(int choice) {
		return (String) super.GetData_Entry(choice);
	}
}
