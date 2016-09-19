import java.util.Scanner;

public class Lab_04_Receipt 
{
	public static void main(String[]args)
	{
		Lab_04_Receipt form = new Lab_04_Receipt();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		
		System.out.println("<<<<<<<_Receipt_>>>>>>>");
		form.Receipt(item1, price1);
		form.Receipt(item2, price2);
		form.Receipt(item3, price3);
		
		
	}
	
	public void Receipt(String item, double price)
	{
		System.out.printf("* %20s ........     %6.2f \n", item, price);
	}
}