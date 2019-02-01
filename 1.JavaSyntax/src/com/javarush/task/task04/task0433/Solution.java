package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1, j = 1;
        while (i <= 10) {
            while (j <= 10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }
    }
}
