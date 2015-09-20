package com.vella.model;

/**
 * Created by s on 8/23/15.
 */
public class Vote {
    private final String user;
    private final GameCollection collection;
    private final boolean upVote;

    public String getUser() {
        return user;
    }

    public GameCollection getCollection() {
        return collection;
    }

    public boolean isUpVote() {
        return upVote;
    }

    public Vote(String user, GameCollection collection, boolean upVote) {
        this.user = user;
        this.collection = collection;
        this.upVote = upVote;
    }
}
