package com.javarush.cryptoanalyser;

import com.javarush.cryptoanalyser.consoleui.Dialogue;
import com.javarush.cryptoanalyser.cryptoanalysis.BruteForce;
import com.javarush.cryptoanalyser.cryptoanalysis.Decryption;
import com.javarush.cryptoanalyser.cryptoanalysis.Encryption;
import com.javarush.cryptoanalyser.cryptoanalysis.IOUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String chosenAction = Dialogue.start();

        if (chosenAction.equalsIgnoreCase("Шифрование")) {

        }
        if (chosenAction.equalsIgnoreCase("Расшифровка")) {

        }
        if (chosenAction.equalsIgnoreCase("Взлом")) {

        }
        if (chosenAction.equalsIgnoreCase("Завершить")) {
            System.exit(1);
        }


        //File inputFile = Dialogue.askForInputPath();
        //File outputFile = Dialogue.askForOutputPath();

        //int key = Dialogue.provideKey();

        //char[] inputCharArray = IOUtils.readCharsFromFile(inputFile);
        //char[] cypherCharArray = BruteForce.hack(inputCharArray);
        //IOUtils.writeCharsToFile(outputFile, cypherCharArray);

       //BruteForce.hackAllKeys(inputCharArray, outputFile);


        // TODO: изменить символы в зашифрованном тексте на те, которых нет в алфавите и запустить программу


        //C:\Users\vskon\Desktop\Новая папка\For encryption.txt
        //C:\Users\vskon\Desktop\Новая папка\Encrypted file.txt
        //C:\Users\vskon\Desktop\Новая папка\Deciphered file.txt

        //C:\Users\vskon\Desktop\Новая папка\Я легенда\ya_legenda.txt
        //C:\Users\vskon\Desktop\Новая папка\Я легенда\Encrypted version.txt
        //C:\Users\vskon\Desktop\Новая папка\Я легенда\Version after decryption.txt

        //C:\Users\vskon\Desktop\Новая папка\Пример\Example.txt
        //C:\Users\vskon\Desktop\Новая папка\Пример\Encrypted example.txt

        //C:\Users\vskon\Desktop\Новая папка\40 deciphered files



        
        
    }
    
    
    
}
