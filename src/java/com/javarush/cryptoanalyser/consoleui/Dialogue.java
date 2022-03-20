package com.javarush.cryptoanalyser.consoleui;

import com.javarush.cryptoanalyser.cryptoanalysis.ApplicationConstants;

import java.io.File;
import java.util.Scanner;

public class Dialogue {
    public static String start() {
        System.out.println("Welcome to my first program!\nChoose the necessary action from the list or enter " +
                "\"Exit\" to exit the program:\n" +
                "Encrypt\nDecrypt\nHack");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static File askForInputPath() {
        System.out.println("Enter source file:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        if (file.isFile()) {
            System.out.println("File is valid");
        } else {
            System.out.println("File is not found");
            file = Dialogue.askForInputPath();
        }
        return file;
    }

    public static File askForOutputPath() {
        System.out.println("Enter the path to the file to save the result of the program:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        while (!file.exists()) {
            System.out.println("The specified path does not exist. Enter the path:");
            file = new File(scanner.nextLine());
        }
        if (file.exists() && file.isDirectory()) {
            System.out.println("File will be generated automatically and saved in the specified directory");
            return new File(file, "result file.txt");
        } else {
            System.out.println("File is valid");
            return file;
        }
    }

    public static int provideKey() {
        int maxValueOfKey = ApplicationConstants.ALPHABET.length - 1;
        System.out.println("Enter a key of shift from 0 till " + maxValueOfKey + ":");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        while (!(key >= 0 && key <= maxValueOfKey)) {
            System.out.println("Key is not valid. Enter a key of shift from 0 " + maxValueOfKey + ":");
            key = scanner.nextInt();
        }
        System.out.println("Key is valid");
        return key;
    }

    public static void end() {
        System.out.println("The program has been completed successfully. See you soon!");
    }
}
