package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileReader fr = new FileReader(name);
        int i;
        int spaceNum = 0;
        int otherNum = 0;
        float result;
        while ((i=fr.read()) != -1) {
            char с = (char) i;
            otherNum++;
            if (с == 32) {
                spaceNum++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        result = (float) (spaceNum * 1.0 / otherNum * 100);
        System.out.println(df.format(result));
        fr.close();
    }
}
