import java.util.Scanner;

public class Lab_04_Interest 
{
	public static void main(String[]args) 
	{
		Lab_04_Interest form = new Lab_04_Interest();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the original amount you borrowed:");
		double Pa = keyboard.nextDouble();
		
		System.out.println("What is the interest rate:");
		double ra =keyboard.nextDouble();
		
		System.out.println("How many times is the loan compounded per year:");
		double na = keyboard.nextDouble();
		
		System.out.println("How many years is the life of the loan:");
		double ta = keyboard.nextDouble();
		
		System.out.printf("Your total monthly payment is $%1.2f", form.equation(Pa, ra, na, ta) );
	}
	public double equation(double P, double r, double n, double t)
	{
		return ((Math.pow(1+(r/n), n*t)*P)/(t*12));
	}
}