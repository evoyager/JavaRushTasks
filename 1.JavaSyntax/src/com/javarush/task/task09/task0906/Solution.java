package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
        String className = stackTraces[2].getClassName();
        String methodName = stackTraces[2].getMethodName();
        System.out.println(className + ": " + methodName + ": " + s);
    }
}
