package com.company.crackingthecode.stringsandarrays;

import java.util.HashSet;

public class IsUnique {

    public static void main(String[] args) {

        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars01(word));
        }

    }

    /**
     * 1.1 Is Unique
     */
    public static boolean isUnique(String s) {
        HashSet<Character> strings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            strings.add(s.charAt(i));
        }
        return strings.size() == s.length();
    }

    public static boolean isUniqueChars01(String s) {
        if (s.length() > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }

    public static boolean isUniqueChars02(String str) {
        if (str.length() > 26) { // Only 26 characters
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println(val);
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
}
