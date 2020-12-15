package org.itstep.blackjack;

public class Game {
    private final Player player;
    private final Player dealer;
    private final Deck deck;

    public Game() {
        player = new Player();
        dealer = new Player();
    }

    public Player getPlayer() {
        return player;
    }

    public Player getDealer() {
        return dealer;
    }
}
