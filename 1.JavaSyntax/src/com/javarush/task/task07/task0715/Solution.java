package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals("именно")) {
                list.add(i+1, "именно");
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
