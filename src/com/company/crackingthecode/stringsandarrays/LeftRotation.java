package com.company.crackingthecode.stringsandarrays;

public class LeftRotation {

    public static void main(String[] args) {

        for (int n : leftRotation(new int[]{1,2,3,4,5}, 4)) {
            System.out.print(n + " ");
        }
    }

    static int[] leftRotation(int[] arr, int d) {
        int[] rotatedArr = new int[arr.length];
        int index = 0;
        for (int i = d; i < arr.length; i++) {
            rotatedArr[index] = arr[i];
            index++;
        }
        for (int j = 0; j < d; j++) {
            rotatedArr[index] = arr[j];
            index++;
        }
        return rotatedArr;
    }
}
