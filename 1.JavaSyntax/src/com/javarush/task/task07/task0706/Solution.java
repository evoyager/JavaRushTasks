package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int[] even = new int[8];
        int[] odd = new int[8];
        int evenCurr = 0;
        int oddCur = 0;
        int evenNumOfResidents = 0;
        int oddNumOfResidents = 0;
        for (int j = 0; j < 15; j++) {
            if (j % 2 == 0) {
                even[evenCurr] = arr[j];
                evenCurr++;
            } else {
                odd[oddCur] = arr[j];
                oddCur++;
            }
        }

        for (int k = 0; k < 8; k++) {
            evenNumOfResidents += even[k];
            oddNumOfResidents += odd[k];
        }

        String result = evenNumOfResidents > oddNumOfResidents ? "В домах с четными номерами проживает больше жителей." :
            "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(result);

    }
}
