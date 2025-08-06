package HackerRank;

import java.util.Scanner;

public class SumOfAllNaturalNumbers {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++)
            sum+=i;

        System.out.println(sum);
    }
}
