package ds222rr_assign1;

// Get DecimalFormat from Java Library
import java.text.DecimalFormat;
// Get Scanner from Java Library
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
			// Enter temperature in Fahrenheit
			System.out.print("Enter temperature in Fahrenheit: ");
			double fahrenheit = sc.nextDouble();
				// Calculate temperature in Celsius
				double celsius = (fahrenheit-32)*5/9;
					// Reduce result to one decimal-digit
					DecimalFormat dFormat = new DecimalFormat("0.#");
					String oneDecimalCelsius = dFormat.format(celsius);
			// Output temperature in Celsius
			System.out.print("Temperature in Celsius: "+oneDecimalCelsius);
		// Close Scanner
		sc.close();
	}

}
