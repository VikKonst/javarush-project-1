package com.javarush.cryptoanalyser.cryptoanalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BruteForce {
    public static File file = new File("com\\javarush\\cryptoanalyser\\cryptoanalysis\\FrequentWordsForBruteForceRealization.txt");

    public static char[] hack(char[] inputCharArray) throws IOException {
        int amountOfFrequentWords;
        Map<Integer, Integer> statistics = new HashMap<>();
        for (int key = 1; key < ApplicationConstants.ALPHABET.length; key++) {
            char[] interimCharArray = Decryption.decrypt(inputCharArray, key);
            String decipheredText = String.valueOf(interimCharArray);
            amountOfFrequentWords = checkForFrequentWords(decipheredText);
            statistics.put(key, amountOfFrequentWords);
        }
        int maxValue = 0;
        int bestKey = 0;
        for (Integer key : statistics.keySet()) {
            if (statistics.get(key) > maxValue) {
                maxValue = statistics.get(key);
                bestKey = key;
            }
        }
        if (bestKey == 0) {
            return null;
        }
        return Decryption.decrypt(inputCharArray, bestKey);
    }

    public static void hackAllKeys(char[] inputCharArray, File file) {
        for (int key = 1; key < ApplicationConstants.ALPHABET.length; key++) {
            char[] interimCharArray = Decryption.decrypt(inputCharArray, key);
            String pathToFile = file.getParent();
            String fileName = "output with key " + key + ".txt";
            file = new File(pathToFile, fileName);
            IOUtils.writeCharsToFile(file, interimCharArray);
        }
    }

    public static List<String> getListOfFrequentWords(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader (file));
            List<String> frequentWords = new ArrayList<>();
            while(reader.ready()) {
                frequentWords.add(reader.readLine());
            }
            reader.close();
            return frequentWords;
    }

    public static int checkForFrequentWords(String decipheredText) throws IOException {
        List<String> tmp = Arrays.asList(decipheredText.split(" "));
        List<String> frequentWords = BruteForce.getListOfFrequentWords(file);
        int amountOfFrequentWords = 0;
        for (String s : frequentWords) {
            if (tmp.contains(s)) {
                amountOfFrequentWords++;
            }
        }
        return amountOfFrequentWords;
    }
}
