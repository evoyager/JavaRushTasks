package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Л" + Character.valueOf((char) i));
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
