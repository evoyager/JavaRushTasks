package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static FileInputStream fin;
    public static FileOutputStream fou;

    public static void main(String[] args) throws IOException {
        String key = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];
        fin = new FileInputStream(fileName);
        fou = new FileOutputStream(fileOutputName);
        switch (key) {
            case "-e": encryptFile(fin, fou);
                break;
            case "-d": decryptFile(fin, fou);
                break;
        }
    }

    public static void encryptFile(FileInputStream fin, FileOutputStream fou) throws IOException {
        byte[] buff = new byte[0];
        while (fin.available() > 0) {
            buff = new byte[fin.available()];
            fin.read(buff);
        }
        for (int i = 0; i < buff.length; i++) {
            buff[i] += 1;
        }
        fou.write(buff);
        fin.close();
        fou.close();
    }

    public static void decryptFile(FileInputStream fin, FileOutputStream fou) throws IOException {
        byte[] buff = new byte[0];
        while (fin.available() > 0) {
            buff = new byte[fin.available()];
            fin.read(buff);
        }
        for (int i = 0; i < buff.length; i++) {
            buff[i] -= 1;
        }
        fou.write(buff);
        fin.close();
        fou.close();
    }

}
