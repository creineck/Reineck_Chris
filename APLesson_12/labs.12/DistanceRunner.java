import java.util.Scanner;
public class DistanceRunner {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a x1 value:");
		int x1 = kb.nextInt();
		System.out.println("Please input a x2 value:");
		int x2 = kb.nextInt();
		System.out.println("Please input a y1 value:");
		int y1 = kb.nextInt();
		System.out.println("Please input a y2 value:");
		int y2 = kb.nextInt();

		Distance object = new Distance(x1, x2, y1, y2);
		System.out.println("distance = "+ object.getDist());
		
		object.setXone(3);
		object.setXtwo(0);
		object.setYone(4);
		object.setYtwo(0);
		System.out.println("distance = "+ object.getDist());
	}
}