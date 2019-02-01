package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<String, Integer> map = new TreeMap<>(Collator.getInstance(new Locale("ru")));
        for (Character c : alphabet) {
            map.put(String.valueOf(c), 0);
        }

        String str = "";
        Character с = 0;
        for (int i = 0; i < 10; i++) {
            str = list.get(i);
            for(int j = 0; j < str.length(); j++) {
                с = str.charAt(j);
                if (map.keySet().contains(с.toString())) {
                    map.put(String.valueOf(с), map.get(с.toString())+1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
