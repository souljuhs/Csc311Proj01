public class MyArrayList {
	private PantryItem[] items; // Array to store pantry items
	private int size; // This tracks the number of items currently in the array

	/*
	 * Constructor initializes the array with an initial cap of 10 items
	 */
	public MyArrayList() {
		items = new PantryItem[10];
		size = 0;
	}

	/*
	 * Adds a new item to the array and if the array is full it'll double the array
	 * size before adding The PantryItem to add to the array
	 */
	public void add(PantryItem item) {
		if (size == items.length) {
			// Double the array size when its full
			PantryItem[] newItems = new PantryItem[items.length * 2];
			System.arraycopy(items, 0, newItems, 0, items.length);
			items = newItems;
		}
		items[size++] = item;
	}

	/*
	 * Retrieves an item at a specified index
	 * 
	 * The index of the item to retrieve The PantryItem at the specified index
	 * 
	 * @throws IndexOutOfBoundsException If the index is out of the range of the
	 * array size
	 */
	public PantryItem get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return items[index];
	}

	/*
	 * Returns the number of items in the array
	 * 
	 * Return the size of the array
	 */
	public int size() {
		return size;
	}
}