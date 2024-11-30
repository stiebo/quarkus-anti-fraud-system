package dev.stiebo.exception;

public class StolenCardNotFoundException extends RuntimeException{
    public StolenCardNotFoundException() {
        super("Stolen card not found");
    }
}
