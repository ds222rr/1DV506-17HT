package ds222rr_assign4.newsagency;

import java.util.ArrayList;	// Get ArrayList from Java Library

public class NewsAgency {
	
	private ArrayList<NewsPaper> registeredNewspaper;	// List of newspapers registered at a NewsAgency
	private ArrayList<News> newsToBeSend;				// List of News that have to be send to all registered newspapers
	private final String newsAgencyName;
	
	public NewsAgency(String name) {	// Constructor
		registeredNewspaper = new ArrayList<NewsPaper>();
		newsToBeSend = new ArrayList<News>();
		newsAgencyName = name;
	}
	public void register(NewsPaper n) {		// To register a newspaper at a NewsAgency
		boolean alreadyRegistered = false;
		for (int i = 0; i < registeredNewspaper.size(); i++) {
			if (registeredNewspaper.get(i) == n) {	// In case the newspaper is already registered
				alreadyRegistered =  true;	
				break;
			}
		}
		if (alreadyRegistered) {	// Verify whether a newspaper is already registered
			System.out.println("Newspaper "+n.getName()+" has already been registered at "+newsAgencyName+"!");
		}
		else {
			registeredNewspaper.add(n);
			n.addAgency(this);
		}
	}
	
	
	public void addNews(News news) {	// to get the latest news from a newspaper
		newsToBeSend.add(news);
		if (newsToBeSend.get(newsToBeSend.size()-1).getContent() == "Last Item") {
			newsToBeSend.remove(newsToBeSend.size()-1);
			distributeNews(newsToBeSend);	// distribute the latest news to all registered Newspapers
			newsToBeSend.clear();	// delete this array after all news have been send
		}
	}
	
	private void distributeNews(ArrayList<News> list) {		// To distribute news
		for (int j = 0; j < list.size(); j++) {
			for (int i = 0; i < registeredNewspaper.size(); i++) {
				if (list.get(j).getCreator() != registeredNewspaper.get(i).getName()) {	// If the creator of the news does not...
					registeredNewspaper.get(i).receiveNews(list.get(j));				// equal the current newspaper
				}
			}
		}
	}

}
