import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore {
	private ArrayList<Toy> toylist = new ArrayList<>();
	//constructors
	public ToyStore() {
		
	}
	public ToyStore(String ts) {

	}
	public String loadToys(String ts) {
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < ts.length; i++) {
			String name = toys.(i);
			String type = toys.(i + 1);
			Toy toy = this.getThatToy();
			if (bar == null) {
				if (type.equals("car")) {
					toylist.add(new Car(n));
				}
				else if (type.eqauls("AF")) {
					toylist.add(new AFigure(n))
				}
			}
			else {
				toy.setCount(toy.getCount() + 1);
			}
		}
	}
	public String getThatToy(String nm) {
		for (String toy : toyList) {
			if (toy.equals("nm")) {
				return toy;
			}
		}
		return "";
	}
	public getMostFrequentToy() {
		String name = "";
		int max = Integer;
		for (int toy : toylist) {
			if (max < count) {
				max = count;
				name = toylist[max];
			}
		}
		return name;
	}
	public getMostFrequentType() {
		int cars = 0;
		int figures = 0;
		for (int toy : toylist) {
			if (toy.equals("car")) {
				car++;
			}
			if (toy.equals("AF")) {
				figures++;
			}
		}
		if (cars > figures)
			return "cars";
		if (figures > cars)
			return "action figures";
		else 
			return "Equal amounts of action figures and cars!";
	}
	public toString() {
		return ;
	}
}