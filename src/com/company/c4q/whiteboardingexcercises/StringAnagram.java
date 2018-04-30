package com.company.c4q.whiteboardingexcercises;


/**
 * Given two strings, write a method to decide if one is an anagram of the other.
 */
public class StringAnagram {

    public static void main(String[] args) {

        System.out.println(anagram("apple", "appl"));

    }

    static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] charSet = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            charSet[s1.charAt(i)]++;
        }
        for (int j = 0; j < s2.length(); j++) {
            charSet[s2.charAt(j)]--;
            if (charSet[s2.charAt(j)] < 0) {
                return false;
            }
        }
        return true;
    }
}
