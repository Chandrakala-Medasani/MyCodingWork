package Practice;
import java.util.Scanner;

public class Loops {

    public static int isPrime(int n){
        if(n==1)
            return 0;
        if(n==2 || n==3)
            return 1;
        if(n%2==0 || n%3 ==0)
            return 0;
        for(int i=4; i<=n/2; i++)
            if(n%i == 0)
                return 0;

        return 1;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        System.out.println(isPrime(n));
        /*int count = 0;
        for(int i=1; i<=n/2; i++)
            if(n%i == 0)
                count++;
        if(count == 1)
            System.out.println("It is prime");
        else
            System.out.println("It is not prime");*/
    }
}
