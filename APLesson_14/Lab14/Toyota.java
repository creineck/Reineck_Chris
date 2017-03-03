public class Toyota implements Location {
	private double[] location;
	public Toyota() {
		location = new double[2];
	}
	public Toyota(String p) {
		location = new double[2];
		String[] locs = p.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
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