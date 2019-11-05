public class test
{
	public static void main(String[] args) {
		TInt m = new TInt("Weight over Time", "Weight", "lbs.");
		m.AddEntry(100);
		String te = "" + m.GetData(0) + " " + m.GetDate(0);
		System.out.println(te);
		m.AddEntry("asdf");
		m.AddEntry(200);
		/*if (m.GetData(0) instanceof Integer) {
			System.out.println(m.GetData(0) + " is an integer ");
		} else {
			System.out.println(m.GetData(0) + " is not an integer ");
		}
		*/
		System.out.println(m.GetData(0) + m.GetData(1));
	}
}
