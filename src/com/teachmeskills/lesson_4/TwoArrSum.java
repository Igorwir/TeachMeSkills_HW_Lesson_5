package com.teachmeskills.lesson_4;

import java.util.Arrays;

public class TwoArrSum {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[4][4];
        int[][] arrsum = new int[arr1.length][arr2.length];
        for (int a = 0; a < arrsum[0].length; a++) {
            for (int i = 0; i < arr1[0].length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    arrsum[i][j] = (i+1) * (j+1);                }
            }
            for (int i = 0; i < arrsum[0].length; i++) {
                for (int j = 0; j < arrsum.length; j++) {
                    System.out.println(arrsum[i][j]);
                }
            }
            System.out.println();
    }
    }
}