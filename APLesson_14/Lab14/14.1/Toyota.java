public class Toyota extends Car {
	private double l[] = new double[2];
	public Toyota(String p) {
		super();
		String[] locs = p.split(", ");
		l[0] = Double.parseDouble(locs[0]);
		l[1] = Double.parseDouble(locs[1]);
		super.move(l[0], l[1]);
	}
}