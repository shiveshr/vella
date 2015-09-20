package com.vella.model;

import java.util.List;
import java.util.Set;

/**
 * Created by s on 8/23/15.
 * Games table: gameId, game story, list<serializable predicates>
 */
public class Game {
    private final String gameId;
    private final String gameStory;
    // all predicates should pass
    private final List<GameConstraints<GameCollection>> constraints; // figure out a way to serialize and stored in db!
    // leaderboard
    private final Set<GameCollection> gameCollections;

    public Game(String gameId, String gameStory, List<GameConstraints<GameCollection>> constraints, Set<GameCollection> gameCollections) {
        this.gameId = gameId;
        this.gameStory = gameStory;
        this.constraints = constraints;
        this.gameCollections = gameCollections;
    }

    public Set<GameCollection> getGameCollections() {
        return gameCollections;
    }

    public List<GameConstraints<GameCollection>> getConstraints() {

//        constraints.get(0).test()
        return constraints;
    }

    public String getGameStory() {
        return gameStory;
    }

    public String getGameId() {
        return gameId;
    }
}
