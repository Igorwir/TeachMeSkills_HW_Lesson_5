package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create an array of n random integers and print it to the screen.
 * Let the size of the array be set from the console and the size of the array can be greater than 5 and less than or equal to 10.
 * If n does not satisfy the condition, print a message about it.
 * Create a second array from only the even elements of the first array, if any, and display it.
 */
public class ArrTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array from 5 to 10 ");
        int consinput = sc.nextInt();
        int[] mas = new int[consinput];
        if (consinput < 5 || consinput > 10) {
            System.out.println("No correct enter");
            consinput = sc.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9);
        }
        System.out.println(Arrays.toString(mas));
        //int[] masEven = mas;
        for (int even : mas) {
            if (even % 2 == 0) {
                System.out.print(" " + even);
            }
            sc.close();
        }
    }
}
