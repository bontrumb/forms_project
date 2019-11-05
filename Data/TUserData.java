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
	private TStruct[] List_TSDouble = {d1};
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
	// stringed Get
	// string returns
	// set methods main
	// init methods
	private void Init_Data() {
		for (TStruct o : List_TLifts) {
			this.GetData().add(o);
		}
		for (TStruct o : List_TSDouble) {
			this.GetData().add(o);
		}
	}

}
