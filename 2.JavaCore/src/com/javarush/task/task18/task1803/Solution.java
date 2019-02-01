package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (map.containsKey(data)) {
                map.put(data, map.get(data)+1);
            } else map.put(data, 1);
        }
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                System.out.print(entry.getKey() + " ");
            }
        }
        reader.close();
        inputStream.close();
    }
}
