package HackerRank;
import java.util.Scanner;


public class CrossPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();


        for(int i=1; i<=n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == j || i + j  == n+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();

        }

        /*for(int i=1;i<=n;i++){
            for(int j=1; j<i; j++)
                System.out.print(" ");

            for(int j=1; j<=n-i+1; j++)
                System.out.print("* ");

            System.out.println();
        }*/
    }
}


