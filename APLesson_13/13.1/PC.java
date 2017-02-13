public class PC extends GameSystem {
	public PC() {
		super();
	}
	public PC(String p) {
		super(p);
	}
	public String systemInput() {
		return "Keyboard and mouse";
	}
	public String toString() {
		return super.toString() + "\nSystem Input: " + systemInput();
	}
}