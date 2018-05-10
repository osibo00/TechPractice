package com.company.hackerrank;

import java.util.Calendar;
import java.util.Locale;

public class JavaDateAndTime {

    public static void main(String[] args) {

        System.out.println(getDay("8", "5", "2018"));

    }

    private static String getDay(String day, String month, String year) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Calendar.YEAR, Integer.parseInt(year));
        rightNow.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        rightNow.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
        return rightNow.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
    }
}
