package ds222rr_assign3;


import java.util.Arrays;
//Get Random from Java Library
import java.util.Random;

public class Deck {		
	private final int SIZE = 52;	// Declare array (deck) size
	private Card [] deck;			// Array (deck) for remaining cards
	private Card [] issuedCards;	// Array (deck) for issued cards
	private int currentSize = 52;	// counter for remaining cards
	private int countIssued = 0;	// counter for issued cards
	private Card cardToIssue;		// Current card
	
	// Constructor
	public Deck() {
		deck = new Card [SIZE];
		issuedCards = new Card [SIZE];
		int i = 0;
		// Iterative statement to create deck
		for (Card.Suite suite : Card.Suite.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				deck[i] = (new Card(suite, rank));
				i++;
			}
		}
	}
	
	public void shuffle() {	// shuffle deck
		// In case deck has 52 cards
		if (currentSize == 52) {
			// Create Card object - as temporary deck
			Card [] tempDeck = new Card [SIZE];
			int i = 0;
			Random rand = new Random();
			// Iterative statement to shuffle deck
			for (i = 0; i < SIZE; i++) {
				int r = rand.nextInt(currentSize);
				tempDeck[i] = deck[r];	// Choose random card and put it to the temporary deck
				deck[r] = deck[currentSize-1];	// Put the last card of the deck to the position of the random card
				currentSize--;
			}
			currentSize = 52;
			deck = Arrays.copyOf(tempDeck, tempDeck.length);	// Copy tempDeck to deck
		}
		// In case deck has not 52 cards
		else {
			System.out.println("Cannot shuffle a deck with less than 52 cards!");
		}
	}
	
	public void reassembleDeck() {	// reassemble deck
		// Iterative statement to reassemble deck
		for (int i = countIssued-1; i >= 0; i--) {			
			deck[currentSize] = issuedCards[i];
			issuedCards[i] = null;
			currentSize++;
			countIssued--;
		}
	}
	public void getIssuedDeck() {	// Printout all issued cards
		System.out.print("Issued Cards:\t");
		// Iterative statement to print out all issued cards
		for (int i = 0; i < countIssued; i++) {
			String str = issuedCards[i].getSuite().toString() + " " + issuedCards[i].getRank().toString();
			System.out.print(str);
			// In case there are less than four cards in a row and the current card is not the last cards
			if ((i+1)%4 != 0 && i != countIssued-1) {
				System.out.print(" - ");
			}
			// In case there are four cards in a row
			if (i != 0 && (i+1)%4 == 0) {
				System.out.print("\n\t\t");
			}
		}
		System.out.println("");
	}
	public String getCurrentCard() {	// Get current card
		String str = cardToIssue.getSuite().toString() + " " + cardToIssue.getRank().toString();
		return str;
	}
	
	public void issueCard() {	// Play a card
		// In case cards are left
		if (currentSize > 0) {
			cardToIssue = deck[0];
			// Iterative statement to rearrange deck
			for (int i = 0; i < currentSize-1; i++) {
				if (i < currentSize-1)
					deck[i] = deck [i+1];
			}
			currentSize--;
			issuedCards[countIssued] = cardToIssue;	// Put the current card to the issuedCards deck
			countIssued++;
		}
		// In case no card is left
		else {
			System.out.println("No cards left! All cards have been issued!");
		}
	}
	public int remainingCards() {	// Get remaining number of cards
		return currentSize;
	}
	
	public boolean play123() {	// Play123Main
		// Iterative statement to determine whether this game is a win or loose
		for (int i = 0; i < SIZE; i++) {
			issueCard();
			// In case card number is a multiple of 3 and card-rank is three
			if ((i+1)%3 == 0 && cardToIssue.getRank() == Card.Rank.three) {
				return false;
			}
			// In case card number is a multiple of 2 and not a multiple of 3 and card-rank is two
			else if ((i+1)%2 == 0 && (i+1)%3 != 0 && cardToIssue.getRank() == Card.Rank.two) {
				return false;
			}
			// In case card number is not a multiple of 2 and not a multiple of 3 and card-rank is ace
			else if ((i+1)%3 != 0 && (i+1)%2 != 0 && cardToIssue.getRank() == Card.Rank.ace) {
				return false;
			}
		}
		return true;
	}
}
