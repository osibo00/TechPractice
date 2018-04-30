package com.company.c4q.whiteboardingexcercises;


/**
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 */
public class ModifyCharsInString {

    public static void main(String[] args) {
        System.out.println(modify("cat"));
    }

    static String modify(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.insert(0, s.charAt(s.length() - 1)).append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
