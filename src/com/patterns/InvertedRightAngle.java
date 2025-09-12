package com.patterns;

import java.util.Scanner;

/*5
            *
           **
          ***
         ****
        *****

 */
public class InvertedRightAngle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for(int i=1; i<=length; i++){
            for(int j=1; j<=length-i; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
//                if(j<=length-i)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");

            System.out.println();
        }
    }
}
