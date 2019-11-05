import java.util.ArrayList;

public class TUserData
{
	// TLifts
	private TBenches l1 = new TBenches();
	private TDeadlifts l2 = new TDeadlifts();
	private TSquats l3 = new TSquats();
	private TStruct[] List_TLifts = {l1, l2, l3};
	// TSDouble
	private TWeight d1 = new TWeight();
	// other
	private boolean UserNew = false;
	// data array
	private ArrayList<TStruct> ArrayData = new ArrayList<TStruct>();
	// constructor
	public TUserData() {
		Init_Data();
	}
	// get methods
	protected ArrayList<TStruct> GetData() {
		return this.ArrayData;
	}
	public TStruct GetData_Var(int choice) {
		return this.GetData().get(choice);
	}
	// local level
	protected Object GetData_Entry(String target) {
		Object obj = new Object();
		int i = SearchData_Type(target);
		if (BoolData_Type(i)) {
			obj = GetData_Entry(i);
		}
		return obj;
	}
}
