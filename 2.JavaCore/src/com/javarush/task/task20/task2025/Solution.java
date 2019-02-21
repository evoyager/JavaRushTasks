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

//    public static long[] getNumbers(long N) {
//        Long[] resultCopy = null;
//        ArrayList<Long> arr = new ArrayList<>();
//        int M;
//        Long num = 0L;
//        for (long i = 0; i < N; i++) {
//            String s = String.valueOf(i);
//            M = s.length();
//            for (long j = 0; j < M; j++) {
//                long currNum = Long.parseLong(String.valueOf(s.charAt((int) j)));
//                num += (long)Math.pow(currNum, M);
//            }
//            if (num == i) {
//                arr.add(i);
//            }
//            num = 0L;
//        }
//        resultCopy = arr.toArray(new Long[arr.size()]);
//        long[] result = new long[resultCopy.length];
//        int i = 0;
//        for (Long l : resultCopy) {
//            result[i++] = l;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE+1)));
    }
}
