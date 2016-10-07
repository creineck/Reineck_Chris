public class Lab_05_Exercise1 
{
	static int player = 1 + (int)(Math.random()* 6);
	static int computer = 1+ (int)(Math.random()* 6);
	static String winner;
	public static void main(String[]args)
	{
		rollDice();
		System.out.println("You rolled a "+player);
		System.out.println("The computer rolled a "+computer);
		System.out.println("The winner is "+winner);
	}
	public static void rollDice()
	{
		if (player > computer)
		{
			winner = "you";
		}
		if (computer >player)
		{
			winner = "the computer";
		}
	}
}