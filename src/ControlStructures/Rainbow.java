package ControlStructures;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 6 :");
        int colorOfRainbow = sc.nextInt();
        switch (colorOfRainbow){
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Purple");
                break;
            default:
                System.out.println("Only 6 colors in a rainbow");
        }sc.close();
    }

}
