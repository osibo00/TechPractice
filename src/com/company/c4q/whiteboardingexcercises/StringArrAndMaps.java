package com.company.c4q.whiteboardingexcercises;

import java.util.HashMap;
import java.util.Map;

public class StringArrAndMaps {

    public static void main(String[] args) {

        Map<String, String> stringMap = sortByChar(new String[]{"apple", "banana", "bat", "cat", "apricot", "can"});

        for (String s : stringMap.keySet()) {
            System.out.println(s + ":" + stringMap.get(s));
        }

    }

    static Map<String, String> sortByChar(String[] arr) {
        Map<String, String> stringMap = new HashMap<>();
        char c;
        String appended = "";
        for (int i = 0; i < arr.length; i++) {
            c = arr[i].charAt(0);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].charAt(0) == c && !stringMap.containsKey(String.valueOf(c))) {
                    appended += arr[j];
                }
            }
            if (!appended.equals("")) {
                stringMap.put(String.valueOf(c), appended);
            }
            appended = "";
        }
        return stringMap;
    }
}
