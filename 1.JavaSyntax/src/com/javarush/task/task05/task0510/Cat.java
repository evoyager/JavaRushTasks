package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;
    int STANDART_WEIGHT = 10;
    int STANDART_AGE = 2;
    String STANDART_COLOR = "Grey";

    public void initialize(String name) {
        this.name = name;
        weight = STANDART_WEIGHT;
        age = STANDART_AGE;
        color = STANDART_COLOR;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = STANDART_COLOR;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = STANDART_WEIGHT;
        color = STANDART_COLOR;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = STANDART_AGE;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = STANDART_AGE;
    }

    public static void main(String[] args) {

    }
}
