public abstract class Car implements Location {
	private final int ID;
	private double[] location;
	private double[] moved;
	public Car() {
		location = new double[2];
		ID = (int)(Math.random()*1000000);
	}
	public int getID() {
		return ID;
	}
	public double[] move(double x, double y) {
		location[0] += x;
		location[1] += y;
		return location;
	}
	public double[] getLoc() {
		return location;
	}
}