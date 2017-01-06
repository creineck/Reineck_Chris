import java.lang.Math.*;
public class MPH {
	private int distance, hours, minutes;
	private double mph;
	
	public MPH() {
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MPH(int d, int h, int m) {
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	//modifiers
	public void setDistance(int d) {
		distance = d;
	}
	public void setHours(int h) {
		hours = h;
	}
	public void setMinutes(int m) {
		minutes = m;
	}
	//accessors
	public double getMPH() {
		mph = Math.round(distance/(hours + (minutes/60.0)));
		return mph;
	}
	public int getDistance() {
		return distance;
	}
	public double getHours() {
		return hours + (distance/60);
	}
}