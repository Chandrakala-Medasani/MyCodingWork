package InterviewPrograms;
import java.util.Scanner;

//strong number or not

public class StrongNumberOrNot {

    public static int fact(int num){

        int f=1;
        for(int i=1;i<=num;i++)
            f*=i;

        return f;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int sum=0;
        int temp=num;

        while(num>0){
            sum+=fact(num%10);
            num/=10;
        }

        if(temp == sum)
            System.out.println("It is strong number");
        else
            System.out.println("It is not strong number");
    }
}

/*
Result:-
145
It is strong number
 */