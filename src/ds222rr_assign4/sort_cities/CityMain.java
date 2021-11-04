package ds222rr_assign4.sort_cities;

import java.io.File;					// Get File from Java Library
import java.io.FileNotFoundException;	// Get FileNotFoundException from Java Library
import java.util.ArrayList;				// Get ArrayList from Java Library
import java.util.Scanner;				// Get Scanner from Java Library

public class CityMain  {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<City> arr = new ArrayList<City>();	// Create new ArrayList object
		File file = new File(args[0]);					// Create new File object connected to an argument
		Scanner scan = new Scanner(file);				// Create new Scanner object connected to 'file'
		int count = 0;
		
		System.out.println("Reading cities from file: "+(args[0]));
		
		while (scan.hasNextLine()) {						// Iterative statement to scan the next line of 'file'
			StringBuilder citySb = new StringBuilder();		// Create new StringBuilder object
			StringBuilder zipCodeSb = new StringBuilder();	// Create new StringBuilder object
			int i = 0;
			String temp = scan.nextLine();
			while (temp.charAt(i) != ';') {					// Iterative statement to append city name on 'citySb'
				citySb.append(temp.charAt(i));
				i++;
			}
			i++;

			while (i < temp.length() && Character.isDigit(temp.charAt(i))) {	// Iterative statement to append city zipCode on 'citySb'
				zipCodeSb.append(temp.charAt(i));
				i++;
			}
			String cityString = citySb.toString();
			String zipCodeString = zipCodeSb.toString();
			int zipCodeInt = Integer.parseInt(zipCodeString);
			arr.add(new City(cityString, zipCodeInt));			// Create new City object and add it to the ArrayList
			count++;
		}
		scan.close();
		System.out.println("Number of cities found: "+count+"\n");
		
		City temp;	// City object to store a City temporary
				
		for (int i = 0; i < arr.size(); i++) {		// Nestled statement to sort the ArrayList
			for (int j = 0; j < arr.size()-1; j++) {
				if ((arr.get(j).compareTo(arr.get(j+1)) == arr.get(j).getZipCode())) {
					temp = arr.get(j);
					arr.remove(j);
					arr.add(j+1, temp);
				}			
			}
		}
		
		for (int i = 0; i < arr.size();i ++) {	// Iterative statement to print all elements of the ArrayList
			System.out.println(arr.get(i).getZipCode()+" "+arr.get(i).getCity());
		}
	}
}
