package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int input = sc.nextInt();
        int[] masAr = new int[input];
        int caunt = 0;
        int i;
        for (i = 0; i < masAr.length; i++) {
            masAr[i] = (int) (Math.random() * 10);
            if (masAr[i] % 2 == 0) {
                caunt++;
            }
        }
        System.out.println(Arrays.toString(masAr));
        int[] masAr2 = new int[caunt];
        int count2 = 0;
        for (i = 0; i < masAr.length; i++) {
            if (masAr[i] % 2 == 0) {
                masAr2[count2] = masAr[i];
                count2++;
            }
        }
        System.out.println(Arrays.toString(masAr2));
    }
}