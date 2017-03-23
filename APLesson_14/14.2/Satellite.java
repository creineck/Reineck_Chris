import java.util.ArrayList;
public class Satellite {
    public static void main(String[]args) {
        ArrayList<Location> locate = new ArrayList<>();
        double[] honLoc = {5, 6};
        locate.add(new Honda(honLoc));
        locate.add(new Toyota("8, 9"));
        locate.add(new GMC(3, 8));
        for(Location loc : locate) {
			double one = Math.random()* 99 + 1;
			double two = Math.random()* 99 + 1;
        	loc.move(one, two);
        }
        double[] home = {0, 0};
        String printout = "\n\n" + "==========================" + "\nStarting locations...";
        for(Location loc : locate) {
            printout += "\nLocation for " + loc.getID() + ": " + getLocation(loc.getLoc());
        }
        printout += "\n\n" + "==========================";
        for(Location loc : locate) {
			double one = Math.random()* 99 + 1;
			double two = Math.random()* 99 + 1;
			double [] l = {one, two};
			loc.move(one, two);
            printout += "\nAfter " + loc.getID() + " moved " + getLocation(l)
            + "\nNew location: " + getLocation(loc.getLoc());
        }
        printout += "\n\n" + "==========================" + "\nDistance from home...";
        for(Location loc : locate) {
            printout += "\nDistance for " + loc.getID() + ": " + getDistance(loc.getLoc(), home);
        }
        System.out.println(printout);
    }
	
    public static String getDistance(double[] car, double[] home) {
        return String.format("%.2f", Math.sqrt((Math.pow(car[0] - home[0], 2)) + Math.pow(car[1] - home[1], 2)));
    }
	
    public static String getLocation(double[] loc) {
        return String.format("(%.2f, %.2f)", loc[0], loc[1]);
    }
}