package com.javarush.cryptoanalyser.cryptoanalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {
    public static char[] readCharsFromFile(File file) {
        List<Character> chars = new ArrayList<>();
            try (FileReader input = new FileReader(file);
                 BufferedReader reader = new BufferedReader(input)) {
                while (reader.ready()) {
                    chars.add((char) reader.read());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            char[] srcCharArray = new char[chars.size()];
            for (int i = 0; i < chars.size(); i++) {
                srcCharArray[i] = chars.get(i);
            }
            return srcCharArray;
        }




}
