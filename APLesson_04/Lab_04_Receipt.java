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
		
		double subtotal = price1+price2+price3;
		double tax = .1*subtotal;
		double total = tax+subtotal;
		String sub = "Subtotal: ";
		String tex = "Tax: ";
		String tot = "Total: ";
		System.out.printf("\n*   %8s........     %6.2f \n", sub, subtotal);
		System.out.printf("*    %8s........     %6.2f \n", tex, tax);
		System.out.printf("*    %8s........     %6.2f \n", tot, total);
		System.out.println("-------------------------------------");
		System.out.println(" *Thank you for your support *");
	}
	
	public void Receipt(String item, double price)
	{
		System.out.printf("*    %7s ........     %6.2f \n", item, price);
	}
}