package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;

public class LargestK {
	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Enter positive Integer
			System.out.print("Give a positive integer: ");
			
			// Verify that input is a positive integer
			if (sc.hasNextInt()) {
				
				int n = sc.nextInt();
								
				// Verify that n is a positive integer
				if (n > 0) {
					
					// Declare variables for iterative statement
					int sum = 0, k = 0;
					
					// Iterative statement to determine K
					while (sum + k + 2 < n) {
						k = k + 2;
						sum = sum + k;			
					}
						
					// Print out result
					System.out.print("\nThe largest K such that 0+2+4+6+...+K"
									+" < "+n+" => K="+k);
							
				}

				// In case N is not a positive integer
				else {
					
					// Print out error message
					System.out.print(n+" is not a positive integer!");
				}
			}
			
			// In case input is not an integer
			else {
				
				// Print out error message
				System.out.print("Input is not an integer!");
			}
			
		// Close Scanner
		sc.close();
	}
}
