package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minStrLength = Integer.MAX_VALUE, maxStrLength = 0;
        int strLength;
        for (int i = 0; i < 10; i++) {
            String str = reader.readLine();
            strLength = str.length();
            strings.add(str);
            if (strLength < minStrLength) {
                minStrLength = strLength;
            }
            if (strLength > maxStrLength) {
                maxStrLength = strLength;
            }
        }
        for (String str : strings) {
            if (str.length() == minStrLength || str.length() == maxStrLength) {
                System.out.println(str);
                break;
            }
        }
    }
}
