package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char prevChar = s.charAt(0);
        char currChar;
        char[] charArray = s.toCharArray();
        charArray[0] = String.valueOf(charArray[0]).toUpperCase().charAt(0);
        for (int i = 1; i < s.length(); i++) {
            currChar = s.charAt(i);
            if (prevChar == ' ' && currChar != ' ') {
                charArray[i] = String.valueOf(currChar).toUpperCase().charAt(0);
            }
            prevChar = currChar;
        }
        System.out.println(new String(charArray));
    }
}
