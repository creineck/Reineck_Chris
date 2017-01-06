import java.util.Scanner;
public class MPHRunner {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input the distance traveled:");
		int distance = kb.nextInt();
		System.out.println("Please input the amount of hours traveled:");
		int hours = kb.nextInt();
		System.out.println("Please input the amount of minutes traveled:");
		int minutes = kb.nextInt();
		
		MPH object = new MPH(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours = "+ object.getMPH() +" mph");
		
		object.setDistance(10);
		object.setHours(2);
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours = "+ object.getMPH() +" mph");
	}
}