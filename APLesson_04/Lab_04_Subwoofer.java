import java.util.Scanner;

public class Lab_04_Subwoofer 
{
	public static void main(String[]args)
	{
		Lab_04_Subwoofer form = new Lab_04_Subwoofer();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length in inches?");
		int length = keyboard.nextInt();
		
		System.out.println("What is the width in inches?");
		int width = keyboard.nextInt();
		
		System.out.println("What is the height in inches?");
		int height = keyboard.nextInt();
		
		double volume = form.calcVol(length, width, height);
		System.out.printf("The volume of your subwoofer box is %10.2f cubic feet", volume);
	}
	public double calcVol(double l, double w, double h)
	{
		return (Math.round((l*w*h)*0.000578704));
	}
}