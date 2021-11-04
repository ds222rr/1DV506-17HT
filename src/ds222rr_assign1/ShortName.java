package ds222rr_assign1;
// Get Scanner from Java Library
import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		// Create a new Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			// Enter first name
			System.out.print("Enter first name: ");
			String first = sc.nextLine();
			// Enter last name
			System.out.print("Enter last name: ");
			String last = sc.nextLine();
				// Create short first name
				char firstShort = first.charAt(0);
				// Create short last name
				String lastShort = last.substring(0,4);
					// Result Output
					System.out.print("Short name: "+firstShort+'.'
									+lastShort);				
		// Close Scanner
		sc.close();
	}

}
