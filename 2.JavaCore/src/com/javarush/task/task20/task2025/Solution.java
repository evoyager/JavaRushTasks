package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        List<Long> list = ArmstrongNumbersMultiSetLongOpt.generate(String.valueOf(N).length()+1);
        List<Long> resultList = new ArrayList<>();
        for (Long l : list) {
            if (l < N) {
                resultList.add(l);
            }
        }
        result = new long[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE+1)));
    }
}
