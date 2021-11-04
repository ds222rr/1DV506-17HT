package ds222rr_assign1;

// Get Scanner from Java Library
import java.util.Scanner;

public class Seconds {

	public static void main(String[] args) {
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			// Enter number of hours
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			// Enter number of minutes
			System.out.print("Minutes: ");
			int minutes = sc.nextInt();
			//Enter number of seconds
			System.out.print("Seconds: ");
			int seconds = sc.nextInt();
				// Calculate total time in seconds
				int time = hours*3600+minutes*60+seconds;
				System.out.print("\nTotal time measured in seconds: "
								+time);
		// Close Scanner
		sc.close();
	}

}
