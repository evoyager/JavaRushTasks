package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("Stallone", "Sylvester");
            map.put("Schwarzenegger", "Arnold");
            map.put("Diesel", "Vin");
            map.put("Chan", "Jackie");
            map.put("Damme", "Van");
            map.put("Momoa", "Jason");
            map.put("Willis", "Bruce");
            map.put("Norris", "Chuck");
            map.put("Yeung", "Bolo");
            map.put("Johnson", "Dwayne");
        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> duplicateNameSet = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (Map.Entry<String, String> nextEntry : map.entrySet()) {
                if (!nextEntry.getKey().equals(entry.getKey()) && entry.getValue().equals(nextEntry.getValue())) {
                    duplicateNameSet.add(entry.getValue());
                }
            }
        }
        for (String name : duplicateNameSet) {
            removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
