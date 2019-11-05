import java.util.Date;
abstract class TStruct_Entry extends Struct
{
	private Date Struct_Date;
	// constructor
	public TStruct_Entry(String Type, String Units) {
		super(Type, Units);
		SetDate();
	}
	// get methods
	public Date GetDate() {
		return this.Struct_Date;
	}
	public Object[] GetTEntry() {
		Object[] ToGet = {GetDate(), super.GetEntry()};
		return ToGet;
	}
	// set methods
	private void SetDate() {
		if (!(GetLock())) {
			this.Struct_Date = new Date();
		}
	}
}
