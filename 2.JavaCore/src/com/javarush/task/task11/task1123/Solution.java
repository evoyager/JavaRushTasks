package com.javarush.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        int[] inputArrayCopy = Arrays.copyOf(inputArray, inputArray.length);
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int buf;
        for (int i = 0; i < inputArrayCopy.length - 1; i++) {
            for (int j = inputArrayCopy.length - 1; j > i; j--) {
                if (inputArrayCopy[j] < inputArrayCopy[j-1]) {
                    buf = inputArrayCopy[j-1];
                    inputArrayCopy[j-1] = inputArrayCopy[j];
                    inputArrayCopy[j] = buf;
                }
            }
        }

        return new Pair<Integer, Integer>(inputArrayCopy[0], inputArrayCopy[inputArray.length-1]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
