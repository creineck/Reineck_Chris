import java.util.Scanner;
public class TicTac {
	static Scanner kb;
	public static void main(String[]args) {
		kb = new Scanner(System.in);
		int[] anArray = new int[9];
		chooseSide();
		generateBoard();
	}
	public static void chooseSide() {
		System.out.println("Would you like to be 'X' or 'O'? (CAPS ON)");
		String XorO = kb.next();
		if (XorO.equals("X")) {
			System.out.println("You are 'X'");
			String side = "X";
		}
		else if (XorO.equals("O")) {
			System.out.println("You are 'O'");
			String side = "O";
		}
		else {
			System.out.println("Please input an 'X' or an 'O'");
			chooseSide();
		}
	}
	public static void generateBoard(int[] anArray) {
		anArray = new int[9];
		System.out.printf("__%1S__|__%1S___|__%1S___"	
						 +"\n__%1S___|__%1S___|__%1S___"
						 +"\n  %1S   |  %1S   |  %1S  ", anArray[0], anArray[1], anArray[2], anArray[3], anArray[4], anArray[5], anArray[6], anArray[7], anArray[8]);
	}
}