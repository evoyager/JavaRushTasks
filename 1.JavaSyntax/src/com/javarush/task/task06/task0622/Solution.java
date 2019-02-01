package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        outputArr(sortArr(nums));
    }

    public static int[] sortArr(int[] nums) {
        int min, pos, buf;
        for (int i = 0; i < nums.length; i++) {
            min = nums[i];
            pos = i;
            for (int j = i; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    pos = j;
                }
            }
            buf = nums[i];
            nums[i] = nums[pos];
            nums[pos] = buf;
        }
        return nums;
    }

    public static void outputArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
