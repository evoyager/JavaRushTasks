package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float minutes = Float.parseFloat(reader.readLine());
        minutes = minutes % 5;
        String color = "";
        if (minutes < 3) {
            color = "зеленый";
        } if (minutes >= 3 && minutes < 4) {
            color = "желтый";
        } if (minutes >= 4 && minutes < 5) {
            color = "красный";
        }
        System.out.println(color);
    }
}