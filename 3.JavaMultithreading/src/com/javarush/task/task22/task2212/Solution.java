package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        if (telNumber.isEmpty()) return false;
        int digits = telNumber.replaceAll("\\D", "").length();
        if ((telNumber.charAt(0) == '+' && digits == 12) || (telNumber.charAt(0) != '+' && digits == 10)) {
            return telNumber.matches("(\\+\\d+)?\\d*(\\(\\d{3}\\))?\\d+(-?\\d+){0,2}");
        }
        else return false;
    }

    public static void main(String[] args) {
        String s = "+380501234567";
//        String s = "+38(050)1234567";
//        String s = "+38050123-45-67";
//        String s = "050123-4567";
//        String s = "+38)050(1234567";
//        String s = "+38(050)1-23-45-6-7";
//        String s = "050ххх4567";
//        String s = "050123456";
//        String s = "(0)501234567";
        System.out.println(s + " - " + checkTelNumber(s));
    }
}
