package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder result = new StringBuilder();
        int count = 5;
        while(count != 0) {
            result.append(s);
            count--;
        }
        return result.toString();
    }

    public static String multiply(String s, int count) {
        StringBuilder result = new StringBuilder();
        while(count != 0) {
            result.append(s);
            count--;
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
