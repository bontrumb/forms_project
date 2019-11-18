import java.util.ArrayList;
public class TUserData
{
	// TLifts
	private TLifts_Benches tl1;
	private TLifts_Deadlifts tl2;
	private TLifts_Squats tl3;
	private TStruct[] List_TLifts = {tl1, tl2, tl3};
	// TDouble
	private TWeight td1;
	private TStruct[] List_TDouble = {td1};
	// master array
	private ArrayList<TStruct> ArrayData = new ArrayList<TStruct>();
	// lock
	private boolean UserNew = false;
	// constructor
	public TUserData() {
		Init_Data();
	}
	public TUserData(TUserData ToCopy) {
		;
	}
	// get array
	
	// init data
	private void Init_Data() {
		for (TStruct o : List_TLifts) {
			this.ArrayData.add(o);
		}
		for (TStruct o : List_TDouble) {
			this.ArrayData.add(o);
		}
		this.UserNew = true;
	}
}
