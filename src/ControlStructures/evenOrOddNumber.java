package ControlStructures;

import java.util.Scanner;
/*
We need to write a program that takes a number as input and determines whether it is an even number or not.
Let's use the Scanner and the if-else operator.
 */
public class evenOrOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter sam number :");
        Scanner sc = new Scanner(System.in);
        int samNumb = sc.nextInt();
        if (samNumb % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");

        }sc.close();
    }
}
