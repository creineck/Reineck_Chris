import java.util.Scanner;

public class Lab_5_adventure
{
	static String choice = "";
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Morpheus shows up in your house..." + 
							"Do you want to pick:" +
							"\n	A) The red pill" +
							"\n		or" +
							"\n	B) The blue pill");
		choice = kb.next();
		if (choice.equals("A"))
		{
			System.out.println("You wake up the next morning the richest man in the world.");
			System.out.println("\nDo you want to: " +
									"\nA) Travel around the world" + 
									"\nB) Enjoy your wealth within the confines of your home");
			choice = kb.next();
			if (choice.equals("A"))
			{
				System.out.println("Good choice. Now you have to decide where to go.");
				System.out.println("\nDo you want to: " +
									"\nA) go to Abu Dhabi on Emirates airlines, first class" + 
									"\nB) go to Thahiti and surf dawn till dusk");
				choice = kb.next();
				if (choice.equals("A"))
				{
					System.out.println("You sleep all the way there in your luxury cabin on Emirates.");
					System.out.println("\nOnce you are there, you share a glass of brandy with Bill Gates");
					System.out.println("\non the tallest building in the world");
				}
				else
				{
					System.out.println("Shred the gnar brah! ");
					System.out.println("\nAfter experiencing an enlightenment, you give away everything ");
					System.out.println("\nand spend the rest of your days being one with nature.");
				}
			}
			else
			{
				System.out.println("Life is good. Now all you have to do is decide what to do with your day.");
				System.out.println("Do you want to: " +
									"\nA) go golf with your rich neighbors" + 
									"\nB) buy a pet tiger");
				choice = kb.next();
				if (choice.equals("A"))
				{
					System.out.println("You discover you have quite a nack for golf.");
					System.out.println("\nYou decide to go pro. In less than a year you");
					System.out.println("\nare the number 1 ranked golfer in the world.");
				}
				else
				{
					System.out.println("Not such a good idea...");
					System.out.println("\nYour pet tiger rebels against your authority, steals your");
					System.out.println("\nland, and leaves you in the gutter");
				}
			}
		}
		else
		{
			System.out.println("You wake up the next morning the poorest man in the world.");
			System.out.println("\nAll your possesions are gone, and you are passed out in the gutter.");
			System.out.println("\nDo you want to: " +
									"\nA) Take a walk in the park" + 
									"\nB) Move to detroit");
			choice = kb.next();
			if (choice.equals("A"))
			{
				System.out.println("As you are walking, you find a club and some golf balls");
				System.out.println("\nDo you want to: " +
									"\nA) Keep walking" + 
									"\nB) Start practicing!");
				if (choice.equals("A")) 
				{
					System.out.println("On your stroll through the park, a stray golf ball flies through");
					System.out.println("\nthe air into the back of your head.");
					System.out.println("\nYou file a lawsuit and become more wealthy than you ever dreamed to be!");
				}
				else
				{
					System.out.println("It turns out you have a nack for golf");
					System.out.println("\nWithin a year you are the number one ranked golfer in the world.");
				}
			}
			else
			{
				System.out.println("You fit right in here in Detroit!");
				System.out.println("\nDo you want to: " +
									"\nA) Move into an abandoned house" + 
									"\nB) Meet some of the locals");
				choice = kb.next();
				if (choice.equals("A"))
				{
					System.out.println("You start a nice family and live a very fulfilling life");
				}
				else 
				{
					System.out.println("Some of the locals share similar sentiments to you in");
					System.out.println("\nin regards to economic inequality.");
					System.out.println("\nYou lead a rebellion to take the city and are now");
					System.out.println("\nthe King of Detroit");
				}
			}
		}
	}
}