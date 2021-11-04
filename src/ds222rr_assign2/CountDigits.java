package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Enter a positive integer
			System.out.print("Provide a positive integer: ");
			
			// Selective statement to verify that the input is an integer
			if (sc.hasNextInt()) {
				int number = sc.nextInt();
				
				// Convert number to string
				String stringNumber = Integer.toString(number);
				
				// Determine length of string
				int stringLength = stringNumber.length();
				
				// Declare variables for iterative and selective statements
				int zero = 0, odd = 0, even = 0;
					
				// Selective statement to verify that the number is a positive integer
				if (number > 0) {
						
					// Iterative statement to determine digits
					for (int i = 0; i <= stringLength-1; i++) {
							
						// In Case digit is zero
						if (stringNumber.charAt(i) == '0') {
								zero++;
						}
						
						// Determine whether digit is odd or even
						else {
							int temp = Character.getNumericValue(stringNumber.charAt(i));
							
							// In Case digit is even
							if (temp%2 == 0) {
								even++;
							}
							// In Case digit is odd
							else {
								odd++;
							}
						}	
					}
						// Print out result
						System.out.println("Zeros:\t"+zero);
						System.out.println("Odd:\t"+odd);
						System.out.println("Even:\t"+even);
				}
					
				// In case number is not a positive integer
				else {
					System.err.print(number+" is not a positive integer!");
				}
			}
			
			// In case input is not an integer
			else {
				System.err.print("Input is not an number or above the max value of integer!");
			}
		// Close Scanner
		sc.close();
	}
}
