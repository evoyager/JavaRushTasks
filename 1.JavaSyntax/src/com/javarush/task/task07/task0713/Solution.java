package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> divideOnThreeList = new ArrayList<>();
        ArrayList<Integer> divideOnTwoList = new ArrayList<>();
        ArrayList<Integer> divideOnOtherList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }
        for (Integer n : list) {
            if (n % 3 == 0) {
                divideOnThreeList.add(n);
            }
            if (n % 2 == 0) {
                divideOnTwoList.add(n);
            }
            if (n % 3 != 0 && n % 2 != 0){
                divideOnOtherList.add(n);
            }
        }
        printList(divideOnThreeList);
        printList(divideOnTwoList);
        printList(divideOnOtherList);
    }

    public static void printList(List<Integer> list) {
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
