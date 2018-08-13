package com.paypal.bootcamp;

public class Card {
	static enum Suit {
		SPADE, HEART, DIAMOND, CLUB, JOKER
	};

	private Suit suit;
	private int seq;
	private int rank;
	final int SUITCOUNT = 13;
	final int JOKERRANK = 52;

	public Card(int seq) {
		if (seq >= JOKERRANK) {
			this.seq = JOKERRANK;
			this.rank = SUITCOUNT;
			this.suit = Suit.JOKER;
		} else {
			this.seq = seq;
			this.rank = seq % SUITCOUNT;
			this.suit = Suit.values()[seq / SUITCOUNT];
		}
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String toString() {

		if (suit.equals(Suit.SPADE))
			return rank + " " + (char) '\u2660';
		else if (suit.equals(Suit.DIAMOND))
			return rank + " " + (char) '\u2666';
		else if (suit.equals(Suit.CLUB))
			return rank + " " + (char) '\u2663';
		else if (suit.equals(Suit.HEART))
			return rank + " " + (char) '\u2764';

		return rank + " " + "JOKER";
	}
}
