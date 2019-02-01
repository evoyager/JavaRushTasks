package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.List;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("First");
        strList.add("Second");
        strList.add("Third");
        strList.add("Fourth");
        strList.add("Fifth");
        System.out.println(strList.size());
        for (String str : strList) {
            System.out.println(str);
        }
    }
}
