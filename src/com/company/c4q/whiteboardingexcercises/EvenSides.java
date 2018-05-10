package com.company.c4q.whiteboardingexcercises;

public class EvenSides {

    public static void main(String[] args) {

        System.out.println(areSumOfSidesEqual(new int[]{1, 3, 4, 4, 4}));
    }

    static boolean areSumOfSidesEqual(int[] arr) {
        int leftmost = 0;
        for (int i = 0; i < arr.length; i++) {
            leftmost += arr[i];
            int rightmost = 0;
            for (int j = arr.length - 1; j > i; j--) {
                rightmost += arr[j];
            }
            if (rightmost == leftmost) return true;
        }
        return false;
    }
}
