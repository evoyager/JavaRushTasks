package com.javarush.task.task22.task2201;

public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (Solution.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else
            if (Solution.SECOND_THREAD_NAME.equals(t.getName())) {
                System.out.println(getFormattedStringForSecondThread(t, e, string));
            } else {
                System.out.println(getFormattedStringForOtherThread(t, e, string));
            }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
//        StringBuilder builder = new StringBuilder("");
//        builder
//            .append(e.getClass().getSimpleName())
//            .append(" : ")
//            .append(e.getCause())
//            .append(" : ")
//            .append(t.getName());
//        return builder.toString();
        return String.format(new String("%s : %s : %s"), e.getClass().getSimpleName(), e.getCause(), t.getName());
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
//        StringBuilder builder = new StringBuilder("");
//        builder
//            .append(e.getCause())
//            .append(" : ")
//            .append(e.getClass().getSimpleName())
//            .append(" : ")
//            .append(t.getName());
//        return builder.toString();
        return String.format(new String("%s : %s : %s"), e.getCause(), e.getClass().getSimpleName(), t.getName());
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
//        StringBuilder builder = new StringBuilder("");
//        builder
//            .append(t.getName())
//            .append(" : ")
//            .append(e.getClass().getSimpleName())
//            .append(" : ")
//            .append(e.getCause());
//        return builder.toString();
        return String.format(new String("%s : %s : %s"), t.getName(), e.getClass().getSimpleName(), e.getCause());
    }
}

