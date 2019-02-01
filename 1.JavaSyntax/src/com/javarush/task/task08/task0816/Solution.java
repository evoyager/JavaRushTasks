package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Schwarzenegger", df.parse("JULY 30 1947"));
        map.put("Diesel", df.parse("JULY 18 1967"));
        map.put("Chan", df.parse("APRIL 7 1954"));
        map.put("Damme", df.parse("OCTOBER 18 1960"));
        map.put("Momoa", df.parse("AUGUST 1 1979"));
        map.put("Willis", df.parse("MARCH 19 1955"));
        map.put("Norris", df.parse("MARCH 10 1940"));
        map.put("Yeung", df.parse("JULY 3 1946"));
        map.put("Johnson", df.parse("MAY 2 1972"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> newMap = (HashMap<String, Date>) map.clone();;
        for (Map.Entry<String, Date> entry : newMap.entrySet()) {
            int month = entry.getValue().getMonth();
            if (month >= 5 && month<= 7) {
                map.remove(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
