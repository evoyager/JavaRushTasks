package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int middle = a;
        if ((a > b && a < c) || (a < b && a > c)) {
            middle = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            middle = b;
        } else if ((c > a && c < b) || (c < a && c > b)) {
            middle = c;
        }
        if (a == b || a == c) {
            middle = a;
        } else if (b == c) {
            middle = b;
        }
        System.out.println(middle);
    }
}
