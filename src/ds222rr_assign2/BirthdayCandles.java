package ds222rr_assign2;

public class BirthdayCandles {
	public static void main(String[] args) 
	{
		// Declare variables for the iterative and selective statements
		int boxes = 0, box = 0, candles = 0;
		
		// Iterative statement to determine the candles that are needed
		for (int i = 1; i <= 100; i++) {
			
			// In case candles are insufficient
			if (candles-i < 0) {
					
				// Iterative statement to determine the amount of boxes and candles
				while (candles-i < 0) {
					boxes++; // Total amount of boxes to buy
					box++;	// Boxes to buy for the current(i) birthday
					candles = candles + 24; // Candles per box
				}	
					candles = candles -i; // Candles needed for the current(i) birthday
					
					// Print out reminder for the current(i) birthday
					System.out.println("Before birthday "+i+", buy "+box+" box(es)");
					
					// Set box to zero
					box = 0;
			}
			
			// In case candles are sufficient
			else {
				candles = candles-i; // Candles needed for the current(i) birthday
			}
		}
		
		// Print out result
		System.out.print("\nTotal number of boxes: "+boxes+", Remaining candles: "+candles);
	}
}
