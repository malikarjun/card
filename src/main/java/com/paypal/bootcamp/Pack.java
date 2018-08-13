package com.paypal.bootcamp;

import java.util.ArrayList;
import java.util.Collections;

public class Pack {
    final int PACK_CARD_COUNT = 54;
    private ArrayList<Card> cards;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Pack() {
        cards = new ArrayList<Card>();
        for(int i = 0; i < PACK_CARD_COUNT; i++) {
            cards.add(new Card(i));
        }

    }


    public void shuffle() {
        Collections.shuffle(cards);
    }
}
