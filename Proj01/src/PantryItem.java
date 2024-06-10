public class PantryItem {
	// Fields to store the properties of a pantry item
	String name;
	int quantity;
	String expiryDate; // We are using a String for simplicity to store the expiry date

	/*
	 * Constructor to initialize a pantry item with a name, quantity, and expire
	 * Date Starting with the name of the item The quantity of the item in stock And
	 * The expiry date of the item
	 */
	public PantryItem(String name, int quantity, String expiryDate) {
		this.name = name;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
	}
}