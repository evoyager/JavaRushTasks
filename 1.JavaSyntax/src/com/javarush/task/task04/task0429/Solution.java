package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int negativCount = 0;
        int positivCount = 0;
        if (a < 0) {
            negativCount++;
        } else if (a > 0) {
            positivCount++;
        }
        if (b < 0) {
            negativCount++;
        } else if (b > 0) {
            positivCount++;
        }
        if (c < 0) {
            negativCount++;
        } else if (c > 0) {
            positivCount++;
        }
        System.out.println("количество отрицательных чисел: " + negativCount);
        System.out.println("количество положительных чисел: " + positivCount);
    }
}
