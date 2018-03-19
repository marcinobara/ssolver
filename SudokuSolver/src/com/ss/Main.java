package com.ss;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] result;
        int[][] test1 = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[][] test2 = new int[][]{
                {5, 3, 5, 3, 7, 0, 0, 0, 0},
                {6, 0, 2, 3, 9, 5, 2, 2, 2},
                {4, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 2, 0, 1, 6, 0, 2, 2, 3},
                {4, 2, 0, 8, 0, 3, 4, 5, 1},
                {7, 2, 0, 0, 2, 0, 2, 2, 6},
                {0, 6, 0, 2, 3, 5, 2, 8, 0},
                {0, 2, 0, 4, 1, 9, 0, 0, 5},
                {0, 2, 0, 7, 8, 6, 0, 7, 9}
        };

        //Solver Result = new Solver(test1);
        Solver Result2 = new Solver(test2);
        result = Result2.result_ar;

        //System.out.println(Arrays.deepToString(result));
    }
}
