package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileInput = args[0];
        String fileOutput = args[1];

        Charset windows1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");

        InputStream inputStream = new FileInputStream(fileInput);
        OutputStream outputStream = new FileOutputStream(fileOutput);

        byte[] buffer = new byte[1000];
        inputStream.read(buffer);
        String s = new String(buffer, windows1251);
        buffer = s.getBytes(utf8);
        outputStream.write(buffer);

        inputStream.close();
        outputStream.close();
    }
}
