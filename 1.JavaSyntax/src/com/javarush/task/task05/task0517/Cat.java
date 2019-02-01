package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;
    int STANDART_WEIGHT = 10;
    int STANDART_AGE = 3;
    String STANDART_COLOR = "Gray";

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = STANDART_WEIGHT;
        color = STANDART_COLOR;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = STANDART_AGE;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = STANDART_AGE;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = STANDART_COLOR;
    }

    public Cat(String name) {
        this.name = name;
        weight = STANDART_WEIGHT;
        age = STANDART_AGE;
        color = STANDART_COLOR;
    }

    public static void main(String[] args) {

    }
}
