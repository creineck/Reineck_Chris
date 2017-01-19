public class InventoryItems {
	private String manufacture, name, category;
	private int id, price;
	public InventoryItems() {
		manufacture = "";
		name = "";
		category = "";
		price = 0;
		id = 0;
	}
	public InventoryItems(String man, String n) {
		manufacture = man;
		name = n;
		id = (int)(Math.random()*1000000000) + 1;
		category = "Not defined";
	}
	public InventoryItems(String man, String n, String cat, int p) {
		manufacture = man;
		name = n;
		id = (int)(Math.random()*1000000000) + 1;
		category = cat;
		price = p;
	}
	public String toString() {
		return "Item Manufacturer: " + manufacture +
				"\nItem Name: " + name +
				"\nItem Category: " + category +
				"\nItem ID: " + id +
				"\nItem Price: " + price;
	}
}