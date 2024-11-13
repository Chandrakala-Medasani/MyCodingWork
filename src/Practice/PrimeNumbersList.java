package Practice;
import java.util.Scanner;

public class PrimeNumbersList {

    public static int isPrime(int n){
        if(n==1)
            return 0;
        if(n==2 || n==3)
            return 1;
        if(n%2 == 0 || n%3 == 0)
            return 0;
        for(int i=4; i<=n/2; i++)
            if(n%i == 0)
                return 0;
        return 1;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int i = scr.nextInt();
        for(int n=1; n<=i; n++)
            System.out.println(isPrime(n));
    }
}