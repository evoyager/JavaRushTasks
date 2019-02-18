package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileReader fr = new FileReader(name);
        int counter = 0;
        StringBuilder word = new StringBuilder();
        while (fr.ready())
        {
            int data = fr.read();
            if (!Character.isLetter((char)data)) {
                if (word.toString().equals("world")) {
                    counter++;
                }
                word = new StringBuilder();
            } else {
                word.append((char)data);
            }
        }

        if (word.toString().equals("world")) {
            counter++;
        }

        System.out.println(counter);

        reader.close();
        fr.close();
    }
}
