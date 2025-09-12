package HackerRank;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        int f1 = 0;
        int f2 = 1;
        System.out.print(f1+"\t"+f2+"\t");

        for(int i=3; i<=n; i++){
            int f3 = f1+f2;
            f1=f2;
            f2=f3;

            System.out.print(f3+"\t");
        }
    }
}
