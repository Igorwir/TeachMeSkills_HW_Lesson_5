package com.teachmeskills.lesson_3;

import java.util.Arrays;

public class TwoArrayTask3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 8, 4};
        int[] arr2 = {4, 5, 7, 9, 2};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        double av1 = 0;
        double av2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            av1 = av1 + arr1[i];
            av2 = av2 + arr2[i];
        }
        av1 /= 5;
        av2 /= 5;
        if (av1 > av2) {
            System.out.println("The first array: " + av1 + " bigger then second: " + av2);
        }else if (av1 < av2){
            System.out.println("The second array: " + av2 + " bigger then first: " + av1);
        }else
            System.out.println("The arithmetic mean is");
    }
}
