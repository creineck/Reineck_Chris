import java.util.Scanner;

public class Lab_05_Exercise2
{
	static boolean discounted;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input an item: ");
		String item1 = keyboard.nextLine();
		
		System.out.println("What is the price?");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please input another item: ");
		String item2 = keyboard.nextLine();
		
		System.out.println("What is the price?");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please input another item: ");
		String item3 = keyboard.nextLine();
		
		System.out.println("What is the price");
		double price3 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please input the final item: ");
		String item4 = keyboard.nextLine();
		
		System.out.println("What is the price?");
		double price4 = keyboard.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		discount(subtotal);
		double tax = subtotal*0.15;
		format(item1, price1, item2, price2, item3, price3, item4, price4);
		
	}
	public static void discount(double subtotal)
	{
		if (subtotal >= 2000)
		{
			subtotal = subtotal - (subtotal*0.15);
			discounted = true;
		}
		if (subtotal < 2000)
		{
			subtotal = subtotal;
		}
	}
	public static void format(String item, double price, String item2, double price2, String item3, double price3, String item4, double price4, double subtotal, double discount)
	{
		System.out.printf("*   %8s.......    %6.2f *", item, price);
		System.out.printf("*   %8s.......    %6.2f *", item2, price2);
		System.out.printf("*   %8s.......    %6.2f *", item3, price3);
		System.out.printf("*   %8s.......    %6.2f *", item4, price4);
		System.out.printf("*   Subtotal.......    %6.2f *", subtotal);
		if (discounted)
		{
			System.out.printf("*   Discount.......    %6.2f *", subtotal*0.15);
		}
		if (!discounted)
		{
			System.out.printf("*   Discount.......    There is no discount");
		}
		System.out.println("Thanks for visiting!");
	
	}
}