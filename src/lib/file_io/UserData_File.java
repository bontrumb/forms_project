package file_io;
import java.io.*;
import java.util.Scanner;
import data.*;
public class UserData_File
{
	public static boolean SetData(String ToAccess, UserData toTransfer) {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream(
						"users/" + ToAccess));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file. Looks like it does not exist.");
			return false;
		}
		UserData_Tools toUse = new UserData_Tools(toTransfer);
		boolean a, b, c, d;
		a = toUse.Set("Info", inputStream.nextLine());
		b = toUse.Set("Gender", inputStream.nextLine());
		c = toUse.Set("Weight", inputStream.nextLine());
		d = toUse.Set("Height", inputStream.nextLine());
		inputStream.close();
		return a && b && c && d;
	}
	public static boolean SaveData(UserData toTransfer) {
		UserData_Tools toUse = new UserData_Tools(toTransfer);
		if (toUse.Get("Info") == null) {
			return false;
		}
		String FileName = "users/" + ((String) toUse.Get("Info")) + ".txt";
		PrintWriter output = null;
		try {
			output = new PrintWriter(FileName);
		} catch (Exception e) {
			//System.out.println("Cannot write to file...");
			return false;
		}
		output.println((String) toUse.Get("Info"));
		output.println((String) toUse.Get("Gender"));
		//output.println("");
		output.println((double) toUse.Get("Weight"));
		output.println((double) toUse.Get("Height"));
		output.close();
		System.out.println("Successfully wrote to " + FileName);
		return true;
	}
}

