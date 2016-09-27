import java.util.Scanner;

public class Lab_04_Cube
{
	static double side;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input the length of a side on your cube: ");
		side = keyboard.nextDouble();
		calcSurf();
		print();
	}
	public static double calcSurf()
	{
		return (6*(side*side));
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with a side with the length of "+side+" is %.5f", calcSurf());
	}
}