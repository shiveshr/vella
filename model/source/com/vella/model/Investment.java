package com.vella.model;

/**
 * Created by s on 8/23/15.
 */
public class Investment {
    private final int amount;
    private final User investor;
    private final GameCollection collection;

    public User getInvestor() {
        return investor;
    }

    public GameCollection getCollection() {
        return collection;
    }

    public int getAmount() {
        return amount;
    }

    public Investment(int amount, User investor, GameCollection collection) {
        this.amount = amount;
        this.investor = investor;
        this.collection = collection;
    }
}
