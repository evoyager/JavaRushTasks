package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Vaska", new Cat("Vaska"));
        map.put("Petka", new Cat("Petka"));
        map.put("Murka", new Cat("Murka"));
        map.put("Lapka", new Cat("Lapka"));
        map.put("Hvostik", new Cat("Hvostik"));
        map.put("Zayka", new Cat("Zayka"));
        map.put("Kleo", new Cat("Kleo"));
        map.put("Zorka", new Cat("Zorka"));
        map.put("Belka", new Cat("Belka"));
        map.put("Strelka", new Cat("Strelka"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<Cat>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
