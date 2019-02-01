package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String param = reader.readLine();
            if (param.equals("helicopter")) {
                result = new Helicopter();
            } else if (param.equals("plane")) {
                int passangers = Integer.parseInt(reader.readLine());
                result = new Plane(passangers);
            }
        } catch (IOException e) {
            e.printStackTrace();
            reader.close();
        }
        reader.close();
    }
}
