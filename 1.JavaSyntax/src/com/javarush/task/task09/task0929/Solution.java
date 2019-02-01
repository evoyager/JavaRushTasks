package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = "";
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        for (int i = 0; i < 2; i++) {
            try {
                sourceFileName = reader.readLine();
                fileInputStream = getInputStream(sourceFileName);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
                continue;
            }
        }
        String destinationFileName = reader.readLine();
        fileOutputStream = getOutputStream(destinationFileName);


        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

