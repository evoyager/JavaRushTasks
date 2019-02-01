package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
    }

    public static String method2() {
        method3();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
    }

    public static String method3() {
        method4();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
    }

    public static String method4() {
        method5();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
    }

    public static String method5() {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
    }
}
