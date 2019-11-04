import java.util.Date;
abstract class TStruct_Entry extends Struct
{
	private Date Struct_Date;
	// constructor
	public TStruct_Entry(Struct o, String Type, String Units) {
		SetDate();
		Object[] ToSet = {o, GetDate()};
		super(ToSet, Type, Units);
	}
	// get methods
	public Date GetDate() {
		return super.GetEntry().get(1);
	}
	public Struct GetEntry() {
		return super.GetEntry().get(0);
	}
	// set methods
	private void SetDate() {
		this.Struct_Date = new Date();
	}
}

