package tests;
import file_io.UserData_File;
import data.*;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;

public class file_ioTest
{
	private UserData U = new UserData();
	private UserData_Tools UDT = new UserData_Tools(U);
	private void CleanUp() {
		File usersFolder = new File("users");
		if (usersFolder.exists()) {
			usersFolder.delete();
		}
	}
	@Test
	public void UDTSet() {
		assertTrue(UDT.Set("Weight", 100));
		assertTrue(UDT.Set("Info", "Jamie"));
		assertTrue(UserData_File.SaveData(U));
	}
	@Test
	public void UDTRetrieve() {
		UDTSet();
		UserData V = new UserData();
		assertTrue(UserData_File.SetData("Jamie.txt", V));
		CleanUp();
		File existing = new File("users");
		//assertFalse(existing.exists());
	}
}
