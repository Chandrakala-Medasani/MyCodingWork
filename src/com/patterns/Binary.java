package com.patterns;

import java.util.Scanner;

/*5
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

 */

public class Binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for(int i=1; i<=length; i++){
            for(int j=1; j<=i; j++)
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            System.out.println();
        }
    }
}
