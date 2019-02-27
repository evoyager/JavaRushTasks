package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        System.out.println(getQuery(params));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder("");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (builder.toString().equals("") && entry.getValue() != null) {
                builder
                    .append(entry.getKey())
                    .append(" = ")
                    .append("'")
                    .append(entry.getValue())
                    .append("'");
            } else if (entry.getValue() != null) {
                builder
                    .append(" and ")
                    .append(entry.getKey())
                    .append(" = ")
                    .append("'")
                    .append(entry.getValue())
                    .append("'");
            }
        }

        return builder.toString();
    }
}
