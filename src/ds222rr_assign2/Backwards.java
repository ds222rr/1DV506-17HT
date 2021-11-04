package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;

public class Backwards {
	
	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Enter String
			System.out.print("Provide a line of text: ");
			String text = sc.nextLine();
		
			// Determine length of text
			int textLength = text.length();
		
			// Create StringBuilder
			StringBuilder sb = new StringBuilder();
		
			// Create iterative statement to append the backward String(text) on the StringBuilder(sb)
			for (int i=textLength; i>0; i--) {
				sb.append(text.charAt(i-1));
			}
					
			// Convert StringBuilder(sb) to String
			String str = sb.toString();
				
			// Print out result
			System.out.print("Backwards: "+str);
			
		// Close Scanner
		sc.close();
	}
}
