package com.teachmeskills.lesson_3;

import java.util.Scanner;

/**
 *Create an array of integers. Write a program that prints out a message about whether a given number is in an array or not.
 * Let the number to be searched be set from the console (Scanner class).
 */

public class ArrayTask0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sam number from 0 to 10");
        int value = sc.nextInt();
        int[] mas = {2, 5, 8, 0, 10};
        int i ;
        for (i = 0; i < mas.length; i++) {
            if (mas[i] != value) {
                continue;
            }
            System.out.println("This number " + mas[i] + " is included in the array");
        }sc.close();
    }
}




