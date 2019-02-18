package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileReader fr = new FileReader(name1);
        FileWriter fw = new FileWriter(name2);
        int counter = 1;
        while (fr.ready())
        {
            int data = fr.read();
            if (counter % 2 == 0) {
                fw.write(data);
            }
            counter++;
        }

        reader.close();
        fr.close();
        fw.close();
    }
}
