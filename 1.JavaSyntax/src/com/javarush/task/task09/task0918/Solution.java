package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends SQLException {
    }

    static class MyException3 extends IndexOutOfBoundsException{
    }

    static class MyException4  extends NullPointerException{
    }
}

