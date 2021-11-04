package ds222rr_assign2;

public class Reverse {
	public static void main(String[] args) {
		
		// Declare Array
		char [] text = {'!', 'y','s','a','E',' ','s','a','w',' ','s','i','h','T'};

		// For-Each-Loop to print out text
		for (char c: text) {
			System.out.print(c);
		}
		
		// Iterative statement to swap places of the characters in the array
		System.out.println("");
		for (int i = 0; i < (text.length/2); i++) {  // Run-time until the middle of the array is reached
			char store = text[text.length-1-i]; // Store the back character
			text[text.length-1-i] = text[i]; // Assign the front character to the position of the back character
			text[i] = store; // Assign the back character(saved in 'store') to the position of the front character
		}
		
		// Enhanced-for-loop to print out text (now reversed)
		for (char c: text) {
			System.out.print(c);
		}
	}
}
