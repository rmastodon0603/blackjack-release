package org.itstep.blackjack;

import org.itstep.blackjack.ui.CardView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;
    private final List<Card> taken;

    public Deck(List<Card> taken) {
        this.taken = taken;
        this.cards = new ArrayList<>();
        for(Suite suite: Suite.values()) {
            for (Rank rank: Rank.values()) {
                this.cards.add(new Card(rank, suite));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getOne() {
        Card card = cards.remove(0);
        taken.add(card);
        return card;
    }

    public void reset() {
        cards.addAll(taken);
        taken.clear();
    }

}
