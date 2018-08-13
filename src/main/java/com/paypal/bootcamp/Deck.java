package com.paypal.bootcamp;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Deck {

    private ArrayList<Card> cards;
    final int PACK_CARD_COUNT = 54;

    public Deck(int noOfPacks) {
        cards = new ArrayList<Card>();

        for(int i = 0; i < noOfPacks; i++) {
            for(int j = 0; j < PACK_CARD_COUNT; j++) {
                cards.add(new Card(j));
            }
        }
    }



    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        Card dealCard = null;
        if (cards.size() != 0) {
            dealCard = cards.get(0);
            cards.remove(0);
        }
        return dealCard;
    }

    public String toString() {
        return cards.toString();
    }


//    public static void main(String []args) {
//        Deck d = new Deck(2);
//        System.out.println(d.toString());
//
//    }

}
