package ds222rr_assign3;

public class AlarmMain {
	public static void main(String[] args) {
		
		// Create new AlarmClock object and set clock time to 23:48 
		AlarmClock al = new AlarmClock(23, 48);
		
		// Display time 
		al.displayTime();
		
		// Set alarm to wake up at 6:15 
		al.setAlarm(6,15);
		
		// Let the clock "tick" for 500 minutes 
		for (int i = 0; i < 500; i++) {
			al.timeTick();
		}
		
		// Display time again 
		al.displayTime();
	}
}
