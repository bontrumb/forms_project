package file_io;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import data.*;
import structs.Struct;
public class UserData_File
{
	private static String pathname = "users";
	private static File path = new File(pathname);
	public static boolean SetData(String ToAccess, UserData toTransfer) {
		Scanner inputStream = null;
		String TruePath = pathname + "/" + ToAccess;
		try {
			inputStream = new Scanner(new FileInputStream(
						TruePath));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file. Looks like it does not exist.");
			return false;
		}
		UserData_Tools toUse = new UserData_Tools(toTransfer);
		boolean a = true;
		String Type = "";
		Object ToAdd = null;
		while (inputStream.hasNext()) {
			Type = inputStream.nextLine();
			ToAdd = inputStream.nextLine();
			a &= toUse.Set(Type, ToAdd);
		}
		inputStream.close();
		return a;
	}
	public static boolean SaveData(UserData toTransfer) {
		UserData_Tools toUse = new UserData_Tools(toTransfer);
		String temp = "temp";
		if (toUse.Get("Info") != null) {
			temp = toUse.Get("Info").toString();
		}
		if (!path.exists()) {
			path.mkdir();
		}
		String FileName = pathname + "/" + temp + ".txt";
		PrintWriter output = null;
		try {
			output = new PrintWriter(FileName);
		} catch (Exception e) {
			System.out.println("Cannot write to file...");
			return false;
		}
		Object ToGet = new Object();
		String Type = "";
		for (Struct o : toUse.GetData()) {
			Type = o.GetType();
			if (toUse.Get(Type) != null) {
				ToGet = toUse.Get(Type);
				output.println(Type);
				output.println(ToGet);
			}
		}
		output.close();
		System.out.println("Successfully wrote to " + FileName);
		return true;
	}
}

