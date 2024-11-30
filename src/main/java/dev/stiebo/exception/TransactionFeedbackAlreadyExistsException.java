package dev.stiebo.exception;

public class TransactionFeedbackAlreadyExistsException extends RuntimeException{
    public TransactionFeedbackAlreadyExistsException() {
        super("Feedback for transaction already exists");
    }
}
