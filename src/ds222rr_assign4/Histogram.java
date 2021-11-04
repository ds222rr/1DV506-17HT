package ds222rr_assign4;

import java.io.File;		// Get File from Java Library
import java.io.FileNotFoundException;

import java.util.Scanner;	// Get Scanner from Java Library 

public class Histogram {
	public static void main(String[] args) throws FileNotFoundException {

		int countOthers = 0;	// Number of other input in the file

		File file = new File(args[0]);	// Create File object connected to a file
		Scanner in = new Scanner(file);		// Create Scanner object connected to a file object
		
		int arr [] = new int[10];	// Declare array to store intervals
		
		// Iterative statement to determine the amount of integers for each interval
		while (in.hasNextInt()) {
			int temp = in.nextInt();
			// In case the value of the integer is between 1 and 100
			if (temp > 0 && temp <= 100) {
				arr[((temp-1)/10)]++;	// Increase amount of integers for interval (temp-1) by 1
			}
			// In ase the value of the integer is not between 1 and 100
			else {
				countOthers++;
			}
		}

		System.out.println("Reading integers from file: "+(args[0]));
		int countIntegers = sumOfIntegers(arr);	// Calculate total number of integers
		System.out.println("Number of integers in the interval [1,100]: "+countIntegers);
		System.out.println("Others: "+countOthers);
		System.out.println("Histogram");
		
		// Iterative statement to print the result
		for (int i = 0; i < 100; i += 10) {
			int j = 0;
			// In case of the first interval
			if (i == 0) {
				System.out.print("  "+(i+1)+"  - "+(i+10)+"  | ");
			}
			// In case of of the 2nd to the 9th interval
			else if (i != 0 && i < 90) {
				System.out.print("  "+(i+1)+" - "+(i+10)+"  | ");	
			}
			// In case of the last interval
			else if (i == 90) {
				System.out.print("  "+(i+1)+" - "+(i+10)+" | ");	
			}
			printStars(arr, i, j);
		}
		in.close();	// Close Scanner	
	}
	// Method to calculate the amount of integers in all intervals
	public static int sumOfIntegers(int [] array) {
		int number = 0;
		for (int i = 0; i < array.length; i++) {
			number = number + array[i];
		}
		return number;
	}
	
	// Method to print the amount of stars according to the amount of numbers in the current interval
	public static void printStars(int [] array, int a, int b) {
		while (b < array[a/10]) {
			System.out.print("*");
			b++;
		}
		System.out.println("");	// Next line
	}
}
