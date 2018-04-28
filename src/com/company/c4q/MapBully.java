package com.company.c4q;

import java.util.HashMap;

public class MapBully {

    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("b", "dirt");
        stringHashMap.put("c", "meh");
        stringHashMap.put("a", "candy");
        modify(stringHashMap);
        for(String s : stringHashMap.keySet()) {
            System.out.println(s + ": " + stringHashMap.get(s));
        }
    }

    public static HashMap modify(HashMap<String, String> stringHashMap) {
        if (stringHashMap.get("a") != null) {
            stringHashMap.put("b", stringHashMap.get("a"));
            stringHashMap.put("a", "");
        }
        return stringHashMap;
    }
}
