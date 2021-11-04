package ds222rr_assign3;

public class RadioMain {
	public static void main(String[] args) {
		System.out.println("Radio 1");
		Radio r1 = new Radio(); // Create new Radio object
		System.out.println( r1.getSettings());  // Default settings
				
		// Modify Radio 1 settings
		r1.setVolume(3);	// Printout "Radio off ==> No adjustment possible"
		r1.turnOn();		// Radio 1 turned on
		r1.setVolume(3);	// Radio 1 = volume(3)
		r1.channelUp();		// Radio 1 = channel(2)
		r1.channelUp();		// Radio 1 = channel(3)
		r1.channelUp();		// Radio 1 = channel(4)
		r1.turnOn();		// Printout "Radio is already turned on!"
		System.out.println( r1.getSettings()); // Radio 1 settings: On true, Channel 4, Volume 3
				
		r1.turnOff();		// Radio 1 turned off
		System.out.println( r1.getSettings());  // Radio 1 settings: On false, Channel 1, Volume 1 (default)
		r1.turnOff();		// Printout "Radio is already turned off!"
				
		System.out.println("\nRadio 2");
		Radio r2 = new Radio(); // Create new Radio object
		
		// Modify Radio 1 settings
		r2.volumeUp();   	// Printout "Radio off ==> No adjustment possible"				
		r2.turnOn();		// Radio 2 turned on
		r2.volumeDown();	// Radio 1 = volume(0)
		r2.volumeDown();	// Printout "New volume not within range!"
		r2.setChannel(15);	// Printout "New channel not within range!"
		System.out.println( r2.getSettings());	// Radio 2 settings: On true, Channel 1, Volume 0
		r2.turnOff();		// Radio 2 turned off
		System.out.println( r2.getSettings());  // Radio 2 settings: On false, Channel 1, Volume 1 (default)
	}		
}

