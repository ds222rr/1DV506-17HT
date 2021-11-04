package ds222rr_assign3;

public class PlayCardsMain {
	public static void main(String[] args) {
		Deck d = new Deck();
		d.shuffle();
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "51"
		d.shuffle();	// Printout "Cannot shuffle a deck with less than 52 cards!"
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "51"
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "50"
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "49"
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "48"
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		d.shuffle();	// Printout "Cannot shuffle a deck with less than 52 cards!"
		d.getIssuedDeck();	// Printout all issued cards
		d.reassembleDeck();
		d.shuffle();
		
		System.out.println("\nNew Game\n");
		
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "51"
		d.shuffle();	// Printout "Cannot shuffle a deck with less than 52 cards!"
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "51"
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "50"
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "49"
		d.issueCard();
		System.out.println("Current card: "+d.getCurrentCard());	// Printout current card
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "48"
		for (int i = 0; i < 12; i++) {
			d.issueCard();
		}
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "36"
		for (int i = 0; i < 36; i++) {
			d.issueCard();
		}
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "0"
		d.issueCard();		// Printout "No cards left! All cards have been issued!"
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "0"
		d.shuffle();	// Printout "Cannot shuffle a deck with less than 52 cards!"
		d.getIssuedDeck();	// Printout all issued cards
		d.reassembleDeck();
		d.shuffle();
		d.issueCard();
		d.getIssuedDeck();	// Printout all issued cards
		System.out.println("Remaining cards in this deck: "+d.remainingCards());	// Printout "51"
	}
}
