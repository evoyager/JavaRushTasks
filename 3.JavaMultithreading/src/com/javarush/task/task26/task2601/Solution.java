package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
//        Integer[] testArray = {8, 15, 5, 17};
//        for (Integer i : sort(testArray)) {
//            System.out.print(i + ", ");
//        }
    }

    public static Integer[] sort(Integer[] array) {
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list);
        boolean listSizeIsOdd = list.size() % 2 == 1;
        int mediane = listSizeIsOdd ? list.get(list.size()/2) : (list.get(list.size()/2 - 1) + list.get(list.size()/2)) / 2;
        if (listSizeIsOdd) {
            list.remove(list.size()/2);
        }
        Comparator<Integer> compareByMediane = (i1, i2) -> Math.abs(i1 - mediane) - Math.abs(i2 - mediane);
        Collections.sort(list, compareByMediane);
        if (listSizeIsOdd) {
            list.add(0, mediane);
        }
        array = list.toArray(new Integer[list.size()]);

        return array;
    }
}
