package com.patterns;

import java.util.Scanner;

public class Spiral {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1; j<i; j++)
                System.out.print(n-j+1);
            for(int j=1; j<=2*n-2*i+1; j++)
                System.out.print(n-i+1);
            for(int j=n-i+2;j<=n;j++)
                System.out.print(j);

            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1; j<i; j++)
                System.out.print(n-j+1);
            for(int j=1; j<=2*n-2*i+1; j++)
                System.out.print(n-i+1);
            for(int j=n-i+2;j<=n;j++)
                System.out.print(j);

            System.out.println();
        }
    }
}
