package ControlStructures;

import java.util.Scanner;
/*
We need to write code using if-else statements that will display the name of the season,
 when entering the number of the month.
*/
public class SeasonsIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers of month :");
        int numberOfMonths = sc.nextInt();
        if (numberOfMonths <= 0) {
            System.out.println("Yuo entered no correct numbers !");
        } else if (numberOfMonths >= 3 && numberOfMonths <= 5) {
            System.out.println("Is Spring");
        } else if (numberOfMonths >= 6 && numberOfMonths <= 8) {
            System.out.println("Is summer");
        } else if (numberOfMonths >= 9 && numberOfMonths <= 11) {
            System.out.println("Is autumn");
        } else if (numberOfMonths == 12 || numberOfMonths <= 2) {
            System.out.println("Is Winter");

        }sc.close();
    }
}
