package com.teachmeskills.lesson_4;

import java.util.Arrays;

public class ArrMasLine {
    public static void main(String[] args) {


        String[][] ches = new String[8][8];
        for (int i = 0; i < ches.length; i++) {
            for (int j = 0; j < ches[0].length; j++) {
                if ((i + j) % 2 == 0) ches[i][j] = "W";
                else ches[i][j] = "B";
            }
        }
        System.out.println(Arrays.deepToString(ches));
    }
}