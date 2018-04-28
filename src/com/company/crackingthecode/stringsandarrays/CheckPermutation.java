package com.company.crackingthecode.stringsandarrays;

import java.util.ArrayList;
import java.util.List;

public class CheckPermutation {

    public static void main(String[] args) {

        System.out.println(permutation("cathe", "tache"));

    }

    public static boolean checkPermutation(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) return false;

        List<Character> charSet = new ArrayList<>();
        for (int i  = 0; i < strOne.length(); i++) {
            charSet.add(strOne.charAt(i));
        }
        for (int j = 0; j < strTwo.length(); j++) {
            if (!charSet.contains(strTwo.charAt(j))) return false;
        }
        return true;
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charSet = new int[128];
        for (int i = 0; i < s.length(); i++) {
            charSet[s.charAt(i)]++;
        }

        for (int j = 0; j < t.length(); j++) {
            charSet[t.charAt(j)]--;
            if (charSet[t.charAt(j)] < 0) {
                return false;
            }
        }
        return true;
    }
}
