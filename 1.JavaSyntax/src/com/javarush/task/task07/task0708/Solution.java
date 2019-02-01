package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        int maxLength = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            strings.add(str);
            int currStrLength = str.length();
            if (currStrLength > maxLength) {
                maxLength = currStrLength;
            }
        }
        for (int i = 0; i < 5; i++) {
            String currStr = strings.get(i);
            if (currStr.length() == maxLength) {
                System.out.println(currStr);
            }
        }

    }
}
