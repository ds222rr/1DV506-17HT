package ds222rr_assign3;

import java.text.DecimalFormat;

public class PointMain {
	public static void main(String[] args) {
		
		Point p1 = new Point();		// Position Point 1: (0,0)
		Point p2 = new Point(6,9);	// Position Point 1: (6,9)
			
		System.out.println("Point 1: "+p1.toString());	// Printout: "Point 1: (0, 0)"
		System.out.println("Point 2: "+p2.toString());	// Printout: "Point 1: (6, 9)"
			
		if (p1.isEqualTo(p2)) {	// Printout: "The two points are not equal"
			System.out.println("The two points are equal");
		}
		else {
			System.out.println("The two points are not equal");
		}
	
		double dist = p1.distanceTo(p2);
		System.out.print("Point Distance: "+printDistance(dist));	// Printout: "Point Distance: 10,8"
			
		p2.move(3,-12);   	// Move Point 2 to position: (X+3, Y-12)
		p1.moveToXY(9,-3);	// Move Point 1 to position: (9, -3)
			
		if (p1.isEqualTo(p2)) { // Printout: "The two points are  equal"
			System.out.println("\nThe two points are equal");
		}
		else {
			System.out.println("\nThe two points are not equal");
		}
		
		dist = p1.distanceTo(p2);
		System.out.println("Point Distance: "+printDistance(dist));	// Printout: "Point Distance: 0,0"
		
	}
	
	/*   M E T H O D S   */
	
	public static String printDistance(double distFloat) {	// Use dFormat for dist
		DecimalFormat dFormat = new DecimalFormat("0.0"); // Create DecimalFormat object
		String distanceDecimal = dFormat.format(distFloat);
		return distanceDecimal;
	}
}
