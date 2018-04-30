package com.company.c4q.unit08practice;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sum(126));
    }

    public static int sum(int n) {
       int rightMost = n % 10;
       int remaining = n / 10;
       if (remaining == 0) {
           return rightMost;
       } else {
           return rightMost + sum(remaining);
       }
    }
}
