package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
//        InputStream inputStream = System.in;
//        Reader reader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(reader);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int years = Integer.parseInt(bufferedReader.readLine());
//        String name = bufferedReader.readLine();

        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        String name = scanner.nextLine();
        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
