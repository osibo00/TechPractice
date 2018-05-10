package com.company.c4q.whiteboardingexcercises;

public class StringCompression02 {

    public static void main(String[] args) {

        System.out.println(compress("aabcccccaaa"));
    }

    static String compress(String s) {
        String newString = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
           counter++;
           if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
               newString += s.charAt(i) + String.valueOf(counter);
               counter = 0;
           }
        }
        return newString.length() < s.length() ? newString : s;
    }
}
