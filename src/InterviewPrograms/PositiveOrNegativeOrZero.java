package InterviewPrograms;
import java.util.Scanner;

//Determine if the number is positive, negative, or zero.

public class PositiveOrNegativeOrZero {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        if(num>0)
            System.out.println(num+" is positive");
        else if(num<0)
            System.out.println(num+" is negative");
        else
            System.out.println(num+" is zero");
    }
}


/*Result:-
500
500 is positive

-254
-254 is negative

0
0 is zero
 */