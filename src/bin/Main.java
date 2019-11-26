/**The main class that runs the TUI.
 */
public class Main
{
	/**Main object that is run at runtime.
	 * Maybe might take in user data if needed.
	 */
	public static void main(String[] args) {
		UserData z = new UserData();
		Profiler q = new Profiler(z);
		Home a = new Home();
		a.Menu_Main(z);
	}
}
