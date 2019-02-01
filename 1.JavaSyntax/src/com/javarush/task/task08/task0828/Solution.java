package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        Date dateFromStr = null;
        try {
            dateFromStr = sdf.parse(month);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFromStr);
        ArrayList<Integer> monthList = new ArrayList<>();
        monthList.add((calendar.get(Calendar.MONTH)+1));
        System.out.println(month + " is the " + monthList.get(0) + " month");
    }
}
