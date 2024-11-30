package dev.stiebo.exception;

public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException() {
        super("Transaction not found");
    }
}
