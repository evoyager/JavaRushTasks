package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Map<String, Double> map = new HashMap<>();
        while (reader.ready()) {
            String line = reader.readLine();
            String[] lineArr = line.split(" ");
            Double value = map.containsKey(lineArr[0]) ? map.get(lineArr[0]) + Double.parseDouble(lineArr[1]) :
                Double.parseDouble(lineArr[1]);
            map.put(lineArr[0], value);
        }
        reader.close();
        Double maxValue = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }
        Map<String, Double> maxValueMap = new TreeMap<>();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                maxValueMap.put(entry.getKey(), entry.getValue());
            }
        }

        maxValueMap.forEach((key, value) -> System.out.println(key));
    }
}
