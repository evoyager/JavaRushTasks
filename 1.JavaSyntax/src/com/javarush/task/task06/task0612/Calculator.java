package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        double div = (double) a / b;
        return div;
    }

    public static double percent(int a, int b) {
        double perc = (double) a / 100 * b;
        return perc;
    }

    public static void main(String[] args) {
        System.out.println(percent(6, 10));
    }
}