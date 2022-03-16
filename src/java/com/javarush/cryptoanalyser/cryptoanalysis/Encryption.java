package com.javarush.cryptoanalyser.cryptoanalysis;

import java.util.Arrays;

public class Encryption {
    public static char[] encrypt(char[] inputCharArray, int key) {
        char[] cypheredCharArray = new char[inputCharArray.length];

        for (int i = 0; i < inputCharArray.length; i++) {
            int indexOfOpenCharinAlphabet = Arrays.binarySearch(ApplicationConstants.ALPHABET,
                    Character.toLowerCase(inputCharArray[i]));
            int indexOfShift = (indexOfOpenCharinAlphabet + key) % ApplicationConstants.ALPHABET.length;
            if (indexOfOpenCharinAlphabet >= 0) {
                cypheredCharArray[i] = ApplicationConstants.ALPHABET[indexOfShift];
            } else {
                cypheredCharArray[i] = inputCharArray[i];
            }
        }
        return cypheredCharArray;
    }
}
