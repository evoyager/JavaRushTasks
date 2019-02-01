package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list.add(Integer.parseInt(reader.readLine()));
        int prevNum = list.get(0);
        int currNum;
        int resultLength = 1;
        int currLength = 1;
        for (int i = 1; i < 10; i++) {
            currNum = Integer.parseInt(reader.readLine());
            list.add(currNum);
            if (currNum == prevNum) {
                currLength++;
            } else {
                if (currLength > resultLength) {
                    resultLength = currLength;
                }
                prevNum = currNum;
                currLength = 1;
            }
        }
        if (currLength > resultLength) {
            resultLength = currLength;
        }
        System.out.println(resultLength);
    }
}