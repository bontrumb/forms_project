public class Profiler
{
	private UserData_Tools use;
	// constructor
	public Profiler(UserData z) {
		this.use = new UserData_Tools(z);
		if (z.IsUserNew()) {
			Profiler_Method();
		}
	}
	// main method
	private void Profiler_Method() {
		String[] To_Init = {"Weight", "Height", "Gender"};
		boolean proceed;
		for (String o : To_Init) {
			String units = use.GetUnits(o);
			if (!units.equals("")) {
				units = " (" + units + ")";
			}
			System.out.println("Enter your " + o + units + ".");
			use.Set_Interactive(o);
		}
	}
}
	
