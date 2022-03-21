package com.javarush.cryptoanalyser.cryptoanalysis;

import java.util.ArrayList;
import java.util.List;

public class Decryption {
    public static char[] decrypt(char[] inputCharArray, int key) {
        List<Character> tempCharArray = new ArrayList<>();
        for (char encryptedChar : inputCharArray) {
            try {
                tempCharArray.add(getDecryptedChar(encryptedChar, key));
            } catch (ApplicationException e) {
                System.out.println("Обнаружен неизвестный символ! Расшифровка невозможна!");
                System.exit(1);
            }
        }
        char[] decipheredCharArray = new char[tempCharArray.size()];
        for (int i = 0; i < decipheredCharArray.length; i++) {
            decipheredCharArray[i] = tempCharArray.get(i);
        }
        return decipheredCharArray;
    }

    private static char getDecryptedChar(char encryptedChar, int key) throws ApplicationException {
        for (int i = 0; i < ApplicationConstants.ALPHABET.length; i++) {
            if (Character.toLowerCase(encryptedChar) == ApplicationConstants.ALPHABET[i]) {
                int indexOfShift = (i - key) % ApplicationConstants.ALPHABET.length;
                if (indexOfShift < 0) {
                    return ApplicationConstants.ALPHABET[ApplicationConstants.ALPHABET.length + indexOfShift];
                }
                return ApplicationConstants.ALPHABET[indexOfShift];
            }
        }
        throw new ApplicationException("Указанный символ не найден!");
    }
}
