import java.util.Scanner;

public class Lab_03_Calculation 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Lets find the are of a square");
		System.out.println("What is your height");
		int height = keyboard.nextInt();
		
		System.out.println("What is the value of the first base?");
		int base = keyboard.nextInt();
		
		int square = (base*height);
		System.out.println("The area of your square is " + square);
	}
}