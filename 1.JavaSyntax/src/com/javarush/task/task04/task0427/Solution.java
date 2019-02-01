package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a % 2 == 0 && a >= 1 && a <= 9) {
            System.out.println("четное однозначное число");
        } else if (a % 2 == 1 && a >= 1 && a <= 9) {
            System.out.println("нечетное однозначное число");
        } else if (a % 2 == 0 && a >= 10 && a <= 99) {
            System.out.println("четное двузначное число");
        } else if (a % 2 == 1 && a >= 10 && a <= 99) {
            System.out.println("нечетное двузначное число");
        } else if (a % 2 == 0 && a >= 100 && a <= 999) {
            System.out.println("четное трехзначное число");
        } else if (a % 2 == 1 && a >= 100 && a <= 999) {
            System.out.println("нечетное трехзначное число");
        }

    }
}
