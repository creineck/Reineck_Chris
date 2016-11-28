import java.util.ArrayList;
import java.util.Scanner;
public class Lab_10_Composites {
	static Scanner kb;
	public static void main(String[]args) {
		kb = new Scanner(System.in);
		int[] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<>(numbers.asList(numbers));
	}
	public static void gFactor(int num) {
		System.out.println("Please input a number:");
		int n = kb.nextInt();
		for (int i = 2; i < n-1; i++) {
			if (n%i == 0)
				return 1;
			else 
				return 0;
		}
	}
	public static void removeComposites() {
		for (int i = 0; i < nums.length; i++) {
			if (gFactor()== 0)
				
		}
	}
}