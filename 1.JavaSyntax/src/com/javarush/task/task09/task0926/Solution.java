package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] arr1 = new int[5];
        int[] arr2 = new int[2];
        int[] arr3 = new int[4];
        int[] arr4 = new int[7];
        int[] arr5 = new int[0];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int) (Math.random()*100);
        }

//        ArrayList<int[]> list = new ArrayList<>(Arrays.asList(arr1, arr2, arr3, arr4, arr5));
        ArrayList<int[]> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
