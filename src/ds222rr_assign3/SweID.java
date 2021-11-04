package ds222rr_assign3;
// Get Scanner from  Java Library
import java.util.Scanner;

public class SweID {
	public static void main(String[] args) {

		// Create Scanner object connected to the keyboard
		Scanner sc = new Scanner(System.in);
		
			// Method 1 and Method 7: Enter first Swedish personal number and verify correctness
			System.out.print("Enter Swedish personal number (format: YYMMDD-NNNN): ");
			String c = sc.nextLine();

			String sweIDOne = verifyInput(c);	// verify whether length is 11
			if (!isCorrect(sweIDOne)) {			// verify whether number is a swedish personal number
				System.exit(-1);				// terminate program if number is not a swedish personal number
			}
		
			// Method 1 and Method 7: Enter second Swedish personal number and verify correctness
			System.out.print("Enter another Swedish personal number (format: YYMMDD-NNNN): ");
			c = sc.nextLine();
		
			String sweIDTwo = verifyInput(c);	// verify whether length is 11
			if (!isCorrect(sweIDTwo)) {			// verify whether number is a swedish personal number
				System.exit(-1);				// terminate program if number is not a swedish personal number
			}
			// Print result
			System.out.print("\n");
			System.out.println(sweIDOne+" is a correct Swedish personal number!");
			System.out.println(sweIDTwo+" is a correct Swedish personal number!");
		
			// Method 2 and Method 3 string declaration and printout
			String firstPart = getFirstPart(sweIDOne);
			String secondPart = getSecondPart(sweIDOne);
			System.out.println("First part of the first number is: "+firstPart);
			System.out.println("Second part of the first number is: "+secondPart);
		
			// Method 4 or Method 5 printout
			System.out.print(firstPart+"-"+secondPart);
			// In case isFemaleNumber returns true
			if (isFemaleNumber(sweIDOne)) {
			System.out.println(" is a female number");
			}
			// In case isMaleNumber returns true
			else if (isMaleNumber(sweIDOne)) {
				System.out.println(" is a male number");
			}
		
			// Method 6 printout
			// In case sweID and sweIDTwo are equal
			if (areEqual(sweIDOne, sweIDTwo)) {
				System.out.println(sweIDOne+" and "+sweIDTwo+" are equal!");
			}
			// In case sweID and sweIDTwo are not equal
			else {
				System.out.println(sweIDOne+" and "+sweIDTwo+" are not equal!");
			}

		// Close Scanner
		sc.close();
	}
	
	/*   M E T H O D S   */
	
	// Method 1: verify that input is correct and return string
	public static String verifyInput(String c) {
		// In case input's length is not 13
		if (c.length() < 11 || c.length() >= 12) {
			System.err.print("Invalid input!");
			System.exit(-1);
		}
		// Declare StringBuilder
		StringBuilder sb = new StringBuilder();
		// Iterative statement to append String c to StringBuilder
		for (int i = 0; i < c.length(); i++) {
			sb.append(c.charAt(i));
		}
		String correctString = sb.toString();
		return correctString;
	}
	
	// Method 2: getFirstPart of sweID
	public static String getFirstPart(String sweID) {
		StringBuilder sb = new StringBuilder();
		// Iterative statement to get the first part of sweID
		for (int i = 0; i < 6; i++) {
			sb.append(sweID.charAt(i));
		}
		String partID = sb.toString();
		return partID;
	}
	
	// Method 3: getSecondPart of sweID
	public static String getSecondPart(String sweID) {
		StringBuilder sb = new StringBuilder();
		// Iterative statement to get the second part of sweID
		for (int i = 7; i <= 10; i++) {
			sb.append(sweID.charAt(i));
		}
		String partID = sb.toString();
		return partID;
	}
	
	// Method 4: determine whether sweID isFemaleNumber
	public static boolean isFemaleNumber(String sweID) {
		// In case 11th char of sweID is even
		if (sweID.charAt(9)%2 == 0) {
			return true;
		}
		return false;
	}
	
	// Method 5: determine whether sweID isMaleNumber
	public static boolean isMaleNumber(String sweID ) {
		// In case 11th char of sweID is odd
		if (sweID.charAt(9)%2 == 1) {
			return true;
		}
		return false;
	}
	
	// Method 6: determine whether two Swedish Personal numbers areEqual
	public static boolean areEqual(String sweID, String sweIDTwo) {
		// Iterative statement to compare two Swedish Personal numbers
		for (int i = 0; i < sweID.length(); i++) {
			// In case current(i) element of sweID is not equal to current(i) element of sweIDTwo
			if (sweID.charAt(i) != sweIDTwo.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	// Method 7: verify whether number is a correct swedish personal number
	public static boolean isCorrect(String sweID) {
		// Iterative statement to verify that all elements are correct (digits and dash)
		for (int i = 0; i < 11; i++) {
			// In case position 8 of the array is not a dash or the other positions are not digits
			if ((i == 6 && sweID.charAt(i) != '-') || (i != 6 && !Character.isDigit(sweID.charAt(i)))) {
				System.err.println(sweID+" is not a correct Swedish personal number! (invalid format)");
				return false;
			}
		}
		// Create year integer
		String strYear = sweID.substring(0,2);
		int year = Integer.parseInt(strYear);
		
		// Verify that month is correct
		String strMonth = sweID.substring(2,4);
		int month = Integer.parseInt(strMonth);
		if (month <= 0 || month > 12) {
			System.err.println(sweID+" is not a correct Swedish personal number! (invalid month)");
			return false;
		}
		
		// Verify that day is correct
		String strDay = sweID.substring(4,6);
		int day = Integer.parseInt(strDay);
		// In case month is January, March, May, July, August, October or December and day is not between 0 and 31
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && ((day <= 0 || day > 31))) {
			System.err.println(sweID+" is not a correct Swedish personal number! (invalid day)");
			return false;
		}
		// In case month is April, June, September or November and day is not between 0 and 30
		else if ((month == 4 || month == 6 || month == 9 || month == 11) && ((day <= 0 || day > 30))) {
			System.err.println(sweID+" is not a correct Swedish personal number! (invalid day)");
			return false;
		}
		// In case month is February
		else if (month == 2) {
			// In case of a leap year
			if ((year%4 == 0) && (day <= 0 || day > 29)) {
				System.err.println(sweID+" is not a correct Swedish personal number! (invalid day)");
				return false;
			}
			// In case of not a leap year
			if ((year%4 != 0) && (day <= 0 || day > 28)) {
				System.err.println(sweID+" is not a correct Swedish personal number! (invalid day)");
				return false;
			}
		}
		// Verify that checksum is correct
		int sum = 0; // total sum
		int j = 2; // to determine which multiplicator (1 or 2) must be chosen
		// Iterative statement to determine sum
		for (int i = 0; i <= 9; i++) {
			int temp = Character.getNumericValue(sweID.charAt(i));
			// In case element number is even
			if (j%2 == 0) {				
				temp = temp * 2; // since multiplicator is 2
			}
			// In case number is greater than 9
			if ((sweID.charAt(i) * 2) > 9)  {
				temp = temp/10 + temp%10; // checksum of current temp value
			}
			sum = sum + temp; // add next element number to sum
			j++; // increase j to get the correct multiplicator for the next element
			// In case the position before the dash is reached
			if (i == 5) {
				i++; // to skip the dash
			}
		}
		// Calculate and verify checksum
		int checksum = 10-(sum%10);
		// In case checksum is not equal to the last digit of the Swedish personal number
		if (checksum != Character.getNumericValue(sweID.charAt(10))) {
			System.err.println(sweID+" is not a correct Swedish personal number! (invalid last digit)");
			return false;
		}
		return true;
	}
}