package dev.stiebo.exception;

public class SuspiciousIpExistsException extends RuntimeException{
    public SuspiciousIpExistsException() {
        super("Suspicious IP already exists");
    }
}
