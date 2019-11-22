import java.util.ArrayList;
import java.util.Date;
abstract class TStruct {
	private String TStruct_Title = "";
	private String TStruct_Type;
	private String TStruct_Units;
	private ArrayList<TStruct_Entry> TStruct_Array = new ArrayList<TStruct_Entry>();
	// constructor
	public TStruct(String Title, String Type, String Units) {
		SetTitle(Title);
		SetType(Type);
		SetUnits(Units);
	}
	public TStruct(TStruct ToCopy) {
		SetTitle(ToCopy.GetTitle());
		SetType(ToCopy.GetType());
		SetUnits(ToCopy.GetUnits());
		for (TStruct_Entry o : ToCopy.GetArray()) {
			this.GetArray().add(o);
		}
	}
	// get methods
	public ArrayList<TStruct_Entry> GetArray() {
		return this.TStruct_Array;
	}
	public String GetTitle() {
		return this.TStruct_Title;
	}
	public String GetType() {
		return this.TStruct_Type;
	}
	public String GetUnits() {
		return this.TStruct_Units;
	}
	// TStruct_Entry get methods
	public TStruct_Entry GetEntry(int choice) {
		return this.GetArray().get(choice);
	}
	public Object GetData_Entry(int choice) {
		Object test = this.GetEntry(choice).GetData();
		/*
		if (test instanceof Integer) {
			return (int) test;
		} else if (test instanceof Double) {
			return (double) test;
		} else if (test instanceof String) {
			return (String) test;
		} else {
			return (Object) test;
		}
		*/
		return test;
	}
	public Date GetDate(int choice) {
		return this.GetEntry(choice).GetDate();
	}
	public String GetEntry_One(int choice) {
		String s1 = "" + GetData_Entry(choice);
		String s2 = " " + GetUnits();
		String ToGet = s1 + s2;
		return ToGet;
	}
	public String GetAll() {
		String StringedArray = "";
		int i;
		StringedArray += GetTitle() + "\n";
		System.out.println(GetArray().size());
		for (i = 0; i < GetArray().size(); i++) {
			StringedArray += GetEntry_One(i) + "\t" + GetDate(i) + "\n";
		}
		return StringedArray;
	}
	// add methods
	abstract boolean AddEntry(Object o);
	/*
	public void AddEntry(Object o) {
		TStruct_Entry ToAdd = new TStruct_Entry(o, GetType(), GetUnits());
		GetArray().add(ToAdd);
	}
	*/
	// set methods
	private void SetTitle(String Title) {
		this.TStruct_Title = Title;
	}
	private void SetType(String Type) {
		this.TStruct_Type = Type;
	}
	private void SetUnits(String Units) {
		this.TStruct_Units = Units;
	}
}
