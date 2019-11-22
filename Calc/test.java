public class test
{
	public static void main(String[] args) {
		UserData a = new UserData();
		UserData_Tools b = new UserData_Tools(a);
		// System.out.println(c.Result(0));
		b.Set("Gender", "M");
		b.Set("Weight", 150);
		System.out.println(b.Get("Gender"));
		System.out.println(b.Get("Weight"));
		System.out.println(a.GetData_Entry("Weight"));
		Lifting_Stats c = new Lifting_Stats(a);
		System.out.println(c.Result(0));
	}
}
