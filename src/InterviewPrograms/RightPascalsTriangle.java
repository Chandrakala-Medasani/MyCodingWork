package InterviewPrograms;
import java.util.Scanner;

//Right pascal's triangle

public class RightPascalsTriangle {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("* ");

            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++)
                System.out.print("* ");

            System.out.println();

        }

    }
}

/*
Result:-
4
*
* *
* * *
* * * *
* * *
* *
*

 */