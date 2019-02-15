package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
        String tag = args[0];
        String name = args[1];
        FileReader fileReader = new FileReader(name);
        StringBuilder s = new StringBuilder("");
        while (fileReader.ready()) {
            char data = (char) fileReader.read();
            s.append(data);
        }
        String str = s.toString();
        System.out.println(s.toString());
        System.out.println("==================");
//        int leftIndex = str.indexOf("<" + tag);
        int leftIndex = 0;
        int rightIndex = str.indexOf("</" + tag);
        int rightIndexEnd = str.indexOf(">", rightIndex) + 1;

//        String firstStr = str.substring(leftIndex, rightIndexEnd);
//        System.out.println(firstStr);

        leftIndex = str.lastIndexOf("<" + tag, rightIndex);
        String nextTag = str.substring(leftIndex, rightIndexEnd);
        System.out.println(nextTag);
        while(rightIndex != -1) {
            while (leftIndex != -1) {
                leftIndex = str.lastIndexOf("<" + tag, leftIndex);
                if (leftIndex == -1) {
                    leftIndex = str.indexOf("<" + tag, rightIndexEnd);
                    rightIndex = str.indexOf("</" + tag, leftIndex);
                    rightIndexEnd = str.indexOf(">", rightIndex) + 1;
                } else {
                    rightIndex = str.indexOf("</" + tag, rightIndexEnd);
                    rightIndexEnd = str.indexOf(">", rightIndex) + 1;
                }
                nextTag = str.substring(leftIndex, rightIndexEnd);
                System.out.println(nextTag);
            }
        }

    }
}
