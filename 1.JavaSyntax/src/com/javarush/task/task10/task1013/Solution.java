package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private char sex;
        private Human mother;
        private String name;
        private int weight;
        private int height;

        public Human(Human mother, String name) {
            this.mother = mother;
            this.name = name;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, char sex, Human mother, String name) {
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.name = name;
        }

        public Human(char sex, Human mother, String name) {
            this.sex = sex;
            this.mother = mother;
            this.name = name;
        }

        public Human(int age, char sex, Human mother, String name, int weight, int height) {
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.name = name;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, char sex, Human mother, String name, int weight) {
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.name = name;
            this.weight = weight;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(char sex) {
            this.sex = sex;
        }

        public Human(Human mother) {
            this.mother = mother;
        }

        public Human(String name) {
            this.name = name;
        }
    }
}
