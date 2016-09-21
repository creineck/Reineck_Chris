import java.util.Scanner;

public class Lab_04_ID 
{
	public static void main(String[]args) 
	{
		Lab_04_ID form = new Lab_04_ID();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = keyboard.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = keyboard.nextLine();
		
		System.out.println("Enter your title:");
		String title = keyboard.nextLine();
		
		System.out.println("Enter the school name:");
		String schoolName = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String schoolYear = keyboard.nextLine();
		
		System.out.println("What is your favorite subject:");
		String subject = keyboard.nextLine();
		
		System.out.printf("***********************************\n");
		form.card(schoolName, schoolYear);
		form.card(firstName, lastName);
		form.card(title, subject);
		System.out.printf("***********************************");
		
	}

	public void card(String coding, String god)
	{
		System.out.printf("* %15s %15s *\n", coding, god);
	}
}