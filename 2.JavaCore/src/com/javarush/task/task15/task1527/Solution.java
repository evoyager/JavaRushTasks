package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String paramStr = url.substring(url.indexOf("?") + 1);
        String[] params = paramStr.split("&");
        Map<String, String> map = new LinkedHashMap<>();
        String[] paramVal;
        for (String str : params) {
            paramVal = str.split("=");
            System.out.print(paramVal[0] + " ");
            if (paramVal.length == 1) {
                map.put(paramVal[0], "");
            } else {
                map.put(paramVal[0], paramVal[1]);
            }
        }
        System.out.println();
        String key, value;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (key.equals("obj") && !value.equals("")) {
                try {
                    alert(Double.parseDouble(value));
                } catch (Exception e) {
                    alert(value);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
