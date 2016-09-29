import java.util.Scanner;

public class Lab_04_Circle
{
	static double r;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the radius of your circle:");
		r = keyboard.nextDouble();
		print();
	}
	public static double calcArea()
	{
		return (r*r*3.14);
		
	}
	public static void print()
	{
		System.out.println("The area of a circle with a radius of "+r+" is "+calcArea()+".");
	}
}