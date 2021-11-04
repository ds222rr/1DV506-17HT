package ds222rr_assign4.newsagency;

import java.util.ArrayList;	// Get ArrayList from Java Library

public class NewsPaper {
	
	private ArrayList<News> newsSendAndReceived;		// To store all created, send and received news
	private ArrayList<News> newsToBeSend;	// To store the latest news that have not been delivered
	private final String nameOfNewspaper;
	private ArrayList<NewsAgency> registeredNA;	// To store all NewsAgency at which the newspaper has been registered
			
	public NewsPaper(String name) {		// Constructor
		newsSendAndReceived = new ArrayList<News>();
		newsToBeSend = new ArrayList<News>();
		nameOfNewspaper = name;
		registeredNA = new ArrayList<NewsAgency>();
	}
	
	public void sendNews() {
		if (newsToBeSend.size() == 0) {		// In case the newspaper has not any news to send
			System.out.println("No news to be send!\n");
		}
		else if (registeredNA.size() == 0) {
			System.out.println("Newspaper "+this.getName()+" is not registered at any NewsAgency!\n");
		}
		else {	// send the latest news to the NewsAgencys
			for (int j = 0; j < registeredNA.size(); j++) {
				for (int i = 0; i < newsToBeSend.size(); i++) {
					registeredNA.get(j).addNews(newsToBeSend.get(i));
				}
				for (int k = 0; k < registeredNA.size(); k++) {
					News lastItem = new News("Last Item", this);		// Create this object to signal that 
					registeredNA.get(k).addNews(lastItem);				// there are no more news to receive
				}
			}	
			newsToBeSend.clear();	// delete array's content after all news have been send
		}
	}
	
	public void receiveNews(News news) {	// to let the newspaper receive the latest news from the NewsAgency
		boolean verify = false;
		for (int i = 0; i < newsSendAndReceived.size(); i++) {			// Iterative statement to verify whether the
			if (newsSendAndReceived.get(i).getID() == news.getID()) {	// newspaper has already received the news
				verify = true;
				break;
			}
		}
		if (!verify) { 
			newsSendAndReceived.add(news);
		}
	}
	
	public void generateNews(String text) {		// Generate News
		News news = new News(text, this);
		newsSendAndReceived.add(news);
		newsToBeSend.add(news);
	}
	
	public void getNews() {		// Print out all news of a newspaper
		System.out.println("\nThe news of "+nameOfNewspaper+"\n");
		if (newsSendAndReceived.size() > 0) {	// In case the newspaper has news to print at all
			for (int i = 0; i < newsSendAndReceived.size(); i++) {
				System.out.println("\""+newsSendAndReceived.get(i).getContent()+"\"");	// Print the news
				System.out.println("Creator: "+newsSendAndReceived.get(i).getCreator()+"\n");	// Print its creator
			}
			System.out.print("\n");
		}
		else {	// In case the newspaper has no news to print
			System.out.println("No news\n\n");
		}
	}
	
	public String getName() {	// Get the name of a newspaper
		return nameOfNewspaper;
	}
	
	public void registerAtAgency(NewsAgency n) {	// Register a newspaper at a NewsAgency
		n.register(this);
	}
	
	public void addAgency(NewsAgency newsAgency) {	// Add an Agency to the Newspapers list
		registeredNA.add(newsAgency);
	}
}
