public class UserNamesRunner {	
	public static void main(String[]args) {
		APLesson_06 object = new APLesson_06("reineckc", "chris", "reineck");
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>>>");
		System.out.println("Name: "+ object.getFirstName() + " "+object.getLastName());
		System.out.println("Username: "+ object.getUserName());
		
		APLesson_06 object1 = new APLesson_06();
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>>>");
		System.out.println("Name: "+ object1.getFirstName() + " "+object1.getLastName());
		System.out.println("Username: "+ object1.getUserName());
		
		object1.setUserName("creineck");
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>>>");
		System.out.println("Name: "+ object.getFirstName() + " "+object.getLastName());
		System.out.println("Username: "+ object.getUserName());
	}
}