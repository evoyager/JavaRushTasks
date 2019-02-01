package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int buf1, buf2;
        if (a < b) {
            buf1 = a;
            a = b;
            b = buf1;
        }
        if (a < c) {
            buf1 = a;
            a = c;
            buf2 = b;
            b = buf1;
            c = buf2;
        } else {
            if (b < c) {
                buf1 = b;
                b = c;
                c = buf1;
            }
        }

        System.out.println(a + " " + b + " " + c);

//        if (a == b);
//
//        int max, middle, min;
//        max = a;
//        min = a;
//        middle = a;
//        if (a < b) {
//            max = b;
//        }
//        if (max < c) {
//            max = c;
//        }
//
//        if (a > b) {
//            min = b;
//        }
//        if (min > c) {
//            min = c;
//        }
//        if (a != max && a != min) {
//            middle = a;
//        } else if (b != max && b != min) {
//            middle = b;
//        } else if (c != max && c != min) {
//            middle = c;
//        }
//
//        System.out.println(max + " " + middle + " " + min);
    }
}
