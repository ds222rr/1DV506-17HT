package ds222rr_assign3;

public class Point {
	private final int SIZE = 2;
	private int [] data;
	
	// Constructors
	public Point() {
		data = new int [SIZE];
		data[0] = 0;
		data[1] = 0;
	}
	
	public Point(int x, int y) {
		data = new int [SIZE];
		data[0] = x;
		data[1] = y;
	}
	
	// Accessors
	public String toString() {	// Get Point coordinates for String
		String xyString = "("+data[0]+", "+data[1]+")";
		return xyString;
	}
		
	public double distanceTo(Point n) {	// Determine distance between two Points
		double distance = Math.pow((data[0]-n.data[0]), 2)+Math.pow(data[1]-n.data[1], 2);
		distance = Math.sqrt(distance);
		return distance;
	}
	
	// Mutators
	public void move(int addX, int addY) {	// Move Point by adding values to its coordinates
		data[0] = data[0] + addX;
		data[1] = data[1]+ addY;
	}
	public void moveToXY(int newX, int newY) {	// Move Point by setting new values for its coordinates
		data[0] = newX;
		data[1] = newY;
	}
	
	// Other
	public boolean isEqualTo(Point n) {	// Determine whether two Points are equal
		return (data[0] == (n.data[0]) && data[1] == (n.data[1]));
	}	
}
