package ds222rr_assign4;

import java.util.Random;

public class RandomWalk {
	private final int maximumSteps;		// maximum steps
	private final int planeSize;		// size of the plane
	private int x;						// X-coordinate
	private int y;						// y-coordinate
	private int takenSteps;				// number of taken steps

	public RandomWalk(int max, int size) {		// Constructor
		maximumSteps = max;
		planeSize = verifySize(size);
		x = 0;
		y = 0;
		takenSteps = 0;
	}
	
	public String toString() {	// Print a string with number of steps taken so far and the current position
		String str = ("Number of taken Steps: "+takenSteps+".\tCurrent position: x "+x+"; y "+y+".");
		return str;
	}
	
	public void takeStep() {	// Take a step in a random direction
		if (!moreSteps()) {		// In case the maximum number of steps is reached
			System.out.print("Maximum steps are reached! Walk is terminated!");
		}
		else if (!inBounds()) {	// In case position is out of bounds
			System.out.print("Stepped out of bounds! Walk is terminated!");
		}
		else {
			Random rand = new Random();	// Create new Random object to determine direction
			int n = rand.nextInt(4);
			if (n == 0) {x++;}		// Go right
			else if (n == 1) {x--;}	// Go left
			else if (n == 2) {y++;}	// Go forward
			else if (n == 3) {y--;}	// Go backward
			takenSteps++;
		}
	}
	
	public boolean moreSteps() {	// true if taken steps so far is below the maximum number of steps
		return takenSteps < maximumSteps;
	}
	
	public boolean inBounds() {		// true if position is inside the bounds
		return (x < planeSize && (x*-1) < planeSize && y < planeSize && (y*-1) < planeSize);
	}
	
	public void walk() {	// Random walk until maximumSteps is reached or position out of bounds
		while (moreSteps() && inBounds()) {
			takeStep();
			
		}
	}
	
	private int verifySize(int n) {		// to verify whether size is at least 1
		if (n <= 0) {
			System.err.print("Size cannot be below zero!");
			throw new RuntimeException();
		}
		else {
			return n;
		}
	}
}
