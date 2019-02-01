package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int theSameFirstNameCount = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                theSameFirstNameCount++;
            }
        }
        return theSameFirstNameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        if (map.keySet().contains(lastName)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
