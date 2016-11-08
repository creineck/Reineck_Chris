import java.util.Scanner;
public class Lab_08_Lucky7s {
	static int num;
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a number:");
		num = kb.nextInt();
		System.out.println(luck(num));
	}
	public static int luck(int number) {
		num = number;
		if (number > 0) {
			if (number%10 == 7)
				return (1 + luck(number/10));
			else
				return (0 + luck(number/10));
		}	
		return 0;
	}
}