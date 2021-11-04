package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Declare variables for iterative and selective statements
			int largestInteger = 0, secondLargestInteger = 0, number = 0;
			
			System.out.print("Provide 10 integers: ");
			
			// Iterative statement to enter 10 integers; Determine second-largest-integer
			for (int i = 0; i<=9; i++) {
				
				// In case an input is not an integer
				if (!sc.hasNextInt()) {
					System.out.print("At least one input is not an integer!");
					System.exit(-1);; // Stop program
				}
				
				// In case input is an integer
				else {
					number = sc.nextInt();

					// In case current(i) integer is >= than the current largest integer
					if (number >= largestInteger) {
						secondLargestInteger = largestInteger;
						largestInteger = number;	
					}
					// In case current(i) integer is bigger than the current second-largest integer
					else if (number > secondLargestInteger) {
						secondLargestInteger = number;
					}
				}
			}	
			// Print out result
			System.out.print("The second largest is: "+secondLargestInteger);

		// Close Scanner
		sc.close();
	}
}