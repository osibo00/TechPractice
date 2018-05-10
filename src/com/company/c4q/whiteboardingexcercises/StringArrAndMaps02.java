package com.company.c4q.whiteboardingexcercises;

import java.util.HashMap;
import java.util.Map;

public class StringArrAndMaps02 {

    public static void main(String[] args) {

        Map<String, Boolean> stringMap = twoOrMore(new String[]{"apple", "banana", "bat", "bat", "apple", "can"});

        for (String s : stringMap.keySet()) {
            System.out.println(s + ":" + stringMap.get(s));
        }
    }

    static Map<String, Boolean> twoOrMore(String[] arr) {
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        for (String s : arr) {
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(s)) {
                    counter++;
                }
            }
            if (!stringBooleanMap.containsKey(s)) {
                if (counter >= 2) {
                    stringBooleanMap.put(s, true);
                } else {
                    stringBooleanMap.put(s, false);
                }
            }
        }
        return stringBooleanMap;
    }
}
