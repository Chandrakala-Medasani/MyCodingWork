package HackerRank;
import java.util.Scanner;

public class EvenOrOddWithOutModuloAndDivideOperator {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        if((num&1)==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}

/*
Result:-
971
Odd

484
Even
 */