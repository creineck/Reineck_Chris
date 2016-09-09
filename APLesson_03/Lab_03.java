import java.util.Scanner;

public class Lab_03 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, I am called RudeAI. \nI would like to ask you some questions.");
		System.out.println("What is your name?");
		keyboard.next();
		
		
		System.out.println("Good name. How old are you?");
		keyboard.nextInt();
		
		keyboard.nextLine();
		System.out.println("Such a fun time to be alive. \nWhat do you do for fun?");
		String fun = keyboard.nextLine();
		
		System.out.println("Wow, I love doing that!");
		System.out.println("What kind of music do you like?");
		keyboard.nextLine();
		
		System.out.println("Lit, How many siblings do you have?");
		keyboard.nextInt();
		
		keyboard.nextLine();
		System.out.println("Same! What do you want to be when you grow up?");
		keyboard.nextLine();
		
		System.out.println("Good choice!");
	}
	
}