package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = null;
        BufferedReader fileReader2 = null;
        try {
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            try {
                fileReader1 = new BufferedReader(new FileReader(name1));
                fileReader2 = new BufferedReader(new FileReader(name2));
                for (String line; (line = fileReader1.readLine()) != null;) {
                    allLines.add(line);
                }
                for (String line; (line = fileReader2.readLine()) != null;) {
                    forRemoveLines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
        reader.close();
        fileReader1.close();
        fileReader2.close();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
