package Programs;
import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int f1 = 0;
        int f2 = 1;
        int f3 = 0;

        for(int i=1; i<=n; i++){
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }

        System.out.println(f3);
    }
}