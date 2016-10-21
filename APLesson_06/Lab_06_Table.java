import java.util.Scanner;

public class Lab_06_Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input an integer");
		int num = kb.nextInt();
		System.out.println("Please input the size of the table in units:");
		int table = kb.nextInt();
		
		for (int i = 1; i <= table; i++)
		{
			System.out.printf("%5d       %5d\n", i, i*num); 
		}
	}
}