package Cycle;
//Displaying the first 10 numbers from 0 with a step of -5
public class FirstNumbers {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while (i++ < 10) {
            System.out.println(j);
            j = j - 5;
        }
    }
}
