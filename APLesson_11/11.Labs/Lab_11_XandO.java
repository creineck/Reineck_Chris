public class Lab_11_XandO {
	public static void main(String[]args) {
		String [][] XandO = new String[4][4];
		
		for (int i = 0; i < XandO.length; i++) {
			for (int j = 0; j < XandO[i].length; j++) {
				int pick = (int)(Math.random()*2 + 1);
				if (pick == 1)
					XandO[i][j] = "x";
				if (pick == 2) 
					XandO[i][j] = "o";
				System.out.print(XandO[i][j] + " ");
			}
			System.out.println();
		}
	}
}