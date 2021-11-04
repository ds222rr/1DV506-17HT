package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;
// Get ArrayList from Java Library
import java.util.ArrayList;
// Get Collections from Java Library
import java.util.Collections;

public class SalaryRevision {
	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Create an ArrayList
			ArrayList<Integer> list = new ArrayList<Integer>();
		
			System.out.print("Provide salaries (and terminate input with 'X'): ");
			
			// Selective statement to verify that input is an integer
			if (sc.hasNextInt()) {
				
				// Iterative statement to provide salaries
				while (sc.hasNextInt()) {	
					list.add(sc.nextInt());
					
					// In case next input is not an integer
					if (!sc.hasNextInt()) {
						
						// In case input equals "X"
						if (sc.next().equals("X")) {
							break; // Stop iterative statement
						}
						
						// In case input equals anything else
						else {
							System.err.print("Invalid input or termination!");
							System.exit(-1); // Stop program
						}
					}
				} 
			
				// Sort array
				Collections.sort(list);
			
				// Calculate Median
				double median = 0;
				// In case array-size is even
				if (list.size()%2 == 0) {
					median = (list.get(list.size()/2 - 1) + list.get(list.size()/2));
					median = (median/2);
				}
				// In case array-size is odd
				else {
					median = (list.get(list.size()/2));
				}
				int medianInteger = (int) (median + 0.5); // Round-off median
			
				// Calculate Average
				double average = 0;
				for (int i = 0; i < list.size(); i++) {
					average += list.get(i);
				}
				average = (average/list.size());
				int averageInteger = (int) (average + 0.5); // Round-off average
			
				// Calulate gap
				int gap = list.get(list.size()-1)-list.get(0); // Subtract the smallest from the largest salary
			
				// Print out result
				System.out.println("Median: "+medianInteger);
				System.out.println("Average: "+averageInteger);
				System.out.println("Gap: "+gap);
			}
			
			// In case input is not an integer
			else {
				
				// In case input equals "X"
				if (sc.next().equals("X")) {
					System.out.print("No input");
					
				// In case input equals anything else
				}
				else {
					System.err.print("Invalid input!");
				}
				
			}
		// Close Scanner
		sc.close();
	}
}
