package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(name2);
        FileInputStream inputStream2 = new FileInputStream(name3);
        FileOutputStream outputStream = new FileOutputStream(name1, true);
        int i;
        while((i=inputStream1.read())!=-1) {
            outputStream.write(i);
        }
        while((i=inputStream2.read())!=-1) {
            outputStream.write(i);
        }
        reader.close();
        inputStream1.close();
        inputStream2.close();
        outputStream.close();
    }
}
