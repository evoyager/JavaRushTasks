package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        StringBuilder line = new StringBuilder("");
        BufferedReader fr = new BufferedReader(new FileReader(file));
        while (fr.ready()) {
            line.append(fr.readLine());
            System.out.println(line.reverse());
            line = new StringBuilder("");
        }
        reader.close();
        fr.close();
    }
}
