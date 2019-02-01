package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska", 1, 5, 10);
        Cat petka = new Cat("Petka", 5, 10, 8);
        Cat murzik = new Cat("Murzik", 10, 50, 1);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}