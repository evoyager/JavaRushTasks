package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String file = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            String line = reader.readLine();
            String[] lineArr = line.split(" ");
            StringBuilder name = new StringBuilder("");
            StringBuilder date = new StringBuilder("");
            for (String s : lineArr) {
                if (!s.matches("^[0-9]+$")) {
                    if (!name.toString().equals("")) {
                        name.append(" ");
                    }
                    name.append(s);
                } else {
                    if (!date.toString().equals("")) {
                        date.append(" ");
                    }
                    date.append(s);
                }
            }
            String pattern = "dd MM yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date d = simpleDateFormat.parse(date.toString());
            PEOPLE.add(new Person(name.toString(), d));
        }
//        PEOPLE.stream().forEach(p -> System.out.println(p.getName() + ", " + p.getBirthDate()));

        reader.close();
    }
}
