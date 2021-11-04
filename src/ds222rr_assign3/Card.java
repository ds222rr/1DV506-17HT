package ds222rr_assign3;

public class Card {
	private final Suite suite;
	private final Rank rank;

		
	public enum Suite {
		diamond, spade, heart, club;
	}

	public enum Rank {
		two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace;
		
	}	
	public Card (Suite s, Rank r) {
		rank = r;
		suite = s;
	}
	
	public Suite getSuite() {
		return suite;
	}
	
	public Rank getRank() {
		return rank;
	}
}