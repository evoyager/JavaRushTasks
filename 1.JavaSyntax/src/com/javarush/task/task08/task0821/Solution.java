package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Stallone", "Sylvester");
        map.put("Schwarzenegger", "Arnold");
        map.put("Diesel", "Vin");
        map.put("Chan", "Jackie");
        map.put("Damme", "Van");
        map.put("Momoa", "Jason");
        map.put("Willis", "Jason");
        map.put("Norris", "Chuck");
        map.put("Johnson", "Bolo");
        map.put("Johnson", "Dwayne");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
