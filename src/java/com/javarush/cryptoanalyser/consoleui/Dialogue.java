package com.javarush.cryptoanalyser.consoleui;

import com.javarush.cryptoanalyser.cryptoanalysis.ApplicationConstants;

import java.io.File;
import java.util.Scanner;

public class Dialogue {
    public static void start() {
        System.out.println("Добро пожаловать в мою первую программу!");
    }

    public static File askForPath() {
        System.out.println("Введите путь к файлу:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        if(file.exists()){
            System.out.println("Валидация файла прошла успешно");
        } else {
            System.out.println("Файл не найден");
            file = Dialogue.askForPath();
        }
        return file;
    }

    public static int provideKey() {
        int maxValueOfKey = ApplicationConstants.ALPHABET.length - 1;
        System.out.println("Введите ключ сдвига от 0 до " + maxValueOfKey + ":");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        while(!(key >= 0 && key <= maxValueOfKey)) {
            System.out.println("Неверный ключ. Введите ключ сдвига от 0 до " + maxValueOfKey + ":");
            key = scanner.nextInt();
        }
        System.out.println("Ключ принят");
        return key;
    }
}
