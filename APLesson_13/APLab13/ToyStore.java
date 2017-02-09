import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore {
	private ArrayList<Toy> toylist = new ArrayList<>();
	public ToyStore() {}
	public ToyStore(String ts) {
		loadToys(ts);
	}
	public void loadToys(String ts) {
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i+=2) {
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy toy = this.getThatToy(name);
			if (toy == null) {
				if (type.equals("Car")) {
					toylist.add(new Car(name));
				}
				else if (type.equals("AF")) {
					toylist.add(new AFigure(name));
				}
			}
			else {
				toy.setCount(toy.getCount() + 1);
			}
		}
	}
	public Toy getThatToy(String nm) {
		for (Toy toy : toylist) {
			if (toy.getName().equals(nm)) {
				return toy;
			}
		}
		return null;
	}
	public String getMostFrequentToy() {
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy toy : toylist) {
			if (max < toy.getCount()) {
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return "Most Frequent Toy: " + name;
	}
	public String getMostFrequentType() {
		int cars = 0;
		int figures = 0;
		for (Toy toy : toylist) {
			if (toy.getType().equals("Car")) {
				cars++;
			}
			if (toy.getType().equals("AF")) {
				figures++;
			}
		}
		if (cars > figures)
			return "Most Frequent Type of Toy: Cars";
		else if (figures > cars)
			return "Most Frequent Type of Toy: Action Figures";
		else 
			return "Equal amounts of action figures and cars!";
	}
	public String toString() {
		return toylist + "";
	}
}