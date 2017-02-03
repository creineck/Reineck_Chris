import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore {
	private ArrayList<Toy> toyList;
	//constructors
	public ToyStore() {
		
	}
	public ToyStore(String p) {
		
	}
	public loadToys(String ts) {
		ts.split(" , ");
		for (int i = 0; i < ts.length; i++) {
			String name = ts[i];
			String type = ts[i + 1];
			Toy toy = new Toy(name);
			if ()
		}
	}
	public getThatToy() {
		
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
		return toyList;
	}
}