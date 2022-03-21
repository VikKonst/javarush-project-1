package com.javarush.cryptoanalyser.cryptoanalysis;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public static char[] encrypt(char[] inputCharArray, int key) {
        List<Character> tempCharArray = new ArrayList<>();

        for (char openChar : inputCharArray) {
            for (int j = 0; j < ApplicationConstants.ALPHABET.length; j++) {
                if (Character.toLowerCase(openChar) == ApplicationConstants.ALPHABET[j]) {
                    int indexOfShift = (j + key) % ApplicationConstants.ALPHABET.length;
                    tempCharArray.add(ApplicationConstants.ALPHABET[indexOfShift]);
                }
            }
        }
        char[] cypheredCharArray = new char[tempCharArray.size()];
        for (int i = 0; i < cypheredCharArray.length; i++) {
            cypheredCharArray[i] = tempCharArray.get(i);
        }
        return cypheredCharArray;
    }
}
