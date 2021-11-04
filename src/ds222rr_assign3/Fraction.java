package ds222rr_assign3;

public class Fraction {
	private final int SIZE = 2;
	private int [] data;
	
	// Constructors
	public Fraction() {
		data = new int [SIZE];
		data[0] = 1;
		data[1] = 1;
	}
	public Fraction(int num, int den) {
		data = new int [SIZE];
		if (checkForZero(den)) {
			data[0] = num;
			data[1] = den;
		}	
	}
	
	// Accessors
	public int getNumerator() {	// Get numerator
		return data[0];
	}
	public int getDenominator() {	// Get denominator
		return data[1];
	}
	
	public String toString() {	// Turn Fraction to String
		StringBuilder sb = new StringBuilder();
		// Iterative statement to convert Fraction to a String
		for (int i = 0; i < 2; i++) {
			sb.append(data[i]);
			if (i == 0) {
				sb.append("/");
			}
		}
		String str = sb.toString();
		return str;
	}		
	public Fraction add(Fraction f) {	// Addition
		Fraction Frac = new Fraction();
		// In case the denominators do not equals zero
		if (checkForZero(data[1]) && checkForZero(f.data[1])) {	
			Frac.data[0] = data[0]*f.data[1]+f.data[0]*data[1];	// numerator
			Frac.data[1] = data[1]*f.data[1];	// denominator
		}
		// In case a denominator equals zero
		else {
			defaultFraction(Frac);
		}
		return Frac;
	}
	public Fraction subtract(Fraction f) {	// Subtraction
		Fraction Frac = new Fraction();
		// In case the denominators do not equals zero
		if (checkForZero(data[1]) && checkForZero(f.data[1])) {	
			Frac.data[0] = data[0]*f.data[1]-f.data[0]*data[1];	// numerator
			Frac.data[1] = data[1]*f.data[1];	// denominator
		}
		// In case a denominator equals zero
		else {
			defaultFraction(Frac);
		}
		return Frac;
	}
	
	public Fraction multiply(Fraction f) {	// Multiplication
		Fraction Frac = new Fraction();
		// In case the denominators do not equals zero
		if (checkForZero(data[1]) && checkForZero(f.data[1])) {	
			Frac.data[0] = data[0]*f.data[0];	// numerator
			Frac.data[1] = data[1]*f.data[1];	// denominator
		}
		// In case a denominator equals zero
		else {
			defaultFraction(Frac);
		}
		return Frac;
	}
	
	public Fraction divide(Fraction f) {	// Division
		Fraction Frac = new Fraction();
		// In case the denominators do not equals zero
		if (checkForZero(data[1]) && checkForZero(f.data[1])) {	
			Frac.data[0] = data[0]*f.data[1];	// numerator
			Frac.data[1] = data[1]*f.data[0];	// denominator
		}
		// In case a denominator equals zero
		else {
			defaultFraction(Frac);
		}
		return Frac;
	}
	
	// Other
	public boolean isEqualTo(Fraction f) {	// Verify equality of two Fractions
		// Iterative statement to verify the equality of two Fractions
		for (int i = 0; i < 2; i++) {
			// In case numerator or denominator are not equal
			if (data[i] != f.data[i]) {
				return false;
			}
		}
			return true;
	}
	public boolean isNegative() {	// Verify negativity of a Fraction
		double frac = ((double) data[0])/ ((double) data[1]);
		return frac < 0;
	}
	// Private help methods
	private boolean checkForZero(int n) {	// Verify whether denominator is zero or not
		return n != 0;
	}
	private Fraction defaultFraction(Fraction defFrac) {	// Return defaultFraction if the denominator of a Fraction is zero
		System.out.println("Cannot perform a calculation when a denominator is 0! (returning 1/1)");
		defFrac.data[0] = 1;	// numerator
		defFrac.data[1] = 1;	// denominator
		return defFrac;
	}
}
