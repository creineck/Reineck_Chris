public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blaaah";
		double number1 = 4444564.3453;
		
		form.format(word1, number1);
		
		String word2 = "yessssss";
		double number2 = 987543.93488979;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("%10s %10.2f", word, number);
	}
}