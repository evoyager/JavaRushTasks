package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 2, "Grey");
        Dog spykeDog = new Dog("Spyke", "buldog", 10);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        String breed;
        int strength;

        public Dog(String name, String breed, int strength) {
            this.name = name;
            this.breed = breed;
            this.strength = strength;
        }
    }

    public static class Cat {
        String name;
        int age;
        String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }
}
