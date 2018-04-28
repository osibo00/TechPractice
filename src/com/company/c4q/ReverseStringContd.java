package com.company.c4q;


public class ReverseStringContd {

    public static void main(String[] args) {
        System.out.println(reverse02("The eagle has landed"));

    }

    public static String reverseItSomeMore(String s) {
        String reversed = "";
        int wordStart;
        int wordEnd;
        int lengthCounter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' || i == 0) {
                wordStart = i;
                wordEnd = i + lengthCounter;
                lengthCounter = 0;
                for (int j = wordStart; j <= wordEnd; j++) {
                    if (s.charAt(j) != ' ') {
                        reversed += "" + s.charAt(j);
                    }
                }
                reversed += " ";
            } else {
                lengthCounter++;
            }
        }
        return reversed;
    }

    public static String reverse02(String s) {
        StringBuilder sb = new StringBuilder();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s1 += s.charAt(i);
            } else if (s.charAt(i) == ' ' || i == s.length() - 1) {
                sb.insert(0, s1 + " ");
                s1 = "";
            }
        }
        return sb.toString();
    }
}
