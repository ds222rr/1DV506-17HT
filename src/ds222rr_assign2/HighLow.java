package ds222rr_assign2;
// Get Scanner from Java Library
import java.util.Scanner;
// Get Random from Java Library
import java.util.Random;

public class HighLow {
	public static void main(String[] args) {
		
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Create a random number generator
			Random rand = new Random();
		
			// Create a random number between 1 and 100
			int random = 1 + rand.nextInt(100);
			
			// Declare variables for the iterative statement
			boolean guess = false;
			int counter = 0;
		
			// Iterative statement for the guessing
			do {
			
				// Increase counter
				counter++;

					// Enter guess
					System.out.print("Guess "+counter+": ");
				
					// Verify that input is valid integer
					if (sc.hasNextInt()) {
						int number = sc.nextInt();
							
						// Selective statements for clue
									
						// In case the guessed number is higher
						if (number < random && counter <= 9) {
							System.out.print("\tClue: higher\n");
						}		
						// If the guessed number is lower
						else if (number > random && counter <= 9) {
							System.out.print("\tClue: lower\n");
						}
						
						// If the guessed number is correct
						else if (number == random) {
							guess = true;
							System.out.print("\tCorrect answer after only "
											+counter+" guesses - Excellent!");
						}
						// In case of more than 10 guesses
						else {
							System.out.print("The number to be guessed was: "+random);
						}
					}
				
					// In case input is not an integer
					else {
						System.out.println("\tInvalid input!");
						counter--;
						sc.next(); // new input for current(counter) guess
					}
					
			} while (!guess && counter < 10);	
		
		// Close Scanner
		sc.close();
	}
}
