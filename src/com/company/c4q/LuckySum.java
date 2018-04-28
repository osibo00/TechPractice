package com.company.c4q;

public class LuckySum {

    public static void main(String[] args) {

        System.out.println(getSum(1,2,3));
        System.out.println(getSum(1,2,13));
        System.out.println(getSum(1,13,3));

    }

    public static int getSum(int a, int b, int c) {
        if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
}
