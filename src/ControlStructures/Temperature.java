package ControlStructures;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру :");
        int t = sc.nextInt();
        if (t > -5){
            System.out.println("Тепло");
        }else if (t <= -5 && t > -20){
            System.out.println("Нормально");
        }else if (-20 > t){
            System.out.println("Холодно");
        }sc.close();
    }
}
