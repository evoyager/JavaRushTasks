package com.javarush.task.task20.task2026;

import java.util.HashMap;
import java.util.Map;

/*
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };
        byte[][] a3 = new byte[][]{
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        System.out.println("=================");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
        System.out.println("=================");
        int count3 = getRectangleCount(a3);
        System.out.println("count = " + count3 + ". Должно быть 0");
    }

    public static int getRectangleCount(byte[][] a) {
        int leftR = 0, leftC = 0;
        int result = 0;
        while (true) {
            Map<String, Integer> upperLeftRectangleCorner = findUpperLeftRectangleCorner(a);
            leftR = upperLeftRectangleCorner.get("row");
            if (leftR >= a.length) {
                break;
            }
            leftC = upperLeftRectangleCorner.get("col");
//            System.out.println("leftR: " + leftR + ", leftC: " + leftC);

            int rightR = leftR;
            int rightC = leftC;
            Map<String, Integer> lowerRightRectangleCorner = findLowerRightRectangleCorner(a, upperLeftRectangleCorner);
            rightR = lowerRightRectangleCorner.get("row");
            rightC = lowerRightRectangleCorner.get("col");
//            System.out.println("rightR: " + rightR + ", rightC: " + rightC);
            result++;
            emptyRectangle(a, upperLeftRectangleCorner, lowerRightRectangleCorner);
        }

        return result;
    }

    static Map<String, Integer> findUpperLeftRectangleCorner(byte[][] a) {
        Map<String, Integer> upperLeftRectangleCorner = new HashMap<>();
        int leftR = 0;
        int leftC = 0;
        while (leftR < a.length && a[leftR][leftC] != 1) {
            if (leftC != a.length - 1) {
                leftC++;
            } else {
                leftC = 0;
                leftR++;
            }
        }
        upperLeftRectangleCorner.put("row", leftR);
        upperLeftRectangleCorner.put("col", leftC);
        return upperLeftRectangleCorner;
    }

    static Map<String, Integer> findLowerRightRectangleCorner(byte[][] a, Map<String, Integer> upperLeftRectangleCorner) {
        int leftR = upperLeftRectangleCorner.get("row");
        int leftC = upperLeftRectangleCorner.get("col");
        Map<String, Integer> lowerRightRectangleCorner = new HashMap<>();
        int rightR = leftR;
        int rightC = leftC;
        boolean needToSearch = true;
        for (int r = leftR; r < a.length; r++) {
            if (needToSearch) {
                for (int c = leftC; c < a.length; c++) {
                    if (a[r][c] == 0)   {
                        if (r == leftR) {
                            rightC = c - 1;
                        } else {
                            if (c == rightC + 1) {
                                rightR = r;
                            } else {
                                needToSearch = false;
                            }
                        }
                        break;
                    }
                }
            }
        }
        lowerRightRectangleCorner.put("row", rightR);
        lowerRightRectangleCorner.put("col", rightC);
        return lowerRightRectangleCorner;
    }

    static void emptyRectangle(byte[][] a, Map<String, Integer> upperLeftRectangleCorner, Map<String, Integer> lowerRightRectangleCorner) {
        int leftR = upperLeftRectangleCorner.get("row");
        int leftC = upperLeftRectangleCorner.get("col");
        int rightR = lowerRightRectangleCorner.get("row");
        int rightC = lowerRightRectangleCorner.get("col");
        for (int r = leftR; r <= rightR; r++) {
            for (int c = leftC; c <= rightC; c++) {
                a[r][c] = 0;
            }
        }
    }
}
