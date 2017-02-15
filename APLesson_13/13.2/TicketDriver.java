import java.util.Scanner;
public class TicketDriver {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("How many days are you ordering in advance?");
		int inad = kb.nextInt();
		System.out.println("How many days are you ordering in advance? (student)");
		int inadS = kb.nextInt();
		Walkup walk = new Walkup();
		Advance advance = new Advance(inad);
		StudentAdvance student = new StudentAdvance(inadS);
		System.out.println(walk);
		System.out.println(advance);
		System.out.println(student);
	}
}