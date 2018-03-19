package com.ss;

public class Solver {
    int[][] input_array;
    public int[][] result_ar;

    public Solver(int[][] arr)
    {
        int[][] original = arr;
        Solve result = new Solve(original, arr,0,0,0,0,1);
        result_ar = result.Res();
    }
}
