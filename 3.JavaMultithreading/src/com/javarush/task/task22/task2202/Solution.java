package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
//        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
//        System.out.println(getPartOfString("лучший - лучший лучший лучший лучший."));

    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] arr = string.split("\\s");
        if (arr.length < 5) {
            throw new TooShortStringException();
        } else {
            return string.substring(string.indexOf(" ") + 1, string.indexOf(arr[4]) + arr[4].length());
        }
//        int fourthSpaceIndex = -1;
//        String result = "";
//        try {
//            for (int i = 1; i < 5; i++) {
//                fourthSpaceIndex = string.indexOf(" ", fourthSpaceIndex+1);
//                if (fourthSpaceIndex == -1) {
//                    throw new TooShortStringException();
//                }
//            }
//            int indexOfEndOfWordAfterFourthSpace = fourthSpaceIndex+1;
//            indexOfEndOfWordAfterFourthSpace = string.indexOf(" ", indexOfEndOfWordAfterFourthSpace) != -1
//                ? string.indexOf(" ", fourthSpaceIndex+1) : string.length();
//            result = string.substring(string.indexOf(" ")+1, indexOfEndOfWordAfterFourthSpace);
//        } catch (TooShortStringException e) {
//            e.printStackTrace();
//        }
//
//        return result;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
