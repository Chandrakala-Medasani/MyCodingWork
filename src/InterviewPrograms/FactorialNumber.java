package InterviewPrograms;
import java.util.Scanner;

//factorial of a number

public class FactorialNumber {

    public static int fact(int num){

        int f = 1;

        for(int i=1; i<=num; i++)
            f*=i;

        return f;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        int sum=0;

        while(num>0){
            sum+=fact(num%10);
            num/=10;
        }

        System.out.println(sum);
    }
}

/*
Result:-
145
145

 */