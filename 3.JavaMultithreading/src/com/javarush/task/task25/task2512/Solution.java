package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        List<Throwable> list = new ArrayList<>();
        list.add(e);
        while(list.get(list.size()-1).getCause() != null) {
            list.add(list.get(list.size()-1).getCause());
        }
        Collections.reverse(list);
        for (Throwable th : list) {
            System.out.println(String.format("%s: %s", th.getClass().getName(), th.getMessage()));
        }
        t.interrupt();
    }

    public static void main(String[] args) {
    }
}
