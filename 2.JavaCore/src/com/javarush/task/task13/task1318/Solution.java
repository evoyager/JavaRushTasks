package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        file = reader.readLine();

        InputStream inStream = null;
        try {
            inStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (inStream.available() > 0)
        {
            int data = inStream.read();
            System.out.print((char) data);
        }

        reader.close();
        inStream.close();
    }
}