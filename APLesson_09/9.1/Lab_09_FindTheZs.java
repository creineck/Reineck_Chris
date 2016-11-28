import java.util.Scanner;
public class Lab_09_FindTheZs {
	static Scanner kb;
	static String[] words;
	public static void main(String[]args) {
		words = new String[5];
		kb = new Scanner(System.in);
		fillArray();
		System.out.println("For the words "+printArray());
		System.out.println("Only "+hasZs()+" contains the letter z.");
	}
	public static void fillArray() {
		System.out.println("Please input 5 words");
		for (int i = 0; i < words.length; i++) {
			words[i] = kb.next();
		}
	}
	public static String printArray() {
		String wordo = "";
		for ( String word : words ) {
			wordo += word + ", ";
		}
		return wordo;
	}
	public static String hasZs() {
		String zs = "";
		for ( String word : words ) {
			if (word.indexOf("z") >= 0) {
				zs += word + ", ";
			}
		}
		return zs;
	}
	
}