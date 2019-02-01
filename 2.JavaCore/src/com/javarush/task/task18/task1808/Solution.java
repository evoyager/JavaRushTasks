package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream1 = new FileOutputStream(name2);
        FileOutputStream outputStream2 = new FileOutputStream(name3);
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream1.write(buffer, 0, count / 2 + count % 2);
            outputStream2.write(buffer, count / 2 + count % 2, count - count / 2 - count % 2);
        }
        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
