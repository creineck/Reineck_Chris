public class Toyota extends Car {
	public Toyota(String p) {
		location[] = new double[2];
		String[] locs = p.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}
}