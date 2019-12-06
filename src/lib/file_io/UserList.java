package file_io;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class UserList
{
	private static String pathname = "users";
	public static ArrayList<String> GetUserList() {
		ArrayList<String> p = new ArrayList<String>();
		File dir = new File(pathname);
		String[] q = dir.list();
		for (String o : q) {
			p.add(o);
		}
		return p;
	}
}


