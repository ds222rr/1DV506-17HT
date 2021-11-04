package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		// Create Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Provide an odd positive integer: ");
			
			// Verfiy that input is an integer
			if (sc.hasNextInt()) {
				int oddNumber = sc.nextInt();
				
				// Verify that number is odd
				if (oddNumber%2 != 0 && oddNumber > 0) {
							
					System.out.print("Right-Angled Triangle: ");
						
					// Iterative statement to create Right-Angled-Triangle
					for (int i = 0; i < oddNumber; i++) {
						
						// Create StringBuilders for Right Angled Triangle
						StringBuilder RightAngledTriangleForward = new StringBuilder();
						StringBuilder RightAngledTriangleBackward = new StringBuilder();
							
						// Iterative statement to append * to the current(i) row
						for (int j = 0; j <= i; j++ ) {
							RightAngledTriangleForward.append("*");
						}
							
						// Iterative statement to append spaces to the current(i) row
						for (int k = 0; k < (oddNumber-i); k++) {
							RightAngledTriangleForward.append(" ");				
						}
							
						// Iterative statement to reverse rows of Right Angled Triangle
						for (int l = oddNumber-1; l >= 0; l--) {
							RightAngledTriangleBackward.append(RightAngledTriangleForward.charAt(l));
						}
							
						// Print out current(i) row
						System.out.print("\n"+RightAngledTriangleBackward);
					}
							
					System.out.println("\nIsoceles Triangle:");
					
					// Iterative statement to create Isoceles Angled Triangle
					for (int i = 0; i < oddNumber; i = i + 2) {
						
						// Declare variables for iterative statements
						double a = (oddNumber/2) ;
						int b = (int) a+1;
								
						// Create StringBuilders for Isoceles Angled Triangle
						StringBuilder IsocelesAngledTriangleForward = new StringBuilder();
						StringBuilder IsocelesAngledTriangleBackward = new StringBuilder();
								
						// Create iterative statement to append * to the current(i) row
						for (int j = 0; j <= i; j++) {
							IsocelesAngledTriangleForward.append("*");
						}
						
						// Create iterative statement to append spaces to the current(i) row
						for (int k = 0; k < oddNumber-((i/2)+ b); k++) {
							IsocelesAngledTriangleForward.append(" ");
						}
						
						// Create iterative statement to reverse rows of Isoceles Angled Triangle							
						for (int l = oddNumber-b+(i/2); l >= 0; l--) {
							IsocelesAngledTriangleBackward.append(IsocelesAngledTriangleForward.charAt(l));
						}
						
						// Print out current(i) row
						System.out.print(IsocelesAngledTriangleBackward+"\n");
					}
				}
				
				// In case that number is not an odd positive integer
				else {
					System.out.print(oddNumber+" is not an odd positive integer!");
				}
			}
			
			// In case input is not an integer
			else {
				System.out.print("Input is not an integer!");
			}
			
		// Close Scanner
		sc.close();
	}
}
