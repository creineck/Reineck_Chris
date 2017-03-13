public abstract class Car implements Location {
	private double[] location;
	private int ID;
	public Car() {
		location = new double[2];
		ID = (int)(Math.random()*1000000);
	}
	public int getID() {
		return ID;
	}
	public abstract void move() {}
}