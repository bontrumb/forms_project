import java.util.Date;
import java.util.ArrayList;

abstract class TStruct extends Struct
{
	// constructor
	public TStruct(ArrayList<TStruct_Entry> a, String Type, String Units) {
		super(a, Type, Units);
	}
	/*
	public TStruct(Struct o, String Type, String Units) {
		super(Type, Units);
		super.SetEntry(InitArray());
		AddEntry(o);
	}
	*/
	public TStruct(String Type, String Units) {
		super(Type, Units);
		super.SetEntry(InitArray());
	}
	// get methods
	public ArrayList<TStruct_Entry> GetArray() {
		return (ArrayList<TStruct_Entry>) super.GetEntry();
	}
	//@Override # might not be needed....
	public Struct GetEntry(int choice) {
		return GetArray().get(choice).GetEntry();
	}
	public Date GetDate(int choice) {
		return GetArray().get(choice).GetDate();
	}
	// add methods
	protected void AddEntry(TStruct_Entry NewEntry) {
		GetArray().add(NewEntry);
	}
	// init methods
	private ArrayList<TStruct_Entry> InitArray() {
		ArrayList<TStruct_Entry> NewTStruct = new ArrayList<TStruct_Entry>();
		return NewTStruct;
	}
	// validation methods
	// SE, CC, CT, COT methods are passed through elsewhere....
}
