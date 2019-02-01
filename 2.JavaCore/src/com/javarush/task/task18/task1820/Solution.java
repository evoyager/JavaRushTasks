package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        BufferedReader br = new BufferedReader(new FileReader(name1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(name2));
        String line;
        while ((line = br.readLine()) != null) {
            String[] floats = line.split(" ");
            for(int i = 0; i < floats.length; i++) {
                float f = Float.parseFloat(floats[i]);
                int n = (int) Math.round(f);
                bw.write(n + " ");
            }
        }

        br.close();
        bw.close();
    }
}
