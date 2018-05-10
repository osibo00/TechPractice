package com.company.hackerrank;

public class OneDimensionalArray {

    public static void main(String[] args) {

    }

    static boolean winOrLose(int leap, int[] game) {
        int i = 0;
        while (i < game.length) {
            if (i == game.length - 1) {
                return true;
            } else if (i + leap >= game.length) {
                return true;
            } else if (game[i + leap] == 0) {
                i = i + leap;
            } else if (game[i + 1] == 0) {
                i = i + 1;
            } else if (game[i + 1] == 1 && game[i + leap] == 1) {
                return false;
            }
        }
        return false;
    }

    static boolean canWin(int leap, int[] game) {
        int i = 0;
        while (i < game.length) {
            if (i < 0 || game[i] == 1) return false;
            if (i == game.length - 1 || i + leap >= game.length) return true;

            game[i] = 1;
            if (game[i + 1] == 0) {
                i = i + 1;
                continue;
            } else if (game[i + leap] == 0) {
                i = i + leap;
                continue;
            } else if (i != 0 && game[i - 1] == 0) {
                i = i - 1;
                continue;
            }
            i++;
        }
        return false;
    }

    static boolean canWin02(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) return false;
        if (i == game.length - 1 || i + leap >= game.length) return true;

        game[i] = 1;
        return canWin02(leap, game, i + 1) || canWin02(leap, game, i - 1) || canWin02(leap, game, i + leap);
    }
}
