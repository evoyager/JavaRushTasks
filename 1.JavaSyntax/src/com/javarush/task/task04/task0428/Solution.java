package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int positivCount = 0;
        if (a > 0) {
            positivCount++;
        }
        if (b > 0) {
            positivCount++;
        }
        if (c > 0) {
            positivCount++;
        }
        System.out.println(positivCount);
    }
}
