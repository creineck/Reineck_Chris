import java.util.Scanner;

public class Lesson_04_Cube_3
{
	static double side;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input the length of a side on your cube: ");
		side = keyboard.nextDouble();
		print();
	}
	public static double calcSurf()
	{
		return (6*(side*side));
	}
	public static void print()
	{
		System.out.println("The surface area of a cube whose sides are "+side+" in length is "+calcSurf());
	}
}