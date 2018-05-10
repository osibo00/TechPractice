package com.company.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {
        System.out.println();
    }

    private static boolean isBalanced02(String s) {
        if (s.length() == 0) return true;
        if (s.length() == 1 || s.length() == 3) return false;

        Stack<Character> charSet = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')' || c == ']' || c == '}') {
                if (charSet.size() != 0) {
                    char last = charSet.pop();
                    if (c == ')' && last != '(') return false;
                    if (c == ']' && last != '[') return false;
                    if (c == '}' && last != '{') return false;
                } else {
                    return false;
                }
            } else if (c == '(' || c == '[' || c == '{') {
                charSet.push(c);
            }
        }
        return true;
    }

    private static boolean isBalanced(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> charSet = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    charSet.offerLast(c);
                    break;
                case ')':
                    if (charSet.size() == 0 || charSet.pollLast() != '(') return false;
                    break;
                case ']':
                    if (charSet.size() == 0 || charSet.pollLast() != '[') return false;
                    break;
                case '}':
                    if (charSet.size() == 0 || charSet.pollLast() != '{') return false;
                    break;
                default:
                    break;
            }

            if (i == s.length() - 1 && charSet.size() > 0) return false;
        }
        return true;
    }
}
