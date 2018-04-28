package com.company.c4q;

public class DividesSelf {

    public static void main(String[] args) {

        System.out.println(dividesBySelf(128));

    }

    public static boolean dividesBySelf(int n) {
        int rightmost = n % 10;
        int remaining = n / 10;
        while (remaining > 0) {
            if (rightmost != 0 && n % rightmost == 0) {
                rightmost = remaining % 10;
                remaining = remaining / 10;
            } else {
                return false;
            }
        }
        return true;
    }
}
