package tests;
import structs.*;
import data.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class dataTest {
	private Weight W = new Weight();
	private double delta = 0.0000001;
	@Test
	public void CheckNull() {
		assertNull(W.GetEntry());
	}
	@Test
	public void CheckSE() {
		assertTrue(W.SE(((Object) 100).toString()));
		assertTrue((W.GetEntry() instanceof Double));
	}
	@Test
	public void CheckInvalidSE() {
		assertFalse(W.SE(100));
		assertFalse((W.GetEntry() instanceof Double));
	}
	@Test
	public void CheckType() {
		assertEquals("Weight", W.GetType());
		assertNotEquals("weight", W.GetType());
	}
	@Test
	public void CheckNegativeSE() {
		assertFalse(W.SE(((Object) (-100)).toString()));
	}
	@Test
	public void CheckUnits() {
		assertEquals("lbs.", W.GetUnits());
	}
	private Gender G = new Gender();
	@Test
	public void GCheckSE() {
		assertTrue(G.SE("M"));
		assertFalse(G.SE("q"));
	}
	@Test
	public void GCheckGet() {
		assertEquals(G.GetEntry(), null);
	}
	/*--Testing UserData--*/
	private UserData U = new UserData();
	@Test
	public void UCheckNotNull() {
		assertNotNull(U.GetData());
	}
	@Test
	public void UCatchException() {
		boolean a = false;
		try {
			U.GetData_Var(-1);
		} catch (Exception e) {
			a = true;
		}
		if (!a) {
			fail();
		}
	}
	@Test
	public void UStringNonEmpty() {
		assertNotNull(U.GetData_List());
	}
	private UserData_Tools UDT = new UserData_Tools(U);
	@Test
	public void UDTCheckNotNull() {
		assertNotNull(UDT.GetData());
	}
	@Test
	public void UDTSearchUnits() {
		assertEquals("lbs.",UDT.GetUnits("Weight"));
	}
	@Test
	public void UDTSet() {
		assertTrue(UDT.Set("Weight", 200));
		assertFalse(UDT.Set("Weight", -100));
	}

}
