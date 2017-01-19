import java.util.Scanner;
public class InventoryItemsRunner {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the item manufacturer?");
		String manufacturer = kb.nextLine();
		System.out.println("What is the name of the product?");
		String name = kb.nextLine();
		System.out.println("Will you be entering your name and price information? (y/n)");
		String answer = kb.nextLine();
		if (answer.equals("n")) {
			InventoryItems item1 = new InventoryItems(manufacturer, name);
			System.out.println(item1);
		}
		else {
			System.out.println("What is the category of the item?");
			String category = kb.nextLine();
			System.out.println("How much does it cost?");
			int price = kb.nextInt();
			InventoryItems item2 = new InventoryItems(manufacturer, name, category, price);
			System.out.println(item2);
		}
	}
}