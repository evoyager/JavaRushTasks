package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        String[] arr = result.split("\n");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                arr[i] = "\n" + arr[i];
            }
            if (i % 2 == 1) {
                arr[i] += "\nJavaRush - курсы Java онлайн";
            }
        }

        System.setOut(consoleStream);
        for (String s : arr) {
            System.out.print(s);
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
