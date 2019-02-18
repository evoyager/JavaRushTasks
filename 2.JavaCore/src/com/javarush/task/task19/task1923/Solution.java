package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while(reader.ready()) {
            String line = reader.readLine();
            String[] arr = line.split(" ");
            for (String s : arr) {
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        writer.write(s + " ");
                        break;
                    }
                }
            }
        }
        reader.close();
        writer.close();
    }
}
