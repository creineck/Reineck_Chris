public class Lab_09_GetOdds {
	static int[] numbers;
	public static void main(String[]args) {
		numbers = new int[10];
		fillArray();
		System.out.print("For the following numbers... "+printArray());
		System.out.println(getOdds(numbers) +" are the odd numbers");
	}
	public static void fillArray() {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray() {
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
	public static int[] getOdds(int[] odd) {
		int[] odds = new int[10];
		for (int num:numbers) {
			if (num%2==1) {
				for (int i = 0; i < numbers.length; i++) {
					odds[i] = num;
				}		
			}
		}
		return odds;
	}
}