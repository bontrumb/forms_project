public class test
{
	public static void main(String[] args) {
		TWeight m = new TWeight();
		m.AddEntry(100);
		System.out.println(m.GetData(0));
		System.out.println(m.GetAll());
	}
}
