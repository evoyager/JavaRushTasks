package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        BufferedReader br = new BufferedReader(new FileReader(name));
        String line;
        String action = args[0];
        int id = Integer.parseInt(args[1]);
        List<String> list = new ArrayList<String>();
        int currId = 0;
        switch (action) {
            case "-d" : {
                while ((line = br.readLine()) != null) {
                    currId = Integer.parseInt(line.substring(0, 8).trim());
                    if (currId == id) {
                        continue;
                    }
                    list.add(line);
                }
                break;
            }
            case "-u" : {
                String productName = args[2];
                String price;
                String quantity;
                int i = 3;
                while (!args[i].contains(".")) {
                    productName += " " + args[i];
                    i++;
                }
                while (productName.length() < 30) {
                    productName += " ";
                }
                price = args[i];
                while (price.length() < 8) {
                    price += " ";
                }
                quantity = args[i+1];
                while (quantity.length() < 4) {
                    quantity += " ";
                }
                String idStr = String.valueOf(id);
                while (idStr.length() < 8) {
                    idStr += " ";
                }

                while ((line = br.readLine()) != null) {
                    currId = Integer.parseInt(line.substring(0, 8).trim());
                    if (currId == id) {
                        line = idStr + productName + price + quantity;
                    }
                    list.add(line);
                }
                break;
            }
        }
        br.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        for (String s : list) {
//            writer.write(s + "\n");
            if (!s.equals(list.get(list.size() - 1)))
                writer.write(s + "\n");
            else writer.write(s);
        }
        writer.close();
    }
}
