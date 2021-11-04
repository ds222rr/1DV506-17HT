package ds222rr_assign2;
// Get Random from Java Library
import java.util.Random;

public class FrequencyTable {
	public static void main(String[] args) {
		
		// Declare array
		int [] dice = {0,0,0,0,0,0};
			
		// Create a random number generator
		Random rand = new Random();
				
		// Run iterative statement to determine frequency of dice numbers (dice numbers = rand + 1)
		for (int i = 0; i < 6000; i++) {
			dice[rand.nextInt(6)]++; // current(rand) dice number increased by one
		}
	
		// Print out result		
		System.out.println("Frequencies when rolling a dice 6000 times:");
				
		// Run iterative statement to print out result
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i+1)+": "+dice[i]);
		}
	}
}
