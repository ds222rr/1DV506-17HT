package ds222rr_assign1;
// Get Scanner from Java Library
import java.util.Scanner;

public class Quote {

	public static void main(String[] args) {
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			// Quote input
			System.out.print("Write a line of text: ");
			String text = sc.nextLine();
				// Quote output
				System.out.print("Quote: "+"\""+text+"\"");
		// Close Scanner
		sc.close();
	}

}
