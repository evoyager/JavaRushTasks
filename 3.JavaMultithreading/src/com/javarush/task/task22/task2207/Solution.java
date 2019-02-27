package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedReader fr = new BufferedReader(new FileReader(file));
        List<String> words = new ArrayList<>();
        while (fr.ready()) {
            String line = fr.readLine();
            String[] arr = line.split(" ");
            words.addAll(Arrays.asList(arr));
        }
        reader.close();
        fr.close();
        for (int i = 0; i < words.size(); i++) {
            for (int j = i+1; j < words.size(); j++) {
                if (words.get(i).equals(new StringBuilder(words.get(j)).reverse().toString())) {
                    Pair pair = new Pair(words.get(i), words.get(j));
                    if (!result.contains(pair)) {
                        result.add(pair);
                    }
                }
            }
        }
        for (Pair pair : result) {
            System.out.println(pair);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
