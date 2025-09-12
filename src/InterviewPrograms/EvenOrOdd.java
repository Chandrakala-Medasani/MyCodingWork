package InterviewPrograms;
import java.util.Scanner;

//Input a number and check if it is even or odd.

public class EvenOrOdd {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        if(num%2==0)
            System.out.print(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}


/* Result:- 5
5 is odd

248
248 is even
 */