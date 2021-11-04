package ds222rr_assign4;

import java.text.DecimalFormat;	// Get DecimalFormat from Java Library
import java.util.Scanner;		// Get Scanner from Java Library

public class DrunkenWalk {
	public static void main(String[] args) {
		int fallen = 0;	 // number of drunks fallen into the water
		Scanner scan = new Scanner(System.in);	// Create new Scanner object connected to the keyboard
		System.out.print("Enter the size: ");
		int size = scan.nextInt();
		System.out.print("Enter the number of steps: ");
		int max = scan.nextInt();
		System.out.print("Enter the number of walks: ");
		int walks = scan.nextInt();


		for (int i = 0; i < walks; i++) {	// Iterative statement to process random walks
			RandomWalk rand = new RandomWalk(max, size);	// Create new RandomWalk object
			rand.walk();	// process random walk
			if (!rand.inBounds()) {		// In case position is out of bounds
				fallen++;
			}
		}
		
		DecimalFormat dFormat = new DecimalFormat("0.00");	// Create new DecimalFormat object
		double fallenPercent = ((double) fallen/(double) walks)*100;
		String str = dFormat.format(fallenPercent);
		System.out.println("Out of "+walks+" drunk people, "+fallen+" ("+str+"%) fell into the water.");
		scan.close();	// close Scanner
		fallen = 0;
		
	}
}
