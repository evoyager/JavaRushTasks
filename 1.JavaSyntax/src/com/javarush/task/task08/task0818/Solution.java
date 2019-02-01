package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++) {
            map.put("Stallone", 999999);
            map.put("Schwarzenegger", 888888);
            map.put("Diesel", 777777);
            map.put("Chan", 666666);
            map.put("Damme", 555555);
            map.put("Momoa", 444444);
            map.put("Willis", 333333);
            map.put("Norris", 222222);
            map.put("Yeung", 111111);
            map.put("Johnson", 400);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
            if (entry.getValue() < 500) {
                map.remove(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}