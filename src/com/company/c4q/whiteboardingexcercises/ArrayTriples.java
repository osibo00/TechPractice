package com.company.c4q.whiteboardingexcercises;


/**
 * Given an int[], we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 */
public class ArrayTriples {

    public static void main(String[] args) {

        System.out.println(triples(new int[]{3, 3}));

    }

    static boolean triples(int[] arr) {
        if (arr == null || arr.length < 3) return true;

        int value;
        for (int i = 0; i < arr.length - 2; i++) {
            value = arr[i];
            if (value == arr[i + 1] && value == arr[i + 2]) {
                return false;
            }
        }
        return true;
    }
}
