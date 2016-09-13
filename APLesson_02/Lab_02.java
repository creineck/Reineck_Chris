import java.util.Random;

public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 8;
		int num2 = 9;
		int mult = num1 * num2;
		
		System.out.println(num1+" multiplied by "+num2+" is"+mult);
		
		System.out.println("\n");
		
		String name = "Chris \n";
		String address = "505 Amigo Lane, ";
		String city = "Del Mar \n";
		String zip = "92015";
		
		System.out.println(name+address+city+zip);
		
		Random number = new Random();
		int l = number.nextInt(10) + 1;
		int w = number.nextInt(10) + 1;
		int h = number.nextInt(10) + 1;
		
		int surArea = (((l*w)+(l*h)+(w*h))*2);
		
		System.out.println("\n");
		System.out.println("The surface area of a rectangular prism with a height of "+h+", \n");
		System.out.println("a width of "+w+", and a length of "+ l+" is "+surArea+" units squared.");
	}
	
}