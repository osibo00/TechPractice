package com.company.hackerrank;

import java.util.HashSet;

public class JavaHashSet {

    public static void main(String[] args) {

    }

    private static void uniquePairs(String[] pair_left, String[] pair_right) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < pair_left.length; i++) {
            hashSet.add(pair_left[i] + "," + pair_right[i]);
            System.out.println(hashSet.size());
        }
    }
}
