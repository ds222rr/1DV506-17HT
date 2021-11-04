package ds222rr_assign4.newsagency;

public class NewsMain {
	public static void main(String[] args) {
		NewsPaper NP1 = new NewsPaper("New York Times");
		NewsPaper NP2 = new NewsPaper("Frankfurter Allgemeine Zeitung");
		NewsPaper NP3 = new NewsPaper("The Times");
		NewsPaper NP4 = new NewsPaper("Aftonbladet");
		NewsAgency NA1 = new NewsAgency("NewsAgencyOne");
		NewsAgency NA2 = new NewsAgency("NewsAgencyTwo");
		NP1.registerAtAgency(NA1);
		NP2.registerAtAgency(NA1);
		NP3.registerAtAgency(NA2);
		NP4.registerAtAgency(NA2);
		NP4.registerAtAgency(NA2);	//	Newspaper has already been registered!
		NP4.registerAtAgency(NA1);
		NP1.generateNews("This is the 1. News");
		NP2.generateNews("This is the 2. News");
		NP1.generateNews("This is the 3. News");
		NP1.sendNews();
		NP2.sendNews();
		NP4.generateNews("This is the 4. News");
		NP4.sendNews();
		NP3.generateNews("This is the 5. News");
		NP3.sendNews();
		NP1.getNews();
		NP2.getNews();
		NP3.getNews();
		NP4.getNews();
		NP3.sendNews();	// No news to be send!
	}
}
