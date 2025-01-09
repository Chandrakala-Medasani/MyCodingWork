package InterviewPrograms;
import java.util.Scanner;

//prime numbers in a range

public class PrimeNumbersRange {

    public static int prime(int num){

        if(num == 1)
            return 0;
        if(num==2 || num==3)
            return 1;
        if(num%2 == 0 || num%3 == 0)
            return 0;
        for(int i=4; i<=num/2; i++)
            if(num%i==0)
                return 0;

        return 1;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int first = scr.nextInt();
        int end = scr.nextInt();

        for(int i=first; i<=end; i++){
            if(prime(i)==1)
                System.out.print(i+"\t");
        }
    }
}

/*
Result:-
1
10
2	3	5	7
 */
