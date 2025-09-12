package InterviewPrograms;
import java.util.Scanner;

//Happy number check

public class HappyNumber {

    public static int sumOfSquares(int num){

        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum+=(rem*rem);
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();


        while(num!=1)
            num = sumOfSquares(num);

        if(num==1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

/*
Result:-
19
true
 */