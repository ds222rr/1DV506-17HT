package ds222rr_assign3;

public class MultiDisplay {
	private String displayMessage;	// Display message
	private int counter;			// Counter
	
	
	// Constructors
	public MultiDisplay() {
		displayMessage = "";
		counter = 0;
	}
	public MultiDisplay(String dM, int countNext) {
		setDisplayMessage(dM);
		setDisplayCount(countNext);
	}
	
	// Accessors
	public String getDisplayMessage() {
		return displayMessage;
	}
	public int getDisplayCount() {
		return counter;
	}
	
	// Mutators
	public void setDisplayMessage(String dM) {
		displayMessage = dM;	// update display message
	}
	public void setDisplayCount(int countNext) {
		if (isCounterAboveZero(countNext))
			counter = countNext;	// update counter
		else {
			System.out.println("Set counter to "+countNext+" rejected! Counter must be at least 1!");
		}
	}

	// Other methods
	private boolean isCounterAboveZero(int countNext) { // Verification for counter
		return countNext > 0;
	}
	public void display(String displayMessage, int countNext) { // Printer with parameters
		setDisplayMessage(displayMessage);
		setDisplayCount(countNext);
			int i = 0;
			// Iterative statement to print out message
			while (i < counter) {
				System.out.println(displayMessage);
				i++;
		}
	}
	public void display() { // Printer without parameters
		for (int i = 0; i < counter; i++) {
			System.out.println(displayMessage);
		}
	}
}
