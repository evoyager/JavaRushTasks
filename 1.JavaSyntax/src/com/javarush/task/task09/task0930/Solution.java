package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<String> words = new ArrayList<String>();
        List<String> numbers = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                numbers.add(array[i]);
            } else {
                words.add(array[i]);
            }
        }

        String buf;
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = words.size()- 1; j > i; j--) {
                if (isGreaterThan(words.get(j-1), words.get(j))) {
                    buf = words.get(j-1);
                    words.set(j-1, words.get(j));
                    words.set(j, buf);
                }
            }
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = numbers.size() - 1; j > i; j--) {
                if (Integer.parseInt(numbers.get(j-1)) < Integer.parseInt(numbers.get(j))) {
                    buf = numbers.get(j-1);
                    numbers.set(j-1, numbers.get(j));
                    numbers.set(j, buf);
                }
            }
        }
        int k = 0, l = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = numbers.get(k++);
            } else {
                array[i] = words.get(l++);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
