package HackerRank;

import java.util.Scanner;

public class SumOfTheDigits {

    public static int sumOfDigits(int num){

        int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num/=10;
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        System.out.println(sumOfDigits(num));
    }
}
