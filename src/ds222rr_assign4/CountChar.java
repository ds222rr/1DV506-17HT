package ds222rr_assign4;

import java.io.File;					// Get File from Java Library
import java.util.Scanner;				// Get Scanner from Java Library

public class CountChar {
	public static void main(String[] args) {
		
		File file = new File(args[0]);	// Create File object connected to a file
		
		try {
			Scanner scan = new Scanner(file);	// Create Scanner object connected to a file object
			StringBuilder sb = new StringBuilder();	// Create StringBuilder object
	
			int [] arr = new int[5];	// Declare array to store all numbers of all character types

			// Iterative statement to assign every line of 'file' to a String object
			while (scan.hasNextLine()) {
				String temp = scan.nextLine();	// Create a String object that contains the next line of 'file'
				sb.append(temp+"\n");
			}
			scan.close();	// Close Scanner
			String str = sb.toString();	// Create String object

			// Iterative statement to determine the numbers of all character types
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);	// Store the current character of 'temp' in 'c'
				// In case 'c' is an UpperCase character
				if (Character.isUpperCase(c)) {
					arr[0]++;
				}
				// In case 'c' is a LowerCase character
				else if (Character.isLowerCase(c)) {
					arr[1]++;
				}
				// In case 'c' is a digit character
				else if (Character.isDigit(c)) {
					arr[2]++;
				}
				// In case 'c' is a WhiteSpace character
				else if (Character.isWhitespace(c)) {
					arr[3]++;
				}
				// In case 'c' does not belong to any previous type
				else {
					arr[4]++;
				} 
			}		
			// Print result
			System.out.println("Number of upper case letters: "+arr[0]);
			System.out.println("Number of lower case letters: "+arr[1]);
			System.out.println("Number of digits: "+arr[2]);
			System.out.println("Number of \"whitespaces\": "+arr[3]);
			System.out.println("Number of others: "+arr[4]);
		}
		catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}	
}