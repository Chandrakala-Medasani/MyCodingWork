package Programs;

import java.util.Scanner;

public class CountPrimes {

    public static int isPrime(int n){
        if(n==1)
            return 0;
        if(n==2 || n==3)
            return 1;
        if(n%2==0 || n%3==0)
            return 0;
        for(int i=5; i*i<=n; i+=6)
            if(n%i==0 || n%i+2==0)
                return 0;

        return 1;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        for(int i=1; i<=num; i++)
            if(isPrime(i)==1)
                System.out.print(i+"\t");
    }
}
