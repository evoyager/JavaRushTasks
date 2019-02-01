package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        ArrayList<FileInputStream> list = new ArrayList<>();
        while (true) {
            String name = reader.readLine();
            inputStream = new FileInputStream(name);
            list.add(inputStream);
            if (inputStream.available() < 1000) {
                for (FileInputStream is : list) {
                    is.close();
                }
                reader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
