import java.util.Scanner;
public class CarRunner {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Paint: ");
		String paint = kb.nextLine();
		
		System.out.println("Interior: ");
		String interior = kb.nextLine();
		
		System.out.println("Engine: ");
		String engine = kb.nextLine();
		
		System.out.println("Tires: ");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		
		object.setCustom(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready....");
		System.out.println("Paint: "+object.getPaint());
		System.out.println("Interior: "+object.getInterior());
		System.out.println("Engines: "+object.getEngine());
		System.out.println("Tires: "+object.getTires());
	}
}