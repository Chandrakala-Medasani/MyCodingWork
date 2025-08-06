package Programs;
import java.util.Scanner;

public class PrimeEfficient {
    public static int isPrime(int num){
        if(num==1)
            return 0;
        if(num==2 || num==3)
            return 1;
        if(num%2==0 || num%3==0)
            return 0;
        for(int i=5; i*i<=num; i+=6)
            if(num%i==0)
                return 0;
        return 1;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(isPrime(num));
    }
}
