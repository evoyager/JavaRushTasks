package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        boolean vysokosny = false;
        int days;
        if (year % 400 == 0) {
            vysokosny = true;
        } else if (year % 100 == 0) {
            vysokosny = false;
        } else if (year % 4 == 0) {
            vysokosny = true;
        } else {
            vysokosny = false;
        }

        if (vysokosny) {
            days = 366;
        } else {
            days = 365;
        }
        System.out.println("количество дней в году: " + days);
    }
}