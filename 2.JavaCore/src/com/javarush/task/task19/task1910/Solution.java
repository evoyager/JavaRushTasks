package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        BufferedReader fbufr = new BufferedReader(new FileReader(name1));
        BufferedWriter fbufw = new BufferedWriter(new FileWriter(name2));
        while (fbufr.ready()) {
            int data = fbufr.read();
            Pattern p = Pattern.compile("\\p{Punct}");
            Matcher m = p.matcher(String.valueOf((char) data));
            if (!m.matches()) {
                if (!m.matches()) {
                    fbufw.write(data);
                }
            }
        }

            reader.close();
            fbufr.close();
            fbufw.close();
    }
}
