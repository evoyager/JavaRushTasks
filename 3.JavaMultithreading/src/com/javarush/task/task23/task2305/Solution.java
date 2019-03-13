package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution firstSolution = new Solution();
        firstSolution.innerClasses[0] = firstSolution.new InnerClass();
        firstSolution.innerClasses[1] = firstSolution.new InnerClass();
        Solution secondSolution = new Solution();
        secondSolution.innerClasses[0] = secondSolution.new InnerClass();
        secondSolution.innerClasses[1] = secondSolution.new InnerClass();
        Solution[] solutions = new Solution[2];
        solutions[0] = firstSolution;
        solutions[1] = secondSolution;
        return solutions;
    }

    public static void main(String[] args) {

    }
}
