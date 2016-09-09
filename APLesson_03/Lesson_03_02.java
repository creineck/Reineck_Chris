import java.util.Scanner; //import statement

public class lesson_03_02 
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user import
		System.out.println("How old are you? ");
		
		//search for the next integer that user enters
		int num = keyboard.nextInt();
		
		//print the results
		System.out.println("Wow! "+ num + " is " + " is perfect. ");
		
		System.out.println("Who is your favorite teacher?");
		
		String teacher = keyboard.next();
		
		System.out.println("Okay! "+ teacher+ " is very good!");
	}
	
}