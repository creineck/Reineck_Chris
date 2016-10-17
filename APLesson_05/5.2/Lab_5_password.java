import java.util.Scanner;

public class Lab_5_password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String username = "username";
		String password = "password";
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("What is the username?");
		String user =  kb.nextLine();
		if (user.equals("username"))
		{
			System.out.println("What is the password?");
			String pass = kb.nextLine();
			if (pass.equals("password"))
			{
				System.out.println("You are granted access!");
			}
			else
			{
				System.out.println("The password is incorrect!");
				passCheck();
			}
		}
		else 
		{
			System.out.println("What is the password");
			String pass = kb.nextLine();
			System.out.println("Your username and password are incorrect");
			passCheck();
		}
	}
}