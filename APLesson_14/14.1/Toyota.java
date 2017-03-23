public class Toyota extends Car {
	public Toyota(String p) {
		double[] TLoc = new double[2];
		String[] locs = p.split(", ");
		TLoc[0] = Double.parseDouble(locs[0]);
		TLoc[1] = Double.parseDouble(locs[1]);
	}
}