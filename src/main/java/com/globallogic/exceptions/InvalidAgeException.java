package com.globallogic.exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(Throwable cause) {
        super(cause);
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
