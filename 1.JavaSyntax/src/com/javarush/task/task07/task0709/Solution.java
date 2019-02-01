package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        strings.add(str);
        int minLength = str.length();
        for (int i = 1; i < 5; i++) {
            str = reader.readLine();
            strings.add(str);
            int strLength = str.length();
            if (strLength < minLength) {
                minLength = strLength;
            }
        }
        for (int i = 0; i < 5; i++) {
            String currStr = strings.get(i);
            if (currStr.length() == minLength) {
                System.out.println(currStr);
            }
        }

    }
}
