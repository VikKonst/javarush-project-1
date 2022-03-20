package com.javarush.cryptoanalyser.consoleui;

import com.javarush.cryptoanalyser.cryptoanalysis.ApplicationConstants;

import java.io.File;
import java.util.Scanner;

public class Dialogue {
    public static String start() {
        System.out.println("Добро пожаловать в мою первую программу!\nВыберите и введите необходимое действие из списка или введите " +
                "\"Завершить\", чтобы выйти из программы:\n" +
                "Шифрование\nРасшифровка\nВзлом");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static File askForInputPath() {
        System.out.println("Укажите исходный файл:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        if (file.isFile()) {
            System.out.println("Валидация файла прошла успешно");
        } else {
            System.out.println("Файл не найден");
            file = Dialogue.askForInputPath();
        }
        return file;
    }

    public static File askForOutputPath() {
        System.out.println("Введите путь к файлу для сохранения результата работы программы:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        while (!file.exists()) {
            System.out.println("Указанный путь не существует. Введите путь:");
            file = new File(scanner.nextLine());
        }
        if (file.exists() && file.isDirectory()) {
            System.out.println("Файл будет сформирован автоматически и сохранен в указанной директории");
            return new File(file, "result file.txt");
        } else {
            System.out.println("Валидация файла прошла успешно. Результат работы программы будет сохранен в указанном файле");
            return file;
        }
    }

    public static int provideKey() {
        int maxValueOfKey = ApplicationConstants.ALPHABET.length - 1;
        System.out.println("Введите ключ сдвига от 0 до " + maxValueOfKey + ":");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        while (!(key >= 0 && key <= maxValueOfKey)) {
            System.out.println("Неверный ключ. Введите ключ сдвига от 0 до " + maxValueOfKey + ":");
            key = scanner.nextInt();
        }
        System.out.println("Ключ принят");
        return key;
    }

    public static void end() {
        System.out.println("Работа программы завершена. До новых встреч!");
    }
}
