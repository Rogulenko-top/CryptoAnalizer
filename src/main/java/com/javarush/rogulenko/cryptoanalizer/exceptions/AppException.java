package com.javarush.rogulenko.cryptoanalizer.exceptions;

public class AppException extends RuntimeException {
    public AppException() {
    }

    public AppException(String message) {
        super(message);
    }
}