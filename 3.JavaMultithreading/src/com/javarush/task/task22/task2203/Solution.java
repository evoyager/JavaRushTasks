package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) {
            throw new TooShortStringException();
        }
        int firstTabIndex = string.indexOf("\t");
        if (firstTabIndex == -1) {
            throw new TooShortStringException();
        }
        int secondTabIndex = string.indexOf("\t", firstTabIndex+1);
        if (secondTabIndex == -1) {
            throw new TooShortStringException();
        }
        return string.substring(firstTabIndex+1, secondTabIndex);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
