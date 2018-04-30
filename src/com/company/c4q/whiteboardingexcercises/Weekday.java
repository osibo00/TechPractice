package com.company.c4q.whiteboardingexcercises;


/**
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 */
public class Weekday {

    public static void main(String[] args) {
        System.out.println(sleepIn(false, true));
    }

    static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday && vacation;
    }
}
