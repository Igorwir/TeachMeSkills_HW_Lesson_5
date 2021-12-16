package com.teachmeskills.lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Create an array of integers. We remove all occurrences of the given number from the array.
 * ==>> I am using a sheet of arrays, how to do this task with a simple array, I could not.<<==
 */
public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = {2, 4, 10, 2, 8, 2};
        ArrayList<Object> mas_new = new ArrayList<>();
        for (int i : mas) {
            mas_new.add(i);
        }
        int elementToBeDeleted = sc.nextInt();
       mas_new.removeAll(Collections.singleton(elementToBeDeleted));
        System.out.println("Array before delete: " + Arrays.toString(mas));
        System.out.println("Array after deleted: " + mas_new);
        sc.close();
        }
    }
