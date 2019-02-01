package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Valentyn", true, 64);
        Human grandfather2 = new Human("Valery", true, 58);
        Human grandmother1 = new Human("Ludmila", false, 58);
        Human grandmother2 = new Human("Natalia", false, 59);
        Human father = new Human("Evgeniy", true, 32, grandfather2, grandmother2);
        Human mother = new Human("Olga", false, 31, grandfather1, grandmother1);
        Human doughter1 = new Human("Maria", false, 3, father, mother);
        Human doughter2 = new Human("Milana", false, 2, father, mother);
        Human son = new Human("Timur", false, 1, father, mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(doughter1);
        System.out.println(doughter2);
        System.out.println(son);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}