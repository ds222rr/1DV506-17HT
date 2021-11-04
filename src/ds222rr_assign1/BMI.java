package ds222rr_assign1;
// Get Scanner from Java Library
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// Create a Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);		
			// Enter length
			System.out.print("Give your length in meters: ");
			double length = sc.nextDouble();
			// Enter weight
			System.out.print("Give your weight in kilograms: ");
			int weight = sc.nextInt();
				// Calculate BMI
				double bmi = weight/(length*length);
				int bmiInteger = (int) (bmi+0.5);
				System.out.print("Your BMI is: "+bmiInteger);
		// Close Scanner
		sc.close();
	}

}
