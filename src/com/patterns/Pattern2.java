package com.patterns;

import java.util.Scanner;

/*5
        1        1
        12      21
        123    321
        1234  4321
        1234554321

 */
public class Pattern2 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            int k=1;
            for(int j=1; j<=2*n; j++) {
                if (j <= i)
                    System.out.print(k++);
                else if (j >= 2*n-i+1)
                    System.out.print(--k);
                else
                    System.out.print(" ");
            }
            System.out.println();
            }

        /*for(int i=1; i<=n; i++){
            int k=1;
            for(int j=1; j<=i; j++)
                System.out.print(k++);

            for(int j=1; j<=2*(n-i); j++)
                System.out.print(" ");

            for(int j=1; j<=i; j++)
                System.out.print(--k);

            System.out.println();
        }*/
    }
}
