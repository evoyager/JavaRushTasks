package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(name));
        Map<String, Double> map = new HashMap<>();
        while (reader.ready()) {
            String s = reader.readLine();
            String[] sArr = s.split(" ");
            Double value = map.containsKey(sArr[0]) ? map.get(sArr[0]) + Double.parseDouble(sArr[1]) :
                Double.parseDouble(sArr[1]);
            map.put(sArr[0], value);
        }
        reader.close();
        map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
