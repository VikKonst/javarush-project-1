package com.javarush.cryptoanalyser;

import com.javarush.cryptoanalyser.consoleui.Dialogue;
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
        System.out.println(Arrays.toString(inputCharArray));

        //C:\Users\vskon\Desktop\Новая папка\For encryption.txt

        
        
    }
    
    
    
}
