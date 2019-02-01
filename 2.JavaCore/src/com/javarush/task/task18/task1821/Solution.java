package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileInputStream fin = new FileInputStream(name);
        Map<Character, Integer> map = new TreeMap<>();
        int i;
        while((i=fin.read())!=-1) {
            char c = (char) i;
            map.put(c,  map.containsKey(c) ? map.get(c)+1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        fin.close();
    }
}
