import java.util.Date;
import java.util.ArrayList;

abstract class TStruct 
{
	private ArrayList<TStruct_Entry> TStruct_Array = new ArrayList<TStruct_Entry>();
	private String TStruct_Type = "";
	private String TStruct_Units = "";
	// constructor
	public TStruct(String Type, String Units) {
		SetType(Type);
		SetUnits(Units);
	}
	// get methods
	public ArrayList<TStruct_Entry> GetArray() {
		return this.TStruct_Array;
	}
	public TStruct_Entry GetEntry(int choice) {
		return this.TStruct_Array.get(choice);
	}
	public Object GetValue(int choice) {
		return this.GetEntry(choice).GetEntry();
	}
	public Date GetDate(int choice) {
		return this.GetEntry(choice).GetDate();
	}
	public String GetType() {
		return this.TStruct_Type;
	}
	public String GetUnits() {
		return this.TStruct_Units;
	}
	// add methods
	protected void AddEntry(TStruct_Entry NewEntry) {
		this.GetArray().add(NewEntry);
	}
	// set methods
	private void SetType(String Type) {
		this.TStruct_Type = Type;
	}
	private void SetUnits(String Units) {
		this.TStruct_Units = Units;
	}
	// validation methods
	// AE, CC, CT, COT methods are passed through elsewhere....
	abstract boolean AE(Object o);
	abstract boolean CC(Object o);
	abstract boolean CT(Object o);

	protected boolean COT(Object o) {
		return true;
	}
}
