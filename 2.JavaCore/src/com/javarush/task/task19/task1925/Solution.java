package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String name1 = args[0];
        String name2 = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(name1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(name2));
        boolean file2IsEmpty = true;
        while (reader.ready()) {
            String line = reader.readLine();
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 6) {
                    if (file2IsEmpty) {
                        writer.write(arr[i]);
                        file2IsEmpty = false;
                    } else {
                        writer.write("," + arr[i]);
                    }
                }
            }
        }
        reader.close();
        writer.close();
    }
}
