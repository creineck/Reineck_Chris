import java.util.Random;
public abstract class Ticket {
	private int serialNo;
	public Ticket() {
		this.serialNo = (int)(Math.random()*1000000);
	}
	public int getSerialNo() {
		return serialNo;
	}
	public abstract int getPrice();
	public String toString() {
		return "\nSerial #: " + serialNo + "\nPrice: " + getPrice();
	}
}