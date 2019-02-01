package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        Thread thread3 = new Thread3();
        Thread thread4 = new Thread4();
        Thread thread5 = new Thread5();
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);
//        for (Thread thread : threads) {
//            thread.start();
//        }
    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException" );
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while(true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Thread5 extends Thread {
        private double sum;
        @Override
        public void run() {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    String str = reader.readLine();
                    if (str.equals("N")) {
                        System.out.println(sum);
                        break;
                    }
                    double i = Double.parseDouble(str);
                    sum += i;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}