package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String str = reader.readLine();
            if (str == null) {
                break;
            }
            Integer data = Integer.parseInt(str);
            if (data % 2 == 0) {
                list.add(data);
            }
        }
        reader.close();
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }

    }
}
