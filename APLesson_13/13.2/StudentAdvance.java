public class StudentAdvance extends Advance {
	private int daysLeft;
	public StudentAdvance() {
		super();
	}
	public StudentAdvance(int dL) {
		super();
		daysLeft = dL;
	}
	public int getPrice() {
		if (daysLeft >= 10)
			return 15;
		else 
			return 20;
	}
	public String toString() {
		return "\nSerial #: " + super.getSerialNo() + "\nPrice: " + getPrice() + "\n*STUDENT ID REQUIRED*";
	}
}