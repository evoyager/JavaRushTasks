package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    static int N = 10000;

    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < N; i++) {
            list.add("Z");
        }
    }

    public static void get10000(List list) {
        for (int i = 0; i < N; i++) {
            list.get(N/2);
        }
    }

    public static void set10000(List list) {
        for (int i = 0; i < N; i++) {
            list.set(i, "X");
        }
    }

    public static void remove10000(List list) {
        for (int i = 0; i < N; i++) {
            if (list.size() != 1) {
                list.remove(list.size() / 2 - 1);
            } else list.remove(0);
        }
    }
}
