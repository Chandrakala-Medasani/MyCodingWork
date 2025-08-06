package com.patterns;

import java.util.Scanner;

/*5
        E
        DE
        CDE
        BCDE
        ABCDE

 */

public class Pattern3 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            for(char ch =(char)('A'+n-i); ch<='A'+n-1;ch++)
                System.out.print(ch);

            System.out.println();

        }
    }
}
