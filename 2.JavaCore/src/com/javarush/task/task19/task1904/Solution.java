package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String person = fileScanner.nextLine();
            String[] personAttr = person.split(" ");
            String firstName = personAttr[1];
            String middleName = personAttr[2];
            String lastName = personAttr[0];
            Date birthDate = null;
            SimpleDateFormat ft = new SimpleDateFormat ("dd MM yyyy");
            try {
                birthDate = ft.parse(personAttr[3] + " " + personAttr[4] + " " + personAttr[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person result = new Person(firstName, middleName, lastName, birthDate);
            return result;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
