package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел  С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 * Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */
public class ThirdArrTask0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();
        int[][][] mas = new int[3][3][3];
        int rez = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                for (int a = 0; a < mas.length; a++) {
                   // mas[i][j][a] = (int) (Math.random() * 20);
                    mas[i][j][a] = (i) ;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                for (int a = 0; a < mas.length; a++) {
                    System.out.print(mas[i][j][a] + " ");

                }
            }
            System.out.println("\n");
        }
    }
}