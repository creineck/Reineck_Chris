public class Honda extends Car {
	private double[] location;
	
	public Honda(double[] p) {
		location = p;
	}
	public int getID() {
		return (int)(Math.random()*100000);
	}
	public void move(double x, double y) {
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc() {
		return location;
	}
}