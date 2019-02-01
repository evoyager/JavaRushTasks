package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrStr = new String[10];
        int[] arrInt = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrStr[i] = reader.readLine();
            arrInt[i] = arrStr[i].length();
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(arrInt[j]);
        }
    }
}
