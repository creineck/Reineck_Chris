public class APLesson_06 {
	//instance variables
	private String userName, firstName, lastName;
	
	//default constructor
	public APLesson_06() 
	{
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with params
	public APLesson_06(String uName, String fName, String lName) {
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName) {
		userName = uName;
	}
	
	//Accessors
	public String getUserName() {
		return userName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}