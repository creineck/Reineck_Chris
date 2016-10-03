import java.util.Scanner;

public class Lesson_04_Rectangle_3
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
		print();
	}
	public static void print()
	{
		System.out.println("Your rectangle is "+ calcPerim()+" feet around");
	}
	public static int calcPerim()
	{
		return (2* (length + width));
	}
}