package HackerRank;

import java.util.Scanner;

public class IsPrime {

    public static int prime(int num){

        if(num == 1)
            return 0;

        if(num==2 || num==3)
            return 1;

        if(num%2==0 || num%3==0)
            return 0;

        for(int i=4; i<=num/2; i++)
            if(num%i==0)
                return 0;


        return 1;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        if(prime(num)==1)
            System.out.println("It is prime");
        else
            System.out.println("It is not prime");
    }
}
