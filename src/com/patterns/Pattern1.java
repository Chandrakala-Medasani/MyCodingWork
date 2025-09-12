package com.patterns;

import java.util.Scanner;

/* 5
        *****
        *   *
        *   *
        *   *
        *****


 */
public class Pattern1 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
