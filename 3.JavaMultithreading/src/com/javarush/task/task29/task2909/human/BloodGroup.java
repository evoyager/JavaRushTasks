package com.javarush.task.task29.task2909.human;

public class BloodGroup {
    private final int code;
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int FOURTH = 4;

    private BloodGroup(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static BloodGroup first() {
        return new BloodGroup(FIRST);
    }

    public static BloodGroup second() {
        return new BloodGroup(SECOND);
    }

    public static BloodGroup third() {
        return new BloodGroup(THIRD);
    }

    public static BloodGroup fourth() {
        return new BloodGroup(FOURTH);
    }
}
