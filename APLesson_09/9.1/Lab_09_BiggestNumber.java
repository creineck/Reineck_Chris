public class Lab_09_BiggestNumber {
	static int[] nums;
	public static void main(String[]args) {
		nums = new int[10];
		fillArray();
		System.out.println("For the following numbers... " + printArray());
		System.out.println("There biggest number is... " + getBiggest());
	}
	public static void fillArray() {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100 + 1);
		}
	}
	public static String printArray() {
		String a = "";
		for (int num : nums ) {
			a += num + ", ";
		}
		return a;
	}
	public static int getBiggest() {
		int max = 0;
		for (int num : nums ) {
			if ( num > max ) {
				max = num;
			}
		}
		return max;
	}
}