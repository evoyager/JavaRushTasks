package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String str = reader.readLine();
            list.add(str);
        }
        int prevStrLength = 0;
        for (int i = 0; i < list.size(); i++) {
            int currStrLength = list.get(i).length();
            if (currStrLength >= prevStrLength) {}
            else {
                System.out.println(i);
            }
            prevStrLength = currStrLength;
        }
    }
}

