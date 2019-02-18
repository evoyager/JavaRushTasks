package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        BufferedReader fbufr = new BufferedReader(new FileReader(name1));
        BufferedWriter fbufw = new BufferedWriter(new FileWriter(name2));
        while (fbufr.ready()) {
            int data = fbufr.read();
            char a = '!';
            if (Character.valueOf((char)data).equals('.')) {
                fbufw.write(a);
            } else {
                fbufw.write(data);
            }
        }

        reader.close();
        fbufr.close();
        fbufw.close();
    }
}
