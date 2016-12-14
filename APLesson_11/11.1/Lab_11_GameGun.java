import java.util.Scanner;
public class Lab_11_GameGun {
	static int bulletCount;
	static int clipSize = 16;
	static int shotCount;
	static String [] clip;
	static Scanner kb;
	public static void main(String[]args) {
		kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipSize];
		resetClip();
		printClip();
		
		while (bulletCount > 0 || shotCount > 0) {
			System.out.println("\nAction: ");
			String action = kb.next();
			if (action.equals("R")) {
				reload();
				printClip();
			}
			if (action.equals("S")) {
				System.out.println(shoot());
				printClip();
				bulletCount--;
			}
		}
	}
	public static void resetClip() {
		for (int i = 0; i < clip.length; i++) {
			clip[i] = " * ";
		}
	}
	public static String shoot() {
		if (shotCount > 0) {
			clip[shotCount - 1] = "[]";
			shotCount--;
			return "Boom!";
		}
		else 
			return "Reload!";
	}
	public static void reload() {
		if (bulletCount >= clipSize) {
			bulletCount -= clipSize;
			shotCount = clipSize;
		}
		resetClip();
		for (int i = 0; i < shotCount; i++) {
			clip[i]=" * ";
		}
	}
	public static void printClip() {
		String output = "";
		output += "Bullets:\t"+ bulletCount +"\nClip:\t";
		for (int i = 0; i < clipSize; i++) {
			output += clip[i];
		}
		System.out.print(output);
	}
}