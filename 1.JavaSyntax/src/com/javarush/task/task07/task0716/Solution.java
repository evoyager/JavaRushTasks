package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        String currStr;
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            currStr = list.get(i);
            if (currStr.contains("р") && currStr.contains("л")) {
                newList.add(currStr);
                continue;
            }
            if (currStr.contains("р")) {
            } else if (currStr.contains("л")) {
                newList.add(currStr);
                newList.add(currStr);
            } else {
                newList.add(currStr);
            }
        }
        return newList;
    }
}