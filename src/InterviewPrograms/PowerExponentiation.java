package InterviewPrograms;
import java.util.Scanner;

//calculate the power

public class PowerExponentiation {

    public static int power(int num, int p){

        int res = 1;

        for(int i=1; i<=p; i++)
            res*=num;

        return res;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int p = scr.nextInt();

        System.out.println(power(num,p));
    }
}

/*
Result:-
5
3
125
 */