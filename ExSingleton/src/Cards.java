import java.util.*;

enum Suit {
	SPADES, HEARTS, CLUBS, DIAMONDS
}

class Card {
	private static Suit suit;
	private  static  int number;
	private static Card card;
	
	private Card(Suit s, int n) {
		suit = s;
		if ((n < 2) || (n > 14)) {
			throw new IllegalArgumentException();
		}
		number = n;
	}
	public  synchronized static Card getInstance(Suit s, int n) {
		if(card == null) {
			card = new Card(s,n);
		}
	
		return card;
	} 
	public void print() {
		switch (number) {
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
			break;
		case 14:
			System.out.print("Ace");
			break;
		default:
			System.out.print(number);
			break;
		}
		System.out.print(" of ");
		switch (suit) {
		case SPADES:
			System.out.println("spades.");
			break;
		case HEARTS:
			System.out.println("hearts.");
			break;
		case CLUBS:
			System.out.println("clubs.");
			break;
		case DIAMONDS:
			System.out.println("diamonds.");
			break;
		}
	}


}
