package Programs;

import java.util.Scanner;

public class PrimeNumberInEfficientWay {

    public static int isPrime(int num){

        if(num == 1)
            return 0;
        if(num == 2 || num == 3)
            return 1;
        if(num%2 == 0 || num%3 == 0)
            return 0;
        for(int i=2; i*i<=num; i++)
            if(num%i==0)
                return 0;

        return 1;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        if(isPrime(num)==1)
            System.out.println("Prime");
        else
            System.out.println("Not a prime");
    }
}
