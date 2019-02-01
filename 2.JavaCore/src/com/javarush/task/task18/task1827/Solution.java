package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length != 0 && args[0].equals("-c")) {
            int id;
            String productName;
            String price;
            String quantity;
            String params = "";
            productName = args[1];
            int i = 2;
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

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            BufferedReader br = new BufferedReader(new FileReader(name));
            String line;
            int maxId = 0;
            int currId;
            while ((line = br.readLine()) != null) {
                currId = Integer.parseInt(line.substring(0, 8).trim());
                if (currId > maxId) {
                    maxId = currId;
                }
            }
            id = maxId + 1;
            BufferedWriter writer = new BufferedWriter(new FileWriter(name, true));

            writer.write("\n" + id + productName + price + quantity);

            reader.close();
            br.close();
            writer.close();
        }
    }
}
