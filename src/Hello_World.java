import java.util.Arrays;
import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args) {
        /**
         System.out.println("Hello team !");
         // Scanner sc = new Scanner(System.in);
         //String samName = sc.nextLine();
         int[] mas = new int[5];
         for (int i = 0; i < mas.length; i++) {
         mas[i] = i * i;

         for (int j = 0; j < i; j++) {
         System.out.println(mas[i]);
         }*/
        int[] mas = new int[]{30, 20, 1, 100};
        int [] mas2 = new int[]{0,0,0,0,0,0,0,0,0,0};
        System.arraycopy(mas,1,mas2,2,3);
            System.out.println(Arrays.toString(mas2));
        }

    }

