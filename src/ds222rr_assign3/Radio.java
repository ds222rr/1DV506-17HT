package ds222rr_assign3;

public class Radio {
	private boolean on;
	private int channel;
	private int volume;
		
	// Constructor
	public Radio() {
		on = false;
		channel = 1;
		volume = 1;
	}
	
	// Accessors
	public String getSettings() { // Get settings
		String settings = ("Settings: On "+on+", Channel "+channel+", Volume "+volume);
		return settings;
	}
	
	// Mutators
	public void turnOn() { // Turn on radio
		if (on) {
			System.out.println("Radio is already turned on!");
		}
		on = true;
	}
	public void turnOff() { // Turn off radio
		if (!on) {
			System.out.println("Radio is already turned off!");
		}
		on = false;
		channel = 1;
		volume = 1;
	}
	public void setChannel(int newChannel) { // Set channel
		if (checkOn() && checkChannel(newChannel)) {
			channel = newChannel;	
		}
	}	
	public void setVolume(int newVolume) { // Set volume
		if (checkOn() && checkVolume(newVolume)) { 
			volume = newVolume;
		}
	}
	public void channelUp() { // Channel up
		if (checkOn() && checkChannel(channel+1)) {
			channel++;
		}
	}
	public void channelDown() { // Channel down
		if (checkOn() && checkChannel(channel-1)) {
			channel--;
		}
	}
	public void volumeUp() { // Volume up
		if (checkOn() && checkVolume(volume+1)) {
			volume++;
		}
	}
	public void volumeDown() { // Volume down
		if (checkOn() && checkVolume(volume-1)) {
			volume--;
		}
	}
	
	// Private help methods
	private boolean checkOn() { // Check whether radio is turned of
		if (!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return false;
		}
		else {
			return true;
		}
	}
	private boolean checkChannel(int newChannel) { // Check whether channel is in range
		if (newChannel < 1 || newChannel > 10) {
			System.out.println("New channel not within range!");
			return false;
		}
		else {
			return true;
		}
	}
	private boolean checkVolume(int newVolume) { // Check whether volume is in range
		if (newVolume < 0 || newVolume > 5) {
			System.out.println("New volume not within range!");
			return false;
		}
		else {
			return true;
		}
	}
}
