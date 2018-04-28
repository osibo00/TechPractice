package com.company.crackingthecode.stringsandarrays;

public class StringRotation {

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }

    }

    public static boolean isSubstring(String s, String t) {
        if (s.length() != t.length()) return false;

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            charSet[s.charAt(i)] = true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (!charSet[t.charAt(i)]) return false;
        }
        return true;
    }

    public static boolean isSubString02(String s, String t) {
        return s.contains(t);
    }

    public static boolean isRotation(String s1, String s2) {
        int length = s1.length();
        if (length == s2.length() && length > 0) {
            String s1s1 = s1 + s1;
            return isSubString02(s1s1, s2);
        }
        return false;
    }
}
