package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = reader.readLine();
            if (name.equals("exit")) {
                break;
            }
            new ReadThread(name).start();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Map<Integer, Integer> map = new HashMap<>();

            try {
                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                    map.put(data, map.containsKey(data) ? map.get(data) + 1 : 1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int freqByte = 0;
            int maxFreq = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    freqByte = entry.getKey();
                    maxFreq = entry.getValue();
                }
            }
            resultMap.put(fileName, freqByte);
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
