package com.company.crackingthecode.stringsandarrays;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(numOfDeletions("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }

    static int wrongAnswerDoesntAlwaysWork(String s1, String s2) {
        List<Character> charSet = new ArrayList<>();
        String longer = s1.length() >= s2.length() ? s1 : s2;
        String shortest = s1.length() >= s2.length() ? s2 : s1;
        int index = 0;
        for (int i = 0; i < longer.length(); i++) {
            char c = longer.charAt(i);
            if (charSet.contains(c)) {
                continue;
            }
            for (int j = 0; j < shortest.length(); j++) {
                if (c == shortest.charAt(j)) {
                    charSet.add(index, c);
                    index++;
                }
            }
        }
        return (s1.length() - charSet.size()) + (s2.length() - charSet.size());
    }

    static int numOfDeletions(String s1, String s2) {
        return 0;
    }
}
