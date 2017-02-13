public abstract class Console extends GameSystem {
	private String platform;
	private int serialNo;
	public Console() {
		super();
	}
	public Console(String p) {
		super(p);
	}
	public abstract String getController();
	public String toString() {
		return "Platform: " + platform + "/nSerial #: " + serialNo + "/nController: " + controller;
	}
}