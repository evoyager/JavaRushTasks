package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        BufferedReader fbufr = new BufferedReader(new FileReader(name1));
        BufferedWriter fbufw = new BufferedWriter(new FileWriter(name2));
        StringBuilder digit = new StringBuilder();
        while (fbufr.ready()) {
            int data = fbufr.read();
            if (data == 32) {
                char[] charArr = digit.toString().toCharArray();
                boolean wordIsDigit = true;
                for (char c : charArr) {
                    if (!Character.isDigit(c)) {
                        wordIsDigit = false;
                        break;
                    }
                }
                if (wordIsDigit) {
                    fbufw.write(digit.toString() + " ");
                }
                digit = new StringBuilder();
            } else {
                digit.append((char) data);
            }
        }
        char[] charArr = digit.toString().toCharArray();
        boolean wordIsDigit = true;
        for (char c : charArr) {
            if (!Character.isDigit(c)) {
                wordIsDigit = false;
                break;
            }
        }
        if (wordIsDigit) {
            fbufw.write(digit.toString());
        }
        reader.close();
        fbufr.close();
        fbufw.close();
    }
}
