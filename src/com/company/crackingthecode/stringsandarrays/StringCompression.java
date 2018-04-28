package com.company.crackingthecode.stringsandarrays;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compression02("aabcccccaaa"));
    }

    public static String compression(String s) {
        List<Character> charSet = new ArrayList<>();
        int index = 0;
        int[] charCount = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c]++;
            if (i == 0) {
                charSet.add(index, c);
                index++;
            }
            if (i >= 1 && charSet.get(index - 1) != c) {
                charSet.add(index, c);
                index++;
            }
        }
        StringBuilder sb = new StringBuilder();
        index = 0;
        for (int j = 0; j < charCount.length; j++) {
            if (charCount[j] >= 1) {
                sb.append(charSet.get(index)).append(String.valueOf(charCount[j]));
                index++;
            }
        }
        return sb.toString();
    }

    public static String compression02(String s) {
        String newString = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            counter++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                newString += "" + s.charAt(i) + counter;
                counter = 0;
            }
        }
        return newString.length() < s.length() ? newString : s;
    }
}
