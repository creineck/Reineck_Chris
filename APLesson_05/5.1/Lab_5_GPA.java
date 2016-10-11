import java.util.Scanner;

public class Lab_5_GPA
{
	static String grade1="";
	static String grade2="";
	static String grade3="";
	static String grade4="";
	static String grade5="";
	static String grade6="";
	static String grade7="";
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Caps ON");
		System.out.println("What is your grade in Math? ");
		grade1 = keyboard.nextLine();
		
		System.out.println("What is your grade in science? ");
		grade2 = keyboard.nextLine();
		
		System.out.println("What is your grade in english?");
		grade3 = keyboard.nextLine();		
		
		System.out.println("What is your grade in history?");
		grade4 = keyboard.nextLine();		
		
		System.out.println("What is your grade in computer science?");
		grade5 = keyboard.nextLine();
		
		System.out.println("What is your grade in language?");
		grade6 = keyboard.nextLine();		
		
		System.out.println("What is your grade in art?");
		grade7 = keyboard.nextLine();
		
		double gpa = ((calcPoints(grade1)+calcPoints(grade2)+calcPoints(grade3)+calcPoints(grade4)+calcPoints(grade5)+calcPoints(grade6)+calcPoints(grade7))/7);
		System.out.println("Your GPA is "+gpa);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return 4.0;
		}
		if (grade.equals("B"))
		{
			return 3.0;
		}
		if (grade.equals("C"))
		{
			return 2.0;
		}
		if (grade.equals("D"))
		{
			return 1.0;
		}
		else
		{
			return 0;
		}
		
	}
}