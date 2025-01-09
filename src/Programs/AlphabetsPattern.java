package Programs;

import java.util.Scanner;

public class AlphabetsPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        char ch = 'A';

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++)
                System.out.print(ch+++" ");

            System.out.println();
        }
    }
}

/*
Result:-
5
A
B C
D E F
G H I J
K L M N O
 */