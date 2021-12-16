package ControlStructures;

import java.util.Scanner;//import class Scanner
/*
We need to write code using swith statements that will display the name of the season,
 when entering the number of the month.
 */
public class SeasonsOfSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//We make input from clavia
        System.out.println("Enter number of month :");
        int samNumbersOfMonths = sc.nextInt();//Assign the variable samSeasons that will come from the keyboard
        switch (samNumbersOfMonths){//Let's go through the cases
            case 12:
            case 1:
            case 2:
                System.out.println("Is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Is autumn");
              break;
            default:
                System.out.println("Write correct the number of month !");

        }sc.close();
    }
}
