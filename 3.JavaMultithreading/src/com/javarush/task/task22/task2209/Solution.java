package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
//        String file = "zz.txt";
        BufferedReader fr = new BufferedReader(new FileReader(file));
        List<String> words = new ArrayList<>();
        while (fr.ready()) {
            String line = fr.readLine();
            String[] arr = line.split(" ");
            words.addAll(Arrays.asList(arr));
        }

        StringBuilder result = getLine(words.toArray(new String[words.size()]));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder builder = new StringBuilder();
        if (words.length == 0) {
            return builder;
        }
        String lastWord = "";

        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        String firstWord = "";
        for (String s : words) {
            wordsList.add(s);
        }
        Collections.sort(wordsList);
        ArrayList<String> tmpList = (ArrayList<String>) wordsList.clone();

        boolean foundWord = true;
        String bestFirstWord = "";
        int maxChainLength = 0;
        for (String nextFirstWord : wordsList) {
            resultList.add(nextFirstWord);
            tmpList.remove(nextFirstWord);
            lastWord = nextFirstWord;
            while (tmpList.size() > 0 && foundWord) {
                foundWord = false;
                for (String s : wordsList) {
                    if (!lastWord.equals(s) && !resultList.contains(s)) {
                        if (String.valueOf(lastWord.charAt(lastWord.length()-1)).equalsIgnoreCase(String.valueOf(s.charAt(0)))) {
                            resultList.add(s);
                            lastWord = s;
                            foundWord = true;
                            tmpList.remove(s);
                            break;
                        }
                    }
                }
            }
            if (resultList.size() > maxChainLength) {
                maxChainLength = resultList.size();
                bestFirstWord = nextFirstWord;
            }
            tmpList = (ArrayList<String>) wordsList.clone();
            resultList.clear();
            foundWord = true;
        }

        builder
            .append(bestFirstWord);
        wordsList.remove(bestFirstWord);
        lastWord = bestFirstWord;

        while (wordsList.size() > 0 && foundWord) {
            foundWord = false;
            for (String s : wordsList) {
                if (!lastWord.equals(s) && !resultList.contains(s)) {
                    if (String.valueOf(lastWord.charAt(lastWord.length()-1)).equalsIgnoreCase(String.valueOf(s.charAt(0)))) {
                        resultList.add(s);
                        lastWord = s;
                        foundWord = true;
                        wordsList.remove(s);
                        break;
                    }
                }
            }
        }

        for (String s : wordsList) {
            resultList.add(s);
        }

        for (String s : resultList) {
            builder
                .append(" ")
                .append(s);
        }

        return builder;
    }
}