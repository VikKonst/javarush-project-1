package com.javarush.cryptoanalyser;

import com.javarush.cryptoanalyser.consoleui.Dialogue;
import com.javarush.cryptoanalyser.cryptoanalysis.Encryption;
import com.javarush.cryptoanalyser.cryptoanalysis.IOUtils;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dialogue.start();
        
        File inputFile = Dialogue.askForPath();

        int key = Dialogue.provideKey();

        char[] inputCharArray = IOUtils.readCharsFromFile(inputFile);
        char[] cypherCharArray = Encryption.encrypt(inputCharArray, key);

        System.out.println(Arrays.toString(inputCharArray));
        System.out.println(Arrays.toString(cypherCharArray));


        //C:\Users\vskon\Desktop\Новая папка\For encryption.txt

        
        
    }
    
    
    
}
