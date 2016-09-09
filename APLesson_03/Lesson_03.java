import java.util.Scanner; //import statement

public class Lesson_03
{
	public static void main(String[]args) 
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user imput
		System.out.println("Please pick a number ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		System.out.println("You entered the number "+ num);
		
	}
	
}