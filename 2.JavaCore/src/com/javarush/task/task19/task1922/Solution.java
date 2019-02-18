package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
//        words.add("А");
//        words.add("Б");
//        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader fr = new BufferedReader(new FileReader(file));
        while (fr.ready()) {
            String line = fr.readLine();
            String[] lArr = line.split(" ");
            int counter = 0;
            for (String s : lArr) {
                if (words.contains(s)) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(line);
            }
        }

        fr.close();
    }
}
