package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float avg = 0;
        int count = 0;
        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1) {
                break;
            }
            avg += n;
            count++;
        }
        avg /= count;
        System.out.println(avg);

    }
}

