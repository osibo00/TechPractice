package com.company.crackingthecode.stringsandarrays;

import java.util.HashSet;

public class OneAway {

    public static void main(String[] args) {
        System.out.println(oneAway02("pale", "bake"));

    }

    public static boolean oneAway01(String s, String t) {
        int editCounter = 0;
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }
        for (int j = 0; j < t.length(); j++) {
            if (!charSet.contains(t.charAt(j))) {
                editCounter++;
            }
        }
        return editCounter <= 1;
    }
    public static boolean oneAway02(String s, String t) {
        int editCounter = 0;
        int length;
        if (s.length() <= t.length()) {
            length = s.length();
        } else {
            length = t.length();
        }
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                editCounter++;
            }
        }
        return editCounter <= 1;
    }
}
