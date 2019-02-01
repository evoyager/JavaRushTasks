package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        List<String> fileNames = new ArrayList<String>();
        while (true) {
            name = reader.readLine();
            if (name.equals("end")) {
                reader.close();
                break;
            }
            fileNames.add(name);
        }
        Collections.sort(fileNames);
        String resultFileName = fileNames.get(0);
        resultFileName = resultFileName.substring(0, resultFileName.lastIndexOf(".part"));
        FileOutputStream fou = new FileOutputStream(resultFileName, true);
        for (String fileName : fileNames) {
            FileInputStream fin = new FileInputStream(fileName);
            byte[] buff = new byte[0];
            while (fin.available() > 0) {
                buff = new byte[fin.available()];
                fin.read(buff);
            }
            fou.write(buff);
            fin.close();
        }
        fou.close();
    }
}
