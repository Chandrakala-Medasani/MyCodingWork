package Programs;

import java.util.Scanner;

public class EvenOrOddUsingTernaryOperator {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        String s = (num%2==0)?"Even":"Odd";

        System.out.println(s);
    }
}


/*
Result:-
856
Even

25
Odd

 */