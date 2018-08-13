package com.paypal.bootcamp;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Deck {

    private ArrayList<Pack> packs;

    public Deck(int noOfPacks) {
        packs = new ArrayList<Pack>(noOfPacks);
    }



    public void shuffle() {
        for(Pack p: packs)
            p.shuffle();

        Collections.shuffle(packs);
    }
}
