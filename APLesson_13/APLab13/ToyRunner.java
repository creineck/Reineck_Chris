import java.util.Scanner;
public class ToyRunner {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a car toy: ");
		String Car = kb.nextLine();
		System.out.println("Please input a toy figure: ");
		String Figure = kb.nextLine();
		AFigure figure = new AFigure(Figure);
		Car car = new Car(Car);
		System.out.println(figure);
		System.out.println(car);
	}
}