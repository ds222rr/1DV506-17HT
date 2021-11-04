package ds222rr_assign3;

public class MultiDisplayMain {
	public static void main(String[] args) {
		
			// Create a new MultiDisplay object
			MultiDisplay md = new MultiDisplay();
			
			md.setDisplayMessage("Hello World!");		// ==> set displayMessage == "Hello World!"
			md.setDisplayCount(5);						// ==> set counter == 5
			md.display();								// ==> print-out "Hello World!" 5 times
			System.out.println("Current Message: "+ md.getDisplayMessage()); // ==> print out "Current Message: Hello World!"
			System.out.println("Current Counter: "+ md.getDisplayCount()); // ==> print out "Current Counter: 5"
			
			md.setDisplayMessage("The Second Message");	// ==> displayMessage == "The Second Message"
			md.display();								// ==> print-out "The Second Message" 5 times
			System.out.println("Current Message: "+ md.getDisplayMessage()); // ==> print out "Current Message: The Second Message"
			System.out.println("Current Counter: "+ md.getDisplayCount()); // ==> print-out "Current Counter: 5"
				
			md.display("The Third Message", 2);  		/* ==> set displayMessage == "The Third Message"  
														   ==> set counter == 2
														   ==> print-out "The Third Message" 2 times */
			
			System.out.println("Current Message: "+ md.getDisplayMessage()); // print-out "Current Message: The Third Message"
			System.out.println("Current Counter: "+ md.getDisplayCount()); // ==> print out "Current Counter: 2"
			
			md.display("The Fourth Message", 0);  		/* ==> set displayMessage == "The Fourth Message"
														   ==> print-out "Set counter to 0 rejected! Counter must be at least 1!
														   ==> print-out "Cannot print a message 0 times!" */
														 
			System.out.println("Current Message: "+ md.getDisplayMessage()); // // print-out "Current Message: The Fourth Message"	
			System.out.println("Current Counter: "+ md.getDisplayCount()); // ==> print out "Current Counter: 2"
			
			md.display("The Last Message", 1);  		/* ==> set displayMessage == "The Last Message"  
			   											   ==> set counter == 1
			   											   ==> print-out "The Last Message" 1 time */
			
			System.out.println("Current Message: "+ md.getDisplayMessage()); // ==> print-out "Current Message: The Last Message"
			System.out.println("Current Counter: "+ md.getDisplayCount()); // ==> print out "Current Counter: 1"
			
			md.setDisplayCount(-3);						// ==> print-out "Set counter to -3 rejected! Counter must be at least 1!
			
			System.out.println("Current Counter: "+ md.getDisplayCount()); // ==> print out "Current Counter: 1"
			md.display();								// ==> print-out "Current Message: The Last Message"
	}
}
