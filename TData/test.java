public class test
{
	public static void main(String[] args) {
		TWeight m = new TWeight();
		TLifts_Benches q = new TLifts_Benches();
		m.AddEntry(100);
		m.AddEntry(200);
		m.AddEntry(300);
		System.out.println(m.GetData(0));
		System.out.println(m.GetAll());
		q.AddEntry(1);
		q.AddEntry(2);
		q.AddEntry(12, 500);
		System.out.println(q.GetAll());
		TWeight r = new TWeight(m);
		System.out.println(r.GetAll());
	}
}
