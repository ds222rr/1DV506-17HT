package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Provide text
			System.out.print("Provide a line of text: ");
			String text = sc.nextLine();
			
			// Determine String length
			int stringLength = text.length();
			
			// Create StringBuilder forward
			StringBuilder sbForward = new StringBuilder();
			
			// Iterative statement to remove non-letter characters
				for (int i = 0; i <= stringLength-1; i++) {
					char c = text.charAt(i); // current(i) char
					boolean cbool = Character.isLetter(c); // true if current(i) char is a letter
					
					// Selective statement to append only letter characters
					if (cbool) {
						boolean cUpper = Character.isUpperCase(c); // true if current(i) char is an upper-case-letter
						
						// Selective statement to change upper-case-letters to lower-case-letters
						if (cUpper) {
							c = Character.toLowerCase(text.charAt(i)); //
						}
						sbForward.append(c); // append current(i) char to StringBuilder
					}							
				}
						
				// Create iterative statement to turn text backwards
				String newString1 = sbForward.toString();
							
				// Determine length of String
				int newStringLength = newString1.length();
				
				// Create Stringbuilder backward
				StringBuilder sbBackward = new StringBuilder();
									
				// Iterative statement to append characters backward
				for (int i = newStringLength-1; i >= 0; i--) {
					sbBackward.append(newString1.charAt(i)); // append current(i) char to StringBuilder
				}
				
				// Turn sbBackward to String
				String newString2 = sbBackward.toString();
						
				// Verify that Text is a palindrome
				if (newString1.equals(newString2)) { // compare the content of both strings
					System.out.print("Text is a palindrome!");
				}
						
				// In case the content of both strings is not equal
				else {
					System.out.print("Text is not a palindrome!");
				}
						
		// Close Scanner
		sc.close();
	}
}
