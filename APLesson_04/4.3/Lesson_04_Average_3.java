import java.util.Scanner;

public class Lesson_04_Average_3
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a number: ");
		num1 = keyboard.nextDouble();
		
		System.out.println("Input another number: ");
		num2 = keyboard.nextDouble();
		
		System.out.println("Input another number: ");
		num3 = keyboard.nextDouble();
		average();
		print();
	}
	public static void print()
	{
		System.out.printf("The average of " + num1+ ", "+num2+", and "+num3+" is %.2f", average());
	}
	public static double average()
	{
		return ((num1+num2+num3)/3);
	}
}