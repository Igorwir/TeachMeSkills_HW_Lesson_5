package Cycle;

//Displaying square numbers from 10 to 20
public class SquareNumber {
    public static void main(String[] args) {
        int rez = 10;
        while (rez <= 20) {
            System.out.print(rez * 2 + " ");
            rez = rez + 1;
        }
    }
}
