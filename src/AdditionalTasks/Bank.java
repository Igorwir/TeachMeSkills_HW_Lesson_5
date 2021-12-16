package AdditionalTasks;

import java.util.Scanner;

// Formula for calculating interest sumProc = sumMan / 100 * proc
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of month :");
        int month = sc.nextInt();
        System.out.println("Enter sum :");
        float sumMan = sc.nextFloat();
        int proc = 7;//interest per month
        float sumProc = 0;//interest amount
        float total = 0;//amount with interest in the period
        for (int i = 1; i <= month; i++) {
             sumProc = sumMan / 100 * proc;
            total = month * sumProc;
        }
        System.out.println(sumProc);
        System.out.println("Your many for : " + month + " month " + total + sumMan);
        sc.close();
    }
}
