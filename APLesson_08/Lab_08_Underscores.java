import java.util.Scanner;
public class Lab_08_Underscores {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		System.out.println(replace(kb.nextLine()));
		
	}
	public static String replace(String sentence) {
		int num = sentence.indexOf(" ");
		if (num >= 0) {
			return replace(sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1, sentence.length()));
		}
		else 
		{
			return sentence;
		}
	}
}