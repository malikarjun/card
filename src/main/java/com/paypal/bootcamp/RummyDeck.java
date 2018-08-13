package com.paypal.bootcamp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class RummyDeck extends Deck {

	public RummyDeck(int noOfPacks) {
		super(noOfPacks);
	}

	public int compareSuits(Card c1, Card c2) {
		if (c1.getSuit() == c2.getSuit()) {
			return c1.getRank() - c2.getRank();
		}
		return c1.getSuit().ordinal() - c2.getSuit().ordinal();
	}

	public int compareValue(Card c1, Card c2) {
		if (c1.getRank() == c2.getRank()) {
			return c1.getSuit().ordinal() - c2.getSuit().ordinal();
		}
		return c1.getRank() - c2.getRank();
	}

	public ArrayList<Card> dealNCards(int n) {
		ArrayList<Card> dealCards = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			dealCards.add(deal());
		}
		return dealCards;
	}

	public Card dealWildCard() {
		return getCards().get(new Random().nextInt(getCards().size()));
	}
}
