import java.util.Scanner;
public class Lab_11_GameHealth {
	static String [] health;
	static int HealthLoad = 6;
	static int HealthCount;
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		HealthCount = 6;
		health = new String[HealthLoad];
		
		while (turn.indexOf("Q")< 0 && HealthCount > 0) {
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.next();
			damage = (int)(Math.random()*2 + 1);
			amount = (int)(Math.random()*6 + 1);
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!");
	}
	public static String takeDamage(int dmg, int amt) {
		if (dmg == 1) {
			HealthCount -= amt;
			return "Taking "+amt+" damage!";
		}
		else {
			if (HealthCount + amt < HealthLoad) 
				HealthCount += amt;
			else 
				HealthCount = HealthLoad;
		}
		return "Power up "+amt+"!";
	}
	public static void printClip() {
		String output = "Health:\t";
		for (int i = 0; i < HealthLoad; i++) {
			if (i < HealthCount)
				health[i] = " @ ";
			else
				health[i] = "[]";
			output+=health[i];
		}
		System.out.println(output);
	}
}