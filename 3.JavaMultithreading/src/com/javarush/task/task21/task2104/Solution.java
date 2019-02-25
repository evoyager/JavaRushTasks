package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass() || !(o instanceof Solution)) {
            return false;
        }
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) &&
            Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    //    public boolean equals(Object o) {
//        if ( !(o instanceof Solution)) {
//            return false;
//        }
//        if (o==null) {
//            return false;
//        }
//        if (o.getClass() != this.getClass()) {
//            return false;
//        }
//        if (o == this) {
//            return true;
//        }
//        Solution s = (Solution) o;
//        if (first == null && s.first == null && last == null && s.last == null) {
//            return true;
//        } else if (first == null && s.first == null && last != null && s.last != null) {
//            return s.last.equals(last);
//        } else if (first != null && s.first != null && last == null && s.last == null) {
//            return s.first.equals(first);
//        }
//        return s.first.equals(first) && s.last.equals(last);
//    }
//
//    public int hashCode() {
//        int result = 17;
//        result = 37 * result + (first == null ? 0 : first.hashCode());
//        result = 37 * result + (last == null ? 0 : last.hashCode());
//        return result;
//    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
