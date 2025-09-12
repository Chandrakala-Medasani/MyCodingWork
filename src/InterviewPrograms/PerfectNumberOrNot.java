package InterviewPrograms;
import java.util.Scanner;

//perfect number or not

public class PerfectNumberOrNot {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        int temp=num;
        int sum=0;

        for(int i=1; i<=num/2; i++){
            if(num%i==0)
                sum+=i;
        }

        if(temp == sum)
            System.out.println("It is perfect number");
        else
            System.out.println("It is not perfect number");
    }
}

/*
Result:-
28
It is perfect number
 */