package com.company.c4q;

public class ArrayHeights {

    public static void main(String[] args) {
        System.out.println(sumHeights(new int[]{5,3,6,7,2}, 0,4));
    }

    public static int sumHeights(int[] arr, int start, int end) {
        int sumDiff = 0;
        for (int i = start; i < end; i++) {
            sumDiff = sumDiff + Math.abs(arr[i] - arr[i + 1]);
        }
        return sumDiff;
    }
}
