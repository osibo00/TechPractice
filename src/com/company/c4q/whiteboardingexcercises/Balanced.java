package com.company.c4q.whiteboardingexcercises;

import java.util.Stack;


/**
 * Check if a string is balanced when its composed of ()[]{}. Can be null and can have other chars.
 */
public class Balanced {

    public static void main(String[] args) {

        System.out.println(stringBalanced(""));
    }

    static boolean stringBalanced(String s) {
        if (s == null || s.length() <= 1) return false;

        char c = s.charAt(0);
        if (c == ')' || c == ']' || c == '}') return false;

        Stack<Character> charSet = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                charSet.push(s.charAt(i));
            } else if (c == ')' || c == ']' || c == '}') {
                if (c == ')' && charSet.pop() != '(') {
                    return false;
                } else if (c == ']' && charSet.pop() != '[') {
                    return false;
                } else if (c == '}' && charSet.pop() != '{') {
                    return false;
                }
            }
        }
        return true;
    }
}
