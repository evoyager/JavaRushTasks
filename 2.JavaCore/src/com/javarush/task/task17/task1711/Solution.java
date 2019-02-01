package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c" : {
                synchronized (allPeople) {
                    for (int i = 0; i < args.length / 3; i++) {
                        String name = args[i*3 + 1];
                        String sex = args[i*3 + 2];
                        String pattern = "dd/MM/yyyy";
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                        Date birthDate = null;
                        try {
                            birthDate = simpleDateFormat.parse(args[i*3 + 3]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        Person person = null;
                        if (sex.equals("м")) {
                            person = Person.createMale(name, birthDate);
                        } else if (sex.equals("ж")) {
                            person = Person.createFemale(name, birthDate);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            }
            case "-u" : {
                synchronized (allPeople) {
                    for (int i = 0; i < args.length / 4; i++) {
                        int id = Integer.parseInt(args[i*4 + 1]);
                        String name = args[i*4 + 2];
                        String sex = args[i*4 + 3];
                        String pattern = "dd/MM/yyyy";
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                        Date birthDate = null;
                        try {
                            birthDate = simpleDateFormat.parse(args[i*4 + 4]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        Person person = null;
                        if (sex.equals("м")) {
                            person = Person.createMale(name, birthDate);
                        } else if (sex.equals("ж")) {
                            person = Person.createFemale(name, birthDate);
                        }
                        allPeople.set(id, person);
                    }
                    break;
                }
            }
            case  "-d" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        Person person = allPeople.get(id);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                        allPeople.set(id, person);
                    }
                    break;
                }
            }
            case  "-i" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        Person person = allPeople.get(id);
                        String name = person.getName();
                        Sex sex = person.getSex();
                        String sexStr = "";
                        if (sex.equals(Sex.MALE)) {
                            sexStr = "м";
                        } else if (sex.equals(Sex.FEMALE)) {
                            sexStr = "ж";
                        }
                        Date birthDate = person.getBirthDate();
                        String birthDateStr = new SimpleDateFormat("dd-MMM-yyyy").format(birthDate);
                        System.out.println(name + " " + sexStr + " " + birthDateStr);
                    }
                    break;
                }
            }

        }
    }
}
