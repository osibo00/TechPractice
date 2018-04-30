package com.company.c4q.whiteboardingexcercises;


/**
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
 */
public class SameLastDigit {

    public static void main(String[] args) {

        System.out.println(sameLastDigit(27, 59));

    }

    static boolean sameLastDigit(int n1, int n2) {
        return n1 % 10 == n2 % 10;
    }
}
