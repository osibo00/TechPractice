package com.company.c4q.whiteboardingexcercises;

public class ContainsInt {

    public static void main(String[] args) {

        System.out.println(containsInt(new int[]{3, 5, 56, 2, 7, 57}, 2));

    }

    static boolean containsInt(int[] arr, int n) {
        for (int i : arr) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }
}
