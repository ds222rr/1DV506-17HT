package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;
// Get ArrayList from Java Library
import java.util.ArrayList;

public class ReverseOrder {
	public static void main(String[] args) {
		
		// Create ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			
			// Declare variables for iterative statement
			int counter = 0, inputInteger = 0;
			
			System.out.println("Enter positive integers. End by giving a negative number.");
			
			// Iterative statement for integer input
			while (inputInteger >= 0) {
				counter++; // Number for the next integer
				System.out.print("Integer "+counter+": ");
					
				// In case input is not an integer
				if (!sc.hasNextInt()) {
					System.out.print("Invalid input!\n");
					counter--; // Decrease counter due to invalid input
					sc.next();
				}
					
				// In case input is an integer
				else {
					inputInteger = sc.nextInt();
					if (inputInteger >= 0) {
						list.add(inputInteger); // Add current integer to the array
					}
				}
			}	
			
			System.out.println("Number of positive integers: "+(counter-1));
			System.out.print("In reverse order: ");
			
			// Iterative statement to reverse array 
			for (int i = 0; i < list.size()/2; i++) { // Run-time until the middle of the array is reached
				int storeFirst = list.get(i); // Store the front integer
				int storeLast = list.get(list.size()-i-1); // Store the back integer
				list.remove(i); // Remove the front integer from its original position in the array
				list.add(i, storeLast); // Place the back integer on the original position of the front integer in the  array
				list.remove(list.size()-i-1); // Remove the back integer from its original position in the array
				list.add(list.size()-i, storeFirst); // Place the front integer on the original position of the back integer in the  array
			}
			
			// Iterative statement to print out reversed array
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}

		// Close Scanner
		sc.close();
	}
}
