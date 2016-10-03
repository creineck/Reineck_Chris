import java.util.Scanner;

public class Lab_04_Rectangle
{
	static int length;
	static int width;
	static int perimeter;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the length of your rectangle: ");
		length = keyboard.nextInt();
		System.out.println("What is the width of your rectangle: ");
		width = keyboard.nextInt();
		calcPerim();
		print();
	}
	public static void print()
	{
		System.out.println("Your rectangle is "+ perimeter+" feet around");
	}
	public static void calcPerim()
	{
		perimeter= (2* (length + width));
	}
}