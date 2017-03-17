import java.util.ArrayList;
public class Satellite {
    public static void main(String[]args) {
		
        ArrayList<Location> locate = new ArrayList<>();
        double[] positions = new double[6];
		
        for(int i=0; i<6; i++) {
        	positions[i] = ((double)(Math.random() * 100) + 1);
        }
        double[] honLoc = {5, 6};
        locate.add(new Honda(honLoc));
        locate.add(new Toyota("8, 9"));
        locate.add(new GMC(3, 8));
        int i = 0;
        for(Car l : locate) {
        	l.move(positions[i], positions[i+1]);
        	i += 2;
        }
        double[] home = {0, 0};
        String printout = "\n\n" + "==========================" + "\nStarting locations...";
        for(Car l : locate) {
            printout += "\nLocation for " + l.getID() + ": " + getLocation(l.getLoc());
        }
        printout += "\n\n" + "==========================";
        i = 0;
        for(Car l : locate) {
			double one = (double)(Math.random()*100 + 1);
			double two = (double)(Math.random()*100 + 1);
			double [] l = {one, two};
			(Car(loc).move(one, two));
            double[] newPos = l.getLoc();
            double x = newPos[0], y = newPos[1];
            printout += "\nAfter " + l.getID() + " moved (" + positions[i] + ", " + positions[i+1] + ")"
            + "\nNew location: " + "(" + (x+positions[i]) + ", " + (y+positions[i+1]) + ")";
            i += 2;
        }
        printout += "\n\n" + "==========================" + "\nDistance from home...";
        for(Car l : locate) {
            printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
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