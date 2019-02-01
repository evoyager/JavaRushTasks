package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dayOfWeek = Integer.parseInt(reader.readLine());
        String dayOfWeekStr = "";
        if (dayOfWeek == 1) {
            dayOfWeekStr = "понедельник";
        } else if (dayOfWeek == 2) {
            dayOfWeekStr = "вторник";
        } else if (dayOfWeek == 3) {
            dayOfWeekStr = "среда";
        } else if (dayOfWeek == 4) {
            dayOfWeekStr = "четверг";
        } else if (dayOfWeek == 5) {
            dayOfWeekStr = "пятница";
        } else if (dayOfWeek == 6) {
            dayOfWeekStr = "суббота";
        } else if (dayOfWeek == 7) {
            dayOfWeekStr = "воскресенье";
        } else {
            dayOfWeekStr = "такого дня недели не существует";
        }
        System.out.println(dayOfWeekStr);
    }
}