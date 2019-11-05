import java.util.Date;
abstract class TStruct_Entry
{
	private Object TStruct_Data = null;
	private String TStruct_Type;
	private String TStruct_Units;
	private Date TStruct_Date;
	// constructor
	public TStruct_Entry(String Type, String Units) {
		SetType(Type);
		SetUnits(Units);
		SetDate();
	}
	public TStruct_Entry(Object o, String Type, String Units) {
		SetData(o);
		SetType(Type);
		SetUnits(Units);
		SetDate();
	}
	// get methods
	public Object GetData() {
		return this.TStruct_Data;
	}
	public String GetType() {
		return this.TStruct_Type;
	}
	public String GetUnits() {
		return this.TStruct_Units;
	}
	public Date GetDate() {
		return this.TStruct_Date;
	}
	// set methods
	protected boolean SetData(Object o) {
		if (ValidType(o) && ValidCondition(o)) {
			this.TStruct_Data = o;
			return true;
		} else {
			return false;
		}
	}

	private void SetType(String Type) {
		this.TStruct_Type = Type;
	}
	private void SetUnits(String Units) {
		this.TStruct_Units = Units;
	}
	private void SetDate() {
		this.TStruct_Date = new Date();
	}
	// check methods
	abstract boolean ValidType(Object o);
	abstract boolean ValidCondition(Object o);
	//abstract boolean IsValidEntry(Object o);
}
