import java.util.Scanner;
public class UserClassRunner {
	public static void main(String[]args) {
		UserClass user = new UserClass();
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a first Name: ");
		String firstName = kb.next();
		System.out.println("Please input a last Name: ");
		String lastName = kb.next();
		
		System.out.println("Would you like an avatar? (y/n)");
		String answer = kb.next();
		kb.nextLine();
		
		if (answer.equals("y")) 
		{
			System.out.println("Please choose an avatar: ");
			String avatar = kb.nextLine();
			user.setAva(avatar);
			UserClass pH2 = new UserClass(firstName, lastName, avatar);
			System.out.println(pH2);
		}
		else 
		{ 
			UserClass pH = new UserClass(firstName, lastName);
			System.out.println(pH);
		}
	}
}