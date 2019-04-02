package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        try {
            int couter = 1;
            while (!currentThread.isInterrupted()) {
                String value = String.format("Some text for %d", couter);
                map.put(String.valueOf(couter), value);
                couter++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.printf("%s thread was terminated", currentThread.getName());
        }
    }
}
