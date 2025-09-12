package InterviewPrograms;
import java.util.Scanner;

//number changing pyramind pattern

public class NumberChangingPyramidPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int k=1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++)
                System.out.print(k+++" ");

            System.out.println();
        }
    }
}

/*
Result:-
5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
