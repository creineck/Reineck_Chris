import java.util.Scanner;
public class EvaluateDeterminant {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		int [][] matrix = new int[2][2];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Please input a number: ");
				matrix[i][j] = kb.nextInt();
				
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(+matrix[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		int evaluation = (matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]);
		System.out.print("\t= "+evaluation);
	}
}