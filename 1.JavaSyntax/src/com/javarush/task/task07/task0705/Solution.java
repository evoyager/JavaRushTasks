package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int[] arrSplit1 = new int[10];
        int[] arrSplit2 = new int[10];

        for (int j = 0; j < 10; j++) {
            arrSplit1[j] = arr[j];
        }
        for (int k = 10; k < 20; k++) {
            arrSplit2[k-10] = arr[k];
            System.out.println(arrSplit2[k-10]);
        }
    }
}
