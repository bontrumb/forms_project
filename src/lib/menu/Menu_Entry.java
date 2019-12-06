package menu;

/**Class that provides the entry data structure.
 */
public class Menu_Entry{
	/**The name of the current entry.
	 */
	private String Entry;
	/**Constructor that builds the current entry.
	 */
	public Menu_Entry(String Entry) {
		this.Entry = Entry;
	}
	// get methods
	/**Gets the value of the #Entry.
	 * @return	#Menu_Entry.Entry
	 */
	public String GetMenu_Entry() {
		return this.Entry;
	}
}
