import java.util.Scanner;

public class Lab_06_Factorial
{
	public static void main(String[]Args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++)
		{
			factorial*=i;
		}
		System.out.println(factorial);
	}
}