package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        while (true) {
            String str = reader.readLine();
            writer.write("\n" + str);
            if (str.equals("exit")) {
                break;
            }
        }
        reader.close();
        writer.close();

    }
}
