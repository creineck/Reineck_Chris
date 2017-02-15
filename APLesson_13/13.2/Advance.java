public class Advance extends Ticket {
	int daysLeft;
	public Advance() {
		super();
	}
	public Advance(int dL) {
		dL = daysLeft;
	}
	public int getPrice() {
		if (daysLeft >= 10)
			return 30;
		else
			return 40;
	}
}