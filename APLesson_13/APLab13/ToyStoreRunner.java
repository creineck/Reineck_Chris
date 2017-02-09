public class ToyStoreRunner {
	private AFigure figure = new AFigure();
	private Car car = new Car();
	public static void main(String[]args) {
		ToyStore store = new ToyStore("Hotwheel, Car, GI Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store.toString());
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
	}
}