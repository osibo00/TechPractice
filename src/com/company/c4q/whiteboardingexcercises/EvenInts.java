package com.company.c4q.whiteboardingexcercises;


/**
 * Given an int[], return the number of even integers in the array.
 */
public class EvenInts {

    public static void main(String[] args) {

        System.out.println(numOfEvens(new int[]{1,2,3,4,5}));
    }

    static int numOfEvens(int[] arr) {
        if (arr == null) return 0;

        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
