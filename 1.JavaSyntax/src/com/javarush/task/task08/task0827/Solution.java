package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd yyyy");
        Date dateFromStr = null;
        try {
            dateFromStr = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFromStr);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        if (dayOfYear % 2 != 0) {
            return true;
        }
        return false;
    }
}
