package ds222rr_assign1;
// Get Scanner from Java Library 
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
			// Enter price
			System.out.print("Price: ");
			double price = sc.nextDouble();
			// Enter payment
			System.out.print("Payment: ");
			int payment = sc.nextInt();
				// Calculate change
				int change = payment-(int)(price+0.5);		
				System.out.println("\nChange: "+change+" kronor");
					// Calculate 1000kr bills
					int tusenkr = change/1000;
					System.out.println("1000kr bills: "+tusenkr);
				// Recalculate change
				change = change%1000;
					// Calculate 500kr bills
					int femhundrakr = change/500;
					System.out.println(" 500kr bills: "+femhundrakr);
				// Recalculate change
				change = change%500;
					// Calculate 100kr bills
					int etthundrakr = change/100;
					System.out.println(" 100kr bills: "+etthundrakr);
				// Recalculate change
				change = change%100;
					// Calculate 50kr bills
					int femtiokr = change/50;
					System.out.println("  50kr bills: "+femtiokr);
				// Recalculate change
				change = change%50;
					// Calculate 20kr bills
					int tjugokr = change/20;
					System.out.println("  20kr bills: "+tjugokr);
				// Recalculate change
				change = change%20;
					// Calculate 10kr coins
					int tiokr = change/10;
					System.out.println("  10kr coins: "+tiokr);
				// Recalculate change
				change = change%10;
					// Calculate 5kr coins
					int femkr = change/5;
					System.out.println("   5kr coins: "+femkr);
				// Recalculate change
				change = change%5;
					// Calculate 1kr coins
					int ettkr = change;
					System.out.println("   1kr coins: "+ettkr);
		// Close Scanner
		sc.close();
	}
}
