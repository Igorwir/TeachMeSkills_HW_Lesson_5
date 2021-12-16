package AdditionalTasks;
//Displaying the first 11 Fibonacci numbers
public class Fibonachi {
    public static void main(String[] args) {
        int first =1;
        int second = 1;
        int sumFib;
        System.out.print(first +" " + second + " ");
        for (int i = 0;i < 9;i++){
            sumFib = first+second;
            first = second;
            second = sumFib;
            System.out.print( sumFib + " ");
        }
    }
}