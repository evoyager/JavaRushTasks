package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        FileInputStream inputStream1 = new FileInputStream(name1);
        FileInputStream inputStream2 = new FileInputStream(name2);
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        int i;

        while((i=inputStream1.read())!=-1) {
            list1.add(i);
        }
        while((i=inputStream2.read())!=-1) {
            list2.add(i);
        }
        list2.addAll(list1);
        inputStream1.close();
        inputStream2.close();
        FileOutputStream outputStream = new FileOutputStream(name1);
        for (Integer character : list2) {
            outputStream.write(character);
        }
        outputStream.close();
    }
}
