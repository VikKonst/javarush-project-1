package com.javarush.cryptoanalyser;

import com.javarush.cryptoanalyser.consoleui.Dialogue;
import com.javarush.cryptoanalyser.cryptoanalysis.BruteForce;
import com.javarush.cryptoanalyser.cryptoanalysis.Decryption;
import com.javarush.cryptoanalyser.cryptoanalysis.Encryption;
import com.javarush.cryptoanalyser.cryptoanalysis.IOUtils;
import java.io.File;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        String chosenAction = Dialogue.start();

        if (chosenAction.equalsIgnoreCase("encrypt")) {
            File inputFile = Dialogue.askForInputPath();
            File outputFile = Dialogue.askForOutputPath();
            int key = Dialogue.provideKey();
            char[] initialCharArray = IOUtils.readCharsFromFile(inputFile);
            char[] cypheredCharArray = Encryption.encrypt(initialCharArray, key);
            IOUtils.writeCharsToFile(outputFile, cypheredCharArray);
            Dialogue.end();
        }
        if (chosenAction.equalsIgnoreCase("decrypt")) {
            File inputFile = Dialogue.askForInputPath();
            File outputFile = Dialogue.askForOutputPath();
            int key = Dialogue.provideKey();
            char[] cypheredCharArray = IOUtils.readCharsFromFile(inputFile);
            char[] decipheredCharArray = Decryption.decrypt(cypheredCharArray, key);
            IOUtils.writeCharsToFile(outputFile, decipheredCharArray);
            Dialogue.end();
        }
        if (chosenAction.equalsIgnoreCase("hack")) {
            File inputFile = Dialogue.askForInputPath();
            File outputFile = Dialogue.askForOutputPath();
            char[] cypheredCharArray = IOUtils.readCharsFromFile(inputFile);
            try {
                char[] hackedCharArray = BruteForce.hack(cypheredCharArray);
                if (hackedCharArray == null) {
                    BruteForce.hackAllKeys(cypheredCharArray, outputFile);
                } else {
                    IOUtils.writeCharsToFile(outputFile, hackedCharArray);
                }
                Dialogue.end();
            } catch (IOException e) {
                System.out.println("System error. The program can not be continued.");
            }
        }
        if (chosenAction.equalsIgnoreCase("exit")) {
            System.out.println("See you soon!");
            System.exit(0);
        }
    }
}
