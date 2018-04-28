package com.company.c4q;

public class RepeatFront {

    public static void main(String[] args) {

        System.out.println(repeat("Chocolate", 3));
        System.out.println(repeat("Ice Cream", 2));

    }

    public static String repeat(String s, int n) {
        String newString = "";
        while (n >= 0) {
            for (int i = 0; i < n; i++) {
                newString += "" + s.charAt(i);
            }
            n--;
        }
        return newString;
    }
}
