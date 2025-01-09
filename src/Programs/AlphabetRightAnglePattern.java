package Programs;

import java.util.Scanner;

public class AlphabetRightAnglePattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=1;j<=i;j++)
                System.out.print(ch+++" ");

            System.out.println();
        }
    }
}

/*
Result:-
5
A
A B
A B C
A B C D
A B C D E
 */
