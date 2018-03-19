package com.ss;

import java.util.Arrays;

public class Solve {
    int[][] input_array;
    public int[][] result_array;


    boolean Checker(int i, int j, int[][] arr, int value) {
        int checked_elemnt = value;
        int third_hor = i/3;
        int third_ver = j/3;
        for(int a = 0; a<arr.length; a++) {
            if(arr[a][j] == checked_elemnt) {return false;};
        }
        for(int b = 0; b<arr.length; b++) {
            if(arr[i][b] == checked_elemnt) {return false;};
        }
        for(int c = third_hor *3; c < (third_hor+1)*3; c++) {
            for (int d = third_ver *3; d < (third_ver+1)*3; d++) {
                if(arr[c][d] == checked_elemnt) {return false;};
            }
        }
        return true;

    }
    public Solve(int[][] original, int[][] arr, int last_i, int last_j, int pos_i, int pos_j, int value) {

        input_array = arr;
        result_array = arr;
        Backtracker(arr, arr, 1, 0,0,0,0,1);

        //System.out.println(Checker(1,1,original,1));
        //System.out.println(Checker(0,0,original,5));
        //System.out.println(Checker(6,4,original,));
        //System.out.println(Checker(7,6,original,));

    }

    void Backtracker(int[][] original, int[][] arr, int N, int last_i, int last_j, int pos_i, int pos_j, int value) {

        if (original[pos_i][pos_j] > 0 && N == 1) {

        }
    }

    public int[][] Res() {
        return result_array;
    }


}

