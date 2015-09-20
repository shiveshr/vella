package com.vella.model;

import com.vella.model.product.Product;

import java.util.List;

/**
 * Created by s on 8/23/15.
 */
public class GameCollection {
    private final Game game;
    private final User user;
    private final List<Product> products;
    private final List<Investment> investments;
    private final List<Vote> upVote;
    private final List<Vote> downVote;

    public Game getGame() {
        return game;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public List<Vote> getUpVote() {
        return upVote;
    }

    public List<Vote> getDownVote() {
        return downVote;
    }

    public GameCollection(Game game, User user, List<Product> products, List<Investment> investments, List<Vote> upVote, List<Vote> downVote) {
        this.game = game;
        this.user = user;
        this.products = products;
        this.investments = investments;
        this.upVote = upVote;
        this.downVote = downVote;
    }
}
