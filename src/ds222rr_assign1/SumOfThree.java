package ds222rr_assign1;
// Get Scanner from Java Library
import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			// Enter three digit number
			System.out.print("Provide a three digit number: ");
			int number = sc.nextInt();
				// Calculate first digit
				int firstDigit = number/100;
				// Calculate second digit
				int secondDigit = (number/10)%10;
				// Calculate third digit
				int thirdDigit = number%10;
					// Calculate Sum of digits
					int sumOfDigits = firstDigit+secondDigit
									  +thirdDigit;
						// Sum of digits Output
						System.out.print("Sum of digits: "
										+sumOfDigits);
		// Close Scanner
		sc.close();
	}

}
