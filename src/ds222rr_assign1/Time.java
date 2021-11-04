package ds222rr_assign1;
// Get Scanner from Java Library
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			// Enter number of seconds
			System.out.print("Give a number of seconds: ");
			int seconds = sc.nextInt();
				// Calculate hours
				int hours = seconds/3600;
				seconds = seconds-(hours*3600);
				// Calculate minutes
				int minutes = seconds/60;
				seconds = seconds-(minutes*60);
					// Time output
					System.out.print("This corresponds to: "+hours
									+" hours, "+minutes+" minutes"
									+" and "+seconds+" seconds");
		// Close Scanner
		sc.close();
	}

}
