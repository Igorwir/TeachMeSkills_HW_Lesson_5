package Cycle;

import java.util.Scanner;

public class NumbersSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter numbers :");
        for ( ; ;){
            int numInput = sc.nextInt();
            if (numInput < 0){
                System.out.println("Only positive numbers !" );
                continue;
            }
            count += numInput;
            System.out.println("Sum numbers " + count);

        }

    }
}
