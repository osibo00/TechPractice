package com.company.c4q.unit08practice;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(flipItAndReverseIt("Potato Sack"));

    }

    public static String flipItAndReverseIt(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += "" + s.charAt(i);
        }
        return reversed;
    }
}
