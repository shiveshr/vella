package com.vella.model;

import javafx.util.Pair;

import java.util.List;

/**
 * Created by s on 8/23/15.
 */
public class User {
    private final String userId;
    private final List<User> friends;
    private final List<User> following; // lazy load
    private final List<User> followers; // lazy load
    private final List<Pair<Game, GameCollection>> activeGames;
    private final List<Pair<Game, GameCollection>> historyGames; // lazy load
    private final List<Pair<User, Game>> downVotes;
    private final List<Investment> investments;
    private final int currency;

    public User(String userId, List<User> friends, List<User> following, List<User> followers, List<Pair<Game, GameCollection>> activeGames, List<Pair<Game, GameCollection>> historyGames, List<Pair<User, Game>> downVotes, List<Investment> investments, int currency) {
        this.userId = userId;
        this.friends = friends;
        this.following = following;
        this.followers = followers;
        this.activeGames = activeGames;
        this.historyGames = historyGames;
        this.downVotes = downVotes;
        this.investments = investments;
        this.currency = currency;
    }

    public String getUserId() {
        return userId;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<Pair<Game, GameCollection>> getActiveGames() {
        return activeGames;
    }

    public List<Pair<Game, GameCollection>> getHistoryGames() {
        return historyGames;
    }

    public List<Pair<User, Game>> getDownVotes() {
        return downVotes;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public int getCurrency() {
        return currency;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public List<Notification> getOldNotifications() {
        return oldNotifications;
    }

    List<Notification> notifications;
    List<Notification> oldNotifications;
}
