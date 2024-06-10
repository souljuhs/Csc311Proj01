import java.util.Scanner;

/*
 * My main class which is to run the food pantry management system
 * It handles user interactions and processes commands
 */
public class Main {
	public static void main(String[] args) {
		FoodPantry pantry = new FoodPantry();
		Scanner scanner = new Scanner(System.in);
		int choice;

		System.out.println("Welcome to the University Food Pantry Management System");
		System.out.println("-------------------------------------------------------");
		while (true) {
			System.out.println("1. Add Item");
			System.out.println("2. Distribute Item");
			System.out.println("3. Search Item");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter item name: ");
				String name = scanner.nextLine();
				System.out.print("Enter quantity: ");
				int quantity = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter expiry date (YYYY-MM-DD): ");
				String expiryDate = scanner.nextLine();
				pantry.addItem(name, quantity, expiryDate);
				System.out.println("Item added successfully!");
				break;
			case 2:
				System.out.print("Enter item name: ");
				name = scanner.nextLine();
				System.out.print("Enter quantity: ");
				quantity = scanner.nextInt();
				scanner.nextLine();
				pantry.distributeItem(name, quantity);
				break;
			case 3:
				System.out.print("Enter item name: ");
				name = scanner.nextLine();
				pantry.searchItem(name);
				break;
			case 4:
				System.out.println("Goodbye!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}