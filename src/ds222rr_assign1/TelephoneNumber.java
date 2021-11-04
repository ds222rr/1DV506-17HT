package ds222rr_assign1;
// Get DecimalFormat from Java Library
import java.text.DecimalFormat;
// Get Random from Java Library
import java.util.Random;

public class TelephoneNumber {

	public static void main(String[] args) {
		// Create a random number generator
		Random rand = new Random();
		// Create empty StringBuilder
		StringBuilder sb = new StringBuilder();
		// Create DecimalFormat
		DecimalFormat dFormat = new DecimalFormat("0000");
			// Create telephone number
			String areaNumber = dFormat.format(rand.nextInt(999));
			int localNumber = 1+rand.nextInt(8);
			String otherDigits = dFormat.format(rand.nextInt(9999));
			sb.append(areaNumber+'-'+localNumber+otherDigits);
				// Telephone number Output
				System.out.print(sb);
	}

}
