package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = null, m = null;
        n = Integer.parseInt(reader.readLine());
        if (n <= 0) {
            throw new Exception();
        }
        m = Integer.parseInt(reader.readLine());
        if (m <= 0) {
            throw new Exception();
        }
        int max = n > m ? n : m;
        int maxDiv = 1;
        for (int i = 2; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                maxDiv = i;
            }
        }
        System.out.println(maxDiv);
    }
}
