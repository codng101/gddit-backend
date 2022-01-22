package fr.mullerguillaume.gddit.exception;

public class SubredditNotFoundException extends RuntimeException{
    public SubredditNotFoundException(String message) {
        super(message);
    }
}