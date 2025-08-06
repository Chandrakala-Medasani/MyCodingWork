package com.patterns;

import java.util.Scanner;

/*5
        *****
          *
          *
          *
        *****

 */

public class I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for(int i=1; i<=length; i++){
            for(int j=1; j<=length; j++){
                if(i==1||i==length||j==((length+1)/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
