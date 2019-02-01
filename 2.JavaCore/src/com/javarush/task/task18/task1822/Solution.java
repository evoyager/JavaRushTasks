package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int searchedId = Integer.parseInt(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        BufferedReader br = new BufferedReader(new FileReader(name));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(" ");
            int id = Integer.parseInt(data[0]);
            if (id == searchedId) {
//                int k = 1;
//                String productName = data[1];
//                for (int i = 2; i < data.length; i++) {
//                    if (!(data[i] instanceof String)) {
//                        break;
//                    }
//                    k = i;
//                }
//                double price = Double.parseDouble(data[k+1]);
//                int quantity = Integer.parseInt(data[k+2]);
                System.out.println(line);
                break;
            }
        }
        br.close();
    }
}
