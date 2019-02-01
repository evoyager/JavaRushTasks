package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        while (true) {
            String name = reader.readLine();
            inputStream = null;
            try {
                inputStream = new FileInputStream(name);
                inputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(name);
                break;
            }
        }
        reader.close();
    }
}
