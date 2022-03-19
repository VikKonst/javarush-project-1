package com.javarush.cryptoanalyser.cryptoanalysis;

import java.util.NoSuchElementException;

public class ApplicationException extends NoSuchElementException {
    public ApplicationException(String message) {
        super(message);
    }
}
