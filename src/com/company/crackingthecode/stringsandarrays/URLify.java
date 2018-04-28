package com.company.crackingthecode.stringsandarrays;

public class URLify {

    public static void main(String[] args) {

        System.out.println(replace02("Mr John Smith   ", 13));
    }

    public static String replace01(String s, int length) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < length; i++) {
           if (chars[i] == ' ') {
               chars[i] = '%';
               chars[i + 1] = '2';
               chars[i + 2] = '0';

            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }
    public static String replace02(String s, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
