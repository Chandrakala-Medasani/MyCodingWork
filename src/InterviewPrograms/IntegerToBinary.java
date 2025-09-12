package InterviewPrograms;
import java.util.Scanner;

//convert number to binary

public class IntegerToBinary {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        StringBuilder sb  = new StringBuilder();

        while(num>0) {
            sb.append(num % 2);
            num /= 2;
        }

        System.out.println(sb.reverse().toString());
    }
}

/*
Result:-
10
1010
 */
