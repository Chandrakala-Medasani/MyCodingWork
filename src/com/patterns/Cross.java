package com.patterns;

import java.util.Scanner;

/*5
        *   *
         * *
          *
         * *
        *   *

 */

public class Cross {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int length = scr.nextInt();

        for(int i=1; i<=length; i++){
            for(int j=1; j<=length; j++){
                if(i==j||j==length-i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
