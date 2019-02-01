package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Double d = null;
            Double d2 = d + 1;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[3];
            System.out.println(i[4]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(2);
            System.out.println(list.get(1));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object i = Integer.valueOf(3);
            String s = (String)i;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("zz.txt")));
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchElementException();
        } catch (NoSuchElementException e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

    }
}
