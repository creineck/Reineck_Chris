import java.util.Scanner;
public class Lab_06_X 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to count up to:");
		int num = kb.nextInt();
		System.out.println("Enter a number to count by:");
		int count = kb.nextInt();
		for (int i = count; i <= num; i+=count)
		{
			System.out.printf(i +"\t");
		}
	}
}