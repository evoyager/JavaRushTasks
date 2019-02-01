package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String buff;
        int removeIndex;
        for (int j = 0; j < 13; j++) {
            removeIndex = strings.size() - 1;
            buff = strings.get(removeIndex);
            strings.remove(removeIndex);
            strings.add(0, buff);
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
