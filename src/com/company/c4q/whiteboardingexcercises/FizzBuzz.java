package com.company.c4q.whiteboardingexcercises;


/**
 * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. Consider the series of numbers beginning at start and running up to but not including end,
 * so for example start = 1 and end = 5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers (e.g. ["1", "2", "3" "4"]), except for multiples of 3, use "Fizz" instead of the number,
 * for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is
 * a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        for (String s : modifiedFizzBuzz(2, 16)) {
            System.out.println(s);
        }

    }

    static String[] modifiedFizzBuzz(int start, int end) {
        String[] arr = new String[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[index] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[index] = "Fizz";
            } else if (i % 5 == 0) {
                arr[index] = "Buzz";
            } else {
                arr[index] = String.valueOf(i);
            }
            index++;
        }
        return arr;
    }
}
