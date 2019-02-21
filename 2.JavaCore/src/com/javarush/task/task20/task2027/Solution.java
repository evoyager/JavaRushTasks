package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
//        int[][] crossword = new int[][]{
//                {'f', 'd', 'e', 'r', 'l', 'k'},
//                {'u', 's', 'a', 'm', 'e', 'o'},
//                {'l', 'n', 'g', 'r', 'o', 'v'},
//                {'m', 'l', 'p', 'r', 'r', 'h'},
//                {'p', 'o', 'e', 'e', 'j', 'j'}
//        };
//        detectAllWords(crossword, "home", "same");
//        int[][] crossword = new int[][]{
//            {'f', 'd', 'e', 'r', 'l', 'k'},
//            {'u', 's', 'a', 'm', 'e', 'o'},
//            {'l', 'u', 'g', 'r', 'o', 'v'},
//            {'m', 'l', 'p', 'r', 'r', 'h'},
//            {'p', 'o', 'e', 'p', 'j', 'j'},
//            {'t', 'r', 'w', 'e', 'k', 'a'},
//            {'m', 'c', 'n', 'q', 's', 'o'},
//            {'z', 'o', 'e', 'f', 'h', 's'}
//        };
//        detectAllWords(crossword, "lleess");
        int[][] crossword = new int[][]{
            {'f', 'e', 'e', 'e', 'l', 'e'},
            {'u', 's', 'n', 'n', 'n', 'o'},
            {'l', 'e', 'n', 'o', 'n', 'e'},
            {'m', 'm', 'n', 'n', 'n', 'h'},
            {'p', 'e', 'e', 'e', 'j', 'e'},
        };
        detectAllWords(crossword, "one");

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<>();
        for (String word : words) {
            String reverseWord = reverseWord(word);

            findFromLeftToRight(crossword, word, result, false);
            findFromLeftToRight(crossword, reverseWord, result, true);

            findFromUpToDown(crossword, word, result, false);
            findFromUpToDown(crossword, reverseWord, result, true);

            findInDigonal(crossword, word, result, false);
            findInDigonal(crossword, reverseWord, result, true);
        }


        for (Word w : result) {
            System.out.println(w);
        }
        return result;
    }

    public static void findFromLeftToRight(int[][] crossword, String word, List<Word> result, boolean wordIsReversed) {
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;


        for (int y = 0; y < crossword.length; y++) {
            for (int x = 0; x < crossword[0].length; x++) {
                if (Character.valueOf((char) crossword[y][x]).equals(word.charAt(0))) {
                    startX = x;
                    startY = y;
                    for (int currCharIndex = 1; currCharIndex < word.length(); currCharIndex++) {
                        if ((x + currCharIndex >= crossword[0].length) ||
                            !Character.valueOf((char) crossword[y][x + currCharIndex]).equals(word.charAt(currCharIndex))) {
                            break;
                        }
                        if (currCharIndex == word.length() - 1) {
                            endX = x + currCharIndex;
                            endY = y;
                            Word w;
                            if (!wordIsReversed) {
                                w = new Word(word);
                                w.setStartPoint(startX, startY);
                                w.setEndPoint(endX, endY);
                            } else {
                                w = new Word(reverseWord(word));
                                w.setStartPoint(endX, endY);
                                w.setEndPoint(startX, startY);
                            }
                            result.add(w);
                        }
                    }
                }
            }
        }
    }

    public static void findFromUpToDown(int[][] crossword, String word, List<Word> result, boolean wordIsReversed) {
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;

        boolean wordIsFound = false;

        for (int x = 0; x < crossword[0].length; x++) {
            for (int y = 0; y < crossword.length; y++) {
                if (Character.valueOf((char) crossword[y][x]).equals(word.charAt(0))) {
                    startX = x;
                    startY = y;
                    for (int currCharIndex = 1; currCharIndex < word.length(); currCharIndex++) {
                        if ((y + currCharIndex >= crossword.length) ||
                            !Character.valueOf((char) crossword[y + currCharIndex][x]).equals(word.charAt(currCharIndex))) {
                            break;
                        }
                        if (currCharIndex == word.length() - 1) {
                            endX = x;
                            endY = y + currCharIndex;
                            Word w;
                            if (!wordIsReversed) {
                                w = new Word(word);
                                w.setStartPoint(startX, startY);
                                w.setEndPoint(endX, endY);
                            } else {
                                w = new Word(reverseWord(word));
                                w.setStartPoint(endX, endY);
                                w.setEndPoint(startX, startY);
                            }
                            result.add(w);
                        }
                    }
                }
            }
        }
    }

    public static void findInDigonal(int[][] crossword, String word, List<Word> result, boolean wordIsReversed) {
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;

        // from upper left corner
        for (int y = 0; y < crossword.length; y++) {
            for (int x = 0; x < crossword[0].length; x++) {
                if (Character.valueOf((char) crossword[y][x]).equals(word.charAt(0))) {
                    startX = x;
                    startY = y;
                    for (int currCharIndex = 1; currCharIndex < word.length(); currCharIndex++) {
                        if ((x + currCharIndex >= crossword[0].length) || (y + currCharIndex >= crossword.length) ||
                            !Character.valueOf((char) crossword[y + currCharIndex][x + currCharIndex]).equals(word.charAt(currCharIndex))) {
                            break;
                        }
                        if (currCharIndex == word.length() - 1) {
                            endX = x + currCharIndex;
                            endY = y + currCharIndex;
                            Word w;
                            if (!wordIsReversed) {
                                w = new Word(word);
                                w.setStartPoint(startX, startY);
                                w.setEndPoint(endX, endY);
                            } else {
                                w = new Word(reverseWord(word));
                                w.setStartPoint(endX, endY);
                                w.setEndPoint(startX, startY);
                            }
                            result.add(w);
                        }
                    }
                }
            }
        }

        // from upper right corner
        for (int y = 0; y < crossword.length; y++) {
            for (int x = crossword[0].length - 1; x >= 0; x--) {
                if (Character.valueOf((char) crossword[y][x]).equals(word.charAt(0))) {
                    startX = x;
                    startY = y;
                    for (int currCharIndex = 1; currCharIndex < word.length(); currCharIndex++) {
                        if ((x - currCharIndex < 0) || (y + currCharIndex >= crossword.length) ||
                            !Character.valueOf((char) crossword[y + currCharIndex][x - currCharIndex]).equals(word.charAt(currCharIndex))) {
                            break;
                        }
                        if (currCharIndex == word.length() - 1) {
                            endX = x - currCharIndex;
                            endY = y + currCharIndex;
                            Word w;
                            if (!wordIsReversed) {
                                w = new Word(word);
                                w.setStartPoint(startX, startY);
                                w.setEndPoint(endX, endY);
                            } else {
                                w = new Word(reverseWord(word));
                                w.setStartPoint(endX, endY);
                                w.setEndPoint(startX, startY);
                            }
                            result.add(w);
                        }
                    }
                }
            }
        }
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
