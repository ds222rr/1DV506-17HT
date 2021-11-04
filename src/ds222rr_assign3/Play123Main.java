package ds222rr_assign3;

import java.text.DecimalFormat;		// Get DecimalFormat from Java Library

public class Play123Main {
	public static void main(String[] args) {
		Deck d = new Deck();		// Create Deck object
		double win = 0;				// counter for win
		double loose = 0;			// counter for loose
		// Iterative statement to determine number of games won and lost
		for (int i = 0; i < 10000; i++) {
			d.reassembleDeck();		// reassemble Deck
			d.shuffle();			// shuffle Deck
			// In case of winning a game
			if(d.play123()) {
				win++;
			}
			// In case of loosing a game
			else {
				loose++;
			}
		}
		
		// Declare doubles for result
		double winFloat = (win/100);
		double looseFloat = (loose/100);
		
		DecimalFormat dFormat = new DecimalFormat("0.00");	// Create DecimalFormat object
		
		// Declare Strings for result
		String winDecimal = dFormat.format(winFloat);
		String looseDecimal = dFormat.format(looseFloat);

		// Print out result
		System.out.println("Percentage of games won:\t"+winDecimal); 
		System.out.println("Percentage of games lost:\t"+looseDecimal); 
	}
}
