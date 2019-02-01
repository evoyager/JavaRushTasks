package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream1 = new FileOutputStream(name2);
        byte[] buffer = new byte[0];
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
        }
        for (int i = buffer.length - 1; i >= 0; i--) {
            outputStream1.write(buffer[i]);
        }
        reader.close();
        inputStream.close();
        outputStream1.close();
    }
}
