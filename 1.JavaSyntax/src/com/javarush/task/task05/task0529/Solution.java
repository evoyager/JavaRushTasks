package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String word = reader.readLine();
            if (word.equals("сумма")) {
                break;
            }
            int n = Integer.parseInt(word);
            sum += n;
        }
        System.out.println(sum);
    }
}