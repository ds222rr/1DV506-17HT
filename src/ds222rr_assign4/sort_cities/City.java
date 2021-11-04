package ds222rr_assign4.sort_cities;

import java.lang.Comparable;	// Get Comparable from the Java Library

public class City implements Comparable<City> {		// implementing the Comparable Interface
	private final String cityName;
	private final int zipCode;
	
	public City(String city, int zip) {		// Constructor
		cityName = city;
		zipCode = zip;
	}
	
	public int compareTo(City city) {		// Compare zipCodes of two cities
		if (zipCode > city.zipCode) {
			return zipCode;
		}
		else {
			return city.zipCode;
		}
	}
	
	public String getCity() {		// Get City name
		return cityName;
	}
	
	public int getZipCode() {		// Get City zipCode
		return zipCode;
	}
}
