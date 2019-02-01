package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileReader fr = new FileReader(name);
        int i;
        Set<Character> engLetters = new HashSet<>();
        for(char c = 'A'; c <= 'Z'; ++c) {
            engLetters.add(c);
        }
        for(char c = 'a'; c <= 'z'; ++c) {
            engLetters.add(c);
        }
        int result = 0;
        while ((i=fr.read()) != -1) {
            if (engLetters.contains((char)i)) {
                result++;
            }
        }
        System.out.println(result);
        fr.close();
    }
}
