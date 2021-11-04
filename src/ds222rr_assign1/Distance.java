package ds222rr_assign1;
//Get Scanner from Java Library
import java.util.Scanner;
// Get DecimalFormat from Java Library
import java.text.DecimalFormat;


public class Distance {

	public static void main(String[] args) {
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			// Enter coordinates
			System.out.print("Enter x1: ");
			int x1 = sc.nextInt();
			System.out.print("Enter y1: ");
			int y1 = sc.nextInt();
			System.out.print("Enter x2: ");
			int x2 = sc.nextInt();
			System.out.print("Enter y2: ");
			int y2 = sc.nextInt();
				// Calculate distance
				double distance = Math.pow((x1-x2),2)+Math.pow((y1-y2),2);
				distance = Math.sqrt(distance);
					// Restrict result to Three Decimal Digits
						DecimalFormat dFormat = new DecimalFormat("0.###");
						String distanceDecimal = dFormat.format(distance);
						//  Distance Output
						System.out.print("Distance: "+distanceDecimal);
		// Close Scanner
		sc.close();
	}

}
