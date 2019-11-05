public class TDummy {
	private TSquats tsquats;
	// constructor
	public TDummy() {
		tsquats = new TSquats();
	}
	//
	public void ASquats(Object o) {
		String v = "" + o;
		tsquats.AE(v);
	}
	public void GVSquats(int choice) {
		Object ret = tsquats.GetValue(choice);
		System.out.println(ret);
	}

}

