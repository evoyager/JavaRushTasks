package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int closest = a;
        if (abs(10 - a) < abs(10 - b)) {
            closest = a;
        } else if (abs(10 - a) > abs(10 - b)) {
            closest = b;
        }
            System.out.println(closest);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}