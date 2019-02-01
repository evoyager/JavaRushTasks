package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        Collections.sort(list);
        Set<Integer> set = new LinkedHashSet<>(list);
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        reader.close();
        inputStream.close();
    }
}
