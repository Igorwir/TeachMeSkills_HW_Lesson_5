package com.teachmeskills.lesson_3;


import java.util.Scanner;
import java.lang.Math;

public class ArrayofRandTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number size of array: ");
        int numOfArr = sc.nextInt();
        int[] samArr = new int[numOfArr];
        int min = samArr[0];
        int max = samArr[0];
        int a = 0;
        for (int i = 0; i < samArr.length; i++) {
            a = (int) (Math.random() * 20);
            samArr[i] = a;
            System.out.println("Random numbers: " + a);
        }
        for (int i = 0; i != samArr.length; i++) {
            if (samArr[i] > max) {
                max = samArr[i];
            }
            if (samArr[i] < min) {
                min = samArr[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
        sc.close();
    }
}
