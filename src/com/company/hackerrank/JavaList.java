package com.company.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerList.add(i, scanner.nextInt());
        }
        int q = scanner.nextInt();
        while (q-- > 0) {
            String query = scanner.next();
            if (query.equalsIgnoreCase("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                integerList.add(index, value);
            } else {
                integerList.remove(scanner.nextInt());
            }
        }
        for (int i : integerList) {
            System.out.print(i + " ");
        }
    }
}
