package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Enter String
			System.out.print("Provide a line of text: ");
			String text = sc.nextLine();
			
			// Calculate String Length
			int textLength = text.length();
			
			// Declare variables for the iterative statement
			int countLowerCaseA = 0, countUpperCaseA = 0;
			
			// Iterative Statement to determine numbers of 'a' and 'A' 
			for (int i=0; i<textLength; i++) {
				
				// In case char is 'a'
				if (text.charAt(i)== 'a') {
					countLowerCaseA++;
				}
				
				// In case char is 'A'
				else if (text.charAt(i)=='A') {
					countUpperCaseA++;
				}
			}
			
			// Print out result
			System.out.println("Number of 'a': "+countLowerCaseA);
			System.out.print("Number of 'A': "+countUpperCaseA);
			
		// Close Scanner
		sc.close();
	}
}
