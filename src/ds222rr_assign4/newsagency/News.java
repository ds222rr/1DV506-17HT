package ds222rr_assign4.newsagency;

public class News {
	
	private static int count = 0;		// To create an id for every News object
	private final String CREATOR;		// Creator of the News object
	private final String CONTENT;		// Content of the News object
	private final int ID;
	
	public News(String text, NewsPaper n) {	// Constructor
		CREATOR = n.getName();
		CONTENT = text;
		count++;
		ID = count;						// each created object gets an unique id
	}
	
	public String getContent() {		// Get the content of the News object
		return CONTENT;
	}
	
	public String getCreator() {		// Get the creator of the News object
		return CREATOR;
	}
	
	public int getID() {				// Get the ID of the News object
		return ID;
	}
}
