package com.company.c4q;

public class Triangle {

    public static void main(String[] args) {
        System.out.println(numOfBlocks(1));
    }

    public static int numOfBlocks(int rows) {
        if (rows == 0) return 0;

        return rows + numOfBlocks(rows - 1);
    }
}
