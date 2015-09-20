package com.vella.model;

/**
 * Created by s on 8/23/15.
 */
public class Notification {
    NotificationType notificationType;
    boolean notified;
    private GameCollection collection;
    private Game game;
    // notification link

    public static enum NotificationType {
        COLLECTION_VOTE,
        INVESTED,
        GAME_COMPLETED,
        FRIEND_COLLECTION_CREATE_OR_UPDATE,
        FOLLOWING_COLLECTION_UPDATE,
        VOTED_COLLECTION_UPDATE,
        NEW_GAME,;

    }
}
