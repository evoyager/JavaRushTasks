package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum, currentNum;
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            maximum = Integer.parseInt(reader.readLine());
            n--;
            while (n > 0) {
                currentNum = Integer.parseInt(reader.readLine());
                if (maximum < currentNum) {
                    maximum = currentNum;
                }
                n--;
            }
            System.out.println(maximum);
        }
    }
}
