package com.company.c4q.unit08practice;

public class BigDiff {

    public static void main(String[] args) {

        System.out.println(difference(new int[]{8}));

    }

    public static int difference(int[] ints) {
        if(ints.length == 1) return 0;
        int smallest = ints[0];
        int largest = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > largest) {
                largest = ints[i];
            } else if (ints[i] < smallest) {
                smallest = ints[i];
            }
        }
        return largest - smallest;
    }
}
