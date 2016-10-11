import java.util.Scanner;

public class Lab_05_BMI
{
	static int height;
	static int weight;
	static double bmi;
	static String condition;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		height = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds?");
		weight = keyboard.nextInt();
		calcBMI();
		System.out.println("Your BMI is: "+bmi);
		System.out.println("You are "+condition);
	}
	public static void calcBMI()
	{
		bmi = ((weight*703)/(height*height));
		if (bmi > 39.9)
		{
			condition = "morbidly obese";
		}
		else if (bmi >= 35)
		{
			condition = "very obese";
		}
		else if (bmi >= 29.9)
		{
			condition = "obese";
		}
		else if (bmi >= 25)
		{
			condition = "overweight";
		}
		else if (bmi >= 18.5)
		{
			condition = "normal";
		}
		else 
		{
			condition = "underweight";
		}
	}
}