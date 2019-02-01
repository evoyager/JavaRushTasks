package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human doughter1 = new Human("Maria", false, 3);
        Human doughter2 = new Human("Milana", false, 2);
        Human son = new Human("Timur", false, 1);
        Human father = new Human("Evgeniy", true, 32, new ArrayList<>(Arrays.asList(doughter1, doughter2, son)));
        Human mother = new Human("Olga", false, 31, new ArrayList<>(Arrays.asList(doughter1, doughter2, son)));
        Human grandfather1 = new Human("Valentyn", true, 64, new ArrayList<>(Arrays.asList(mother)));
        Human grandmother1 = new Human("Ludmila", false, 58, new ArrayList<>(Arrays.asList(mother)));
        Human grandfather2 = new Human("Valery", true, 58, new ArrayList<>(Arrays.asList(father)));
        Human grandmother2 = new Human("Natalia", false, 59, new ArrayList<>(Arrays.asList(father)));
        System.out.println(doughter1);
        System.out.println(doughter2);
        System.out.println(son);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
