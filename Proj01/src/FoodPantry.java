public class FoodPantry {
	private MyArrayList pantry; // Array list to store the pantry items

	// Constructor initializes the pantry with a new instance of MyArrayList
	public FoodPantry() {
		pantry = new MyArrayList();
	}

	/*
	 * Adds or updates an item in the pantry and if the item exists it increases its
	 * quantity
	 * 
	 * Again relisting The name of the item The additional quantity to add The
	 * expiry date of the item
	 */
	public void addItem(String name, int quantity, String expiryDate) {
		for (int i = 0; i < pantry.size(); i++) {
			PantryItem item = pantry.get(i);
			if (item.name.equals(name)) {
				item.quantity += quantity;
				return;
			}
		}
		pantry.add(new PantryItem(name, quantity, expiryDate));
	}

	/*
	 * Distributes a specified quantity of an item If the available quantity is less
	 * than requested, it distributes what is available
	 * 
	 * The name of the item to distribute The quantity to distribute
	 */
	public void distributeItem(String name, int quantity) {
		for (int i = 0; i < pantry.size(); i++) {
			PantryItem item = pantry.get(i);
			if (item.name.equals(name)) {
				if (item.quantity >= quantity) {
					item.quantity -= quantity;
					System.out.println(quantity + " " + name + " distributed successfully!");
				} else {
					System.out.println(item.quantity + " " + name + " distributed successfully!");
					item.quantity = 0;
				}
				return;
			}
		}
		System.out.println(name + " is not available in the pantry.");
	}

	/*
	 * Searches for an item by its name and displays its details if found
	 * 
	 * The name of the item to search
	 */
	public void searchItem(String name) {
		for (int i = 0; i < pantry.size(); i++) {
			PantryItem item = pantry.get(i);
			if (item.name.equals(name)) {
				System.out.println(
						"Item: " + item.name + ", Quantity: " + item.quantity + ", Expiry Date: " + item.expiryDate);
				return;
			}
		}
		System.out.println(name + " is not available in the pantry.");
	}
}