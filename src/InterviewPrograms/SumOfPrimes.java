package InterviewPrograms;
import java.util.Scanner;

//sum of the prime numbers

public class SumOfPrimes {

    public static int isPrime(int num){

        if(num==1)
            return 0;
        if(num==2 || num==3)
            return 1;
        if(num%2==0||num%3==0)
            return 0;
        for(int i=4; i<=num/2; i++)
            if(num%i==0)
                return 0;

        return 1;
    }

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++) {
            if (isPrime(i) == 1)
                sum = sum + i;
        }

        System.out.println(sum);
    }
}
/*
Result:-
10
17

 */